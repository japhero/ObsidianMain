&emsp;
&emsp;


#  DUMP



## [Kahn A linear combination and span](https://www.khanacademy.org/math/linear-algebra/vectors-and-spaces/linear-combinations/v/linear-combinations-and-span)
- Linear combination is any combination of 2 vectors using constants to manipulate both vectors 
- Linear combinations are called linear combinations because the only manipulation we do is using a scalar 
- a potential question to be asked with linear combinations is what is a set of all of the combinations of linear combinations 
	- You can represent any vector within $\mathbb R^2$ using linear combinations of 2 vectors that are not 0 vectors or a multiples of one another.

- **SPAN** is a set of the possible "end" locations of the total combinations
## Vector notation 

$\vec{F}$ Arrow is the combined vector while a hat $(\hat{x})$ denotes the unit vector

### Colum vectors 
These vectors are simply a different format for the vectors that we all know and love. 

$\text{Vector}(x,y) =\begin{bmatrix} x \\y\end{bmatrix}$


# Math 2114 VT DUMP
- Vectors carry multiplication like with a normal brackets
$$
\vec{v}=4[1,1,1]=[4,4,4]  
$$

#### Vector addition 
- When we add vectors we simply add its respective values together. 
	- in $\mathbb{R}^2$ with vector $u$ and $v$ we would get an expression that looks like 
$$
u+v=[u_{1}+v_{1},u_{2}+v_{2}]
$$

#### Vector Subtraction
- This rule is very similar to vector addition in the sense that the way we do the operation is the same but obviously the actual operation is different 

$$
u-v=[u_{1}-v_{1},u_{2}-v_{2}]
$$

#### Head-to-tail Rule
given 2 vectors $u$ and $v$ the vector $\vec{s}=u+v$ the new vector $s$ gives the the vector from the tail of $u$ to the head of $v$.
![[Pasted image 20250826231125.png]]

This also works with [[#Vector Subtraction]] but is inverted.
For example if given the 2 vectors $a$ and $b$ the vector $b-a$ would go from the head of $a$ to the tail of $b$
![[Pasted image 20250826231918.png]]







# 3b1b DUMP

## EP 1: Vectors
- Vectors can represent the output of functions 
- Vectors are
	- Physics: are arrows pointing in space and they have a **length** and **direction** they are independant of the origin
	- CS: vectors are orders lists of numbers a matrix. collum matrix?
	- Math: vectors are anything where its possible to add vectors and multiply them
	- General: An arrow in a coordinate system where the vector is at the origin of the coordinate system
- Vectors are the building blocks of linear algebra.
- Origin root of a vectors
- Cartesian cords represent the "tip" of vectors
-   $\text{Vector}(x,y) =\begin{bmatrix} x \\y\end{bmatrix}$
- linear algebra centers around vector addition and multiplication 
- **Addition**
	- each vector is a step and therefore it makes sense that. adding vectors would be the sum of the steps.
	- the vector sum is the same as just summing all of the x values and all of the $y$ values.
- **Multiplication by a number. Scalar?**
	- the operator is the effect on the length/magnitude meaning that if for example a vector has a length of 2 and we multiply it by 2 it has a length of 4 because its the effect on the length. 
	- Think about it as stretching or shrinking the vector.
	- Its called scaling 
	- Any number scaling a vector its a scalar so yes multiplication by a scalar.
	- if you have a vector thats a list of other vectors to scale the vector you have to apply the scalar to all the individual components of the vector.

## EP 2: Linear combinations, span, and basis vectors
-  think of each coordinate as a scalar that scales the respective $\hat{i}$ and $\hat{j}$ unit vector.
- =="Basis vectors"==
	- basis vectors are what the input scalars scale
	- $\text{unit vector in the y direction }= \hat{j}$
	- $\text{unit vector in the x direction}= \hat{i}$
- what if we chose different basis vectors
	- allows mathmaticians to build other frameworks using a similar set of rules.
- anytime we describe vectors numerically we are implying that we are using a reference set of basis vectors.
- ==**Linear combination**==
	- anytime you are scaling 2 different vectors and adding them together its called a linear combination
	- if you fix one vector and then scale only the other one the endpoint of the resultant vector will always be in a line
	- if your vectors "line up" or have the same polar angle it means they are limited to that angle but otherwise these 2 vectors can represent any vector that exists
	- $a\vec{w}+b\vec{v}=\text{linear combination}$
		- A and b are scalars

![right|300](https://i.imgur.com/qC6bwil.png)

- **==Span==**
	- The span is the set of all linear combinations possible with 2 sets of vectors
	- That harkens back to what spaces 2 vectors can represent when scaled as this is their span.
- When dealing with collections of vectors we can represent them as points in space.
- linear combination of 3 is built in the same way as with 2 vectors.
- ==**Linear dependance**== is when we can represent 1 vector instead of 2 without reducing the span the relationship between the vector replacing and being replaced is linear dependance. One vector can be represented as linear combination of others
	- This usual occurs when 2 vectors in 3d space fall on the same span or in 2d space when 2 vectors have the same "angle" in polar coordinates.
- ==**Linear independence**== 
	- $\vec{w}\neq a\vec{v}$
	- when one vector cannot be represented by scaling the other [[Vectors|vector]] they are linearly independent.
**Basis formal definition**
==**The basis of Vector space is a set of linearly independent vectors that span the full space.**==

## EP 3: Linear transformations and [[matricies]]







## Dot product and cross product

![](https://i.imgur.com/l53WRSM.png)

![](https://i.imgur.com/KhyRmQY.png)





&emsp;
&emsp;


---

# Resources 
<iframe width="560" height="315" src="https://www.youtube.com/embed/fNk_zzaMoSs?si=2T9HyD7MNYrdAtlI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
<iframe width="560" height="315" src="https://www.youtube.com/embed/k7RM-ot2NWY?si=tT_GbTdc7-8Bz9VW" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

[Linear Algebra: A Modern Introduction, 4th Edition](https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9780357038963&id=524237692&snapshotId=1251407&)
