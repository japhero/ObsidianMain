# Dump






$$
\int_{a}^b \sqrt{ r^2 +\left( \frac{dr}{d\theta} \right)^2} \, d\theta 
$$
> arc length 


**cartesian to polar**
$$
r = \sqrt{ x^2 +y^2}
$$
$$
\theta = \tan^{-1}\left( \frac{y}{x} \right)
$$
$$
\begin{array} {l}
x=r\cos \theta  \\
y=r\sin \theta
\end{array}
$$


## Cardioid
$r= a\pm a\sin \theta$
$r=a\pm a\cos \theta$

- line of semetry will intersect at $2a$
- non line of semetry will intersect at  $\pm a$
- zero is where the 

![](https://i.imgur.com/bEBB3JV.png)


## Limacon 
$r=a \pm b \sin \theta$
$r=a \pm b \cos \theta$

- dimpled when $b<a<2b$
- convex when $a \geq 2b$
- [[#Cardioid]] when $a=b$
- loop when $a<b$



## Roses
- Roses with an odd amount of pedals eg $\sin (3\theta)$ will be drawn twice 
- Roses with an even coefficient inside the $\sin$ or $\cos$.



## Polar derivatives 

- isnt the function r just the distance from the origin as theta changes

- to take the derivative simply take the derivative normally 

- use $xy$ definitions for polar and then represent the derivative as 

> [!INFO]- Proof of the polar derivative equation ${\frac{dy}{dx}=\frac{\frac{dr}{d\theta}\sin \theta+r\cos \theta}{\frac{dr}{d\theta}\cos \theta-r\sin \theta}}$
> 
> 1. At its base we use the formulas that relate polar to cartesian to then get a cartesian slope$\left( \frac{dy}{dx} \right)$. Although note that this slope is still in the form $\frac{dy}{dx}=f(\theta)$ 
> $$
> \begin{array}{l}
> x=r\cos(\theta) \\
> y=r\sin (\theta)
> \end{array}
> $$
> 2. Now if we take the derivative of each definition using [[chain rule]]
> 
> $$
> \begin{array}{l} 
> \frac{dx}{d\theta}=\frac{dr}{d\theta}\cos \theta-r\sin \theta \\
> \frac{dy}{d\theta}=\frac{dr}{d\theta} \cos \theta - r\sin \theta
> \end{array}
> $$
> 3. Now we simply substitute that in for the basic slope formula $\frac{dy}{dx}$
> 
> 
> $$
> 
> \large{\frac{dy}{dx}=\frac{\frac{dr}{d\theta}\sin \theta+r\cos \theta}{\frac{dr}{d\theta}\cos \theta-r\sin \theta}}
> $$


$$ 
 \large{\frac{dy}{dx}=\frac{\frac{dr}{d\theta}\sin \theta+r\cos \theta}{\frac{dr}{d\theta}\cos \theta-r\sin \theta}}
$$


## Polar integrals

$$
\frac{1}{2}\int_{a}^b r(\theta)^2\, d\theta
$$
> area of function
![](https://i.imgur.com/UuUFBTn.png)

- The area formula is found through the fact that each $d\theta$ in the integral to find the area





# Resources

[KA: Worked example: Area enclosed by cardioid](https://www.khanacademy.org/math/ap-calculus-bc/bc-advanced-functions-new/bc-9-8/v/cardioid-area)
[KA:  Polar functions derivatives](https://www.youtube.com/watch?v=8mS9eDHf0fQ)