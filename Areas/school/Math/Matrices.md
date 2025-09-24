

# DUMP

- addition or subtraction of matrices has to have 2 of the same size matrices
- Matricies are row x collum
### **Matrix Transpose**
- uses the apostrophe  (') symbol
- Matrix transposition is when you take the rows in collums and take the collums into rows
$$
A=
\begin{bmatrix} 
1 & 4 \\
-2 & 3 \\
12  & 7
\end{bmatrix}
$$
**This is a transposed matrix**
$$
A'= \begin{bmatrix}
1 & -2 & 12 \\
4 & 3 & 7
\end{bmatrix}
$$

### Matrix multiplication
- **Inner dimensions** must match
- Resulting matrix has the dimensions as the **outer dimensions**
- order matters when multiplying matrices 
	-  **Inner dimension** are the column number of the first matrix and the row number of the second matrix. Eg.. $[3\times \colorbox{green} {2] [3} \times 2]$ the highlighted section are the inner values 
	- **Outer dimensions** are the row number of the first matrix and the column number of the second matrix. Eg $\colorbox{green} {[3} \times 2] [3 \times \colorbox{green} {2]}$ the highlighted section is the "outer values".


**How to actually multiply the matrices**


> [!EXAMPLE]- Example
> 
> If given 
> $$
> A=
> \begin{bmatrix} 
> 1 & 4 \\
> -2 & 3 \\
> 12  & 7
> \end{bmatrix}, \space
> B'= \begin{bmatrix}
> -4 & 20 & 7 \\
> -3 & 9 & 4
> \end{bmatrix}
> $$
> First we know that the resulting matrix has to be $3\times 3$ because the first matrix has 3 rows and the second matrix has 3 collums. But to actually get the resultant matrix you have to multiply the first value of the matrix A's row by the first value of matrix B's collum then add that by the second values multiplied then the third and so on until you have a sum.
> $$
> (1)(-4)+(4)(-3)=-16
> $$
> $$
> \text{Resultant Matrix}=\begin{bmatrix}
> -16 & [ \space] & [ \space]   &   \\
>  [ \space] & [ \space] & [ \space] \\
> [ \space] & [ \space] & [ \space]
> \end{bmatrix}
> $$
> Then the first row and second collum multiplied and summed.
> $$
> (1)(20)+(4)(9)= 56
> $$
> $$
> \text{Resultant Matrix}=\begin{bmatrix}
> -16 & 56 & [ \space]   &   \\
>  [ \space] & [ \space] & [ \space] \\
> [ \space] & [ \space] & [ \space]
> \end{bmatrix}
> $$
> Then we do this until our final result
> $$
> R=\begin{bmatrix}
> -16 & 56 & 23 \\
> -1 & -13 & -2 \\
> -69 & 303 & 112
> \end{bmatrix}
> $$
> 

### Inverse Matrices $(A^{-1})$
- Can only do a matrix inverse with square matrices 
	- Rows = collums
- $A^{-1}$ has the same size as $A$.
- When solving linear equations you must have the same number of equations as variables to be able to solve the for the variables.
- 

--- 
# Resources 
[PVCC Lecture one](https://learn.vccs.edu/courses/693196/pages/lecture-1-syllabus-software-downloads-and-introduction-to-matrices?module_item_id=51972285)