
#workInProgress
## Why does it work?
The formulas of Trigonometric Substitution are substitutes because they do the same action as the trig function making them equal. The formulas are often similar to solving for a side of a triangle and can be derived from [[Pythagoras theorem]] $(a^2+b^2=c^2)$. [Further explanation](https://youtu.be/EV5dhv0A2wU?t=14)
## Formulas 
$$
\int { a^2-x^2 } \, dx  \to x= a\sec(\theta)
$$
$$
\int {a^2+x^2 } \, dx  \to x = a\tan(\theta)
$$
$$
\int { x^2 -a^2} \, dx \to x= a\sin(\theta)
$$
&emsp;
&emsp;



# DUMP

## Class 
- Start with the  triangle and work backwords to simplyfy the  process of taking the trig function after solving and simplyfying. 

## Trig Sub

Trigonometric substitution is simply using Pythagoras theorem to substitute identities for trig functions into the integral solving and using the new trigonmic identity to find the integral

![[Trig sub triangle example.svg|right]]For example if given $\int \frac{1}{\sqrt{1- x^2 }} \, dx$ we know that if we see $a^2-x^2$ we can represent $x$ as $x=a\sin(\theta)$. Then using this we could also represent this as a triangle. If we solve for $\sin(\theta)$ giving $\sin(\theta)=\frac{x}{2}$ we can assume that the triangle will have an opposite side of $x$ and an adjacent side of $2$

&emsp;

&emsp;

Now that we have an identity for $x$ in the form of $\theta$ we can solve for $dx$ 
$$
\begin{array}{ll} 
x = (1)\sin(\theta) \\
dx= \cos(\theta) \\
\end{array}
$$
Having these identities if we look back the original equation $\left( \int \frac{1}{\sqrt{1- x^2 }} \,dx \right)$ you can see that we can substitute so that our integral is now in the form  of theta $(\theta)$. 
$$
\int \frac{\cos(\theta)}{\sqrt{ 1-\sin^2(\theta)  }} \, d \theta 
$$
After we have completed this step we enter the solving territory meaning we have to solve for a trig function that we can plug back into our triangle this works because our variable is theta or  the angle of the triangle so we can use the identity of the trig function to solve sometimes this means we might end up with $\int \csc(\theta)\,d\theta$ or generally any trig function we can plug back into the triangle. Specifically for this equation use fact that $1-\sin^2(\theta)=\cos^2(\theta)$ by substituting.
$$

\begin{array}{ll}
\int \frac{\cos(\theta)}{(\cos^{\cancel{2}}\theta)^{\cancel{\frac 1 2}}} \, d \theta \\
\int \frac{\cancel{\cos \theta}}{ \cancel{\cos \theta}} \, d\theta  \\
\int  \, d\theta 
\end{array}
$$
Now that we just have $d\theta$ as the integrand we can take the integral.
$$
\int  \, d\theta =\theta
$$
Now that we have integrated we can use our previously defined identities to switch back to a function of $x$.
$$
\begin{array}{l}
\sin(\theta) =x \\
\theta = \sin^{-1}(x)
\end{array}
$$
Therefore we know that 
$$
 \int \frac{1}{\sqrt{1- x^2 }} \,dx = \sin^{-1}(x)$$



![[Trig sub triangle cos(theta).svg|140|right]]eNote that in other trig sub's we cant just take take the inverse trig we have to take the function of theta and use the fact that its a trig function to solve get an identity. For example if we had ended up with $\cos(\theta)$ instead of $\theta$ would have to  take the $\frac{\text{adjacent}}{\text{hypotenuse}}$. 


&emsp;


&emsp;

---

## Taking trigonometric integrals

$\int  \sin^2(x)\cos^3(x) \, dx$
- Use trig identities to convert the equation into  on that you can integrate using [[U-Substitution|u sub]].
- Do this by reducing the odd trig function so it has a power of 1 this then allows you to take the [[U-Substitution|u sub]] 
$$\int  \sin^2(x)\cos^5(x) \, dx = \sin^2(1-\sin^2x)^2\cos x$$


## HW 8/29 notes

p. 476-477 # 1,3, 7, 15, 20, 23, 29

p. 483-484  # 1, 5-13 all, 17-21 odd

