#Physics_Book_Notes #physics 



# Chapter 15 Oscillations


- **Oscillatory motion** is a repetitive motion back and forth around an equilibrium position
- Simple harmonic motion is when oscillation are sinusoidal 
- The mechanical energy of an oscillating system is conserved
	- constantly transferred in between kinetic and potential energy
- Friction gives us a dampened oscillation 



## 15.1 SHM

- All oscillators have two things in common 
	- The oscillations take place around an equilibrium position
	- The motion is periodic, repeating at regular intervals of time


- Time to complete one full cycle is called the **Period**
- The **amplitude** is the maximum displacement from equilibrium
- **Frequency** is the number of cycles completed per second 


$$
\begin{align}
f=\frac{1}{T}Hz   &   & T =\frac{1}{f}s
\end{align}
$$
### 15.1.1 Kinematics

SMH equations

$$
\begin{align}
x(t)=A\cos(2\pi ft) & =  A\cos\left( \frac{2\pi t}{T} \right) =A\cos(\omega t)
\end{align}
$$
We can relate **angular frequency** ($\omega$) with Period with 

$$
\omega = \frac{2\pi}{T}
$$
- Using the previously established equations and their derivatives we can write the velocity of the wave as
$$
v_{max}= \frac{2\pi A}{T} = 2\pi fA = \omega A
$$


##  15.2 SHM and Circular Motion 

- **Uniform circular motion projected onto one dimension is simple harmonic motion**.
- Angular frequency has the same numerical value as angular velocity for the projected value of uniform circular motion described in [[Chapter 4 PHYS 2305]]


### 15.2.1 Initial conditions the phase constant 


- If we add an offset or the phase constant to the equation found earlier we get the equation for both velocity and position for SMH 

$$
\begin{align}
x(t)=A\cos(\omega t+\phi_{0}) \\
v(t)=-\omega A\sin(\omega t+\phi_{0})
\end{align}
$$
> Two primary equations of simple harmonic motion

- The quantity $\phi=\omega t+\phi_{0}$ is called the **phase** of the occilation.
	- is simple the angle of the circular motion particle whose shadow matches the oscilator. 
	- The constant $\phi_{0}$ is called the phase constant. Its determined by the initial conditions for the oscillator 

- Different value for the phase constant means different starting positions for the wave

![[Pasted image 20260210211237.png|center|500]]


## 15.3 Energy in SHM 

- Energy is transformed between kinetic and potiential, but the total mechanicla energy $E$ doesnt change. 
![[Pasted image 20260210211612.png|center|400]]

- the particle has purely potential energy at $x = \pm  \,A$ and purely kinetic energy as it passes through the equilibrium point at $x=0$. 

- Maximum speed relative to the spring constant and mass of a the occilating object is given as 
$$
v_{max} = \sqrt{ \frac{k}{m} }A
$$

- Frequency and period of an oscilating spring are determined by the spring constant $k$ and the objects mass $m$ 
$$
\begin{align}
w=\sqrt{ \frac{k}{m} } &  & f=\frac{1}{2\pi}\sqrt{ \frac{k}{m} } &  & T=2\pi \sqrt{ \frac{m}{k} }
\end{align}
$$
- The period and frequency do not depend on the amplitude A. 


### 15.3.1 Conservation of Energy 

- because energy is conserved, we can combine equations to get 
$$
E=\frac{1}{2}mv^2 +\frac{1}{2}kx^2 = \frac{1}{2}kA^2 =\frac{1}{2}m(v_{max})^2

$$

## 15.4 The Dynamics of SHM 

$$
\frac{d^2x}{dt^2} = -\frac{k}{m}x
$$
> this is called the equation of motion



> [!warning] Skipped 15.4 
> 



## 15.5 Vertical Oscillations


- The vertical oscillations of a mass on a spring are the same simple harmonic motion as those of a block on a horizontal spring. 


## 15.6 The Pendulum 

- Uses an arc of length $s$ rather than distance 

![[Pasted image 20260210213752.png|center|500]]

The acceleration for a pendulum can be given by the expression 
$$
\frac{d^2s}{dt^2}=-g\sin\theta
$$


### 15.61 the small angle approximation

- Small angle approximation relies on the fact that if we take a small angle of a circle the hight of the right triangle will be similar to the arc length of that angle.
- 