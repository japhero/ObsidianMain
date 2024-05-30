&emsp;
# Table Method 
The table method is a simplification tool for taking the integral using [[Integration by Parts]] because it breaks down the method into repeatable steps. This method is useful when you know that you are going to have to take integral [[recursion|recursively]] and dont want to have to track all the different integrals. 

&emsp;

## Application
To use the method set up a table and take the variables $u$ and $v$ normally but make sure that $u$ "shrinks" meaning eventually taking the derivative will give zero. This has to be true because every new $u$ will act as a coefficient for every new $v$.

&emsp;
$$
\tiny{\int (uv) \, dx =\left[ (u *v')-(u'*v'') +(u''*v''')\dots -(n-1) 
  \left( \left( \frac{d^{n}u}{dx^{n}} u \right) \left( \frac{d^{(n+1)}v}{dx^{(n+1)}}v \right) \right) \right]}
$$
> $n$ is the number of times you have to take the derivative to get $u$ to zero.

&emsp;

To enact the formula all you have to do is 
**First:**
list out the derivatives of both functions of $v$ and $u$ until $u=0$. This is because they will be coefficients if $u=0$ that part will always $=0$ as to the reason why we dont take the derivative of either function past $u=0$. 

**Second:**
Take each $u$ that has been found and multiply it times the corresponding $v$ which has had the derivative taken 1 more time than $u$. 

**Third:**
Summate all of the combined functions together but make sure to alternate with adding and subtracting them as the first should be added then subtracted then added again and so on until all of the tabled values (except for $v$) have been incorporated.
![[Integration by parts table method|600]]

&emsp;



# DUMP

## Class notes 
- is inverse product rule 
- $[f(x)g(x)]'=f(x)g'(x) +g(x)f'(x)$
- $\int [uv]'= \int u \,dv\int v \, du$
- One part is $u$ one part is $dv$ remember $dv$ includes $dx$
- FInd $dv$ by taking out $u$ and whatever is left over is $dv$.
.  then find the derivative of both functions and plug into the given equation for integration by parts. 
$$
\int (u \, dv )=uv -\int (v \, du ) 
$$
chose $u$ to be whatever variable will "shrink". This is because whatever will shrink be part of the next integral.

**Steps**
- Chose a $u$ and take it out.
- take the integral of the rest or $dv$ to find $v$ and then plug into the equation




---

# Resources
