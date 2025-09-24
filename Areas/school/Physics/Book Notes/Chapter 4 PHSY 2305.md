
# Dump
- General form for a position vector using unit vectors
$$
\vec{r}=x\hat{i}+ y \hat{j}
$$
- Average velocity equation changes within its representation of $\Delta  \vec{r}$ giving 
$$
\vec{v}_{avg} = \frac{\Delta  \vec{r}}{\Delta t} = 
\frac{\Delta x}{\Delta t} \hat{i} + \frac{\Delta y}{\Delta t} \hat{j}
$$
> where $\hat{i}$ and $\hat{j}$ are unit vectors of the $x$ and $y$ position respectively 

- basic calculus: instant velocity is tangent to position 
$$
\vec{a}_{\text{avg}}=\frac{\Delta  \vec{v}}{\Delta t}
$$
> remember that $\Delta  \vec{v}$ has a direction so is the vector of the sum of all velocity but **directional**


$$
\vec{a}_{\text{avg}} = a_{x} \hat{i}+ a_{y} \hat{j}=  \frac{d\vec{v}}{dt}= \frac{dv_{x}}{dt} \hat{i} + \frac{dv_{y}}{dt} \hat{j}
$$
- You can componentize the kinematic equations found for constant acceleration 

### [[Frames of reference|Reference Frames]]
- Is the difference between frames of reference simply the point of its origin 
	- No becasue frames of reference can have velocities. For example if i am moving at 20m/s in one direction the things around me especially if they are moving too will have different "relative" velocity and position.

**Galilean transformation of velocity**
- If you know the velocity of an object in one frame of reference you can transform it into another


### Uniform circular motion 
![[Pasted image 20250907190617.png]]

- A particle moves around an "origin" within the path of a circle with radius **r** 
- The velocity is always tangent to the circle
- The amount of time it takes to go around the circle once is called the **period $(T)$** 
$$
v= \frac{\text{1 circumference}}{\text{1 period}}=\frac{2\pi r}{T}
$$
- angular equations use a polar coordinate system to set the position of the given particle 
- ARCLENGTH FUCK
- $\Delta \theta$ is angular displacement 
- $\omega$ is positive for counter clockwise rotation and negative for clockwise rotation 


## Centripetal Acceleration 
- The acceleration of uniform circular motion is called **centripetal acceleration**.
	- This is not different from other types of motion its just a name for this specific motion. 
- Magnitude of acceleration for centripetal acceleration is:
$$
a=|\vec{a}|=\frac{|d \vec{v}|}{dt}=\frac{v\space d\theta}{r \space d\theta/v_{t}}=\frac{v_{t}^2}{r}
$$
this also would give $a= \omega^2r$


### Uniform circular motion model 
- This model applies to a particle moving along a circular trajectory at constant speed or to points on a solid object rotating at a steady rate. 
- Mathmatically
	- tangential velocity is $v_{t}=\omega r$
	- Centripetal acceleration is $v_{t^2}/r$ or $\omega^2r$
	- $\omega$ and $v_{t}$ are positive for ccw rotation negative for cw rotation.
- Model fails if motion isnt steady 


### Non Uniform circular motion 
- for linear systems acceleration is $ax=\frac{dv_{x}}{dt}$
- Angular acceleration is denoted by $\alpha$ (alpha)
$$
\alpha \equiv \frac{d \omega}{dt}
$$
- in $rad/s^2$

![[Pasted image 20250914202930.png|500]]


### Tangential Acceleration
- We offten make acceleration components relative to the tangent line of the circle of which the point is at. 
**Arc Length**
$$
\begin{array}
s_{f}=s_{i}+v_{it}\Delta t +\frac{1}{2}a_{t}(\Delta t)^2 \\
v_{ft}=v_{it} +a_{t}\Delta t
\end{array}
$$












****
## Definitions 
- Coordinate systems that move relative to each other are called [[Frames of reference|reference frames]] 
- $\omega$ is the symbol for angular velocity 
- $\alpha$ is the symbol for angular acceleration 
- $v_{x}=\frac{dx}{dt}$
- $v_{y}=\frac{dy}{dt}$
- Conversions to polar 
	- $v_{x}=v\cos(\theta)$
	- $v_{y}=\sin(\theta)$
- $v=\sqrt{ v_{x}^2 +v_{y}^2}$
- $\theta= \tan^{-1}\left( \frac{v_{y}}{v_{x}} \right)$
- $$
\vec{a}_{\text{avg}} = a_{x} \hat{i}+ a_{y} \hat{j}=  \frac{d\vec{v}}{dt}= \frac{dv_{x}}{dt} \hat{i} + \frac{dv_{y}}{dt} \hat{j}
$$

- $$
\vec{a}_{\text{avg}}=\frac{\Delta  \vec{v}}{\Delta t}
$$
- $$
\vec{v}_{avg} = \frac{\Delta  \vec{r}}{\Delta t} = 
\frac{\Delta x}{\Delta t} \hat{i} + \frac{\Delta y}{\Delta t} \hat{j}
$$
- $$
\vec{r}=x\hat{i}+ y \hat{j}
$$
- **Period $(T)$** the amount of time it takes for a particle to go around its circular motion once. 
- $\Delta \theta$ is angular displacement 
- $$
\Delta \theta =\theta_{f}-\theta_{i}
$$

- $$
\text{average angular velocity} = \frac{\Delta \theta }{\Delta t}
$$
- $$
\omega = \frac{d\theta}{dt}
$$
