#physics #PHYS_2306 #Physics_Book_Notes 


The number of field lines attached to a charge is proportional to its magnitude.



Small charged objects
$$
\vec{E}=\frac{1}{4\pi \epsilon_{0}} \frac{q}{r^2} \hat{r}
$$


Infinitely long wire of charge
$$
\vec{E} = \left( \frac{1}{4\pi \epsilon_{0}} \frac{2|\lambda|}{r} \right)
$$

A sphere of charge 
$$
\vec{E} = \frac{1}{4\pi \epsilon_{0} } \frac{Q}{r^2} \hat{r}
$$
> when $r>R$




An infinitely wide plane of charge
$$
\vec{E} = \left( \frac{\eta}{2\epsilon_{0}} \right)
$$


### 23.2.1 Multiple point charges
- **the net electric field is the** _**vector sum**_ **of the electric fields due to each charge**
	- super position we can find the charge from each point charge sum them and get our answer

### PSS

- Establish a coordinate system
- identify the point P at which you want to calcuklate the E field
- draw the e field for each charge at p
- use symetry to determine if any components of $\vec{E_{\mathrm{net}}}$ are zero 

SOLVE
$$
\vec{E}_{net} = \sum \vec{E}_{i}
$$


### Electric Field lines 
![[Pasted image 20260402214509.png#invert]]

### 23.3.0 Continuous charge distributions 

**linear charge density**
$$
\lambda = \frac{Q}{L}
$$
**Surface Charge density**
$$
\eta = \frac{Q}{A}
$$
- this ofc assumes a even charge distribution 

### 23.3.1 Integration is summation 

- the total charge on an object is the sum of its charges 

$$
Q = \sum_{i=1}^N \Delta Q_{i} =  \underbrace{\int}_{\mathrm{object}}  \, dQ 
$$

**For a rod**

- $dQ=\lambda dx$

$$
Q= \underset{\mathrm{rod}} \int  \, dQ=\int_{0}^L \lambda \, dq 
$$



### 23.3.2 Problem solving strat

1. Divide the total charge $Q$ into many small point like charges $\Delta Q$.
2. Use our knowledge of the electric field of a point charge to find the electric field of each $\Delta Q$
3. Calculate the net field $\vec{E}_{\mathrm{net}}$ by summing the fields of all the $\Delta Q$ (take the integral)





### 23.4.1 Disk of Charge

$$
\eta=\frac{Q}{A}=\frac{Q}{\pi R^2}
$$


**E field**
$$
(\mathrm{E_{disk}})_{z} = \frac{\eta}{2\epsilon_{0}}\left[ 1-\frac{z}{\sqrt{ z^2 +R^2 }} \right]
$$

### 23.4.3 A Plane of Charge 
$$
\mathrm{E_{plane}} = \frac{\eta}{2 \epsilon_{0}} = \mathrm{constant}
$$
$$
\vec{E}_{\mathrm{plane}} = \left( \frac{|\eta|}{2 \epsilon _{0}} \right)
$$
![[Pasted image 20260402220024.png#invert]]


### 23.4.4 A sphere of Charge 

$$
\vec{E}_{\mathrm{sphere}} = \frac{Q}{4\pi \epsilon_{0}r^2} \hat{r}
$$
> $r\geq R$

