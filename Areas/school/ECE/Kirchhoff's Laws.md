
&emsp;
# Kirchhoff's Voltage Law 
This law often called **Kirchhoff's loop rule** tells us about the relationship of voltage drops within a circuit. This law comes from the idea that energy cannot be created or destroyed (conservation of energy). The law goes as follows

***"The directed sum of the potential differences (voltages) around any closed loop is zero."*** [^1]

Mathematically this comes out as 
$$
\sum_{i=1}^i V_{i}=0
$$


> [!EXAMPLE]- Symbolic Example
> 
> 
> ![|center|300](https://i.imgur.com/6PdKM29.png)
> If the loop we are looking at is loop $L_{ABCD}$ and as per convention we go counter clockwise around the loop adding each voltage drop. (note that when getting actual values entering the negative terminal along a voltage source gets a negative number) we get the expression:
> $$
> \Large{v_{1}+v_{2}+v_{3}+v_{4}=0}
> $$
> 


&emsp;
# Kirchhoff's Current Law 
This rule often called the **junction rule** is a rule defining the interaction of current at a **node.** The rules states that 

***"The algebraic sum of currents in a network of conductors meeting at a point is zero."*** [^1] 

Mathematically this comes out as 
$$
\sum_{i=1}^n I_{i}=0
$$
>where $n$ is the number of branches with currents flowing twoards or away from the node 

> [!EXAMPLE]- Symbolic Example
> 
> 
> ![|center|300](https://i.imgur.com/RTbfit3.png)
> Looking at this circuit we can obviously identify that the node is the point in the middle where all currents are flowing either into or out of the node. Furthermore using the standard convention where current flowing into the circuit is positive and current flowing out is negative we can represent this circuit mathematically as :
> $$
> \Large{i_{2}+i_{3}-i_{1}-i_{4}= 0}
> $$
> 

---
&emsp;
# Circuit analysis using [[#Kirchhoff's Voltage Law|KVL]] and [[#Kirchhoff's Current Law|KCL]]



## Mesh Analysis 
This type of circuit analysis that uses [[#Kirchhoff's Voltage Law|KVL]] to create a [[Systems of linear equations|linear system]] to solve for currents within a circuit. This an especially useful tool when solving for currents when it is no longer possible to simplify the [[Finding Equivalent Resistances|equivalent resistances]].

**How does [[#Mesh analysis]] work?** 

Mesh analysis works by standardizing the "rules" for each circuit element that translates into the linear system setting up "loops" for the circuit" using these rules. This system is then solved through a variety of methods (mostly calculator not by hand). The results then give us the currents across each element.  


#### Theoretical [[#Mesh Analysis]] Example
![[Mesh Circuit Analysis Theoretical example|700]]

### Supermesh analysis 
Sometimes when analyzing a circuit we are give a voltage source in-between two of our mesh's. This is a problem because it means that neither mesh can be defined simply by the current source, this requires a Supermesh.   

To solve a Supermesh we have to find a relationship between the 2 currents dividing the mesh. This is done pretty simply as we simply can subtract the current going into the source from the one going through the source to find the given current for that point eg:

$$
\Large i_{\text{through}} - i_{\text{against}} = I_{\text{current source}}
$$
> This is called the ***Supermesh equation***

after establishing this relationship we can simply create a systems of equations as usual but we treat our Supermesh as one loop (it will only be one equation/row in our system). After creating the system make sure to add our Supermesh equation to the [[Systems of linear equations|system]] and solve 


#### [[#Supermesh analysis|Supermesh]] Numerical Example 
![[Supermesh Example numerical|center|900]]


&emsp;




## Nodal Analysis 
This type of analysis is another method similar in execution to [[#Mesh Analysis]] that allows us to find the **voltages** within a circuit when we cannot further simplify using [[Finding Equivalent Resistances|equivalent resistances]]. 

### How do you do Nodal Analysis 

1. Start by finding all of the nodes for your given circuit this is done relatively easily if you highlight the different connections in different colors.


2. After establishing the nodes start writing each individual node equation. Each node equation is a practically [[#Kirchhoff's Current Law|KCL]] equation for that given node and generally can be written  by

$$ {
(i_{out_{1}} +i_{out_{2}}\dots+i_{out_{x}}) - (i_{in_{1}} +i_{in_{2}}\dots i_{in_{x}}) = 0}
$$
although we are looking for voltages so if we substitute ohms law into the equation solving for current $(I)$ we get:
$$
\large{ \text{KCL equation for node 1}=  \frac{
v_{1}- v_{2}}{R_{a}}\dots+ \frac{v_{1}-v_{n}}{R_{n}}+  {\sum_{i=1}^i I_{n}} =0}$$
> this is where current $(I)$ is positive when its leaving the node and $R_{n}$ is the resistor in-between node $1$ and $2$.  

3. Now repeat step ***2*** for each node in the circuit until you are given a [[Systems of linear equations|linear system]]. 
4. Finally solve your [[Systems of linear equations|system]] to get your voltages at each node.  


### Supernodes
Supernodes are when we have a voltage source in-between 2 nodes when we are trying to perform [[#Nodal Analysis]]. To solve this problem we have to create something called a super node. 

The first step in solving a circuit using a Supernode is to identify the Supernode equation. All this equation represents is the relationship between the nodes across the "Supernode.  


![[Supernode Equation Diagram|center|400]]
>Finding this equation is relatively simply if we remember that voltage on the negative end (Node B) of the voltage source must be the difference between the voltage source and the positive end of the source (Bode A).  (This is because the rest of the voltage must be dropped to 0 after the voltage crosses the source)  


After creating the Supernode equation simply combine the 2 nodes on the ends of the Supernode and create a combined [[#Kirchhoff's Current Law|KCL]] equation for both, repeat this process to find the rest of the [[#Kirchhoff's Current Law|KCL]] equations and solve the linear system. 



&emsp;
 

[^1]: [kirchhoff's circuit laws: Wikipedia](https://en.wikipedia.org/wiki/Kirchhoff%27s_circuit_laws)
