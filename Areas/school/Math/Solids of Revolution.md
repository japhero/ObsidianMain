#math #calculus 


# Disk/washer method 
<img src ="https://i.imgur.com/UZ7Uhe8.png" align = "right" width ="400" height = 180>

The disk method is a technique that one can use to get the area of a shape revolved around an axis. The area is attained by creating “disks” using the properties of the original function.

&emsp;
## Disk Method Formula
The formula is a [[Definite integrals|definite integral]] that multiplies the "height" of the function times the area of a circle ($\pi r^2$). **The result of multiplying the height times the circle practically gives a function of the area of a  single "disk"**; which when put in the terms of the larger integral will give the volume. It is very important to remember that in the setup of the equation we are trying to find the area of a single disk and then integrating that will give volume. Note that the relationship between area and volume is a product of integration.
$$ 
Disk \space  Method \space Volume= \pi \int_{a}^b [f(x)]^2\, dx
$$

&emsp;


## Washer Method 
The washer method is a combination of the [[Solids of Revolution#Disk Method Formula|disk method]], similarly to when finding the [[Definite integrals#Finding Definite integral with several functions.|definite integral with several functions]] we are in principle subtracting one area from another that's why it's called the washer method because when we subtract 2 disks it usually results in a washer like shape.

&emsp;

## Washer method formula
<img src = "https://i.imgur.com/f7PLXh9.png" align = "right" width =250>
The washer method formula is different than the disk in part because it relies on the principal of "outer" - "inner". This means that we are subtracting the function closest away from the line of rotation from the function farthest. This can be confusing because one has to remember the relativity to line of rotation not to the axis of rotation.

$$\pi \int_{a}^b (\mid [\mid f(x)-  D \mid \,]^2 -[\mid g(x)-  D\mid] \, \mid]^2)\, dx $$
>Note that the absolute value signs represent the "outer - inner" relationship.

&emsp;


# Cross sections

![[Pasted image 20240316203257.png|right|250]]Cross-sections are another technique to approximate the volume of  3d dimensional shapes, this technique differs because although the 3d shapes are defined by the base functions, in 3d space they can be represented as the cross-sections of other shapes such as squares and  semicircles.

&emsp;

Cross sections similarly to [[Solids of Revolution#Disk/washer method|the disk and washer method]] are at their core the summation of a infinite number of "slices", this is why the formula before integration is a formula of whatever shape the cross section represents with again the "height" of the given function as the parameter.

## The different parts of a cross section
![|right](https://i.imgur.com/xe8ZZOa.png)

![|right|](https://i.imgur.com/HsBHPug.png)



In my opinion cross sections are made of 2 different parts. 
1. **The Original function,** as with all other volume problems you are given a shape that you then take the cross section of this shape or function is half of the equation literally and figuratively. 
2. **The 3 dimensional shape,** the 3d shape expands on the original function to fill the given shape weather that's an equilateral triangle, semicircle or square it usually is the other half of the equation. This component is usually represented by applying the formula for its area to the original function.

## Formulas 
Cross sections are unique because they have several formula depending on what shape is applied and although you can apply a generic formula of the given 3d shape in some cases in other cases its easier to use a proxy or a representation of that function in the terms of the height usually a coefficient. 

&emsp;


### Semi Circle
![|right|250](https://i.imgur.com/YL4ThJF.png)
A semi circle is just as it seems a circle transposed with the area of the function as the radius of the circle. The formula is adapted to solve for $f(x)$ and gives a coefficient of $\frac{\pi}{8}$. 

$$
\frac{\pi}{8}\int^b_{b} f(x)^2 \, dx 
$$
> [!EXAMPLE]- Proof that semi circle coefficient is $\frac{\pi}{8}$
> The area of a circle is $\pi r^2$ but because its a half circle we have to divide by 2. (note that we substitute $f(x)$ for $r$ because the input we are given is $f(x)$)
> $=\frac{1}{2}\pi f(x)^2$
> currently the input is the diameter of the circle and because the formula requires radius we divide $f(x)$ by 2
> $=\frac{1}{2}\pi\left( \frac{f(x)}{2} \right)^2$ 
> then distribute the exponent and combine fractions.
> $$=\frac{1}{8}\pi f(x)^2 \space or \space \frac{1}{8}\pi r^2$$
> 




### Isosceles right Triangle 
<img src = "https://i.imgur.com/aNT6eQu.png" width = 60% align = "right">

- the sides of the triangle in respect to the hypotenuse can be written as $\frac{\sqrt{ 2 }}{2}h$.
- Area is going to be $\frac{1}{2} bh$
	- substituting $\frac{\sqrt{ 2 }h}{2}$ for $b$ and $h$ because gives us the equation 

$$
Area =\frac{\sqrt{ 2 }h}{2} \cdot \frac{\sqrt{ 2 }h}{2} \cdot \frac{1}{2} 
= \color{yellow} \frac{1}{4}h^2
$$
This means we can write a general formula for iso right triangles **when the hypotenuse is the base**
$$ \color{orange}
Volume = \int_{a}^b \frac{1}{4}(f(x)-g(x))^2 \, dx 

$$
when a leg of the triangle is the base the coefficients change.
$$
Volume =  \frac{1}{2}\int_{a}^b (f(x)-g(x))^2  \, dx 
$$
&emsp;







---
# Resources 
<iframe width="560" height="315" src="https://www.youtube.com/embed/qMXPnfx2MQM?si=hvHmwXltx2PXmEuL" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/R-Qu3QWOEiA?si=H8CsfzignPzpSYfi" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>


---

&emsp;

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
	1. **The Original function** usually this means what is the height/distance between the 2 functions given. This is similar to a normal definite integral.
	2. Another part is what is the function that gives the "3d" area of a that function for example for a square this means simply squaring the height but for other functions such as a rectangle or semi circle it can mean manipulating the height. **Remember that the setup function should be a function of the area of "slice" of the volume.**
	3. The third part is coefficients this can change depending what "shape" we are finding for example for an  equilateral triangle this would be $\frac{\sqrt{ 3 }}{4}$ and then to create a function of the entire volume it would be $\frac{\sqrt{ 3 }}{4} \int^b_{a} a^2 \, dx$ because we are transposing the area function into a volume function by taking the integral of area and coefficients can always be extracted when taking the integral. 
### Semi circle
- use the formula $\frac{\pi r^2}{2}$
- remember that 
 $$
\frac{\pi}{8}\int_{a}^b (f(x)-g(x))^2   \, dx 
$$
### Isosceles right Triangle 
<img src = "https://i.imgur.com/aNT6eQu.png" width = 60% align = "right">

- the sides of the triangle in respect to the hypotenuse can be written as $\frac{\sqrt{ 2 }}{2}h$.
- Area is going to be $\frac{1}{2} bh$
	- substituting $\frac{\sqrt{ 2 }h}{2}$ for $b$ and $h$ because gives us the equation 

$$
Area =\frac{\sqrt{ 2 }h}{2} \cdot \frac{\sqrt{ 2 }h}{2} \cdot \frac{1}{2} 
= \color{yellow} \frac{1}{4}h^2
$$
This means we can write a general formula for iso right triangles **when the hypotenuse is the base**
$$ \color{orange}
Volume = \int_{a}^b \frac{1}{4}(f(x)-g(x))^2 \, dx 

$$
when a leg of the triangle is the base the coefficients change.
$$
Volume =  \frac{1}{2}\int_{a}^b (f(x)-g(x))^2  \, dx 
$$


> [! Example]- proof for a $x=\frac{\sqrt{ 2 }}{2}h$ 
> 
> 
> $x^2+x^2=h^2$
> $= 2x^2 =h^2$
> $=x^2=\frac{h^2}{2}$
> $=x=\frac{h}{\sqrt{ 2 }}=\frac{\sqrt{ 2 }h}{2}$
> $$=
> \frac{\sqrt{ 2 }h}{2}
> $$
> 
 