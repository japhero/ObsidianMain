#math #factoring

----

# Trinomials 
A **trinomial** is an algebraic expression that has three terms. Is typically found in the form $ax^2 +bx+c$.


## Factor when $a=1$
Factoring when $a=1$ simply means as for the basic definition of Trinomials ($ax^2+bx+c$ ) a has to be $1$ this can be done by factoring out a $GCF$ or simply given. 

**Step 1** 
Grab **B** and **C** these values are what we use to find the factors.

**Step 2** 
List factors of **C**, then evaluate if these factors add up to **B** if so these are your factors of $f(x)$ **(multiply to C add to B)**.


**Step 3** 
Multiply your values by $-1$ then put them into Trinomial factored form $\left((x+a)(x+b) \right)$ which is the product of 2 binomials.

![[a=1 method example|600]]


## Factor by grouping
Factoring by grouping is an additional way to factor when we cant get the $a$ to have a coefficient of 1. For example using the "traditional" method it would be hard to factor an equation such as $4x^2+4x-15$. Factoring by grouping is another tool that lets us factor such equations. 

**Step 1**
The first step is similar to other methods in the sense that we have to find 2 numbers thats product is $a \cdot c$ and who's sum is $b$. 
$b_{1} *b_{2}=ac$
$b_{1}+b_{2} =b$

**Step 2**
The goal of step 1 is to give us a way to split $bx$ so that we can then factor each "half". To start this rewrite the equation, but write $bx$ as a sum of the 2 factors found $(b_{1},b_{2})$ with a coefficient of x . 
$$ax^2+bx+c \to ax^2+b_{1}x+b_{2}x+c$$
**Step 3** 
Its important to think of the new equation 2 somewhat separate parts that you manipulate separately $(ax^2 +b_{1}x) +(b_{2}x+c)$. The goal of the next operation is to have both haves have the same multiple but a different coefficient. Factor each "half" of the equations so that both halves have the same equation in the parentheses but a different coefficient.  
$$
(ax^2+b_{1}x) + (b_{2}x + c) =   f_{1}x \underbrace{(dx+e)}_{\text{one factor}} + f_{2}(dx+e)
$$

**Step 4**
The equation $f_{1}x (dx+e) + f_{2}(dx+e)$ contains all of the factors we just need to arrange them. We do this simply by factoring out $(dx+e)$. After doing this we get the answer.
$$
(f_{1}x+f_{2})(dx+e)
$$


[article](https://www.khanacademy.org/math/algebra/x2f8bb11595b61c86:quadratics-multiplying-factoring/x2f8bb11595b61c86:factor-quadratics-grouping/a/factoring-quadratics-leading-coefficient-not-1)

## Quadratic formula 
$$\frac{{-b \pm \sqrt{ b^2 -4ac}}}{2a}$$


## Completing the square 
Completing the square is a technique for rewriting factoring and solving quadratics. It works on the principal that we try to change a binomial into a perfect square by manipulating the constant or $c$. The relationship between the variables is represented by the formula 
$$x^2+2ax+a^2$$

Usually we are given a trinomial which we have to manipulate, for example $x^2+10x+24$. To start we want to remove the current constant and separate out the binomial:
$$
\begin{array}{ll}
x^2+10x+24 \\
\underbrace {x^2+10x}_{\text{binomial}} = \underbrace {-24}_{  \text{const}}
\end{array}
$$
Now that we have the binomial separated we need to add a constant to make the equation a perfect square. To do this we use the relationship previously established $(x^2+2ax+a^2 = (x+a)^2)$. Use this to find $a^2$ and make the binomial into a perfect square by adding it to both sides

$$
\begin{array}{ll}
\frac{10}{2}=a \\
\left( \frac{10}{2} \right)^2 =a^2 \\
x^2+2ax+a^2 \to \color{orange} x^2+10x+25 =-24 +25
\end{array}
$$

Now that we have a perfect square factor the quadratic into its root.
$$
(x+a)^2= \color{yellow} (x+5)^2=-24+25
$$
To get the solution to the quadratic solve for $x$

$$
\begin{array}{ll}
(x+5)^2=-24+25 \\
(x+5)^2=1 \\
\sqrt{ (x+5)^2 }=\sqrt{ 1 } \\
x+5= \pm \space 1 \\
\color{green} \large x=-5\pm 1
\end{array}
$$

> [!NOTE]+ 
> Remember though that if you are completing the square and have factored out a GCF  you have to multiply what you are adding to both sides by the GCF. For example if you have the binomial
> $$2(x^2+2x)=-3$$
> looking at this binomial we can see that to complete the square we need to add 1 to the binomial $\left( \left( \frac{2}{2} \right)^2=1 \right)$ but to even out the equation as previously stated we need to multiply 1 by the coefficient, so we need to add 2 $(1*2)$ eventually we get 
> $$
> 2(x^2+2x \color{yellow} +1 \color{white}  ) = -3 \color{yellow} +2 \color{white}
> $$
> then after completing the square we are left with
> $$
> 2(x+1)^2=-1
> $$
> 

---
# Resources 

- [MashupMath](https://www.mashupmath.com/blog/how-to-factor-polynomials)
- [Kahn academy](https://www.khanacademy.org/math/algebra/x2f8bb11595b61c86:quadratics-multiplying-factoring/x2f8bb11595b61c86:factor-quadratics-grouping/a/factoring-by-grouping)
- [Kahn academy 2](https://www.khanacademy.org/math/algebra/x2f8bb11595b61c86:quadratics-multiplying-factoring/x2f8bb11595b61c86:factor-quadratics-grouping/a/factoring-quadratics-leading-coefficient-not-1)
- [Kahn academy 3](https://www.khanacademy.org/test-prep/v2-sat-math/x0fcc98a58ba3bea7:advanced-math-easier/x0fcc98a58ba3bea7:factoring-quadratic-and-polynomial-expressions-easier/a/v2-sat-lesson-factoring-quadratic-and-polynomial-expressions) 


