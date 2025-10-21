

&emsp;
# Intro 
Linear transformations are practically a way to apply functions to matrices. This allows us to do "operations" on matrices and represent certain actions mathematically. Note that not all things done to a matrix are linear transformations ([[#Conditions of being a Linear Transformations Linear Transformation .|conditions of being a L.T]]). 


&emsp;

## Definition
A **transformation** or **mapping** or **function** $T$ from $\mathbb{R}^n$ to $\mathbb{R}^m$ is a rule that assigns to each vector $v$ in $\mathbb{R}^n$ a <u>unique</u> vector $T(v)$ in $\mathbb{R}^m$. 
$$
T:\mathbb{R}^n \to \mathbb{R}^m
$$
Were $\mathbb{R}^n$ is the **Domain** of the function $T$ and $\mathbb{R}^m$ is the **codomain/target space** of the function $T$. Note that for the function $T$ the **range** of the function is a **subspace** of **codomain**.

&emsp;
### Conditions of being a [[Linear Transformations|Linear Transformation]]. 
Being a linear Transformation requires that the operation matches specific criteria not every "operation" applied to a given matrix is a linear transformation. 

A transformation $T:\mathbb{R}^n \to \mathbb{R}^m$ is called a **linear transformation** if
1. $T(u+v)=T(u)+T(v)$ for all $u$ and $v$ in $\mathbb{R}^n$ 
2. $T(cv)=cT(v)$ for all $v$ in $\mathbb{R}^n$ and scalars $c$.

#### Practical Solving Technique
Using the two equations above to prove a linear transformation can be tedious if its not immediately obvious which relationship would disprove a potential L.T. To make our lives easier we can use a combined equation to prove both at once.

$T:\mathbb{R}^n\to \mathbb{R}^m$ is a linear transformation if 
$$
T(c_{1}v_{1}+c_{2}v_{2})=c_{1}T(v_{1})+c_{2}T(v_{2})
$$
 > for all $v_{1},v_{2}$ in $\mathbb{R}^n$ and scalars $c_{1},c_{2}$ 


> [!Example]-  EXAMPLE: $T \left( \begin{bmatrix} x \\y \end{bmatrix} \right)= \begin{bmatrix} y \\ x^2\end{bmatrix}$
>  
> To know whether or not this linear transformation is valid we can simply use the combined linear transformation [[#Practical Solving Technique|conditional]]:
> $$
> \begin{array}{ll}
> T(c_{1}v+c_{2}u)=c_{1}T(v)+c_{2}T(u)
> \end{array}
> $$
> where $T$ is the given linear transformation and $v$ and $u$ are each vectors of the same size as our input, meaning:
> $$
> \begin{array}{ll}
> v = \begin{bmatrix}
> v_{1} \\ v_{2}
> \end{bmatrix}, & u =  
> \begin{bmatrix}
> u_{1} \\ u_{2}
> \end{bmatrix}
> \end{array}
> $$
> Substituting this for the given equation and simplifying we get.  
> 
> $$
> \begin{array}{ll}
> T\left( 
> \begin{bmatrix}
> c_{1}v_{1} \\
> c_{1}v_{2}
> \end{bmatrix} + 
> \begin{bmatrix}
> c_{2}u_{1} \\
> c_{2}u_{2}
> \end{bmatrix} 
> \right) =  
>  
>  
> 
>   c_{1} T  
> \left(
> \begin{bmatrix}
> v_{1} \\
> v_{2}
> \end{bmatrix} 
>  \right) + 
>    c_{2} T  
> \left(
> \begin{bmatrix}
> u_{1} \\
> u_{2}
> \end{bmatrix} 
>  \right)
>  
>   \\
> T\left(
> \begin{bmatrix}
> c_{1}v_{1} +c_{2}u_{1} \\
> c_{1}v_{2} +c_{2}u_{2}
> \end{bmatrix}
> \right) = 
>   c_{1} T  
> \left(
> \begin{bmatrix}
> v_{1} \\
> v_{2}
> \end{bmatrix} 
>  \right) + 
>    c_{2} T  
> \left(
> \begin{bmatrix}
> u_{1} \\
> u_{2}
> \end{bmatrix} 
>  \right)
> 
> \end{array}
> $$
> Now we can apply the transformation to both sides by simply treating the groups of variables created in our expansion as either $x$ or $y$. Practically this means flipping the rows and squaring the bottom row (before it is flipped with the top)
> $$
> \begin{array}{ll}
> 
> \begin{bmatrix} 
> (c_{1}v_{2} +c_{2}u_{2})^2 \\
> c_{1}v_{1} +c_{2}u_{1} 
> \end{bmatrix}
>  = 
>   c_{1} 
> \left(
> \begin{bmatrix}
> (v_{2})^2 \\
> v_{1}
> \end{bmatrix} 
>  \right) + 
>    c_{2}   
> \left(
> \begin{bmatrix}
> (u_{2})^2 \\
> u_{1}
> \end{bmatrix} 
>  \right)
>  \\ 
>  
>  
> 
> \begin{bmatrix}   
>  c_{1}^2v_{1}^2 +2(c_{1}c_{2}v_{1}v_{2}) +c_{2}^2 v_{2}^2\\
> (c_{1}v_{2} +c_{2}u_{2})^2 \\
> c_{1}v_{1} +c_{2}u_{1} 
> \end{bmatrix}
>  = 
>    
> 
> \begin{bmatrix}
> c_{1}(v_{2})^2 \\
> c_{1}v_{1}
> \end{bmatrix} 
>   + 
> \begin{bmatrix}
> c_{2}(u_{2})^2 \\
> c_{2}u_{1}
> \end{bmatrix} 
>  
> 
> \end{array}
> $$
> Even at this step of the equation it becomes obvious that these two statements aren't true and that $[y^2,x]$ is not a linear transformation. But if we simplify more we get the final equation. 
> $$\large
> \begin{bmatrix}   
>  c_{1}^2v_{1}^2 +2(c_{1}c_{2}v_{1}v_{2}) +c_{2}^2 v_{2}^2\\
> (c_{1}v_{2} +c_{2}u_{2})^2 \\
> c_{1}v_{1} +c_{2}u_{1} 
> \end{bmatrix} \not =  
>  
>  
> \begin{bmatrix}
> c_{1}v_{2}^2 c_{1}u_{2}^2\\
> c_{1}v_{1}+c_{2}u_{2}
> \end{bmatrix}
> $$
> Therefore we know that the given equation is **<u>not</u>** a [[#Definition|linear transformation.]]  
> 


&emsp;

## Standard Matrices 
A **standard matrix** is a way to represent the operation of a [[#Definition|linear transformation]] as a matrix $A$. The operation is the same as multiplying by the standard matrix and can be mathematically represented by:
$$
T_{A}(x)=Ax \, (\text{for } x \text{ in } \mathbb{R}^n)
$$


### How to find the standard matrix 
Finding the standard matrix is fairly simple if we realize that linear transformations are isolated from their inputs. What this means is that the operation is the same in nature regardless of the specific input, therefore if we apply a linear transformation to a given identity matrix $(I_{n})$ the operation applied to the Identity matrix will be representative of only that Linear transformation. Multiplying by this $T(I_{n})$ will therefore do the same thing as applying the transformation.

Let $T:\mathbb{R}^n\to \mathbb{R}^m$ be a linear transformation. Then $T$ is a matrix transformation. More specifically, $T=T_{A}$ where $A$ is the $m \times n$ matrix:
$$
A= [T(e_{1})\vdots T(e_{2}) \vdots\dots \vdots T(e_{n}) ]
$$
>  Where $e_{1},e_{2}\dots ,e_{n}$ is the standard basis vectors of the identity matrix for given size $I_{n}$


> [!EXAMPLE]- PUT EXAMPLE
> Contents


## Combining Linear Transformations
Sometimes its required to chain different linear transformations together this is done pretty simply and is reliant on the properties that allow the [[#Standard Matrices|standard matrix]]. Namely the fact that we can represent linear transformations as matrices.

Let $T:\mathbb{R}^n \to \mathbb{R}^n$ and $S:\mathbb{R}^n \to \mathbb{R}^p$ be linear transformations. Then $S \circ T: \mathbb{R}^m \to \mathbb{R}^p$ is a linear transformation. Moreover, their standard matrices are related by 
$$
[S \circ T]=[S][T]
$$


## Further Formulas/Relationships



&emsp;


