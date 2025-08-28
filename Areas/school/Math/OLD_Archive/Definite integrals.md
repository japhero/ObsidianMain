#compress #math #calculus #Numeric_methods



> [!INFO]- REWRITE
> candidate for rewrite becasue hard to understand without examples

# Riemann sums
## Left/right Riemann sums
<img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Riemann_sum_%28leftbox%29.gif/120px-Riemann_sum_%28leftbox%29.gif" width =150><img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Riemann_sum_%28rightbox%29.gif/120px-Riemann_sum_%28rightbox%29.gif" width =150>

The left and right Riemann sums are basically the same equation but with a variation in the starting point. In a more accurate description the right or left part describes what side for the interval $\Delta x$ is used to calculate the "rectangle" for that interval. 

$S_{left} =\Delta x[f(a)+f(a+2\Delta x)+\dots f(b-\Delta x)]$

$S_{right} = \Delta x[f(a+\Delta x) +f(a+2\Delta x)\dots f(b)]$

when observing the formulas we can see that our assumption is true the difference practically is whether we use the first value($a$) or not. For example if we have right Riemann sums  we want the first point to be on the right side of $\Delta x$ so we add $\Delta x$



# Trapezoidal integration 

## Formula
$$ \int^b_{a} f(x) \, dx \approx \frac{b-a}{2n}[f(x_{0})+2f(x_{1}) +2f(x_{3})\dots_{} 2f(x_{n-1}+f(xn))]$$

- The reason $f(x_{1})\dots$ is multiplied by 2  is because we can assume that it appears 2 times because the nature of trapz is to chain them together when taking the formula in the form of a trapezoid $\frac{a_{0}+a_{1}}{2}h$ and chained together we would se $\Delta x\left( \frac{1}{2}(a_{0}+a_{1}) +\frac{1}{2}(a_{1}+a_{2})\dots \right)$ as seen $a_{1}$ would apear twice therefore we assume this in the formula. 
- Simplified formula for when the spacing in between $N$ points is spaced by $\Delta x$ $$\int^b_{a}f(x) \, dx \approx 
 \Delta x\left( 
 \frac{f(x_{N})+f(x_{0})}{2} +
  \sum^{N-1}_{k=1} f(x_{k}) 
  \right)$$
  - Desmos solver = https://www.desmos.com/calculator/vw5l9nkjgx
  - Remember that the "point's" are the number of open even intervals. In simpler terms this means that the points are the number of spaces that we take between input values not the actual amount of input values. 


# Finding Definite integral with several functions.
- Take the integral of both functions and subtract with the absolute value
- $\bigg| \int f(x) \, dx -\int g(x) \, dx \bigg|$
- Practically its hard for us to evaluate this function by hand with the absolute value sign because we cant literally apply absolute value to every point on the plane.
- ![[Definite integral with several fractions|1000]]
- ![[x to y conversion graph definite integrals|1000]]
## Finding limits of integration 
- to find the limits of integration we need to find the intersection points of our functions because this is were the parts of our functions start "enclosed".

## Calculator tricks 
in a calculator instead of figuring out the outer vs inner we can just write the absolute value $\int ( \mid f(x)-g(x) \mid) \, dx =\int ( \mid g(x) -f(x) )\, dx$

---
# DUMP
## class notes
- Integrals $\int  \, dx$ are really sums $\sum$
- No need for $C$ because the limits of the integral assure its not needed because the result is finite.
- are integrals just the sum of values at infinitely close spaces or $dx$.
- To solve for the definite integral substitute your values given and then subtract. 

## Reimann Sum
- way to approximate integrals 
- Left hand means that the left vertex of the square is what intersects with the curve
	- <img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Riemann_sum_convergence.png/600px-Riemann_sum_convergence.png" width = 400>
	- Blue is righthand yellow is lefthand
- If a function is increasing then we know that lefthand will be an under aproximation and the opposite for righthand riemansums.

### Middle Riemann sums
<img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Riemann_sum_%28middlebox%29.gif/120px-Riemann_sum_%28middlebox%29.gif" width =150>

## Reiman sums as limits
- Reiman sums usually suffer accuracy because space in between rectangles $(dx)$  
. 





---
# Resources 

<iframe width="560" height="315" src="https://www.youtube.com/embed/xec6HTcn2M8?si=-Z3TpS2OzCx9T6Kt" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/kgg5Rspf1Js?si=zDLf0yQyviTFhf1V" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
[Reiman sums as limits to ∞](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-3/a/definite-integral-as-the-limit-of-a-riemann-sum) 