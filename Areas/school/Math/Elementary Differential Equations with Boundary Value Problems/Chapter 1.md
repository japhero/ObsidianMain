#book_Notes #math_2214 #Diff_EQ


# Dump
- "Modeling a physical process often leads to equations that involve not only the physical quantity of interest but also some of its derivatives. Such equations are referred to as **differential equations.**"


### Form of an $n$th Order Differential Equation
formal definition of a differential equation 
$$
y^{(n)}=f(t,y,y',\dots,y^{(n-1)})
$$
- $t$ is the independent variable and $y$ is the dependent variable 
- A solution is any function $y(t)$ that satisfies the equation on out t-interval of interest.
- **Ordinary differential equations (ODE)** are called ordinary because there is only one independent variable (in this textbook t). If the equation has more than one independent variable then this is called a **partial differential equation**. 


### Initial Value Problems
- To have a proper unique solution auxiliary initial conditions are required.
- A ODE with enough initial conditions to find a unique solution is called an initial value problem. 
- Must have the same number of initial conditions as the order of the equation. 



> [!Example]-
> consider the initial value problem 
> $$\tag{a}
> \begin{array}{ll}
> y'+3y=6t+5, &y(0)=3 
> \end{array}
> $$
> Show that for any constant $C,$ that 
> $$ \tag b
> \begin{array}{ll} 
> y=Ce^{-3t}+2t+1
> \end{array}
> $$
> is a solution to the differential equation given initially.
> 
> 
> **Solution**
> We can prove this simply by inserting the solution into the differential equation given and solving for $6t+t$.
> 
> $$
> \begin{array}{ll}
> y'+3y  &  = (Ce^{-3t}+2t+1)' +3(Ce^{-3t}+2t+1) \\
>     & =(-3Ce^{-3t}+2)+3(Ce^{-3t}+6t+3) \\
>  & =6t+5
> \end{array}
> $$
> 


## Direction Fields 

- A Direction field is a way of predicting the qualitative behavior of solutions. 
	- They give a good "picture" of potential solutions to differential equations
- A direction field is a [[Slope Fields]]


#### Isoclines
- Helpful when you need to draw a direction field by hand 


> [!DEFINITION] Isocline
> An **isocline** of the differential equation $y'=f(t,y)$ is a curve  of the form
> $$ 
> f(t,y)=c
> $$
> > where $c$ is a constant 

- Isoclines are useful because, <u>**at every point on an isocline, the associated direction field lines have the same slope**.</u>
	- restated every point on the isocline line has the same slope. This is definitionally true because if we expand the definition of isoclines we get $y'=f(t,y)=c$.


> [!EXAMPLE]- Example
> 
> $$
> \begin{array}{c}
> y' = f(t,y)=C \\
> y'=y-t
> \end{array}
> 
> 
> $$
> sample potential value for $y'$ so lets say $\{ 1,0,-1,-2 \}$ plug these values in and solve for the function $y=f(t)$ and graph
> 
> $$
> \begin{array}{ll}
> y' =1  & y=t+1 \\ 
> y' =0  & y=t \\ 
> y' =-1  & y =t-1  \\ 
> y' =-2  &  y=t-2
> \end{array}
> $$







#### Direction fields for autonomous Equations 

- Isoclines are especially effective for differential equations of the form $y'=f(y)$ because they are simply horizontal lines.
- Differential equations where the right hand side doesn't depend explicitly on $t$, are called **autonomous differential equations**.
- an example would be 
$$
y'=y^2-3y
$$

#### Equilibrium Solutions 

consider the autonomous differential equation 
$$
y'=f(y)
$$
- Constant solutions of an autonomous differential equation are known as equilibrium solutions 
- Constant solutions will be roots of $f(y)=0$ 




********

# ANKI CARDS
- [x] The **order** of a differential equation 
	- [x] order is the size of the highest derivative that appears in the equation.  For example if my equation includes $y''$ then it is a second order equation. 
- [x] The difference between partial and ordinary differential equations 
	- [x] ODE' s have one independent variable partial differential equations have several
- [x] Definition of a general solution 
	- [x] An expression containing arbitrary constants that can be adjusted as to give every solution of the equation. 
- [x] How to create a direction field/slope field?
- [x] How do you create isoclines and what is their use?
- [x] What is the definition of an autonomous differential equation 


