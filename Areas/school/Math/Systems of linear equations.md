#math #LinearAlgebra #LinearSystems
&emsp;
# Solving linear systems 
&emsp;
### Gaussian Elimination
This is a method for solving a linear system and one of the most common. 

**Steps**
1. Write the augmented matrix of the system of linear equations
2. Use elementary row operations to reduce the augmented matrix to [[#Row Echelon Form]].
3. Using [[#Back Substitution]], solve the equivalent system that corresponds to the reduced matrix, 

> [!EXAMPLE]- Example
> Contents

&emsp;
#### Gauss-Jordan Elimination 
This method is very similar to [[#Gaussian Elimination]] but substitutes solving for [[#Row Echelon Form]] for solving for [[#Reduced Row Echelon Form]]. 


> [!EXAMPLE]- Example
> Contents

&emsp;
## Definitions 
&emsp;
## Back Substitution 

&emsp;
## Row Echelon Form 
This is a form for an [[#Augmented Matrix]] which makes it very easy to find the given solution.

**A matrix in [[#Row Echelon Form]] properties are:** 
1. Any rows consisting entirely of zeros are at the bottom 
2. In each nonzero row, the first nonzero entry (called the **leading entry**) is in a column to the left of any leading entries below it.

For example:
$$
\begin{array}{c}
\begin{bmatrix}
1 & 2 & -4 & -4 & 5 \\
2 & 4 & 0 & 0 & 2 \\
2 & 3 & 2 & 1 & 5 \\
-1 & 1 & 3 & 6 & 5
\end{bmatrix}
 \\ \to \\
\boxed{
\begin{bmatrix} 
1 & 2 & -4 & -4 & 5 \\
0 & -1 & 10 & 9 & -5 \\
0 & 0 & 1 & 1 & -1 \\
0 & 0 & 0 & 0 & 24
\end{bmatrix}}

\end{array}
$$

### Reduced Row Echelon Form
This form is very similar to [[#Row Echelon Form]] but it makes it even easier to [[#Back Substitution|back substitute]] and is used within the [[#Gauss-Jordan Elimination]].

**Properties:**
1. Its in Row Echelon Form
2. The leading entry in each nonzero row is $1$ (called leading $1$ )
3. Each column containing a leading 1 has zeros in every other entry. 

The last property is the most important/confusing. 
$$
\begin{array}{c} 
\underbrace{
\begin{bmatrix} 
1 & 2 & -4 & -4 & 5 \\
0 & -1 & 10 & 9 & -5 \\
0 & 0 & 1 & 1 & -1 \\
0 & 0 & 0 & 0 & 24
\end{bmatrix}
}_{\text{Row Echelon Form}} \\
 \\
\to  \\
\underbrace{
\begin{bmatrix} 
1 & 0 & 0 & -2 & 0 \\
0 & 1 & 0 & 1 & 0 \\
0 & 0 & 1 & 1 & 0 \\
0 & 0 & 0 & 0 & 1
\end{bmatrix}
}_{\text{Reduce Row Echelon Form}}
\end{array}
$$

&emsp;
****

# Dump

## Non-Linear systems of equations


## Linear systems 

- A system of equation with infinitely many solutions means that the equations are the same


![](https://i.imgur.com/1eiIy2w.png)


### Methods for Solving Linear systems  

#### Substitution 
- Substitution is when we express one of the variables in terms of another variable, substitute that variable and then solve for the singular variable.


> [!EXAMPLE]- $\text{Example 1:} \left(\begin{array}{r} 3x-y=23 \\4x+3y=48  \end{array}\right ) \text{using Substitution.}$
> 
> **1.** Make the first equation in terms of $y$ to prepare for substitution
> $$
> \begin{array}{r}
> 3x-y=23  \\  
> 3x=23+y \\
> y=3x-23 
> \end{array}
> $$
> **2.**  Now that we have $x$ in terms of $y$ we can substitute this back into the second equation and solve.
> $$
> \begin{array}{rr} 
> 4x+3(3x-23)=48  & \text{Substituted} \\
> 4x+9x-69=48   \\
> 13x=117 \\
> x=\frac{117}{13} \\
> x=9
> \end{array}
> $$
> **3.** Now that we have a value for $x$ we can substitute that value back into one of the original equations. This should then allow us to solve for $y$.
> $$
> \begin{array}{rr}
>  3(9)-y=23 \\
> 27-y=23 \\
> -y=23-27 \\
> y=4
> \end{array}
> $$
> **Solution** The solution to this system is $x=9,y=4$. This means that the two linear functions intersect at $(9,4).$ 


## 

---

# Resources
[Pauls Online Math notes ](https://tutorial.math.lamar.edu/Classes/Alg/SystemsThreeVrble.aspx)
[Cuemath](https://www.cuemath.com/algebra/system-of-equations/)
