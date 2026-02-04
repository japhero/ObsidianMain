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

- Uses alot of the same concepts as [[Chapter 4 PHYS 2305]]

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






# Section 12.5-12.11 


- The ability of a force to cause a rotation depends on three factors.
	- The magnitude of $F$ of the force.
	- The distance $r$ from the point of application to the pivot 
	- The angle at which the force is applied 

- All of these factors can be combined into one factor called torque ($\tau$ Greek Letter tau)
$$
\tau=rF\sin(\phi)
$$
- Torque is the rotational equivalent of force 
![[Pasted image 20251109200832.png|300]]

- Unit is Netwon meters or $J$ Joule 


- using the "lever arm" interpretation of the torque concept torque can be written as
$$
|\tau| = Fd
$$

- Net torque equation 
$$
\tau_{\text{net}} = \tau_{1}+\tau_{2} +\tau_{3} + \dots = \sum_{i} \tau_{i}
$$

- Relative to gravity 
$$
\tau_{\text{grav}} = -Mgx_{cm}
$$
- where $x_{cm}$ is the position of the center of mass relative to the axis of rotation


## Rotational Dynamics
- Torque causes angular acceleration 

**Newtons second law for rotational motion**
$$
\alpha = \frac{\tau_{net}}{I}
$$
- where $I$ is the moment of inertia about the axis of rotation
- In practice this is rewritten as $\tau_{net}=\alpha I$



| Rotational Dynamics   |                          | Linear Dynamics         |                       |
| --------------------- | ------------------------ | ----------------------- | --------------------- |
| Torque $(\text{N m})$ | $\tau_{net}$             | force (N)               | $\vec{F}_{net}$       |
| Moment of Inertia     | $I$                      | Mass (kg)               | m                     |
| angular acceleration  | $\alpha$                 | acceleration $(m /s^2)$ | $\vec{a}$             |
| second law            | $\alpha = \tau_{net} /I$ | second law              | $\vec{a}= \vec{F} /m$ |


**Constant torque model**
- alalagous to constnat force model 
- rigid body has constant angular acceleration
- Limitations: Model fails if the torque isnt constant.


- Static equilibrium model
	- For extended objects at rest
	- Mathematically
		- No net force $F_{net} = \vec{0}$ 
		- No net torque $\tau_{net} = 0$
	- Limitations: Model fails if either the forces or torques aren't balanced. 


**Balance and stability**
 - Stability depends on the center of mass 
 - The critical angle $\theta_{c}$ is reached when the center of mass is directly over the pivot point. This is the point of balance. 
$$
\theta = \tan^{-1}\left( \frac{t}{2h} \right)
$$
- where $t$ is the base of support and the height of the center of mass is $h$
- as a general rule a wider base of support and or a lower center of mass improves stability 


## 12.9 Rolling motion

 - For a rolling object that doesn't slip its velocity can be given by 
$$
v = R \omega 
$$
- 
![[Pasted image 20251109205533.png]]

- Rotational Kinetic energy is given by 
$$
K_{rot} = \frac{1}{2} I \omega^2
$$
- Doing some math that i dont understand 
$$
K_{\text{rolling}} = \frac{1}{2}I \omega^2 +\frac{1}{2} Mv^2=K_{rot} +K
$$
- In other words the rolling motion of a rigid body can be described as a translation of the center of mass plus a rotation about the center of mass. 



## 12.10 Rotational dynamics written as vectors


- The vector of angular velocity $\vec{\omega}$ 
- The magnitude of $\vec{\omega}$ is the objects angular speed $|\omega|$
- $\vec{\omega}$ points along the axis of rotation 
	- Use the right hand rule to find the axis of rotation where you wrap your fingers around the direction of the rotated object and the place where your finger is pointing is the direction of the vector $\vec{\omega}$ 

- **Torque**
	- using the definition of torque from earlier and establishing that force and position
$$
\vec{\tau} = \vec{r} \times  \vec{F}
$$

## 12.11 Angular Momentum 

- written as vector $\vec{L}$ 
$$
\vec{L} = \vec{r}   \times   \vec{p}
$$
- $\vec{r}$ is position while $\vec{p}$ is the plane of motion

- the angular momentum vector is perpendicular to the plane of motion.
- Angular momentum is the rational equivalent of linear momentum. 
- Very dependent on which point the position $\vec{r}$ is measured from.

$$
\frac{d\vec{L}}{dt} = \tau_{net}
$$
- angular momentum is conserved for a system with no net torque 

- around a fixed axle 
$$
\vec{L} = I  \vec{\omega}
$$


# Questions 