Robot arm is a project that is a circular robot arm that controls  a grabber that tries to pick up container crates. This document contains the source code and documentation for serveral of the functions used in the program.



## imports
this is a list of imports used within the program these imports are all based on the circut python base of python thats why things like pip cant be used to run the files and its all local.
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

Also Note that the array "***runningMedian***" is a global variable as putting inside the function would restrict it to the scope of a single refrence or call.
***

## Calculating the median
Function that calculates the median of the and array.
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

step by step
``` 
[1,5,4,0,3] #sort
[0,1,3,4,5] #find center value
5/2 = 2.5   # round and find that value through indexing
list[3]= 3  # the median is 3

```
***
