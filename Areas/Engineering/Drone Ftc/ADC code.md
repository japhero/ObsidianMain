# KID MODE

```python
from codrone_edu.drone import *
from src.DroneManager import DroneHandler
import traceback
from src.LiveGraph import LiveGraph
from FakeDrone import FakeDrone
import numpy as np
from src.Course import *
import pynput
from simple_pid import PID



drone = Drone()
drone.pair()

drone.speed_change(1)

height_ceil = .5
throttle_pid_data = (100, 0, 0)
#TODO: adjust PID values to precise movement.
level_PID = PID(Kp= 170, Ki= 0, Kd=0, setpoint=height_ceil , output_limits=(-100,100) )


def range_map(x, in_min, in_max, out_min, out_max):
    return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min



def onRelease(key):
    
    if key == pynput.keyboard.Key.enter:
        for x in range(5): ## Dont need loop but redundancy is good
            drone.reset_move()
            drone.sendStop()

        print("Emergency stop")
        
    if key == pynput.keyboard.Key.shift_r:
        while drone.get_height("m") != -1:
            print("Land")
            drone.sendLanding()
        
        
    if key == pynput.keyboard.Key.space:
        drone.takeoff()
        print("Takeoff")
        while drone.get_height("m") > height_ceil:
            drone.set_throttle(level_PID(drone.get_height("m")))        


with pynput.keyboard.Listener(on_press= onRelease) as keyboard:
    while True:
        try:
            if drone.get_height("m") > height_ceil: 
                drone.set_throttle(level_PID(drone.get_height("m"))+ min(drone.get_left_joystick_y(),0) )
                drone.set_drone_LED(255,0, 0,255)
            else:
                drone.set_drone_LED(0, 255, 0,255)
                # drone.set_throttle(level_PID(drone.get_height("m")))
                drone.set_throttle(drone.get_left_joystick_y()) 


            drone.set_roll(drone.get_right_joystick_x())
            drone.set_pitch(drone.get_right_joystick_y())
            drone.move()
        except Exception as e:
            print(e) 
            for x in range(100):
                drone.sendLanding()
            print(traceback.format_exc())
            break
```


# Drone manager
```python
from codrone_edu.drone import *
from simple_pid import PID
import numpy as np
import time
from typing import Optional
from scipy import stats as st 


class DroneHandler():
    
    def __init__(self,drone) -> None:
        
        
        print("DroneHandler Initted")
        self.drone = drone
        self.curPos = [0,0,0] # x,y,z
        # self.curRot = (0,0,0) # yaw, pitch, roll
        self.curTarget = [0,0,0] # x,y,z

        
        pitch_pid_data = (30, .1, .3) # Kp, Ki, Kd
        throttle_pid_data = (100, 0, 0)
        roll_pid_data = (70, .1, 0)

        self.roll_pid = PID(roll_pid_data[0],roll_pid_data[1],roll_pid_data[2], setpoint=0, output_limits=(-100,100))
        self.pitch_pid = PID(pitch_pid_data[0], pitch_pid_data[1], pitch_pid_data[2], setpoint=0, output_limits=(-100,100))
        self.throttle_pid = PID(Kp= throttle_pid_data[0], Ki=throttle_pid_data[1], Kd=throttle_pid_data[2], setpoint=0, output_limits=(-100,100) )

        self.start_time = time.time()
        
        
        
        self.pidList = [self.pitch_pid,self.roll_pid,self.throttle_pid]
        
        

    def move(self,relPos):
        
        self.curTarget = relPos
        
        for i,pid in enumerate(self.pidList):
            pid.setpoint = relPos[i]
            
        
        
        self.drone.set_pitch(self.pitch_pid(self.curPos[0]))
        self.drone.set_roll(-self.roll_pid(self.curPos[1]))
        self.drone.set_throttle(self.throttle_pid(self.curPos[2]))
        
        self.drone.move()
        
        self.update()
        
        
    def update(self, data  = None):
        posData = data if data != None else self.drone.get_position_data()
    
        
        self.curPos = (posData[1],posData[2],posData[3])
        self.curRot = self.drone.get_position_data() 
        return self.curPos
        # print(f"x: {self.curPos[0]:.2f} y: {self.curPos[1]:.2f} z: {self.curPos[2]:.2f}")
        
    def sequential_movement(self,seq:list[tuple], timeOut: Optional[int] = 0 ):
        movement = 0
        sequence_time = time.time()
        print("Starting Movement")
        while True:
            descriptions  =[
                "Moving through the yeollow keyhole",
                "Moving below the yellow keyhole",
            ]

            print(f"{descriptions[movement]}" + 
                  f" movement Numnber {movement}" +
            
                f" timeout: {time.time() - sequence_time :.2f} " +
                f" {False if time.time() - sequence_time > timeOut else True},"+
                f" errors: {np.less(np.abs(np.subtract(self.curPos, seq[movement])),[.07]*3 )}"
            )

            if np.all(np.less(np.abs(np.subtract(self.curPos, seq[movement])), [0.07]*3)) or time.time() - sequence_time > timeOut:
                movement += 1
                sequence_time = time.time()
            
            if self.drone.r2_pressed() or not movement < len(seq):
                
                time.sleep(2)
                self.drone.land()
                break
            # turns into a do while loop.

            self.move(seq[movement])
        
              
                
                
                
    def flashColor(self,color = None):
        if color == None:
            color = map(lambda x: x*255, np.random.rand(3))
        self.drone.set_drone_LED(color)

    
    
    def get_display_Data(self,pV,minIndex =0,maxIndex = 2):
        return (self.pidList[pV].setpoint*10,self.curPos[pV] *10,self.pidList[pV](self.curPos[pV]))[minIndex:maxIndex]
        # converted to cm for better readability
    
    def get_z_pos(self):
        return self.curPos[2]
    
    def getCurPos(self):
        return self.curPos  
    
    def get_latest_time(self):
        return time.time() - self.start_time
    
    
    def _what_color(self, hue):
        RED = [255,0,0]
        GREEN = [0,255,0]
        BLUE = [0,0,255]
        if 0 <= hue < 60:
            return RED
        elif 60 <= hue < 180:
            return GREEN
        elif 180 <= hue:
            return BLUE

    
    def get_pad_color(self, dataGrain:Optional[int]  = 5):

        
        colors = []
        
        
        for x in range(dataGrain):
            colors.append( self._what_color(self.drone.get_color_data()[0]) )
            time.sleep(.1)
            
        return st.mode(colors)[0]
            
            
        

```

# Main

```python
from codrone_edu.drone import *
from src.DroneManager import DroneHandler
import traceback
from src.LiveGraph import LiveGraph
from FakeDrone import FakeDrone
import numpy as np
from src.Course import *


# plotData = [grain,dataAmount,dataNames,overAllName,colors]

# lg = LiveGraph(([10,3,["input","Pos","pidOut"],"xPid",["r","b","g"]],
#                 [10,3,["input","Pos","pidOut"],"yPid",["k","g","y"]],
#                 [10,3,["input","Pos","pidOut"],"zPid",["y","m","violet"]]))
# lg.interactiveMode()

drone = Drone()
droneManager = DroneHandler(drone)
print("--Innit Complete--")

try:
    drone.pair()
    drone.reset_sensor()
    drone.set_drone_LED(255,255,255,100) # makes white
    time.sleep(1)
    innit_color = droneManager.get_pad_color()
    drone.takeoff()
    

    testPoints = [2.7232189178466797, inchtoM(68)]
        
    droneManager.sequential_movement([
        (Y_KEYHOLE_XYZ[0] - inchtoM(4),0,Y_KEYHOLE_BASE_HEIGHT + (KEYHOLE_DIAMATER/2)), # moves infront of yellow keyhole
        (G_KEYHOLE_XY[0] ,-inchtoM(1),Y_KEYHOLE_BASE_HEIGHT + (KEYHOLE_DIAMATER/2)),
        (G_KEYHOLE_XY[0] ,-inchtoM(1),(G_KEYHOLE_BASE_HEIGHT + KEYHOLE_DIAMATER/2)), #goes throught the yellow keyhole and infront of green keyhole
        (G_KEYHOLE_XY[0] ,inchtoM(-1),(G_KEYHOLE_BASE_HEIGHT + KEYHOLE_DIAMATER/2)),
        (G_KEYHOLE_XY[0] ,inchtoM(12*3),(G_KEYHOLE_BASE_HEIGHT + KEYHOLE_DIAMATER/2)),
        (LANDING_PAD[0], testPoints[1],inchtoM(3*12)), # goes though the green keyhole and gets ready to land
    ],timeOut= 5)
    
    drone.set_drone_LED(
    *droneManager.get_pad_color(20),100
    )
    
    
    print("close")

    drone.land()
    drone.close()

except Exception as e:
    traceback.print_exc()
    drone.land()
    drone.close()


```