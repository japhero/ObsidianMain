#Electrical_Engineering #ECE_2024 #Hardware #ECE



# DUMP



## VIDEO 1
- Transistor can act as a switch or as an amplifier 

- Three terminals 
	- Collector 
	- base 
	- emitter 


- When acting like and amp the small current from the base flows to the emitter, this current controls the larger amount of current that can flow from the collector to the emitter.
	- This is why $\beta$ is used as the gain terminal 


### Different modes/Operating region

**Cutoff** 
- there is no current through the base emitter 

**Saturation operation**
- Base emitter is forward biased as well as the base collector 

**Active region**
- the base is forward biased but the collector is forward biased
- THIS IS APLIFICATION
- 
- for PNP the direction of current is reversed. 



## Class notes 



### Shockly diode equation
$$
I_{D}=I_{S}\exp\left( \frac{qV_{D}}{{V_{T}}} -1\right)
$$
> $V_{t}=.0026$
## BJT's


**NPN**

- When solving for the gain we use KCL and assume the BJT is a node
- Current is mainly made up of electrons

**PNP**

- The current directions are flipped
- Current is mainly made up of Holes.

![[Pasted image 20260420113741.png#invert|center|400]]
	
$$
\begin{align}
i_{B} & =(1-\alpha)I_{ES}\left[ \mathrm{ \exp\left( \frac{v_{BE}}{V_{T}} \right)} \right] \\
i_{c} & =\alpha i_{E}=\alpha I_{ES}\left[ \exp\left( \frac{v_{BE}}{V_{t}} -1\right) \right]
\end{align}
$$
## Current Equations

$$
\begin{align} \\
 & i_{c}=\alpha i_{e} = \frac{\beta}{1+\beta}i_{e}\\
 & i_{c}=\beta i_{b} \\
 & i_{e} =(1+\beta)i_{b} \\ 
 & i_{B}=i_{E}-i_{C} \\
 & i_{C}=i_{E}-i_{B}
\end{align}
$$
**Beta and alpha**
$$
\begin{align}
\large\beta  & = \frac{i_{c}}{i_{ b}}= \frac{\alpha}{1-\alpha} \\
\large\alpha  & = \frac{i_{c}}{i_{e}}

\end{align}
$$

### Modes

- Forward active
    - BE junction is forward biased
    - BC junction is reverse biased
- Saturation
    - B-E and B-C junctions are forward biased
- Cut-off
    - B-E and B-C junctions are reverse biased
- Inverse active
    - B-E junction is reverse biased
    - B-C junction is forward biased

### $\beta$ (Beta)

- Beta is the internal gain within the transistor it is often if in the forward amplification range not as relevant and the current and voltage gain is different.

$$
\begin{align}
\large\beta  & = \frac{i_{c}}{i_{ b}}= \frac{\alpha}{1-\alpha} \\
\large\alpha  & = \frac{i_{c}}{i_{e}}

\end{align}
$$


## Large Signal Modeling 
- Is Used for DC analysis related to the DC bias of the transistor 

There are 3 models based off of the 3 different operating modes of the transistor 
1. Active (forward active)
2. Saturation
3. Cutoff 

The way large signal works is that we test the circuit to see what mode its in then apply the correct model and solve. The 3 different modes come from the fact that at different emitter, collector and base voltages the two "diodes" are biased in different ways 

![[Pasted image 20260430235140.png#invert]]

In practice only Saturation and and Active matter since at cutoff the circuit is a open circuit.  


> [!Note]- Different Bias settings
> - Forward active
>     - BE junction is forward biased
>     - BC junction is reverse biased
> - Saturation
>     - B-E and B-C junctions are forward biased
> - Cut-off
>     - B-E and B-C junctions are reverse biased
> - Inverse active
>     - B-E junction is reverse biased
>     - B-C junction is forward biased
> 



### Solving Steps

1. Make an educated guess on the possible region of operation
2. Replace the BJT by the large-signal model corresponding to the chosen region
3. Perform the analysis of the resulting circuit and determine IC, IB, VBE and VCE
4. If all the constrains are met for the chosen region, you are done.
	- Active:
		- IB > 0 and VCE > 0.2 V for an NPN BJT
		- IB > 0 and VCE < -0.2 V for a PNP BJT
	- Saturation:
		- IB > 0 and βIB > IC > 0 for both transistor types
	- Cutoff:
		- VBE < 0.5 0 and VBC < 0.5 for NPN BJT
		- VBE > -0.5 0 and VBC > -0.5 for PNP BJT
5. If one, or more, constraint fails, choose a different region and go back to step 2.


### Circuits 

**Forward Active Model**
![[Pasted image 20260501002720.png#invert|center|400]]

**Saturation Model**
![[Pasted image 20260501002802.png#invert|center|400]]


&emsp;




---



## 4 Resistor Bias Network

![[Pasted image 20260422114308.png#invert|center|300]]

- The connection to ground of the $V_{bb}$ DC source short circuits to ground any AC input signal.
- We solve this with a four resistor bias network which provides a constant base voltage with a voltage divisor.

![[Pasted image 20260422114533.png#invert]]

## Small Signal Analysis

$$ I_{b}=I_{bq} \cdot \mathrm{\exp}\left( \frac{v_{be}(t)}{V_{T}} \right) $$

> $V_{T}=.026V$ at room temperature

- We replace the nonlinear exponential with a resistor that linearizes that relationship

![[Pasted image 20260422115714.png#invert|center|400]]

- The current source is needed because we cannot assume a constant voltage drop or current through the circuit because if so the AC would get removed.
- Large signal model is used for biasing and only works in DC

## Amplifiers

- All amplifiers are pass band

### Common Base

- Has voltage gain but no current gain

### Common Emitter
The Common-Emitter is a BJT configuration where the base terminal of the transistor is
the input, the collector is the output, and the emitter is common to both of them.

- High input impedance means the source sees little load current
- Has both current and voltage gain

![[Pasted image 20260422120056.png#invert|center|300]]

- We use decoupling caps C1 and C2 to remove the DC current.

### Common Collector

- Has current gain but no voltage gain
- The output voltage is 0.7 below the input voltage
    - Called a voltage follower because it follows the voltage of the source but with a small drop

![[Pasted image 20260427112145.png#invert]]

**Common collector circuit along with the general model** ![[Pasted image 20260427114230.png#invert|center]]


*****
# Resources 
<iframe width="560" height="315" src="https://www.youtube.com/embed/PW_eikSxDzY?si=dt2z8bclsveW3yea" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
<iframe width="560" height="315" src="https://www.youtube.com/embed/iJ7zP0wDPZI?si=2sCB4ot03C17MlEo" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>