&emsp;


## Overview 
A [[Power Series]] is a way to represent/approximate existing functions by combining [[Series]] $\left( \sum_{n=0}^\infty \right)$ with functions, note that the functions within the series are not the same as the functions that the series represents.  Any Power Series can be written in the form. 

$$
\sum_{n=0}^\infty c_{n}(x-a)^n\
$$
> $c_{n}$'s are called the coefficients of the series.
> **$a$** is just a number

This is sometimes called the series about $a$ this is because the series is literally centered at $a$. Example 

![|righ|300](https://i.imgur.com/7CTx8JP.png)

$$
\begin{array}{l}
g(x)= \frac{1}{1+x^3} \\
 \\
=\displaystyle{\sum_{n=0}^\infty (-1)^n x^{3n}}, |-x^3|<1
\end{array}
$$
&emsp;

&emsp;

&emsp;


> [!EXAMPLE]- Explanation for power series of $\frac{1}{1+x^3}$ around 0  
> Because the function is in the same form as the known geometric series equation
> $\frac{1}{1-x}=\sum_{n=0}^\infty x^n)$ 
> Therefore we can simply substitute in the correct equation 
> $\left( \frac{1}{1-(-x^3)} \right)$
> To get the initial series of
> $\sum_{n=0}^\infty (-x^3)^n$
> simplifying this gives  our answer
> $\displaystyle{g(x)=\sum_{n=0}^\infty(-1)^nx^{3n}}$






# Dump
&emsp;
## Power Series
- Any Series that can be written in the form
	- This series is "about a"
$$
\sum_{n=0}^\infty c_{n}(x-a)^n
$$
> $c_{n}$'s are called the coefficients of the series.
> **$a$** is just a number

- [[Power Series]] are a function of $f(x)$ and therefore the [[Power Series]] converging is conditioned on what values of $x$ we put into the series.
$$
\begin{array}{ll}
a-R<x<a+R  & \text{Power Series Converges} \\
x< a-R \text{ and }x>a+R & \text{Power Series Diverges}
\end{array}
$$
- For the power series we are allways guaranteed to have convergence at $x=a$
- Best tests to use are almost [[Series#Root test|Root test]] or [[Series#Ratio Test|Ratio Test]], these tests are used to find the condition(s) on $x$ that we can use to determine the values of $x$ for which the power series will converge and diverge. From this we can get the [[#Radius of Convergence]] and the [[#Interval of convergence]]
- Use the process defined in [[Series#Ratio Test|Ratio Test]] to find the [[#Interval of convergence]] and [[#Radius of Convergence]].

**Power Series and functions**
- We can represent functions with power series 
- When given the general geometric series 
$$\sum_{n=0}^\infty ar^n=\frac{a}{1-r} \text{ provided } |x|<1 \text{, }a=1 \text{ and } r=x $$
- This function can represent the function
$$
\sum_{n=0}^\infty x^n=\frac{1}{1-x}
$$
- It important to note that the $x$ within a power series is just a variable and can be replaced with any form for example..
$$
g(x)=\frac{1}{1+x^3} \to \sum_{n=0}^\infty (-x^3)^n \text{ provided } |-x^3|<1
$$
- We can use [[Series#Definitions|previous definitons]] found and substitute them in to  make solving the series easier, for example...
$$
h(x)=\frac{2x^2}{1+x^3} = 2x^2 \frac{1}{1+x^3} \to 2x^2 \sum_{n=0}^\infty (-1)^n x^{3n}
$$
> Note that this is possible becaue the $x$'s dont affect the convergence of the series


- 



&emsp;
### **Definitions**


##### Radius of Convergence
There is a number $R$ so that the power series will converge for, $|x−a|<R$ and will diverge for $|x−a|>R$. This number is called the **radius of convergence** for the series. 
$$
\text{Radius of convergence}=\frac{|a-b|}{2}
$$
> Where $a,b$ are the two values from the interval of convergence
##### Interval of convergence
The  interval of all $x$’s, including the endpoints if need be, for which the power series converges is called the **interval of convergence** of the series.

## Taylor Series
- [[#Taylor Series]] is a more general definition for defining functions in relation to a series
- $f(x)$ must have derivatives for [[#Taylor Series]] to work
- Taylor  series is a way to find the $c_{n}$'s or coefficients of a power series. It does this by continually taking the derivative of the series as to remove the x as a coefficient and leave just the value, this is so that when you plug in $x=a$ just the  coefficient is left 
$$
\begin{array}{l}
f(x)=c_{0}+c_{1}(x-a)+c_{2}(x-a)^2 +\dots \\
f(a)=c_{0} \\
 \text{Then take the derivative to get } c_{1}  \text{ because}\\ 
f'(x)=c_{1}+2c_{2}(x-a)+3c_{3}(x-a)^2+\dots \\
f'(a)=c_{1} \\
\text{Now taking the derivative one last time} \\
f''(x)=2c_{2}+3(2)c_{3}(x-a)^2+ 4(3)c_{4}(x-a)^2 +\dots \\
f''(a)=2c_{2}
\end{array}
$$
- Through this process notice a pattern this being that taking the derivative and solving for the  constant gives us this constant making it easy to find the $c_{n}$'s
	- This means we can create a general formula for the coefficients or $c_{n}$'s this being
$$
c_{n}=\frac{f^{(n)}(a)}{n!}
$$
- **Taylor series formula**
$$
\begin{array}{l} 
f(x)=\sum_{n=0}^\infty \frac{f^{(n)}(a)}{n!}(x-a)^n \\
 \\
=f(a)+f'(a)(x-a)+\frac{f''(a)}{2!}
\end{array}
$$



---
# Resources

[Pauls Online Notes Power Series](https://tutorial.math.lamar.edu/Classes/CalcII/PowerSeries.aspx)
[Pauls Online Noes Power Series and Functions](https://tutorial.math.lamar.edu/Classes/CalcII/PowerSeriesandFunctions.aspx)
[Pauls Online Notes Taylor Series](https://tutorial.math.lamar.edu/Classes/CalcII/TaylorSeries.aspx)
