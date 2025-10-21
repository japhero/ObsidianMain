

# Dump

- When we do a linear transformation we use subscript to indicate which matrix the transformation was applied to. 
$$
T_{A} \begin{bmatrix}
x \\
y
\end{bmatrix} 
$$
- This denotes that we applied the function $\begin{bmatrix} x\\ y\end{bmatrix}$ to the matrix $A$
- A **transformation** or **mapping** or **function** $T$ from $\mathbb{R}^n$ to $\mathbb{R}^m$ is a rule that assigns to each vector $v$ in $\mathbb{R}^n$ a <u>unique</u> vector $T(v)$ in $\mathbb{R}^m$. 
	- The notation for this transformation is 
$$
T:\mathbb{R}^n \to \mathbb{R}^m
$$
- the **domain** of $T$ is $\mathbb{R}^n$ and the **codomain** of $T$ is $\mathbb{R}^m$. 
- The range is every actual value of $T(v)$ 

### **Definition of a Linear Transformation** 

$T:\mathbb{R}^n\to \mathbb{R}^m$ is a linear transformation if 
$$
T(c_{1}v_{1}+c_{2}v_{2})=c_{1}T(v_{1})+c_{2}T(v_{2})
$$
 > for all $v_{1},v_{2}$ in $\mathbb{R}^n$ and scalars $c_{1},c_{2}$ 


&emsp;

### Def

Let $A$ be an $m\times n$ matrix. Then the matrix transformation $T_a:\mathbb{R}^n\to \mathbb{R}^m$ defined by
$$
T_{a}(x) = Ax \, (\text{for }x \text{ in }\mathbb{R}^n) 
$$
is a linear transformation


&emsp;

### **Theorem 3.31** (standard matrix of the linear transformation)
Let $T:\mathbb{R}^n \to \mathbb{R}^m$ be a linear transformation. Then $T$ is a matrix transformation. More specifically, $T=T_{A},$ where $A$ is the $m\times n$ matrix
$$
A= [T(e_{1})\vdots T(e_{2}) \vdots\dots \vdots T(e_{n}) ]
$$
> Where $e_{1},e_{2}\dots ,e_{n}$ is the standard basis vectors in $\mathbb{R}^n$.

&emsp;

### **Inverses of Linear transformations**

**Definition**
Let $S$ and $T$ be linear transformations from $\mathbb{R}^n$ to $\mathbb{R}^n$. Then $S$ and $T$ are inverse transformations if
$$S\circ T=I_{n} \text{ and } T\circ S= I_{n}$$.





