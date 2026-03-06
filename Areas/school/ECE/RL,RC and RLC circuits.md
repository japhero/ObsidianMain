#ECE #ECE_2024 


&emsp;

# RL and RC charging circuits 

We can use the RLC charging equation for discharging circuits as well because in those situations $V_{s}(\infty)$ or $i_{L}(\infty)$ are going to be zero anyways.

$$\Large
\begin{align}
v(t) = V_{s}(\infty) + (V_{c}(0^-)-V_{s}(\infty))e^{-\frac{t}{RC}} \\
i_{L}(t) = i_{L}(\infty) + [i_{L}(0^-)-i_{L}(\infty)]e^{-\frac{Rt}{L}}
\end{align}
$$



&emsp;
# RLC circuits 

&emsp;
## The dampening ratio equation
The series and parallel case have different coefficients in their second order differential equation and therefore have different characteristic equation and therefore different roots. Although this is only true for the second coefficient $b$ of the characteristic equation. 
$$
\frac{d^2 x(t) }{dt}+ 2\alpha \frac{dx}{dt} +\omega_{0}x
$$
> This is the second order differential for both series and parallel RLC circuits where $\alpha$ is:

$$
\begin{array}{cc} 
\displaystyle \alpha_{s}=\frac{R}{2L}, & \displaystyle \alpha_{p} =\frac{1}{2RC}
\end{array} \tag {1.1}
$$
> Where $\alpha_{s}$ is for series and $\alpha_{p}$ is for parallel

The damping ratio equation $\large \zeta$ is simply a ratio between $\alpha$ and $\omega_{0}$ where $\omega_{0}$ represents the resonant frequency of the system and is given by:

$$
w_{0}=\frac{1}{\sqrt{ LC }} \tag {1.2}
$$ 

Finally we can write the dampening ratio equation 

$$
\LARGE \boxed{\zeta=\frac{\alpha}{\omega_{0}}=
\frac{\frac{R}{2L}}{\frac{1}{\sqrt{ RC }}} \text{ or }
\frac{\frac{1}{2RC}}{\frac{1}{\sqrt{ RC }}}
} \tag {1.3}
$$


&emsp;
### The Dampening Ratio Applied 
We can use $\zeta$ to predict the behavior of the system thus its name the dampening ratio. The three cases arise from the different possible cases for roots of the system given the quadratic of the characteristic equation:
$$
\lambda^2 +2\alpha  \lambda +\omega_{0}
$$
Now the quadratic 
$$
\begin{align}
\lambda_{1},\lambda_{2} &  = \frac{ -b\pm \sqrt{ b^2-4ac }}{2a} \\
 & = \frac{-2\alpha  \pm \sqrt{ (4\alpha^2-4\omega_{0}) }}{2} & \text{given $a =1,b=2\alpha,c=\omega_{0}$}
\end{align}
$$
as we can see in this quadratic (this is true for any quadratic) we can have 1 of 3 situations

1.  2 Real roots 
2.  1 Repeated real root 
3.  2 imaginary roots 


&emsp;
###  **The 3 cases of the Dampening Ratio** 

![[Pasted image 20260224010700.png#invert]]



#### **Case 1:**  **The Overdamped Case**
In this case we have two negative real roots thus $\zeta$ must be greater than one. 

**For series**
$$
\begin{array}{rr} \displaystyle
\zeta >1, &  \displaystyle
\alpha > \omega_{0}^2
\end{array}
$$

Because we have negative real roots we can use the [[Quadratic Formula]] from before to find the solutions. (we will write them as $S_{1},S_{2}$ instead of $\lambda_{1},\lambda_{2}$ )

$$
\begin{align}
s_{1} & = -\alpha + \sqrt{ \alpha^2 -\omega _{0}^2} \\
s_{2} & = -\alpha - \sqrt{ \alpha^2-\omega^2_{0} }
\end{align}
$$
These then serve as the exponents for the general equation for the solution of differentials of this case 
$$
\boxed{\LARGE
x(t) = K_{1} e^{-s_{1}t} +K_{2}e^{-s_{2}t} + \text{FF}}
$$
> Where $FF$ is a forcing function/ a constant condition which will outlive the transient


#### **Case 2:**  **The Critically Damped Case**
In this case everything under the square root cancels out meaning in the numerator we get $\pm 0$


$$
\begin{array}{rr} \displaystyle
\zeta =1, &  \displaystyle
\alpha = \omega_{0}
\end{array}
$$

Since out exponents become much simpler we don't have $S_{1}$ or $S_{2}$ in this general equation
$$
\LARGE
\boxed{
x(t) = e^{-\alpha t}(K_{1}+K_{2}) + FF} 
$$
> Where $FF$ is a forcing function/ a constant condition which will outlive the transient

#### **Case 3:**  **The Underdamped Case**
In this case we have 2 imaginary roots. This happens only when $\omega_{0}$ is large than $2\alpha$ 

For **Series** cases this means 
$$
\begin{array}{rr} \displaystyle
\zeta <1, &  \displaystyle
\alpha < \omega_{0}
\end{array}
$$


This is the only case in which we see an oscillation, its frequency if given by  
$$
\begin{align}
\omega_{d}  & =\sqrt{ \omega_{0}^2 - \alpha^2 } \\ \\
\end{align}
$$

By manipulating [[Eulers Formula]] we can create a general solution for the Underdamped case
$$
\large{
\boxed{
x(t) = e^{-\alpha t}(K_{1}\cos(w_{d}t)+K_{2}\sin(\omega_{d}t) ) + FF
}}
$$




## Solving RLC equations

When solving RLC equations for functions such as voltage or current the way we do this is very similar to solving [[Second Order Differential Equations]] except that we go straight to the solution equations given by the [[#**The 3 cases of the Dampening Ratio**|dampening ratio equations]] and simply solve for the constants within those solutions given initial conditions given by the circuit.

In all three cases we use the initial conditions to solve for $K_{1},K_{2}$ the easiest way to do this is to solve for the function at time zero and the derivative at time zero and plug both values in to either create a system of equations or simply get values for $K_{1}$ and $K_{2}$. 

To do this we need the derivative of either current or voltage at 0 this is done by using the current equation for caps or inductors and solving for derivatives so.

$$
\begin{array}{ll} \displaystyle
V_{c}=C \frac{di_{c}}{dt}, &  \displaystyle
i_{L}= L \frac{dv_{L}}{dt}
\end{array}
$$
So for instance if i was finding voltage through a cap i would solve for $K_{1}$ and $K_{2}$ with 
$$
\begin{align}
v(0) & =K_{1}e^{-s_{1}(0)} + K_{2}e^{-s_{2}(0)} \\
v'(0) & = (-s_{1})K_{1}e^{-s_{1}(0)} + (-s_{2})K_{2}e^{-s_{2}(0)}
\end{align}
$$
> this is assuming we are overdamped and in [[#**Case 1 ** **The Overdamped Case**|case 1]].



&emsp;

# Differential Proofs 

> [!NOTE]- Proof for the differential equation for discharging capacitors and inductors
> ![[RL and RC circuits voltage and current proof|center|900]]


> [!NOTE]-  Proof for the differential equation for RLC circuits in series 
> 
> ![[RCL circuit in series.svg#invert|center|600]]
> 
> 
> 
> 
> We start with KVL again
> $$
> -V_{s} +i_{L}R+L \frac{di_{L}(t)}{dt}+v_{c}(t)=0 \tag 1
> $$
> to solve this we need to express this equation in terms of cap voltage or inductor current
> 
> $$
> \begin{array}{ll}
> \text{In terms of the capacitor voltage:}  & \displaystyle i_{L}(t)=i_{c}(t) = C \frac{dv_{c}(t)}{dt} \\
>  
> \text{In terms of the indcutor current:} & \displaystyle  v_{c}(t) = \frac{1}{C} \int_{0}^ t i_{L}(t) \, dt  + v_{c}(t)
>  
> \end{array}
> $$
> In this situation its easier to create the differential in terms of the capacitor voltage so we start by substituting for $i_{L}(t)$
> 
> $$
> \tag 2 -V_{s} + R\color{red}{C \frac{dv_{c}(t)}{dt}} \color{white}   +L \frac{di_{L}(t)}{dt}+v_{c}(t)=0
> $$
> Now we only need to replace the $i_{L}'(t)$ term this we can do by taking the identity from above and taking the derivative.
> 
> $$
> \begin{align}
> i_{L}(t) & =C \frac{dv_{c}(t)}{dt} \\
> \frac{di_{L}(t)}{dt} & = C \frac{d^2v_{c}(t)}{dt^2}
> \end{align}
> $$
> Now we do our last substitution to solve for the differential 
> 
> $$
> -V_{s}(t) +RC \frac{dv_{c}(t)}{dt} + L\color{red} C \frac{d^2v_{c}(t)}{dt^2} \color{white} +v_{c}(t)=0
> $$
> 
> Final steps are just to rearrange the equation to isolate the $v''_{c}(t)$ term. This gives us our Second Order Homogenous Linear Differential Equation. 
> 
> $$\large
> \frac{d^2v_{c}(t)}{dt^2} + \frac{R}{L} \frac{dv_{c}(t)}{dt} +\frac{1}{LC} v_{c}(t) = \frac{V_{s}(t)}{LC}
> $$
> If we then repeat the same steps but solve for the current we get the equation
> $$\large
> \frac{d^2 i_{L}(t)}{dt^2} + \frac{R}{L}  \frac{di_{L}(t)}{dt}+\frac{1}{LC}i_{L}(t)=\frac{1}{L} \frac{dV_{s}(t)}{dt} 
> 
> $$
> 

