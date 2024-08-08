

# Dump 

## Systems 
[[Quadratic Formula]]


## Areas and Volume 
- You will not be tested on the formulas of volume and if you are tested on a shape it will be provided within the prompt
- To evaluate 
	- Find formula
	- Plug in 
	- Solve
- you may be tasked to find length or other factors after being given a formula and the volume.
- Linear dimensions (factors of volume equations that are to the first power) effect the volume of solids in a linear fashion. For example $h$ (height) in the equation of a Cylinder $(\pi r^2h)$ 
	- Maybe you can solve by writing the "changes" to the formulas as coefficients to the base and then figure out the total coefficient change to all of the variables. Simply if my formula is made up of variables with varying degrees for example $(ab^2)$ and the question says that the new volume is twice $a$ and 3 times $b$ write those as coefficients $((2a)(3b)^2)$ extract a total coefficient by extrapolating. $2*3^2*ab^2$ and now we get a total coefficient of $18$ because $9*2$ where as  before the coefficient was $1$.  Basically we substitue in coefficients and see what we are scaling by.
	- Note that this only works when the formula is not a summation
	- [EXAMPLE ](https://www.khanacademy.org/test-prep/v2-sat-math/x0fcc98a58ba3bea7:geometry-and-trigonometry-easier/x0fcc98a58ba3bea7:area-and-volume-easier/v/sat-math-s1-harder)

## Congruence, similarity, and angle relationships
- Sum of triangle angles is $180\degree$ 
- Supplementary angles = Angles adjacent to each other at an intersection of two lines; their measures add up to $180\degree$ 
- Vertical angles = Angles on the opposite sides of an intersection of two lines; they have the same measure.

### Similar triangles
- Similar triangles can be created in many ways and its important to recognize them when you see them. Remember that the similar angle corresponds with the same line.

![[Screenshot 2024-07-26 at 4.00.23 PM.png|310]]![[Screenshot 2024-07-26 at 4.00.33 PM.png||270]]
- Similar triangles are triangles with the same angles but different lengths
- Ratio between the lengths is called $k$
![[Pasted image 20240726173800.png|200]]
- if in 2 triangles there are 2 corresponding angles meaning 4 angles total you can assume that the triangles are similar.
	- Similar triangles dont neccicarily have the same side lengths 
- Key is ratio of corrosponding sides when solving angles you can set up equations to solve for sides like so
if you have corresponding triangles $\overline {ABC}$ and $\overline{DEF}$  then to solve for any side use the ratio of corresponding sides. This follows because any given ratio of corresponding triangles will be the same $\frac{\overline{AB}}{\overline{DE}}=\frac{\overline{BC}}{\overline{EF}}$
-  Whats isosceles
	- same length on 2 sides

![[Pasted image 20240802135027.png|400]]
- Using the types of triangle we can assume cirtain things for example on a equilateral triangle we can assume that all angles are the same. Another example would be an isosceles triangle where we can assume that the 2 acute angles are the same. 
- Basically use logical reasoning to assert the angles.
- **Congruent** angels are angles that have the exact same measurement
- **Corresponding** angles are always equal but indicate that because of some symmetry such as parallel lines they correspond to be equal.

**Solving**
- If you are given the side lengths use them to see what angles corrospond as the side opposite from corrosponding angles is allways the same length at least for similar triangles.

## Right triangles
- [[Pythagoras theorem]] 
$$
a^2+b^2=c^2
$$

- What are Pythagorean triples
	- "integers that satisfy the Pythagorean theorem." Basicaly all 3 values in Pythagoras theorem.
	- The usage is remembering them to save time 
- 9,12,15
- 5,12,13
- 7,24,25

- What is a Trigonomic ratio
	- The ratio between 2 similar triangles
- 3 angles in common is a similar triangle
- 
$$
\begin{aligned}
\sin \theta &=\dfrac{\text{opposite leg}}{\text{hypotenuse}}=\dfrac{{BC}}{{AB}} \\\\
\cos \theta &=\dfrac{\text{adjacent leg}}{\text{hypotenuse}} =\dfrac{{AC}}{{AB}}\\\\
\tan \theta &=\dfrac{\text{opposite leg}}{\text{adjacent leg}}=\dfrac{{BC}}{{AC}}
\end{aligned}$$
Or **SOCATOA**

- The sin cos and tan of corrosponding angles in similar triangles will allways be the same.

### Special right triangles

![[Screenshot 2024-08-02 at 2.25.51 PM.png|200]]
- The special triangles act as formulas for the different relationships that we will find between sides depending on the angles given
- REMEMBER $30\degree,60\degree,90\degree$ and $45\degree,45\degree,90\degree$
- also know that we can identfy speical right triangles by the ratios found for example of the ratio between the short side and the hypotenuse is $s=2h$ and the triangle contains a right angle we can assume its a special right triangle

## Circles 

**Definitions**
- arc lengths = lengths of portions of a circle
- Sector areas = areas defined by 2 radii like piechart or pizza slice


### Arc lengths and sector areas

- Ratio of the arc length to the entire **circumference** should be the same as the ratio of the central angle and $360 \degree$ 
$$\frac{\text{arc length}}{\text{circumference}} = \frac{\text{central angle}}{360 \degree}$$
- we can then use this equation to solve for any given part when given 2 the two others. 
- Area problems use a ratio of the area of the sector to the total area of the circle and the degres of central angle compared to the total angle 
$$\frac{\text{Area of Sector}}{\text{Total circle area}} = \frac{\text{central angle}}{360 \degree}$$

<img src = "https://i.imgur.com/lNNR1zm.png" width =300>
- When solving for circles have triangles instead of arcs the same rules apply to find the central angle although you have to use other rules such as the isosceles triangle rule to find the other 2 angles.



> [!EXAMPLE]- EXAMPLE: The circle below with center $O$ has a circumference of $12\pi$. What is the length of minor arc $\stackrel\frown{AC}$ ?             
> ![[Pasted image 20240802170158.png|left|400]] 
> 
> 
> 
> 
> Because we are given the central angle and circumference we can solve for the arc using the ratio of angle to $360\degree$ and arc to circumference. This relationship can be represented with the equation:
> $$\frac{\text{arc length}}{\text{circumference}} = \frac{\text{central angle}}{360 \degree}$$
> This can be then used simply by plugging in what was given:
> $$
> \frac{x}{12\pi}= \frac{120\degree}{360 \degree}
> $$
> Now all we have to do is solve.
> $$x=\frac{120}{360} \cdot 12\pi=\color{yellow} 4\pi$$
> 

## Unit Circle Trig
1. Convert between radians and degrees
2. Use our knowledge of special right triangles to find radian measures
3. Identify the sine, cosine, and tangent of common radian measures


**Formulas to convert to and from Radians and Degrees**
$$\text{Degrees} =\text{Radians} \cdot \frac{180}{\pi}$$
$$\text{Radians}=\text{Degrees} \cdot \frac{\pi}{180}$$
$$
\frac{\text{Radians}}{\pi}=\frac{\text{Degrees}}{180}
$$
- Unit circle means that the radius is 1
- $\sin$ is the y cordinate
- $\cos$ is the x cordinate
- We can use special right triangles (especially 30,60,90) to manually figure out the trig definitions for an angle. 
	![[Trig definitions using special triangles]]


> [!EXAMPLE]- EXAMPLE: In the  $xy$-plane below, $O$ is the center of the circle, and the measure of $\angle AOB$ is $\dfrac{\pi}{a}$. What is the value of $a$ ?
> 
> <img src = "https://i.imgur.com/BPKWtY2.png" width =300>
> We know we are looking for an angle in radians which is a fraction of $\pi$. To start we are going to represent the point with a right triangle using the point to represent the lengths of the triangle's sides.
> 
> <img src = "https://i.imgur.com/ogfVjgg.png" width = 300> 
> 
> To complete the triangle we are going to solve for the hypotenuse using [[Pythagoras theorem]]:  $\left ( \sqrt{ (\sqrt{ 3 })^2 +1^2} \right ) =2$ 
> 
> Now that we have the hypotenuse some keen people might have noticed that these numbers look very familiar to a special right triangle and it is!! Knowing this we can infer that the angle we are is $60 \degree$ because the corresponding special triangle is a $30,60,90$ triangle.
> 
> Now that we have the degree all we have to do is convert it to radians which simply requires multiplying it by $\frac{\pi}{180}$ : 
> 
> $$60 \cdot \frac{\pi}{180} =\frac{\pi}{\color{yellow} 3}$$

- We only use sin and cos to represent x and y when solving in a unit circle 

## Circle Equations

**Circle Formula**

Standard form in which the circle has a center $(h,k)$ and radius $r$
$$
(x-h)^2+(y-k)^2=r^2
$$

### [[Factoring polynomials#Completing the square|Completing the square]]
- we want to make both squares perfect squaes we do this by manipulaiting the $c$ component.
- Works for any quadratic 
- means making the quadratic a perfect square
- relies on the formula $x^2-2ax+a^2=(x-a)^2$
- this doesn't give the root so what is the purpose 
	- Can give the root by solving after factoring
- remember when taking the square root that the constants will be $\pm$.
$$\text{distance} = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}$$


