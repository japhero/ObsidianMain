https://www.youtube.com/watch?v=gnSW2QpkGXQ
### DUMP For video
omni wheel uses rollers that are offset by $\degree{45}$
<img src = "https://i.imgur.com/2QnRPjA.png" width =50%>
When supplying each individual wheel they should move like above
- When applying full power to all motors this should cancel and it should move straight.

## Code methods 

```
Speed  = -gamepad.left_stick_y;
Turn   =  gamepad.right_stick_x;
strafe =  gamepad.left_stick_x;

leftFront  = speed + turn + strafe;
rightFront = speed - turn - strafe;
leftBack   = speed + turn - strafe;
rightBack  = speed - turn + strafe;
```

---


## 