#physics #Physics_Book_Notes 








**Rigid Body** 
- an object whose size and shape don't change as it moves is called a rigid body.
- A rigid body is characterized by its movement of inertia $I$ which is the rotational equivalent of mass.
**Torque** 
- The tendency or ability of a force to rotate an object about a pivot point. You'll learn that torque depends on both the force and where the force is applied. A longer wrench provides a larger torque.
- **Torque is to rotation what force is to linear motion**
- Newtons second law for rotation is 
$$
\alpha= \tau/I
$$
**Angular Momentum**
- A momentum is to rotation what momentum is to linear motion
- A momentum is an objects tendency to keep rotating
- A momentum $\vec{L}$ is a vector pointing along the rotation axis.


**Rotational Motion**
- $M_{e}$ includes rotational kinetic energy $\frac{1}{2}I\omega^2$
- Angular momentum is conserved for an isolated system


- The change is that now we also consider objects which have size and arent just arbitrary mass's

### **Rigid Body Model**
A rigid body is an extended object whose size and shape do not change as it moves.
- Particle-like atoms are held together by rigid massless rods.
- A rigid body cannot be stretched, compressed, or deformed. All points on the body have the same angular velocity and angular acceleration.
- Limitations: Model fails if an object changes shape or is deformed.


- Three main types of rigid body motion
	- Translational motion
		- Object moves along path but doesnt rotate
	- Rotational motion
		- Object rotates about a fixed point 
	- Combinational motion 
		- An object rotates as it moves along a trajectory 

- Uses alot of the same concepts as [[Chapter 4 PHSY 2305]]

$$
\begin{array}{ll}
\omega_{f} = \omega_{i} \Delta t +\frac{1}{2} \alpha (\Delta t)^2 \\
\theta_{f}=\theta_{i}+ \omega_{i} \Delta t +\frac{1}{2} \alpha (\Delta)^2 \\
\omega_{f}^2 = \omega_{i}^2 +2 \alpha \Delta \theta
\end{array}
$$
![[Pasted image 20251026215652.png]]
$$
\begin{array}{ll}
v_{r} =0, & a_{r}=\frac{v^2_{t}}{r}=\omega^2
r  \\
v_{t} = r\omega,  & a_{t}=r \alpha
\end{array}
$$
- within angular acceleration $\alpha$ wether the object is speeding up or slowing down depends on wether or not the sign of $\alpha$ points in the opposite direction from $\omega$ 
- 


### Rotation about the center of mass
- An object without translational motion will rotate about its center of mass

given we model an object a set of particles $(x_{i},y_{i})$ $i$ being the number of particles, also given that $m_{i}$ is the mass of each particle $i$ this then gives that the center of mass is 

$$
\begin{array}{ll}
x_{cm} = \frac{1}{M} \sum_{i} m_{i}x_{i} =\frac{m_{1}x_{1}+m_{2}x_{2}+m_{3}x_{3}+\dots}{m_{1}+m_{2}+m_{3}+\dots} \\
y_{cm} = \frac{1}{M} \sum_{i} m_{i}y_{i}=\frac{m_{1}y_{1}+m_{2}y_{2}+m_{3}y_{3}+\dots}{m_{1}+m_{2}+m_{3}+\dots}
\end{array}
$$
- This basically means that the center of mass is at the average $x$ and y point for a given object given that an objects mass is the same in every particle 
- **The center of mass is the mass-weighted center of the object**

**Finding the center of mass through [[Antiderivatives-integrals|integration]]** 

- We can simplify finding the center of mass from before by treating the particles as areas and simply get the average area. 

$$
\begin{array}{\ll}
y_{m} = \frac{1}{M} \int y \, dm \\
 x_{cm} = \frac{1}{M}\int x  \, dm
\end{array}
$$

### Rotational Energy 
- Rotational kinetic Energy 

- Moment of inertia 
$$
I=m_{1}r_{1}^2 +m_{2}r^2_{2}+\dots \sum_{i}m_{i}r^2_{i} 
$$

- Units of inertia are $kg\, m^2$ 

- An objects moment of inertia depends on the axis of rotation
$$
K_{rot}=\frac{1}{2} I \omega^2
$$
$$
E_{mech} = K_{rot} +U_{G}=\frac{1}{2}I\omega^2 +Mgy
$$

**Calculating Moment of Inertia** 



- Complex objects can be divided into several objects 
$$
I_{\text{object}} = I_{1} +I_{2} +I_{3}+\dots
$$


# Questions 