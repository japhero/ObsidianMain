


# DUMP
## The process
the steps are to 
- devide 
	- divide highest degree of the dividend by the divisor 
- multiply 
	- Multiply the result of the devision times the divisor
- subtract
	- Subtract the result of the multiplication from the dividend and then repeat the steps on the result untill the degree of the result is equal or lower to the divisor.
$$
\begin{array}{r} \\
\text{Quotent} \\
\text{Devisor}\enclose{longdiv}{\text{Dividend}} \\
\hline \text{Remainder}
\end{array}
$$

$$
\begin{array}{rl} 
 x+2 & \text{get quotent by dividing } \frac{Div_{i}}{Dev_{i}}\\
x+2{\enclose{longdiv}{x^2+5x+6}} & \text{multiply the divisor to match the dividend} \\
\underline{-(x^2+2x)}  & \text{subtract the result} \\
3x+6 \\
\underline{\phantom{-1}-(3x+6)}   \\ 
 0+0
\end{array}
$$



## Solving integrals with long devision
- do it until the degree of the numerator is less than the degree of the denominator.
- when the numerator is >= the denominator





> [!Example]- $\int \frac{{x-5}}{-2x+2} \, dx$
> 
> **Step 1**
> Take the long division to find the remainder and quotient 
> $\begin{array}{r} -\frac{1}{2} \\ -2x+2\enclose{longdiv}{x-5}\\   {-(x-1)}\\ \hline  -4\end{array}$
> 
> **Step 2**
> rewrite the integral using the result of the the long devision taking the quotent out
> $\int {-\frac{1}{2}-\frac{4}{2x+2}} \,dx$
> 
> **Step 3 **
> Simplify  
> $\int {-\frac{1}{2}-\frac{2}{x+1}} \,dx$
> 
> **Step 4**
> Then take the anti derivative of both functions giving
> $$-\frac{1}{2}x+2\ln (x+1) +C$$


## Solving polynomials with long devision
#pre_calculus



---
# Resources 
- [Mathis fun](https://www.mathsisfun.com/long_division.html)
-  [Integration using long division kahn academy](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-10/v/integral-partial-fraction)

<iframe width="560" height="315" src="https://www.youtube.com/embed/_FSXJmESFmQ?si=5kGPl5iXDY9LtO2x" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
- [Online polynomial long divison calculator](https://www.emathhelp.net/en/calculators/algebra-1/polynomial-long-division-calculator/?numer=x%5E2&denom=x%2B1)