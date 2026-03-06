#physics 

&emsp;


# Charge and $\vec{E}$ Fields





**Coulombs Law**
$$
\mathrm{F_{1 \space on \space2}} = \mathrm{F_{2 \space on \space 1}}
= \frac{K |q_{1}| | q_{2} |}{r^2}
$$
> $k$ is the electrostatic constant


**Electric field of a point charge**
$$
\vec{E} = \frac{1}{\pi \epsilon_{0}} \frac{q}{r^2} \hat{r}
$$
> where $\hat{r}$ is the unit vector from the charge toward the point at which we want to know the field 


### Constants 
$$
\begin{array}{ll}
e = 1.6 \times10^{-19} \\
q=(N_{p}-N_{e})e  \\
m_{e}=9.109 \cdot 10^{-31} \\
k = 9 \cdot 10^{9} \\
\epsilon_{0}= 8.85 \cdot 10^{-12}
\end{array}
$$
&emsp;

# Waves
## Simple Harmonic Motion


### Vertical and horizontal springs

**Hooke's Law** 
$$
(F_{net})_{s}=-ks
$$
> for the linear restoring force of a spring attached to mass $m$ 
> S is the arbitrary direction that the spring is facing 

**Period and angular frequency for vertical and horizontal springs**
$$
\begin{array}{ll}
\omega = \sqrt{ \frac{k}{m} },  &  &  T=2\pi \sqrt{ \frac{m}{k} }
\end{array}
$$

### Simple Pendulum 

**Angular Frequency** and Period
$$
\begin{array}{ll}
\omega = \sqrt{ \frac{g}{L} },  & T = 2\pi  \sqrt{ \frac{L}{g} }
\end{array}
$$

### Physical Pendulum 

**Angular Frequency and Period**
$$
\begin{array}{ll}
\omega = \sqrt{  \frac{Mgl}{I} }, & T=2\pi \sqrt{ \frac{I}{Mgl} }
\end{array}
$$

### Energy in SHM
If there is no friction or dissipation, kinetic and potential are alternatively turned into each other and total mechanical energy is conserved.
$$
\begin{align}
E  & = \frac{1}{2}mv^2+\frac{1}{2}kx^2 \\
 & = \frac{1}{2}m(v_{max})^2 \\
 & =\frac{1}{2}kA^2
\end{align}
$$
### General SHM Equations

**Frequency**
$$
F=\frac{1}{T}
$$
**Angular Frequency**
$$
\omega = 2\pi f =\frac{2\pi}{T}
$$

**Position**
$$
\begin{align}
x(t) &  = A\cos(\omega t+\phi_{0}) \\
 & =A\cos\left( \frac{2\pi}{T} + \phi \right) \\
 & = A\cos(\phi) 
\end{align}
$$
**Velocity**
$$
v_{x}(t) = -v_{max}\sin(\omega t+\phi_{0})
$$
> $v_{max}=\omega A$

**Acceleration**
$$
a_{x} (t)= -\omega^2x(t)=-\omega^2A\cos(\omega t+\phi_{0})
$$
**Definition of phase**
$$
\phi = \omega t+\phi_{0}
$$
The phase constant is determined by the initial conditions 
$$
\begin{array}{ll}
x_{0} = A\cos(\phi_{0}) &  v_{0x} =-\omega A\sin(\phi_{0})
\end{array}
$$

&emsp;
## Traveling Waves

**Wave Equation**
$$
\begin{align}
D(x,t)  & = A\sin\left[ 2\pi\left( \frac{x}{\lambda}-\frac{t}{T} \right) + \phi_{0} \right] \\
 & =A\sin(kx-\omega t+\phi_{0})
\end{align}
$$
> $A$ is the amplitude 
> $k=\frac{2\pi}{\lambda}$ is the wave number
> $\omega=2\pi f=\frac{2\pi}{T}$ is the angular frequency 
> $\phi_{0}$ is the phase constant that describes initial condition
 

**Wave speed for any sinusoidal wave**
$$
v=\lambda f
$$
&emsp;
### Applications

**Wave speed for transverse wave (string)**
$$
v=\sqrt{ \frac{T_{s}}{\mu} }
$$
> where $T_{S}$ is the tension and $\mu$ is the string density $m/L$

**Wave speed for sound wave**
$$
v=\sqrt{ \frac{B}{\rho} }=343 \mathrm{ \,m/s}
$$
**Wave speed for light (transverse)**
$$
v=c/n
$$
> $c=3\times10^8 \mathrm{\,m/s}$
> $n$ is the materials index of refraction



**Wave intensity**
$$
I=\frac{P}{a}
$$
> where $P$ is the power and $a$ is the area 


**Wave intensity for a circular/spherical wave**
$$
I=\frac{P_{\mathrm{source}}}{4\pi r^2}
$$
**Sound intensity level**
$$
\beta = 10 \mathrm{\, dB}\,\log_{10}(I/1.0 \times10^{-12} \, W/m^2 )
$$

&emsp;
### Doppler Effect

$f_{0}$ is the emitted frequency 
$v_{s}$ is the velocity of the source 
$v_{o}$ is the velocity of the observer
$v$ is the wave speed



**Approaching Source**
$$
f_{+} = \frac{f_{0}}{1-v_{s}/v}
$$

**Receding Source**
$$
f_{-} = \frac{f_{0}}{1+v_{s}/v}
$$

**Observer approaching a source** 
$$
f_{+}=(1 + v_{o}/v)f_{0}
$$

**Observer receding from a source** 
$$
f_{-}=(1-v_{o}/v)f_{0}
$$

**General Doppler effect**
$$
f_{\pm}=f_{0} \left( \frac{v \pm v_{o}}{v \pm v_{s}} \right)
$$
> **Numerator**: Use $+$ if the observer moves towards the source use $-$ if moving away.
>**Denominator**: use $-$ if the source moves towards the observe use $+$ if moving away from the observer



## Superposition

The number of standing waves with a system is called the standing wave mode $m$


&emsp;


**Amplitude at position $x$**
$$
A(x)=2a\sin kx
$$

### Solving Interference Problems

1. **Maximum constructive interference** occurs where crests are aligned with crests and troughs with troughs. The waves are in phase.
2. **Maximum destructive interference** occurs where crests are aligned with troughs. The waves are out of phase.


**Phase difference**
$$
\begin{array}{ll}
 \text{Constructive}:  & \Delta \phi = 2\pi  \frac{\Delta r}{\lambda} + \Delta \phi_{0} = m \cdot 2\pi \\
\text{Destructive:} & \Delta \phi =2\pi \frac{\Delta r}{\lambda}+\Delta \phi_{0} =(m+\frac{1}{2}) \cdot 2\pi

\end{array}
$$
> $\Delta r$ is the path length difference between of the two waves
> $\Delta \phi_{0}$ is any phase difference in between the sources

**Path difference**
$$
\begin{array}{ll}
\text{Constructive:}  & \Delta r =m\lambda \\
\text{Destructive:} & \Delta r=\left( m+\frac{1}{2} \right)\lambda
\end{array}
$$


&emsp;
### Boundary Conditions

**Displacement node ⇄ Pressure antinode**
**Displacement antinode ⇄ Pressure node**

&emsp;

**Closed Closed and Open Open Tube** equations
$$
\begin{array}{ll} \displaystyle
\lambda_{m}=\frac{2L}{m}   
 & \displaystyle f_{m} = m  \frac{v}{2L}=mf_{1}  & m=1,2,3,\dots
\end{array}
$$
> **Closed closed** must have nodes at both ends 
> **Open open** must have antinodes at both ends
> And where $f_{1}$ is the fundamental frequency 

**Open Closed tube equations**

$$
\begin{array}{ll} \displaystyle
\lambda_{m}=\frac{4L}{m}   
 & \displaystyle f_{m} = m  \frac{v}{4L}=mf_{1}  & m=1,3,5,7,\dots
\end{array}
$$
> $f_{1}$ is the fundamental frequency 


**Beats equation**
$$
f_{\mathrm{beat}}= | f_{1}-f_{2}|
$$



&emsp;
# Kinematics

## Constant Acceleration 
$$
\begin{array}{ll}
v_{fs}=v_{is}+a_{s}\Delta t \\
s_{f}=s_{i} +v_{is} \Delta t +\frac{1}{2}a_{s}(\Delta t)^2 \\
v_{fs}^2=v_{is}^2+2a_{s}\Delta s
\end{array}
$$
> $s$ indicates an arbitrary direction $(x,y)$


## Uniform Motion Kinematic Equations
	
$$
\begin{array}{ll}
v_{s} = \Delta s/ \Delta t \\
s_{f} = s_{i} +v_{s} \Delta t
\end{array}
$$

## Uniform Circular Motion
**Angular Velocity**
$$
\omega =\frac{2\pi r}{T} = \frac{d\theta}{dt}
$$
> Where $T$ is the **Period** and $r$ is the **radius** of the path of motion
****
**Centripetal Acceleration**
$$
 \vec{a}=\frac{v^2}{r}
$$
> where $v$ is the velocity tangential to the motion of a particle at a specific point.
****

**Magnitude of Centripetal Acceleration**
$$
a=\omega^2 r
$$
> where $a$ is the magnitude of Centripetal Acceleration
****
**Tangential Velocity**
$$
v = \omega r
$$
****


**Definitions**
1. **Period:** The period is the amount of time it takes for the particle to do 1 revolution. 
2. $\omega$ (omega): is the symbol for angular velocity were positive $\omega$ is counter clockwise
3. $\alpha$ (alpha): is the symbol for angular acceleration were positive $\alpha$ is counter clockwise

****

&emsp;
# Friction 


## Static Friction
**Force of static Friction**
$$
\begin{array}{ll}
F_{s}\leq \mu_{s}F_{n}  \\
F_{s}^{\text{MAX}}=\mu_{s}F_{n} 
\end{array}
$$
> where $\mu_{k}$ is the coefficient of static friction


## Kinetic Friction
**Force of Kinetic Friction**
$$
F_{k} = \mu_{k} F_{n}
$$
> where $\mu_{k}$ is the coefficient of kinetic friction

****

&emsp;




# Springs 

**Energy Stored in a spring**
$$
U_{s}=\frac{1}{2}k(\Delta s)^2
$$
> Where $\Delta s$ is the distance between the spring equilibrium and its "stretched position"

**Hooke's Law**
$$
F=-k \Delta x
$$
> $k$ is in the opposite direction because the spring pulls against the forces that displace it. $\Delta x$ is the displacement from the springs equilibrium.  

****

**Spring constant for springs in parallel**
$$
k_{eq}= k_{1}+k_{2}\dots +k_{n}
$$
**Spring constant for springs in series**
$$
k_{eq}^{-1}=k_{1}^{-1}+k_{2}^{-1}\dots +k_{n} ^{-1}
$$




****

&emsp;
# Newtons Laws of Motion 

## First
An object at rest will stay at rest, and an object in motion will stay in motion with the same velocity, unless acted upon by an external force.

## Second 
The acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass.
$$
F=ma
$$

## Third

![||Right|200](https://stickmanphysics.com/wp-content/uploads/2020/10/Newtons-3rd-wall.jpg)

For every action, there is an equal and opposite reaction.  When one object exerts a force on a second object, the second object exerts a force of equal magnitude and opposite direction on the first object.

$F_{1}=F_{2}$
****

&emsp;

# Gravity

$$
g=\frac{F_{\text{M on m}}}{m} = \frac{GM}{r^2}
$$

****
&emsp;
# Energy

**Definition of Work**
$$
\Delta E_{\text{sys}}=W_{ext}
$$
> where $W_{\text{ext}}$ is the amount of energy leaving
****

**Kinetic Energy**
$$
K=\frac{1}{2}mv^2
$$

****

**Gravitational Potential Energy**

$$
U_{g}=mgh
$$
> where $h$ is the hight from an arbitrary position


****
**Work for non constant force**
$$
W=\int_{s_{i}}^{s_{f}} F_{s} \, ds 
$$
> work done by for $\vec{F}$ as a particle is displaced from $s_{i}$ to $s_{f}$ 
>$F_{s}$ is the component of $\vec{F}$ in the $s$ direction 

****

**Work Done with constant force**
$$
\begin{array}{l}
W=F(\Delta r)\cos \theta \\
W= \vec{F} \cdot \Delta  \vec{r}
\end{array}
$$
> (work is done by a constant force) where $\theta$ is the angle between the force and the particles displacement $\Delta  \vec{r}$ 

****

**Total system work equation**
$$
\Delta E_{\text{sys}} = \Delta K + \Delta E_{th} = W_{ext}
$$
****

**Power Definition**
$$
P = \frac{dE_{sys}}{dt}
$$
****
**Power relative to a constant force and velocity**
$$
P= \vec{F} \cdot  \vec{v} = Fv \cos \theta
$$

****
&emsp;



# Vector Equations 

$$
\theta= \tan^{-1}\left( \frac{A_{y}}{B_{x}} \right)
$$
> This is useful to find the $\theta$ of any any vector just remember the "functional domain" of $\tan^{-1}$ $\left[ -\frac{\pi}{2},\frac{\pi}{2} \right]$

$$
|\vec{a}| = \sqrt{ a_{x}^2 +b_{y}^2}
$$
> Within $\mathbb R^2$ 
