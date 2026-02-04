#book_Notes #math_2214 #Diff_EQ

# Dump

Chapter 2 used sections 2.2 -> 2.6, 2.9, 2.10 

## Section 2.1 Introduction  
- 

> [!definition] First order linear differential equation
>
> $$
> y' +p(t)y=g(t) \tag {1}
> $$
> 
> These functions are defined on some $t-$interval of interest $a< t<b$.
> 
> If the function $g(t)$ on the right hand side is equal to zero then this is considered a **homogeneous** differential equation if $g(t)$ is non-zero then the functions is considered **non-homogeneous**
> 


- Any equation that can be algebraically be manipulated into the forms above can also be considered a differential equation. 

- First order **nonlinear** functions are functions who cannot be put into the form of equation 1
- It is possible to find explicitly representations for the solution of a first order linear equation 
- First order nonlinear equations cannot be solved explicitly.

- Note that $g(t)$ and $p(t)$ can be nonlinear but $y$ and $y'$ must be in the correct form


### Existence and Uniqueness for First order linear initial value problems 



> [!DEFinition] Existence and Uniqueness for First order linear initial value problems
> Let $p(t)$ and $g(t)$ be continuous functions on the inverval $(a,b)$, and let $t_{0}$ be in $(a,b)$. Then the innital value problem 
> 
> $$
> \begin{array}{ll}
> y'+p(t)y=g(t) & y(t_{0})=y_{0}
> \end{array}
> $$
> has a unique solution on the entire interval $(a,b).$
> 

- The statement has 3 main facets 
	- A solution exists 
	- the solution is unique 
	- The unique solution exists on the entire interval $(a,b)$


## Section 2.2 First Order Linear Differential Equations



### Solving the linear Homogenous Equation

> [!NOTE]+ Proof For the solution to the **First Order Linear Homogenous Differential Equation**
> 
> 
> 
> Rewriting the linear homogenous equation $y'+p(t)y=0$ solving for $y$ we get
> $$
> \tag 1{y'  = -p(t)y }
> $$
> Given this identity we need to find a function $y(t)$ where its derivative is equal to $-p(t)y$ this relationship sounds obvious but is key to the solution. These properties are mirrored by the equation $e^{-f(t)}$ when we consider its derivative is $-f'e^{-f(t)}$ or 
> 
> $$
> y'=-p(t)y\to f(t)= e^{-f(t)},f'(t)=\underbrace{ -f' \cdot f(t)}_{\text{same as $-p(t)y$}}
> $$
> There still lies one problem $f' \not =p(t)$ so we simply have to start with $p$ already in its integrated form. This is how we the solution
> 
> $$
> \large y=e^{-\int p(t) \, dt}  \tag 2
> $$
> > You can take the derivative to test the solution and see if you get the FOHE
> 




### The General Solution 

- We need to be able to find the general solution to the FOHE if we multiply equation 2 by $C$ we get

$$
y=Ce^{-\int p(t) \, dt}
$$
> Where $C$ is an arbitrary constant

Now for any constant $C$ we have a solution to the FOHE making it the general solution. 

- Using this equation we can solve any **First Order Homogenous Equation**




### First Order Nonhomogeneous Equations  


> [!NOTE]+ Solving the Nonhomogeneous Linear Equation
> $$
> y'+p(t)y =g(t) \tag {3}
> $$
> 
> To do this we will define a helper equation called the **Integrating Factor** $(\mu)$
> 
> $$
> \mu(t)=e^{\int p(t) \, dt } = e^{P(t)} \tag{4}
> $$
> We then multiply equation $5$ by equation $3$ (the integrating factor).
> 
> $$
> \mu(t)y'+p(t)\mu(t) y =g(t)\mu(t) \tag 5
> $$
> To go further we have to consider a clever identity for the **integrating factor** specifically 
> $$
> \mu'(t)=p(t)e^{\int p(t) \, dt }=\mu(t)p(t)
> $$
> This identity was the reason that the integrating factor was picked as it was in equation 3. More specifically this identity lets us rewrite equation $5$ by replacing $p(t)\mu(t)$ with $\mu'(t)$ giving 
> 
> $$
> \mu(t)y'+\mu'(t)y=g(t)\mu(t) \tag 6
> $$
> To continue solving we must recognize another clever identity, this one being the identity for a product rule. The left side of equation $6$ is the explicit definition for a product rule which we can rewrite as so
>  $$
>  \mu(t)y'+\mu'(t)y = \frac{d}{dt}  (\mu(t)y)
> $$
>  > Again this is basically the definition for a product rule but done in reverse
> 
> Using this to rewrite equation $6$ we get
> 
> $$
> \frac{d}{dt}(\mu(t) \,y)= g(t)\mu(t)
> $$
> 
> Now we simply take the integral
> 
> $$
> \begin{array}{cc}
>  & \displaystyle  \cancel {\int}  \cancel {\frac{d}{dt}} (\mu(t)y)   \, \cancel{ dt} =\int \mu(t)g(t) \, dt +C \\ 
> 
>  & \displaystyle  \mu(t)y= \int  \mu (t)g(t) \, dt 
> \end{array}
> $$
> Finally divide by $\mu(t)$ or multiply by $e^{-\int  p(t) \, dt}$ 
> 
> $$
> \LARGE y=e^{-P(t)} \int e^{P(t)} g(t)  \, dt+Ce^{-P(t)} \tag 7
> $$
> > Note that to simplify the equation $\displaystyle P(t)=\int pt \, dt$






## Section 2.5 First Order Nonlinear Differential Equations 

- The term nonlinear encompasses all differential euqaiotns that are not linear. In particular, a **first order nonlinear differential equation** has the form
$$
y'=f(t,y)
$$
> where $f(t,y) \not= -p(t)y +g(t)$


- Example nonlinear equations 
	-  $y'=t^2+y^2$
	- $y'+\cos (y)$

### Existence and Uniqueness 

- Given initial value problem 
$$
\begin{array}{ll}
y'= f(t,y), & y(t_{0})=y_{0} 
\end{array}
$$

> [!definition]+ THRM 2.2 Uniqueness and Existence for first order Non-Linear Differential Equations 
> 
> Let $R$ be the open rectangle defined by $a<t<b, \alpha<y<\beta$. Let $f(t,y)$ be a function of two variables defined on $R,$ where $f(t,y)$ and the partial derivative $\frac{\partial f}{\partial y}$ is continuous on $R$. Suppose $(t_{0},y_{0})$ is a point in $R$. Then there is an open $t-$interval $(c,d)$, contained in $(a,b)$ and containing $t_{0}$, in which there exists a unique solution of the initial value problem
> $$
> \begin{array}{ll}
> y'= f(t,y), & y(t_{0})=y_{0} 
> \end{array}
> $$ 
> ![[Existence and Uniqueness THRM 2.2 DIFF EQ|center]]
> >The open rectangle $R$, defined by $a<t<b,\, \alpha<y<\beta,$ contains the innital point $(t_{0},y_{0})$. If the hypothesews of Theorem 2.2 hold on $R$, we are guaranteed a unique solution to the innital vlaue problem on some open interval $(c,d)$

