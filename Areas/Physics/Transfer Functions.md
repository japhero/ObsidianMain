#math #Physics #signalProcessing  
# "What are transfer functions?" Dump
- transfer functions are a compact way to model the relationship between the input and the output.
- models Linear, time-invariant dynamics (wtf does this mean)
- its a mathematical model
- can model input and output over time 
- can convert differential equations into transfer functions using the [[laplace transform]]
- for linear differential equations when taking the derivative with respect to time, it turns into exponents of the complex variable $s$
	- $\mathscr{L}(y(t))=s^0Y(s)$
	- $\mathscr{L}(\dot{y}(t))=s^1Y(s)$
	-  $\dot{y}$ means y with the derivative taken with respect to time. each dot signals the degree of the derivative.
	- $\mathscr{L}$ means [laplace transform ](https://en.wikipedia.org/wiki/Laplace_transform)
	- $s =\sigma + j \omega$
	- $frequency  =  \omega$
	- $exponential = \sigma$ 
- if we have an input as a function of $u$ we can **transfer** it through the system by multiplying it times the [[Transfer Functions|Transfer Function]]. 
- Always in the $s$ domain
- we dont use [[Differential Equations]] because they dont work well in series.
- **Poles** are the values of $s$ that cause $G(s) \to ∞$  
- **Zeros** are values of $s$ that cause $G(s) \to 0$
- **gain** is the value of $G(s)$ under steady state conditions or its the value of the transfer function when $s$ is set to zero
- can use the $s$ domain to determin if the system is stable.
- We can use transfer functions to design systems as for [[Filtering accelerometer Data]], or [[Applied signal processing]]




---
# Resources
<iframe width="560" height="315" src="https://www.youtube.com/embed/2Xl7--Df3g8?si=KX525fnyNZkcEjm2" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>