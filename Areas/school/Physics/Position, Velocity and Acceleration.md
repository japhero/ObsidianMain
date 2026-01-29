This note serves to show how the main 3 figures of motion are used in physics. This note is mainly there to explain differences in how these 3 are used not what they are. 


# Position
In physics position is often denoted by an arbitrary letter such as $r$ or $s$. In general the vector form of position is:
$$
\vec{r}=x\hat{i}+ y \hat{j}
$$
> where $\hat{i}$ and $\hat{j}$ are [[Vectors|unit vectors]] 

When using vectors is important to remember that a position vector is simply a vector that <u>points to the position.</u> The magnitude or angle often don't have much meaning, unlike with [[#Acceleration]] or [[#Velocity]]. 

****

&emsp;

# Velocity 
Velocity is again pretty simple it just has a few quirks and also can be represented like position. 
$$
\vec{v} = v_{x} \hat{i} + v_{y} \hat{j}
$$
> where we practically have a component vector for each cartesian direction $\vec{v} = [v_{x},v_{y}]$ 


## Average Velocity 
This is also pretty simple its just important to remember that the numerator $\Delta \vec r$ is a vector of position not the absolute distance of a particle  
$$
\vec{v}_{avg} = \frac{\Delta  \vec{r}}{\Delta t} = 
\frac{\Delta x}{\Delta t} \hat{i} + \frac{\Delta y}{\Delta t} \hat{j}
$$


 ****
&emsp;
# Acceleration 


## Average Acceleration
$$
\vec{a}_{\text{avg}} = a_{x} \hat{i}+ a_{y} \hat{j}=  \frac{d\vec{v}}{dt}= \frac{dv_{x}}{dt} \hat{i} + \frac{dv_{y}}{dt} \hat{j}
$$


&emsp;
****
# Vector componentization 
Sometimes we want to find specific components of vectors within mostly [[#Acceleration]] or [[#Velocity]]  but even sometimes [[#Position]]. To do this we just use basic trig conversions 

$$
\begin{array}{ll}
a_{x}=|a|\cos(\theta) \\
a_{y}=|a|\sin(\theta)
\end{array}
$$
> where $a$ is a vector in $\mathbb R^2$




# Useful Equations 
Just general vector equations 
$$
\theta= \tan^{-1}\left( \frac{A_{y}}{B_{x}} \right)
$$
> This is useful to find the $\theta$ of any any vector just remember the "functional domain" of $\tan^{-1}$ $\left[ -\frac{\pi}{2},\frac{\pi}{2} \right]$

$$
|\vec{a}| = \sqrt{ a_{x}^2 +b_{y}^2}
$$
> Within $\mathbb R^2$ 