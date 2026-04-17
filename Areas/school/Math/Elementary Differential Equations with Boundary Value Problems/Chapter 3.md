#book_Notes #math_2214 #Diff_EQ


## Existence and Uniqueness for Second Order differential equations

> [!definition] Thrm 3.1
> Let $p(t),q(t)$ and $g(t)$ be continuous funcitons on the interval $(a,b)$ and let $t_{0}$ be in $(a.b)$. Then the initial value problem
> 
> $$
> \begin{align}
> y''+p(t)y'+q(t)y=g(t), &  & y(t_{0})=y_{0}, &  & y'(t_{0})=y'_{0}
> \end{align}
> $$
> 
> Has a unique solution defined on the entire interval $(a,b)$



## Principal of Superposition 


> [!definition] Thrm 3.2
> 
> 
> Let $y_{1}(t)$ and $y_{2}(t)$ be any two solutions of 
> $$
> y''+p(t)y'+q(t)y=0
> $$
> defined on the interval $(a,b)$. Then, for any constants $c_{1}$ and $c_{2}$ the linear combination
> $$
> y(t)=c_{1}y_{1}(t)+c_{2}y_{2}(t)
> $$
> is also a solution on $(a,b)$.

- All this says is that we can combine different solutions with scalar multiples to generate a new solution
	- I guess my only question is then whaat defines a solution in this sinario any equation that is a function on the interval?



## Wronskian

- For a second order system given two solutions two a differential we can compute the Wronskian determinant which tells us if that set of solutions is a fundamental set 

$$
W(y_{1},y_{2}) =
\left |
\begin{array}{ll}
y_{1}(t_{0}) & y_{2}(t_{0}) \\
y_{1}'(t_{0}) & y_{2}'(t_{0})
\end{array}
\right | \not= 0
$$
> This is called the Wronskian determinant

- We use the Wronskian determinant to figure out weather or not we have a unique solution for a given second order differential. 

- When we get a nonconstant result from the Wronskian determinant we test it on the interval of the differential equation 
	- For example if the Wronskian determinant is $-4t$ then we must test $-4t$ on the interval that $p(t)$ and $q(t)$ exist and see if $-4t =0$ on that interval. If it doesn't then we know that its a unique solution. 



### 3.8 Method of Undetermined Coefficients 
- Is used to find the particular solution
- Must have the complementary solution to use undetermined coefficients 
- Remember general solution has the form 
$$
y(t)=y_{c}+y_{p}
$$
- In this method we guess what the particular solution will look like and then solve for the coefficients of our guess after. 

- One trick to make it easy to solve these is that with the gvien $g(t)$ equation out guess needs to have the same coefficients as $g(t)$
	- For example if $g(t)=t^2-t+5$ and my coefficients of my guess are $5At^2-3Bt-C$ (after i took the derivative pluged and simplified) then the coeffents must be the same within the guess and $g(t)$ eg $5A=1m,-3B=-1,-C=5$

- summarize with this table 

$$
\begin{array}{c|c}
 g(t) & y_{p}(t) \mathrm{ \bf{\space guess}} \\
\hline 
 ae^{\beta t} & Ae^{\beta t} \\
a\cos(\beta t) & A\cos(\beta t)+B\sin(\beta t) \\
 b\cos(\beta t)& A\cos(\beta t)+B\sin(\beta t) \\
 a\cos(\beta t)+b\sin(\beta t)& A\cos(\beta t)+B\sin(\beta t) \\
 \mathrm{n^th \space degree\space polynomial}& A_{n}t^n+A_{n-1}t^{n-1}+\dots A_{1}t+A_{0}

\end{array}
$$

