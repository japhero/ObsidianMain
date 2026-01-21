#ECE 



# Section 7.3 Sequential Logic Circuits 

- The operation of sequential logic circuits is synchronized by a clock signal 


## Flip Flops 
-  Is called a flip flop because it has 2 stable states. 
- It can store one but of information. 
- A useful version of the flip flop would be the SR flipflop as you are able to change the state with set and reset
	- Set makes the flip flip $(Q)$ high 
	- Reset makes the $Q$ low
	- $S$ and $R$ cannot be high at the same time
- an asynchronous input such as clear to a clock SR latch example will make the latch low no matter the clock cycle of the latch making the clear $(Cl)$ async.


## Edge triggered circuits
- The term edge describes the fact that the circuit changes its states on the change of the clock
	- Positive edge triggered circuits respond when the clock signal switches from low to high.
	- Negative edge trigged circuits respond on the transition from high to low. 
- The positive edge of the clock is also called the **leading edge** and the negative is called the **trailing edge**
- 