
> [!INFO] 
> This note is because in calc 2 we have not reached [[Ordinary Differential Equations|ODE's]] and therefore not really knowing the distinction ima make this note for now.


# Dump




## Logistics problems

- what the fuck is carrying capcity?
	- The maximum amount that a system can sustain, for example the max amount in a population.

-  What the fuck is $k$ in the context of [[#Logistics problems]]
	- the relative growth rate of the system 
$$
\frac{1}{P} \cdot \frac{dP}{dt}=k
$$
**Logistics differential equation**
$$
\frac{dP}{dt}= kP\left( 1-\frac{P}{M} \right)
$$
> $M =\text{carrying capacity, } P=\text{population, } k=\text{growth rate}$  

- if we see the equation $\frac{dP}{dt}=.05P+.0005P^2$ for example we can simply factor out $.05P$ and get our equation $\frac{dP}{dt}=.05P\left( 1-\frac{P}{100} \right)$ 


## Proof:  



> [!Warning] Look for correction
> carrying M to the numorator fishy check it 

$$
\begin{array}{l} \\  \\
 \large\frac{dP}{dt}=kP\left( 1-\frac{P}{M} \right) \to \frac{M-P}{P}=Ae^{-kt}\\
 \\

\frac{dP}{dt}=kP\left( 1-\frac{P}{M} \right) \\
\int \frac{dP}{P(1-{P}/{M})} \, =\int k \, dt \\
\frac{A}{P} + \frac{B}{1-P/M} = \frac{1}{P}+\frac{1}{M-P} \\
\int \left( \frac{1}{P}+\frac{1}{M-P} \right) \, dp = \int k \, dt  \\
\ln(P)-\ln(M-P)=kt+C \\
-\ln(P)+\ln(M-P)=-kt-C \\
\ln\left( \frac{M-P}{P} \right)=-kt-C \\
\frac{M-P}{P}=e^{kt+c} \\
\frac{M-P}{P}=e^{-kt}e^{-c} \\
 \\
\large{\frac{M-P}{P}=Ae^{-kt}}
\end{array}
$$
