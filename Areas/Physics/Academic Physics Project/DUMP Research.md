#vector #Euclidean_plane
<video src = "https://svs.gsfc.nasa.gov/vis/a000000/a003900/a003908/ecco2_v01.mp4" controls = True width =400 />



## A More Fluid Model for Ocean Currents D [^5]
- Oceans are modeled by putting buoys into the ocean and then mesuring the velocities that the buoys return and then computing the currents as a [[vector field]].[^5] 
-  "Reconstructing ocean currents accurately can facilitate weather forecasting, maritime navigation, and forecasting of oil spill dispersion." [^5]
- The method has limitations becaue the buoys can somtimes fail to collect data due to ocean vortices 
- The framework used to model the ocean was created in 2 parts one simulated and one realistic model and then the difference between the 2 is then calculated.
- **The Helmholtz Decomposition.** 
	- The motion of a volume element of a fluid, such as the ocean, can be decomposed into a divergent velocity and a rotational velocity.
	- Is a vector field.
$$
\underbrace{F}_{ocean \space flow} = \underbrace{grad\, Φ}_{divergent \space velocity} + \underbrace{rot \, Ψ }_{rotational \space velocity}
$$
	Stream function $\uparrow$
-  We can relate the model to how the oceans use energy because this model simulates the energy of the ocean using vector field.
	- Does this mean that are modeling based off a differential equation?
- Is the study interpreting the data of the boueys and then creating a model?
- "our goal is to reconstruct the vector field from sparse observations."
- "Our primary goals are (1) prediction of the field F at new locations, not observed in the training data, and (2) estimation of the divergence, itself a function of location and which we define next as part of the Helmholtz decomposition. Secondarily, we are interested in recovering vorticity, another functional of F described below."
- The Helmholtz Decomposition is used to extrapolate the data used in the training of the boueys to a model and to have a high covariance inbetween those 2.
- $(x_{m}^{(1)},y_{m}^{(2)})^T ∈ \mathbb{R}^2$ represnt the location of a bouey and $x_{m}$ is represented as a collum vector usually latitude and longitude  
	- This makes sense becasue the points coll vectors x,y are part of the set used to then calculate the ocean flow.
- if a fluid is "incompressable" the velocity vector feild must have a divergence of 0 everywhere. 
	- Is this what divergent free means?

### Curl
- Curl is also is expressed because of the fluid flow around it but it is "tendancy" that something has to rotate because as in divergence its neighbors.  
- Positive curl means clockwise rotation while counter clockwise rotation is negative
- seen for example when the fluid is slow at the "top" and "fast" at the bottom causing rotation
- true curl is 3d.
- $\text{curl F}= \nabla \times F$
- for GP study[^5] $ζ$ is the curl.

### Maxwells equations 
$$
div \space E = \frac{\rho}{\varepsilon_{0}}
$$
- Divergence is proportional to charge density. This basically means that protons act as a "source" and electrons act as a "sink"
- and where there is no charge the fluid flows incompressible 
$$
div \space B =0
$$
- Means that there is 0 divergence everywhere and that the "fluid" is incompressible. 
- This is relative to[^5] because this is the situation that the oecan takes a divergent free felid. 
$$
curl \space E
$$




. Helmholtz decomposition
- Operation in vector calculus that states that a vector field in 3 dimensions can be represented as a tge sum of a divergence free vector field. 

### Divergence 
- Vector fields are planes were each point in space has a vector
- in our case they are the velocity of each particle of fuel.
- static vector feilds are a steady state system
- Vector feilds can describe other physical phenomenon such as fluid flow.
- divergence is the amount that fluids flow into regions near it
	-  Maby of the amount of fluid coming out of a space?
	- divergence of "sources" is positive and the opposite is true as channels where fluid flows into it are negative
- In this context a vector feild takes in 2d input and outputs.
- the output of a divergence function depends on the "neighbors" thats what makes it similar to [[derivative|derivatives]] 
- $div \space F=  \nabla \cdot F$ (dot product of the derivatives)
- for GP[^5] study the divergence is $δ$.


### New vocab
- **covariance**: Covariance is a statistical tool that measures the relationship between two random variables
- **[Divergence](https://en.wikipedia.org/wiki/Divergence)**:In [vector calculus](https://en.wikipedia.org/wiki/Vector_calculus "Vector calculus"), **divergence** is a [vector operator](https://en.wikipedia.org/wiki/Vector_operator "Vector operator") that operates on a [vector field](https://en.wikipedia.org/wiki/Vector_field "Vector field"), producing a [scalar field](https://en.wikipedia.org/wiki/Scalar_field "Scalar field") giving the quantity of the vector field's source at each point. More technically, the divergence represents the volume density of the outward [flux](https://en.wikipedia.org/wiki/Flux "Flux") of a vector field from an infinitesimal volume around a given point. [[Divergence]]
- [**Scalar potential**](https://en.wikipedia.org/wiki/Scalar_potential) describes the situation where the difference in the [potential energies](https://en.wikipedia.org/wiki/Potential_energy "Potential energy") of an object in two different positions depends only on the positions, not upon the path taken by the object in traveling from one position to the other.
- [Elements](https://en.wikipedia.org/wiki/Element_(mathematics)) $x \in A$ means that a is an element of a 
- Phase space: a solution to a given system an [[Ordinary Differential Equations|ODE]] 
- 


![](https://i.imgur.com/qusPOUo.png)
> Figure 1. First column: ground truth predictions (upper) and divergence (lower). Second column: current predictions. Third column: divergence estimates. Fourth column: posterior divergence z-values.
- 
# Resources 
<iframe width="560" height="315" src="https://www.youtube.com/embed/rB83DpBJQsE?si=Louow-fSMQeYor0J" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>



# Environmental effects on the currents.




[^1]: [Su, F., Fan, R., Yan, F. _et al._ Widespread global disparities between modelled and observed mid-depth ocean currents. _Nat Commun_ **14**, 2089 (2023).](https://rdcu.be/dBUSO)
[^2]:[ECCO Website](https://www.ecco-group.org/)
[^3]: [ECCO publications](https://www.ecco-group.org/storymaps.htm?id=95)
[^4]:https://rdcu.be/dBUSO 
[^5]: [Gaussian Processes at the Helm(holtz): A More Fluid Model for Ocean Currents](https://arxiv.org/pdf/2302.10364.pdf)
[^Helmholtz_Wiki]: [Helmholtz Wikipedia ](https://en.wikipedia.org/wiki/Helmholtz_decomposition)



