
# Dump
- local linearity is using the tangent line to approximate the value 
- figure out the tangent line, use local "linearization" to approximate the value.
- $l(x)=f(a)+f'(a)(x-a)$
	- This formula is built under the assumption that the change in slope between x and a is minimal.
	- It works because it applies the immediate change so the derivative of x for the difference  between x and a or $(x-a)$
	- Basically we follow the tangent line until the given point.
<img src="https://i.imgur.com/csENEw1.png" width =400>

> [!EXAMPLE]-  Example : Given  $\frac{dy}{dx}=\frac{y^2}{x-1}$  write an equation for the tangent line for the graph $y=f(x)$ with the initial condition $f(2)=3$ at $x=2$ then use this equation to approximate $f(2.1)$
> 
> **Step 1:** 
> We must realize that we have already been given our inputs for the function. When the function is written as $f(2)=3$, and we are looking for the tangent line at $x=2$ we know that our $x$ value is obviously 2 but more importantly that our y value is 3. Although this may seem straight forward because this is an [[Ordinary Differential Equations|ODE]] the function of x is $f(x)$ and not $y=x$ that's why a "peticular" solution is listed as $y=f(x)$ not $y=x$.
> 
> **Step 2:** 
> Substitute values in for the given differential equation $g(x,y)=(2,3)$ and solve for $\frac{dy}{dx}$. Solving $\frac{3^2}{2-1}=9$ gives us $9$ as the slope.
> 
> **Step 3:**
> rewrite our function in standard form: $y=9(x-2)+3$. This is the equation of the tangent line.
> 
> **Step 4:**
> Approximate for the value of $2.1$ by plugging it into the equation of the tangent line. Giving an approximate value of 3.9
> $$f(x)\approx 9(2.1-2)+3 =3.9 \text{, tanget line, } y=9(x-2)+3$$
> 

--- 
# Resources
<iframe width="560" height="315" src="https://www.youtube.com/embed/u7dhn-hBHzQ?si=Gv3sZtH9kuGfenc0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>