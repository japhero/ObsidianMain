
# DUMP
https://acmerobotics.github.io/ftc-dashboard/features#telemetry
![](https://i.imgur.com/XbAcIGi.png)

## Relative difference 
https://stackoverflow.com/questions/28036652/finding-the-shortest-distance-between-two-angles#:~:text=Angles%20are%20scalars%2C%20so%20the,you%20made%20a%20rough%20diagram.

## Possible issues with code.
-  Don't know if the IMU's start angle is relative to the "side" or the front of the robot or if we need to adjust $90\degree$
- IDK if when switching wheel powers we will oscillate
- is the PID math right?
- 
# NOTE EXPLINATION IS BETA AND CODE IS NOT VERIFIED SO IDK IF ITS EVEN TRUE 
---
# Explanation

## Goal of the Program 
Before creating we should always evaluate the goal of it and in this case the goal is to adapt the direction of our robot that has importantly has [[Mechanum Wheels]]. More specifically we want to take the the angle of our joystick and turn the "front" of our robot to that heading but relative to the start position of our robot which should be relative to the field because its [[Field centric drive explained|Field centric drive]] .  **SUMMARY: Turn our robot to a heading given by the joystick all relative to the field.**


## Difference with Normal PID 
The main difference and challenge in this code is that we are using angles to approximate our error and target this is an issue because angles are "circular" and numerically the loop that they create is impossible to apply to PID. For example if I was at $340\degree$ and my target was $10\degree$ the numerical calculation/difference would be go $-330\degree$ but that's obviously inefficient and dumb why wouldn't I just turn $+30\degree$.  Another issue is if my current heading passes $360\degree$ it looks to the computer as if I instantly turned $360\degree$ 


## Main approach to the problem 
The main idea is that we do fancy math to make turning relative to $\pm 180\degree$. This math is fairly simple as we just take the 2 angles relative to the difference in angles and just take the which ever one has a greater absolute value because we only care about absolute distance and the sign is just representative of what "direction" we need to turn

```python
def returnSmallest(a1,a2):
    r1 = (a1 - a2) % 360
    r2 = (a2 - a1) % 360
    return r2 if r2 <= r1 else -r1
```