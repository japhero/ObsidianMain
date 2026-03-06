#math #Diff_EQ 



# First Order Linear Differential Equations 

&emsp;

## Definition of First Order Linear Differential Equations
&emsp;
 $$
 y' +p(t)y=g(t) \tag {1}
 $$
 
> These functions are defined on some $t-$interval of interest $a< t<b$.
 
 If the function $g(t)$ on the right hand side is equal to zero then this is considered a **homogeneous** differential equation if $g(t)$ is non-zero then the functions is considered **non-homogeneous**
 


&emsp;


### Existence and Uniqueness Theorem for First order Linear Differential Equations

> [!DEFinition] 
> Let $p(t)$ and $g(t)$ be continuous functions on the inverval $(a,b)$, and let $t_{0}$ be in $(a,b)$. Then the innital value problem 
> 
> $$
> \begin{array}{ll}
> y'+p(t)y=g(t) & y(t_{0})=y_{0}
> \end{array}
> $$
> has a unique solution on the entire interval $(a,b).$

This theorem is uniquely usefully because it gives us an exact interval on which we can find a solution. 


&emsp;


## Integrating Factor 

The integrating factor is a way to solve First order nonlinear differential equations that aren't separable.  The integrating factor is typically denoted by $(\mu)$ and is found by using the [[#Definition of First Order Linear Differential Equations|standard form]].

$$
\mu = e^{\int p(t) \, dt }
$$

The integrating factor exists because it can collapse a product rule. Look at the proof for  a further explanation but it exists to satisfy this condition 
$$
\mu(t)p(t) = \mu'(t)
$$


> [!NOTE]- Using the integrating factor to solve the Nonhomogeneous First Order Linear Differential Equation
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

 