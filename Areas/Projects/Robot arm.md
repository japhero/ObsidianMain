Robot arm is a project that is a circular robot arm that controls  a grabber that tries to pick up container crates. This document contains the source code and documentation for several of the functions used in the program.



## Imports
this is a list of imports used within the program these imports are all based on the circuit python base of python, that's why things like pip can't be used to run the files and it's all local.
 ```                                                                python
import time

import math

import simpleio

import analogio

import digitalio

from adafruit_motor import stepper,servo

import board

import pwmio

from analogio import AnalogIn, AnalogOut

  ```
***


## Initializations  

``` python

coils =[

digitalio.DigitalInOut(board.D8), # A1

digitalio.DigitalInOut(board.D9), # A2

digitalio.DigitalInOut(board.D10), # B1

digitalio.DigitalInOut(board.D11), # B2

]

# This for loop loops over the board pins and declares them as outputs.   
for coil in coils:

coil.direction = digitalio.Direction.OUTPUT

  ```
This is a list of all the coils used by the stepper motor

```python
SERVOPINS = {board.D5,board.D6,board.D7}

SERVONAMES ={"rotaServ","armLeft,armRight"}

# Stores the values for board pins and names for the potentiometers

for x in range(2):

#loops over the names and board values and Initializes them
pwm = pwmio.PWMOut(SERVOPINS,duty_cycle=2 ** 15, frequency=50)

SERVONAMES = servo.Servo(pwm)
```
similar to above but also stores names 


## Creating the array
these functions smothed over the values by finding the mean of several values as to avoid outliers.
``` python

runningMedian = []

def medianCalc(x):

runningMedian.append(round(x,1))

if len(runningMedian) == 20: # 20 is the max amount of values in the array

runningMedian.pop(0)

return median(runningMedian)

  ```
The Function adds to an array every time the function is called in the loop. This happens untill the function [len](functions##len) returns the max value of 20 which is when we use the pop function to remove the first value in the array. Removing the first value allows values to flow similar to a conveyor belt.  
``` python
for x in range(1,8):
	medianCalc(x)

[1]
[1,2]
[1,2,3]
[1,2,3,4]
[1,2,3,4,5]
[2,3,4,5,6]
[3,4,5,6,7]
```

Also note that the array "***runningMedian***" is a global variable, as putting inside the function would restrict it to the scope of a single reference or call.
***

## Calculating the median
Function that calculates the median of the array.
```python

def median(input):

sortedArray = input.deepcopy()

sortedArray.sort()
# sorts the list least to greatest
length = round(len(sortedArray)/2)
#rounds the length/2 to get the location of the center value
return sortedArray[length]
#returning the center value 
```
The median is the center value of a sorted list of numbers. In this function we first make a 
[[functions#.deepcopy() |deepcopy()]] of the list sort the list numericaly then calculate the center by rounding half of the length of the list and then return that value.

Step by step
``` 
[1,5,4,0,3] #sort
[0,1,3,4,5] #find center value
5/2 = 2.5   # round and find that value through indexing
list[3]= 3  # the median is 3

```
***
## Controlling the button state
This code takes the input of a button and decides the state of the grabber arm from closed to open.  The reason we can't just take the input from the button is that the output is a constant on or off of the button, and we need to measure the change in that on or off to control what the button does, not the constant state of the button.

``` python 

prevState = 0    
GrabClose = False      

prevState = 0    

GrabClose = False      

def Grab(buttonVal):
    global prevState
    global GrabClose
    
    if buttonVal and buttonVal != prevState:
        prevState = True
        GrabClose = not GrabClose
        if GrabClose:
            pass
            #code for servos to open
        else:
            pass
            #code for servos to close  
    elif  not buttonVal:
        prevState = False
    return "open" if GrabClose == True else "close

```

First, the reason we use global variables is that we can't reset the value of the state of the arm nor the previous state, as they must stay consistent in between runs of the function.  Next the debouncer, it takes the current value and compares it to the last value of the button if they are the same we know that the button was not pressed if the opposite is true we can change the previous state to on and flip the state of the button in this case the variable of "GrabClose".
***
## Managing the direction of the stepper 
The way the stepper changes is effected by the delay the range of the delay is shown below in the graph

![[GRAPH EXAMPLE.png|600]]
in the code bellow the range is shown as the function creates this graph and uses it to determine the direction represented by the letters (F,S,B)
``` python
def direcManager(interval):
    global lastDirec
    global timeInt
    time = timeInt

    #change condition for time to subtract thats were bugg is
    #global because needs to change value

    if time > abs(interval) or time == 10:
        timeInt = 0
        #better way to controll direction
        if interval >=-9 and interval <= -1:
            motor.onestep(direction=2)
            lastDirec = "b"
        elif interval <= 9 and interval >= 1:    
            motor.onestep()
            lastDirec = "f"
        else:
            lastDirec = "s"
    return lastDirec
```
***



