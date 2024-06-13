https://pdocs.kauailabs.com/navx-micro/examples/field-oriented-drive/


https://www.youtube.com/watch?v=gnSW2QpkGXQ 


## Math
``` java
double rcw = pJoystick->GetTwist();
double forwrd = pJoystick->GetY() * -1; /* Invert stick Y axis */
double strafe = pJoystick->GetX();
 
float pi = 3.1415926;
 
/* Adjust Joystick X/Y inputs by navX MXP yaw angle */
 
double gyro_degrees = ahrs->GetYaw(); // basicaly an imu
float gyro_radians = gyro_degrees * pi/180; // to raidians
float temp = forwrd * cos(gyro_radians) + strafe * sin(gyro_radians);
strafe = -forwrd * sin(gyro_radians) + strafe * cos(gyro_radians);
fwd = temp;

/* At this point, Joystick X/Y (strafe/forwrd) vectors have been */
/* rotated by the gyro angle, and can be sent to drive system */
```