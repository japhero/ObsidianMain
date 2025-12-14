#ECE #ComputerEngineering #Circuits




# DUMPS
## Dump  [Intro to Op-Amps](https://www.youtube.com/watch?v=fmRHDqcodS4)
-  The output of an opp amp is determined by the diffference between the input and the output times the gain so

$$
V_{o}=A(V_{+}-V_{-})
$$
- In an ideal opp amp the A or the gain is infinity eg
	- in an ideal opp amp $A \approx \infty$

- Rule #1 of opp amps the voltage difference between $V+$ and $V-$ is zero when there is negative feedback  
	- The reason this happens is because as the voltage of the output increases trying to reach the "ideal" infinite difference between the two inputs this voltage goes back into the input and eventually reaches the voltage of the other signal. For example if the inputs are 5v and 0 as the output reaches tries to go to infinity $V_{o}= \infty(5-0)$ eventually the two voltages will be 5 and 5 where now the difference will be zero and now the voltage will remain stable.

- Rule #2 no current will flow through the inputs. 
	- This happens because the resistor between the two inputs is ideally infinity where the current is approximately zero although this doesn't effect voltage.

- The saturation voltage is the source voltage becasue the opp amp cannot go higher than the source voltage. 
	- This is why open loop amps work like a comparator because the attempted voltage output is infinity and just gets cut by the saturation voltage.


### TLDR

Opp amps have 2 big rules 

1. The ideal voltage difference of the two inputs is 0.
2. No current flows through the inputs 


- The **saturation voltage** is the voltage of source inputs as the amp cannot give a higher or lower output than the source voltages
	- For example if an opp amp is powered by $+5\,V$ and $-5 \, V$ the output cannot be higher than +5 or -5.



## Dump [Inverting and Non-inverting Amplifiers](https://www.youtube.com/watch?v=EOZyofNXWXc&list=PLfYdTiQCV_p6tWY5Wwjgefa7AX2YiDRQ4&index=4)

 - We can reclassify the V+ and V- as noninverting and inverting inputs respectively. This works because within the equation $A(V_{+}-V_{-})$ if $V_{+}$ is slightly higher than $V_{-}$ then the output will be positive and vice versa. This works because the ideal gain factor $A$ is infinity so whatever sign is given by either the the inverting or noninverting input is multiplied by infinity before being output. 

**Inverting Config**
- Within the inverting opp amp configuration the output goes into the negative input 
- The gain is given by 
$$
\frac{V_{out}}{V_{in}}=-\frac{R_{f}}{R_{in}}
$$

![](https://i.imgur.com/bWSPSf8.png)


**Non Inverting Config**

- Gain is given by 
$$
\frac{V_{out}}{V_{in}} = 1 + \frac{R_{f}}{R_{1}}
$$
![|400](https://i.imgur.com/AnqYMR3.png)

## Dump [Summing op-amp circuit](https://www.youtube.com/watch?v=jlwcIRKCqek)


![](https://spiceman.net/wp-content/uploads/2022/07/adder-circuit.jpg)


- The negative terminal must be zero because the positive is grounded and therefore each resistor must drop all of the voltage coming into the negative terminal.  

$$
V_{o} = -(v_{0}+v_{1}\dots +v_{i})
$$
> when the ratio of the $R_{f}$ to $R_{i}$ is 1



## Dump [Difference Amplifiers](https://www.youtube.com/watch?v=Ea5AsPZgB64), [Vid 2](https://www.youtube.com/watch?v=yrXPudthHy8)

- Like other opp amps the output voltage is a function of the input voltages and the given resistors present on the circuit 


- A good way to solve them is to use super position to remove one voltage source and then solve for the effect one has and then do the other






# Resources
<iframe width="560" height="315" src="https://www.youtube.com/embed/fmRHDqcodS4?si=Nkz45V2VrfM1S5AB" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/EOZyofNXWXc?si=4iGYosvVz7x1HSKD" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/jlwcIRKCqek?si=qsdTxCuUbJJ8lDn-" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>