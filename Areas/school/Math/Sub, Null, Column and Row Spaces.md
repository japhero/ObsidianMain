



# Subspaces
A **subspace** of $\mathbb{R}^n$ is any collection $S$ of vectors $\mathbb{R}^n$ such that:
1. The zero vector $0$ is in $S$.
2. If $u$ and $v$ are in $S$, then $u+v$ is in $S$. ($S$ is **closed under addition**)
3. If $u$ is in $S$ and $c$ is a scalar, then $cu$ is in $S$. ($s$ is **closed under scalar multiplication**)

&emsp;

- Write about conditionals and how they relate because they are the practical application


# Null Spaces
Let  be an $m\times n$ matrix. The **null space** of $A$ is the subspace of $\mathbb{R}^n$ consisting of solutions of the homogenous linear system $Ax=0$. It is denoted by $\text{null}(A)$

> [!Note]- Nullity
> The Nullity is simply the dimension of the null space. 
> $$
> \text{Nullity} =dim(\text{Null(A)})
> $$




## Rank Nullity Theorem 
We can relate null spaces in a useful way by considering the implications of the nullity and the [[Systems of linear equations#Rank Theorem|Rank Theorem]]. 

$$
\begin{array}{ll}
\text{Nullity}(A) + \text{Rank}(A)=n \\
\text{\# of free var} +\text{non-zero equations = \# of variables}
\end{array}
$$


# Column and Row Spaces 
&emsp;

## Definition
1. The **row space** of $A$ is the subspace $row(A)$ of $\mathbb{R}^n$ spanned by the rows of $A$. 
2. The **column space** of $A$ is the subspace $col(A)$ of $\mathbb{R}^m$ spanned by the columns of $A$. 



## Useful Relationships
We can relate the dimension of [[#Column and Row Spaces|row spaces]] and [[#Column and Row Spaces|column spaces]] using the expression below.
$$
\text{dim}(Row(A))=\text{dim}(Col(A))=\text{Rank}(A)
$$
 This also logically makes sense if we consider that the dimension of the row and column space will simply be the number of pivot columns that the matrix has in [[Systems of linear equations#Row Echelon Form|REF]]. This will also be the rank of the matrix.  