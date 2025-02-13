#calculus #series #retarded

# Tests

&emsp;
## Limit Comparison 
Limit comparison is a test we can use to figure out if 2 [[Series]] behave in the same way. Behavior in this case means we can figure out if the terms diverge or converge. This test operates similarly  to the and operator in CS.

Suppose that $\sum a_{n}$ and $\sum b_{n}$ are series with positive terms.
$$
\lim_{ n \to \infty } \frac{a_{n}}{b_{n}}=L
$$
if $0<L<\infty$, then either both converge or both diverge

**Example**
> [!EXAMPLE]- $\sum_{n=1}^\infty \frac{\sqrt{ n }+4}{n^2}$
> 
> First we have to identify that a limit comparison is an ideal test. We can preemptively know this because we know that in the longterm $(n \to \infty)$ we can ignore the constant $4$ and simplify the expression to $${\frac 1 {n^{\frac{3}{2}}}}$$.
>  This simplified version is useful because now we can identify the simplified version as convergent through the [[#P TEST|P-Test]]. Now that we know that the simplified version converges we simply have to prove that the simplified version and original behave the same or numerically $\to$
> $$
> \text{}\sum_{n=1}^\infty \frac{\sqrt{ n }+4}{n^2} \approx \sum^\infty_{n=1} \frac{1}{n^ \frac{3}{2}}
> $$
> 
> This is where [[#Limit Comparison]] comes in as it allows us to compare 2 functions  and judge weather they behave the same. Knowing this we take the limit and solve
> $$
> \begin{array}{ll}  
> \displaystyle{
> \lim_{ n \to \infty }  \frac{\frac{\sqrt{ n}+4}{n^2}}{\frac{1}{n^ \frac{3}{2}}}
> } \\ 
> \displaystyle{ 
>  \lim_{ n \to \infty } \frac{(\sqrt{ n} +4)n^ \frac{3}{2}}{n^2}
> } \\ \\
> 
> \displaystyle{ 
>  \lim_{ n \to \infty } \frac{n^2+4n^ \frac{3}{2}}{n^2}
> } \\
> \end{array}
> $$
> Now we just have to solve the limit, this we can do by dividing the coefficients of the values with the greatest exponent ([[Limits|remember back to pre-calculus]]). 
> 
> $$
> \lim_{ n \to \infty } \frac{(1)n^2+4n^ \frac{3}{2}}{(1)n^2}=1
> $$
> Therefore we can logically conclude that 
> $$
> \large{ \sum_{n=1}^\infty \frac{\sqrt{ n }+4}{n^2} \text{, converges due to limit comparison.}
> }$$
> 

---
&emsp;



&emsp;

# DUMP



### P TEST 
- we use the p test to figure out convergence and divergencece

if given an equation 
$$
\sum_{n=c}^\infty \frac{1}{n^p}
$$

- if $p>1$ then the sum is convergent
- if $p\leq 1$ then the sum is divergent 

**Example**
> [!EXAMPLE]- $\sum_{n=1}^\infty  \frac{1}{n^3}$
> 
> 
> 1. Because we see that our sum matches the P-Test form we can simply identify the exponent of our denominator as $3$. Now we evaluate the test showing that $3>1$ therefore
> $$
> \sum_{n=1}^\infty  \frac{1}{n^3}  \text{  is converging because of P-Test}
> $$

### Direct comparison 
- Direct comparison is were we use the known behavior of another equation to evaluate the state of another. This works because we know that if our evaluated function is greater than a known divergent function it will be divergent and if it is less than a known convergent question it will be convergent. 
- When doing direct comparison the most important part is that we use a comparison function that we know is less than or greater than our function

**Example**


> [!EXAMPLE]- $\sum^\infty_{n=2} \frac{1}{n-1}$
> 
> 1. We find a function we know is divergent because of the P-Test and that we know would be greater less than our function. Our denominator contains $n-1$ so we can simply remove the $-1$ to get our comparison function
> 
> $$
>  \frac{1}{n-1} > \frac{1}{n} \text{ for all of n}
> $$
> 2. Now because we set up our relationship we only have to prove that $\frac{1}{n}$ is divergent to prove that $\sum^\infty_{n=2} \frac{1}{n-1}$ is divergent. This we can do with the P-Test
> $$\sum^\infty_{n=2} \frac{1}{n} \text{ diverges because of P-Test}$$
> 3. Now that we have established that our comparison function $\left( \sum^\infty_{n=2} \frac{1}{n} \right)$diverges and that our starting function $\left( \sum_{n=2}^\infty \frac{1}{n-1} \right)$ is less than our comparison function. It logically follows that 
> $$
> \sum_{n=2}^\infty \frac{1}{n-1} \text{, Diverges through direct comparison}
> $$


---

&emsp;

### Nth term test
$$
\text{If}\lim_{ n \to \infty } a_{n} \not = 0  \text{ then } \sum a_{n} \text{ diverges}
$$
- Although if the limit does equal $0$ then it doesn't necessarily mean that the limit converges.
- The test is only conclusive if the limit equals doesn't equal 0 this means that if the limit does we must use another method to find convergence or divergence.

---
&emsp;
### Integral Test

$$
\begin{array}{l} 
\displaystyle{
\text{(a)} \space   \text{If } \int_{1}^\infty f(x) \, dx \text{ is convergent, then} \sum_{n=1}^\infty \text{is also convergent}}\\
 \\
\displaystyle{\text{(b) If} \int_{1}^\infty f(x) \, dx  \text{ is divergent, then} \sum_{n=1}^\infty \text{is also divergent}}
\end{array}

$$

- just [[Improper integrals]]

---
&emsp;

### Root test


### Alternating Series test
If we have a Series in the form $\sum a_{n}$ and either $a_{n}=(-1)^n b_{n}$ or $a_{n}=(-1)^{n+1}b_{n}$ where $b_{n}>0$. Then if 


$$
\begin{array}{\l}
1. \displaystyle \lim_{ n \to \infty } b_{n}=0 \text{ and,}  \\ \\

2. \{b_{n}\}  \text{ is a decreasing sequence}
\end{array}


$$
the series $\sum a_{n}$ is convergent

---

&emsp;

### Ratio Test
If we have a series in the form $\sum a_{n}$ and 
$$
L=\lim_{ n \to \infty } \left |\frac{a_{n+1}}{a_{n}} \right|
$$
Then,
$$
\begin{array}{l}  
1. \text{If } L < 1, \text{ the series is absolutely convergent.} \\  \\
2. \text{If } L = 1, \text{ the series is divergent.}  \\ \\
3. \text{If } L > 1, \text{ the series may be divergent, conditionally convergent, or absolutely convergent.}  \\ \\

\end{array}
$$


---
## Types

### Geometrics 
- geometrics are series in which each term is multiplied times a constant value to find the next 
- To find the value that they approach use 

$$\text{if } r<| 1 | \text{ then } \sum f_{n} \text{ converges to } \frac{A}{1-r}$$
> Where $A$ is the first value of $f_{n}$



> [!EXAMPLE]- $\sum_{t=1}^\infty \left(  \frac{x-5}{2} \right)^n$
> $r=\frac{x-5}{2}$
> $-1<\frac{x-5}{2} <1$
> $-2<x-5<2$
> $3<x<7$
> $\text{Radius of convergence}=2$
> $\text{center of convergence =5}$



### Telescoping 

- Telescoping is when the series cancels out values over time leaving only a few values. 
- This happens because each successive interval on the series cancels out the last. 



## Definitions 

$$
\begin{array} {l}
 \text{1. } \sin(x)= \displaystyle \sum_{n=0}^\infty (-1)^n \frac{x^{2n+1}}{(2n+1)!} \\
 \\
\text{2. }  \cos = \displaystyle \sum_{n=0}^\infty (-1)^n \frac{x^{2n}}{(2n)!} \\
 \\
\text{3. } e^x =\displaystyle \sum_{n=0}^\infty \frac{x^n}{n!} \\
 \\
\text{4. } e^x = \displaystyle \lim_{ n \to \infty } \left( 1+\frac{1}{n} \right)^n
\end{array}



$$






&emsp;

---
# Resources
[Pauls Online Notes Alternating  Series test](https://tutorial.math.lamar.edu/classes/calcii/AlternatingSeries.aspx)
[Pauls Online Notes Ratio Test](https://tutorial.math.lamar.edu/classes/calcii/ratiotest.aspx)
[Pauls online notes Root test](https://tutorial.math.lamar.edu/classes/calcii/roottest.aspx)
