


## Section 5.1 


> [!definition] DEF: Orthogonal Set 
> A set of vectors $\{ v_{1}, v_{2},\dots, v_{k} \}$ in $\mathbb{R}^n$ is called an **orthogonal set** if all pairs of distinct vectors in the set are orthogonal that is, if 
> 
> $$
> v_{i} \cdot v_{j} = 0 \, \text{  whenever } i \not =j \text{ for  } i,j=1,2, \dots ,k
> $$



> [!definition] DEF: Orthogonal basis 
> An orthogonal basis for a subspace $W$ of $\mathbb{R}^n$ is a basis of $W$ that is an orthogonal set. 


- Cross product of 3d vectors 

$$
\begin{array}{ll}
u=  
\begin{bmatrix}
u_{1} \\
u_{2} \\
u_{3}
\end{bmatrix} 
 &  
v=  
\begin{bmatrix}
v_{1} \\
v_{2} \\
v_{3}
\end{bmatrix}
\end{array}
$$
$$
u \times v =  
\begin{bmatrix}
u_{2}v_{3}-u_{3}v_{2} \\
u_{3}v_{1} - u_{1}v_{3} \\
u_{1}v_{2}-u_{2}v_{1}
\end{bmatrix}
$$
- Cross product of two vectors is orthogonal to both of them

## Section 5.2 


> [!definition] DEF: **Orthogonal Projection** 
> 
> Let $W$ be a subspace of $\mathbb{R}^n$ and let $\{ u_{1},\dots,u_{k} \}$ be an <u>orthogonal basis</u> for $W$. For any vector $v$ in $\mathbb{R}^n$, the **orthogonal projection of $v$ onto W** is defined as 
> $$
> \text{proj}_{W}(v) = \left( \frac{u_{1} \cdot v}{u_{1} \cdot u_{1}} \right)u_{1} +\dots+\left( \frac{u_{k} \cdot v}{u_{k} \cdot u_{k}} \right) u_{k}
> $$
> 
> 
> The **Component of $v$ orthogonal to $W$** is the vector 
> $$
> \text{perp}_{W}(v)= v- \text{proj}_{W}(v)
> $$
> 



**THRM**
Let $W$ be a subspace of $\mathbb{R}^n$ and let $v$ be a vector in $\mathbb{R}^n$. Then there are unique vectors $w$ in $W$ and $w^\perp$ in $W^\perp$ such that 
$$
v = w+ w^\perp
$$



## Section 5.3 

**Gram-Schmidt Process** 
- A way to find orthogonal basis for a subspace W of $\mathbb{R}^n$ 

Let $\{ x_{1}, \dots,x_{k} \}$ be a basis for a subspace $W$ of $\mathbb{R}^n$ and define the following:

$$
\begin{array}{lll}
v_{1}=x_{1},  &  W_{1}= \text{span}(x_{1}) \\
v_{2}= x_{2} - \left( \frac{{v_{1} \cdot x_{2}}}{v_{1} \cdot v_{1}} \right)v_{1}, & W_{2} = \text{span}(x_{1},x_{2}) \\
v_{3}= x_{3} - \left( \frac{{v_{1} \cdot x_{3}}}{v_{1} \cdot v_{1}} \right)v_{1} - \left( \frac{{v_{2} \cdot x_{3}}}{v_{2} \cdot v_{2}} \right)v_{2}, & W_{2} = \text{span}(x_{1},x_{2}) \\
\vdots \\
v_{k} = x_{k}- \left( \frac{{v_{1} \cdot x_{k}}}{v_{1} \cdot v_{1}} \right)v_{1} - \left( \frac{v_{2} \cdot x_{k}}{v_{2} \cdot v_{2}}  \right) -\dots- \left( \frac{v_{k-1} \cdot x_{k}}{v_{k-1} \cdot c_{k-1}} \right)v_{k-1}, & W_{k} = \text{span}(x_{1},\dots,x_{k})

\end{array}
$$

Then for each $i=1,\dots,k, \{ v_{1},\dots,v_{i} \}$ is an orthogonal basis for $W_{i}$. In particular, $\{ v_{1},\dots,v_{k} \}$ is an orthogonal basis for $W$. 




### Question 
- How do you 



