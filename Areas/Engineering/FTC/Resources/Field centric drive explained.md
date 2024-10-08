

# Using Vectors to calculate movement 
The goal of this program is to control the power of the DC motors with a [[Vectors]] which has an input of **Power and cartesian coordinates relative to the joystick**. This basically means we want to turn our wish of I want to go in this direction$\degree$ with this speed into a power value for the motors. Additionally We want to be able to control the direction of the robot regardless of of its heading(the direction its currently facing) and turn the robot while moving. 


## Getting Theta out of cartesian cords
We can get theta through the [[atan2]] function this function turns our **X** and **Y** positions from the joystick into an angle relative to a 2d plane where $(0,0)$ is the origin. This is extremely useful for creating a [[Vectors]] as it gets us the angle that our joystick is pointing in **radians**.

<img src = "https://i.imgur.com/1RwHVEp.png" width =300>



## Converting theta to power
Now we need to convert our inputs of **power** and now **theta** into something that we can actually feed to our motors a power value in between $0$ and $1$ .
#### More [[Vectors]] 
To get the motor values of each motor we are going to treat our angle theta as a triangle where we know that the adjacent side and the opposite side will equal the final [[Vectors]].
![[vector addition|500]]



We know that if we make the Adjacent [[Vectors]] and Opposite [[Vectors]] relative to the robots strafing movement and forwards and backwards movement we can then use those vectors as power values. To make the angle relative we shift the angle of $\theta$ by $\degree{-45}$ because the wheels forces are "pushing" 45 degrees offset from the center. This can be visualized by shifting the angle of raw vector of the motor by $\degree{-45}$.
![[shifted -45|500]]
Therefore the pseudocode for getting the motor power (not scaled) is.   
```java
leftFront  = power * cos{theta} - PI/4
rightFront = power * sin{theta} - PI/4
leftBack   = power * sin{theta} - PI/4
rightBack  = power * cos{theta} - PI/4
```
 