
```python
from codrone_edu.drone import *
from DroneManager import DroneHandler
import traceback
from LiveGraph import LiveGraph
from FakeDrone import FakeDrone
import numpy as np
from Course import *


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
    droneManager.get_pad_color()
    drone.takeoff()
    
    while True and not drone.r2_pressed():
        # droneManager.move([0,0,.5])
        testPoints = [2.7232189178466797, inchtoM(80)]
        
        if droneManager.sequential_movement([
            (Y_KEYHOLE_XY[0] - inchtoM(4),0,Y_KEYHOLE_BASE_HEIGHT + (KEYHOLE_DIAMATER/2)), # moves infront of yellow keyhole
            (G_KEYHOLE_XY[0] ,-inchtoM(1),Y_KEYHOLE_BASE_HEIGHT + (KEYHOLE_DIAMATER/2)),
            (G_KEYHOLE_XY[0] ,-inchtoM(1),(G_KEYHOLE_BASE_HEIGHT + KEYHOLE_DIAMATER/2)), #goes throught the yellow keyhole and infront of green keyhole
            (G_KEYHOLE_XY[0] ,inchtoM(-1),(G_KEYHOLE_BASE_HEIGHT + KEYHOLE_DIAMATER/2)),
            (G_KEYHOLE_XY[0] ,inchtoM(12*3),(G_KEYHOLE_BASE_HEIGHT + KEYHOLE_DIAMATER/2)),
            (LANDING_PAD[0], testPoints[1],inchtoM(3*12)), # goes though the green keyhole and gets ready to land
        ]) == True:
            break 
        else:
            continue
    color = droneManager.get_pad_color()
    
    if color  == "Red":
        pass
    elif color == "Blue":
        pass
    elif color == "Green":
        pass
    # implement other sequences here
    
    
    
    print("close")

    drone.land()
    drone.close()

except Exception as e:
    traceback.print_exc()
    drone.land()
    drone.close()


```

---

```python
from codrone_edu.drone import *
from simple_pid import PID
import numpy as np
import time


class DroneHandler():
    
    def __init__(self,drone) -> None:
        
        
        print("DroneHandler Initted")
        self.drone = drone
        self.curPos = [0,0,0] # x,y,z
        # self.curRot = (0,0,0) # yaw, pitch, roll
        self.curTarget = [0,0,0] # x,y,z
        self.movement = 0
        self.movementTime = -4
        
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
        
    def sequential_movement(self,seq:list[tuple]):
        
                
        descriptions  =[
            "move to yellow keyhole",
            "through yellow keyhole",
            "move to green keyhole",
            "through green keyhole",
            "go down to 3 feet",
            "move to landing pad and land",
        ]
        
        print(f"{descriptions[self.movement]}" + 
              f"movement Numnber {self.movement}" +
            # f" looking for: {seq[self.movement]}" +
            #   f"error: {np.average(np.subtract(self.curPos, seq[self.movement]))} "
           f" errors: {np.less(np.abs(np.subtract(self.curPos, seq[self.movement])),[.07]*3 )}"
        )
        
        if  np.all(np.less(np.abs(np.subtract(self.curPos, seq[self.movement])), [0.6]*3)) or self.movement > len(seq):
            self.movement += 1
            if self.movement >= len(seq):
                print("hovering for 3 seconds")
                self.drone.hover(3)
                self.drone.land()
                self.movement = 0
                return True
                
            self.movementTime = self.get_latest_time()
            
            


        self.move(seq[self.movement])
        
              
                
                
                
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
    
    def get_pad_color(self):
        RED = [255,0,0]
        GREEN = [0,255,0]
        BLUE = [0,0,255]
        
        color_data = self.drone.get_color_data()
        hue = color_data[1]
        if 0 <= hue < 60:
            color = "Red"
            self.drone.set_drone_LED(*RED,100)
        elif 60 <= hue < 180:
            color = "Green"
            self.drone.set_drone_LED(*GREEN,100)
        elif 180 <= hue < 300:
            color = "Blue"
            self.drone.set_drone_LED(*BLUE,100) 
        return color        
        
        
```