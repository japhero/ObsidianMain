
# Dump class notes
- Integrals $\int  \, dx$ are really sums $\sum$
- No need for $C$ because the limits of the integral assure its not needed because the result is finite.
- are integrals just the sum of values at infinitely close spaces or $dx$.
- To solve for the definite integral substitute your values given and then subtract. 




# Reimann Sum
- way to aproximate integrals 
- Left hand means that the left vertex of the square is what intersects with the curve
	- <img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Riemann_sum_convergence.png/600px-Riemann_sum_convergence.png" width = 400>
	- Blue is righthand yellow is lefthand
- If a function is increasing then we know that lefthand will be an under aproximation and the opposite for righthand riemansums.




# Trapezoidal integration 

## Formula
$$ \int^b_{a} f(x) \, dx \approx \frac{b-a}{2n}[f(x_{0})+2f(x_{1}) +2f(x_{3})\dots_{} 2f(x_{n-1}+f(xn))]$$

- The reason $f(x_{1})\dots$ is multiplied by 2  is because we can assume that it appears 2 times because the nature of trapz is to chain them together when taking the formula in the form of a trapezoid $\frac{a_{0}+a_{1}}{2}h$ and chained together we would se $\Delta x\left( \frac{1}{2}(a_{0}+a_{1}) +\frac{1}{2}(a_{1}+a_{2})\dots \right)$ as seen $a_{1}$ would apear twice therefore we assume this in the formula. 
- Simplified formula for when the spacing in between $N$ points is spaced by $\Delta x$ $$\int^b_{a}f(x) \, dx \approx 
 \Delta x\left( 
 \frac{f(x_{N})+f(x_{0})}{2} +
  \sum^{N-1}_{k=1} f(x_{k}) 
  \right)$$
  - Desmos solver = https://www.desmos.com/calculator/yufquxovaz


# Finding Definite integral with several functions.
- Take the integral of both functions and subtract with the absolute value
- $\bigg| \int f(x) \, dx -\int g(x) \, dx \bigg|$
- ![[Definite integral with several fractions|700]]
- 