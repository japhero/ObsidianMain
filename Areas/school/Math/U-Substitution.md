
U-Substitution is a method for taking the integral of a function specifically we can think of it as taking the inverse chain rule.

# Steps 
Given the principled equation $\int f(g(x)) \, dx$ these are the steps of [[U-Substitution]].

**Step 1:** 
Find $u$: $u = g(x)$ this will typically be the "inside" function/equation. Generally this is the most important step in using [[U-Substitution]]. One good rule to use when trying to chose $u$ is that our goal should always be to make the function a function of $u$ and not of $x$ so try to find whatever value of $du$ that removes $x$.

**Step 3:** 
Find $du$. Finding $du$ means taking the derivative of $u$ or in this case $g'(x)$. In general we want $du$ to be the inverse of $g'$ in $f'\left(g(x) \right)g'(x)$ of the [[chain rule#Formula|chain rule formula]] this is again because [[U-Substitution]] is the inverse chain rule or undoing the chain rule.

**Step 4:**
Solve for $dx$. After we take the derivative of $u$ we are given the equation $du=g'(x)dx$ to be able to plug this into our current equation of $f(g(x))dx$ we need to solve for $dx$. So divide out $g'$ and get: $du \, \frac{1}{g'(x)}$ 

**Step 5:**
Plug in $dx$ and make our equation relative to $u$. Simply substitute the previously solved version of $du$, this gives us $\frac{1}{g'(x)} \int f(u)du$. This equation is also misleading as it still has a function of $x$, in [[U-Substitution]] we want this to basically never be the case and is only allowed in this case because we assume its a constant which it should be when taken properly.   

**Step 6:**
Integrate $u$ normally. This process again shows one of the goals of [[U-Substitution]] its to "prepare" our equation so that we can integrate it "normally" or using a variety of other methods that dont work unless we have an equation in the terms of $u$. In our equation we will apply the formula $\int  \, u^ndu= \frac{u^{n+1}}{n+1}+C$ to integrate giving the result $\downarrow$
$$ \int f(g(x)) \, dx =\frac{f(g(x))^2}{2 g'(x)}$$



> [!EXAMPLE]- EXAMPLE:  $\int{10x\cos(10x^2-2)}\, dx$
> 
> **Step 1:**
> The first step of the problem is to find $u$ and intern $du$. We will do this by setting $u = 5x^2-2$.
> 
> **Step 2:** 
> Find $du$ by taking the derivative of $u$, $u',du= 20x\,dx$ 
> 
> **Step 3:**
> Solve for $dx$ to then substitute it in so we can make the equation a factor of $u$.
> Solve by just dividing out $20x$ to make $\frac{1}{20x}du=dx$.
> 
> **Step 4:**
> substitute in $\frac{1}{20x}$ for $dx$ and solve. $\frac{10x}{20x}\cos(u)$. Note that we can always take out constants out of integrals so after we we cancel $x$: $\frac{10\cancel{x}}{20\cancel x}\cos (u)$ we can rewrite the integral as $\frac{1}{2}\int \cos (u) \, dx$.
> 
> **Step 5:**
> we can use the basic trig definitions to rewrite $\cos dx=\sin$. Then substitute $u$ back in and apply the constant meaning that the answer is $$\int{10x\cos(10x^2-2)}\, dx = \frac{1}{2}\sin(10x^2-2) + C$$
> 

&emsp;

&emsp;


# Change of variables with U-Sub

![right|200](https://i.imgur.com/dNk5Yjb.png)

Change of variables allows one to solve an integral without having to plug the function of $u$ back into the equation although this means that the limits of integration change because we are adopting a new function as the integrand. This is done by plugging in the limits of integration into the function of $u$.
$$\int_{a}^b f(x) \, dx \to  \int_{u(a)}^{u(b)} u(x)  \, dx$$

&emsp;
> [!Example]- EXAMPLE:$\int^3_{1} \frac{x}{x+1}  \, dx$
> 
> $u =x^2+1$
> $du =2x \,dx$
> $dx = \frac{du}{2x}$
> $=\int^3_{1} \frac{\frac{x}{u}}{2x}  \, dx$
> $= \frac{1}{2}\int^3_{1} u^{-1}  \, dx$
> plug in limits of integration into $u$ 
> = $\int^{3^2+1}_{1^2+1} u^{-1} \, dx$
> $=\frac{1}{2} \int^{10}_{2} u^-1 \, dx$
> $$\frac{1}{2}(\ln(10)-\ln(2))$$
> 

&emsp;

&emsp;

---
# Resources 
<iframe width="560" height="315" src="https://www.youtube.com/embed/sdYdnpYn-1o?si=LHiJk4MHJec5TkA6" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
<iframe width="560" height="315" src="https://www.youtube.com/embed/r5XXDSOh5Nk?si=DQvb_0d33bamkXD-" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
 <iframe width="560" height="315" src="https://www.youtube.com/embed/rsBALP8QNns" title="_-substitution: defining _ (more examples) | AP Calculus AB | Khan Academy" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>


[Kahn academy](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-9/a/review-applying-u-substitution)
[definite integral article KA](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-9/a/u-substitution-definite-integrals)



# Dump
## Class Notes
$$\int  \, u^ndu= \frac{u^{n+1}}{n+1}+C $$

- [[Antiderivatives-integrals]] is a type of [[U-Substitution]]?
- [[U-Substitution]] is literaly substituiting the value $u$ instead of a variable.
- isnt it just operating as a kind of [[chain rule]]
-  **$u$-substitution**, which basically reverses the chain rule.
- $u$ is the internal part of the [[chain rule]]
- $u$ is an implicit function of the main function of $f(x)$
- the reason that we have to manipulate $du$ by multiplying or dividing the whole equation is because we want $du$ to be the derivative of $u$ and in a normal chain rule this would be what we are multiplying by. 
	- simply we want $du$ to be the $g'$ in $f'\left(g(x) \right)g'(x)$ of the [[chain rule#Formula|chain rule formula]].
- $du$ goes away when i take the integral its kindov symbolic and just goes away.
- $du$ is kindov used as a vessel for geting rid of "products" of taking the derivative
- Integral rules $\downarrow$
- $$\int [f(x)+g(x)] \, dx  = \int f(x) \, dx + \int g(x) \, dx  $$
- The goal with $u$ should allways be to remove x from the equation
- can use trig definitions to change into a form that we can solve.
- $\frac{dy}{dx}=2e^{x-y} \to \frac{dy}{dx} =\frac{2e^x}{e^y}$
	- Just a neet usage of [[Exponent Rules]] 
- chosing what value you use for u is very important maby when compressing use as example $$\int \frac{\cos\left( (1-3x)^{\frac 1 3} \right)}{(1-3x)^ {\frac{2}{3}}} \, dx$$
## taking derivatives in the exponent
$$\frac{d}{dx} (a^x)=a^x\ln(x)$$
- when you take the integral of ln and get c in the exponent you can also rewright $e^{C}$ as $K$ for constant and then just solve.



## common derivative question
why cant we operate the integral $\int \frac{1}{u}dx$ as $\int u^{-1} \, dx$.
I know we cant because of the definition of the common integral 
$$ common \space Integral = \int \frac{1}{u} \, dx = \ln(u)$$
**Answer:** because when taking the integral we would have to divide by zero which we cannot do. $$\int \frac{u^{-1+1}}{-1+1} \, dx =\int \frac{u^0}{0} \, dx =\cancel{ \exists}$$



## Vid1 notes
- What we need to do
	-  find $u$
	- find $du$
- $du$ is the derivative of $u$, $du=u'$
- we want all x variables to in the form of $u$
-    [current TImestamp](https://youtu.be/sdYdnpYn-1o?t=146)

## Change of variables 
- When we are asked for a integral in the form of $u$ we simply solve for $u$ as usual but set the limits of integration by pluging in the old values into the function of u.
	- Then take the integral as normal but remember to use the limits of integration set  by the function of u
	- 
