#math #calculus 
# Dump

## Class stuff copied

- Disk method entails 2 formulas.
	- $\pi \int_{a}^b [f(x)]^2\, dx$
	- $\pi \int^b_{a} \left( [f(x)]^2 - [g(x)]^2 \right) \, dx$
	- thickness = $dx$
	- outer function - inner function
- when taking the integral of the functions its easier to foil out the function.
- $$\pi \int_{a}^b ([\mid f(x)-  D \mid \,]^2 -[\mid g(x)-  D\mid \,]^2)\, dx $$
	- were $D$ is the distance to the line of pivot.
	- Practically we wont apply the absolute value similarly to [[Definite integrals]] because its impossible to assume that state for a whole function so we will differentiate in between $[D-f(x)]$ and $[f(x)-D]$ not $[\mid f(x)- D \mid \,]$
	- when using washer method we must remember that for rotating across functions an axis of x or y the function must be in terms of the transfer fucntion for example if rotating across $x=1$ it has to be a function of $x$. 
	- "For the disk/washer method we integrate along the axis parallel to the axis of rotation."
	- $$
2\pi\int_{a}^b (\mid r -d \mid)(f(x)-g(x)) \, dx 
$$
remember that its really representing
$$
2\pi \int_{a}^b (radius)(height) \, dx 
$$

- When you have a function of a line plug in that value not the total area of that function as its found when taking the integral.
	- For example if you have $-x^2+2$ bound by $y=1$ and $x=0$ remember that to represent the "square" of the function dont use  the area ($1*1$) use the value of that function so $1$. This is because we need to remember that in this case we get the area when we integrate and the limits of integration decide the "width" in this case of the function (because its the line value * x) theoretically you could calculate the area and separate it out but that would be the same as doing $\int_{a}^b a-b \, dx = \int^b_{a} a \, dx -\int^b_{a} b \, dx$




![[relative offsets|right|1000]]





 

Both revolve 1around the y axis but they do so in different orientations 




## Cross section Dump
- use [[Shapes Formulas]]
- break the shape into tiles with a width of $dx$
- We are really getting the length of the base and the width and then solving for the area by taking the integral.
-  ==two objects are perpendicular if they intersect to form a right angle at the point of intersection==
- Fundamentally we always try to find a function of the "slice"
- pay attention when it gives you a function of the height.
- Cross sections have 3 parts 
	1. The Original function usually this means what is the height/distance between the 2 functions given. This is similar to a normal definite integral.
	2. Another part is what is the function that gives the "3d" area of a that function for example for a square this means simply squaring the height but for other functions such as a rectangle or semi circle it can mean manipulating the height. **Remember that the setup function should be a function of the area of "slice" of the volume.**
	3. The third part is coefficients this can change depending what "shape" we are finding for example for an  equilateral triangle this would be $\frac{\sqrt{ 3 }}{4}$ and then to create a function of the entire volume it would be $\frac{\sqrt{ 3 }}{4} \int^b_{a} a^2 \, dx$ because we are transposing the area function into a volume function by taking the integral of area and coefficients can always be extracted when taking the integral. 
### Semi circle
- use the formula $\frac{\pi r^2}{2}$
- remember that 
### Iso right Triangle 
<img src = "https://i.imgur.com/aNT6eQu.png" width = 60% align = "right">

- the sides of the triangle in respect to the hypotenuse can be written as $\frac{\sqrt{ 2 }}{2}h$.
- Area is going to be $\frac{1}{2} bh$
	- substituting $\frac{\sqrt{ 2 }h}{2}$ for $b$ and $h$ because gives us the equation 

$$
Area =\frac{\sqrt{ 2 }h}{2} \cdot \frac{\sqrt{ 2 }h}{2} \cdot \frac{1}{2} 
= \color{yellow} \frac{1}{4}h^2
$$
This means we can write a general formula for iso right triangles of 
$$ \color{orange}
Volume = \int_{a}^b \frac{1}{4}(f(x)-g(x))^2 \, dx 
$$

> [! Example]- proof for a $x=\frac{\sqrt{ 2 }}{2}h$ 
> 
> 
> $x^2+x^2=h^2$
> $= 2x^2 =h^2$
> $=x^2=\frac{h^2}{2}$
> $=a=\frac{h}{\sqrt{ 2 }}=\frac{\sqrt{ 2 }h}{2}$
> $$=
> \frac{\sqrt{ 2 }h}{2}
> $$
> 
 
---
# Resources 
<iframe width="560" height="315" src="https://www.youtube.com/embed/qMXPnfx2MQM?si=hvHmwXltx2PXmEuL" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/R-Qu3QWOEiA?si=H8CsfzignPzpSYfi" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
