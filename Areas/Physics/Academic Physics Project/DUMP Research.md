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
- ==How can you model the ocean==
- **This study combines the data gathered with the boeys and extrapolates that data to a vector field this vector feild can then be represent in fluid flow as with the curl effecting the actually fluid while the vector feild represents the overall velocity.**

### Curl
- Curl is also is expressed because of the fluid flow around it but it is "tendancy" that something has to rotate because as in divergence its neighbors.  
- Positive curl means clockwise rotation while counter clockwise rotation is negative
- seen for example when the fluid is slow at the "top" and "fast" at the bottom causing rotation
- true curl is 3d.
- $\text{curl F}= \nabla \times F$
- for GP study[^5] $ζ$ is the curl.
- ==How can you model the ocean==
- **The Curl is used in the the context of the vector field to create the "Ocean Flow" Formula and is an element of the final model**

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
- ==How can you model the ocean (incorporate this section)==
- **Although these are equations to represent Electricity one is applicable $div \space B =0$ is a representation for the water used in the ocean becasue its incompressible its divergent free in the context of the rotational equation**



### The Helmholtz Decomposition. 
The motion of a volume element of a fluid, such as the ocean, can be decomposed into a divergent velocity and a rotational velocity.
==How can you model the ocean (incorporate this section)==
**The decomposition is the main math equation used in the paper as listed above its the fundemental part of how the model is represented in velocity and rotation $\underbrace{F}_{ocean \space flow} = \underbrace{grad\, Φ}_{divergent \space velocity} + \underbrace{rot \, Ψ }_{rotational \space velocity}$**




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
- ==How can you model the ocean (incorporate this section)==
- **Divergence in the context of modeling is used to find the divergent velocity again similarly to curl its an element of the "Stream" Function**


### New vocab
- **covariance**: Covariance is a statistical tool that measures the relationship between two random variables
- **[Divergence](https://en.wikipedia.org/wiki/Divergence)**:In [vector calculus](https://en.wikipedia.org/wiki/Vector_calculus "Vector calculus"), **divergence** is a [vector operator](https://en.wikipedia.org/wiki/Vector_operator "Vector operator") that operates on a [vector field](https://en.wikipedia.org/wiki/Vector_field "Vector field"), producing a [scalar field](https://en.wikipedia.org/wiki/Scalar_field "Scalar field") giving the quantity of the vector field's source at each point. More technically, the divergence represents the volume density of the outward [flux](https://en.wikipedia.org/wiki/Flux "Flux") of a vector field from an infinitesimal volume around a given point. [[Divergence]]
- [**Scalar potential**](https://en.wikipedia.org/wiki/Scalar_potential) describes the situation where the difference in the [potential energies](https://en.wikipedia.org/wiki/Potential_energy "Potential energy") of an object in two different positions depends only on the positions, not upon the path taken by the object in traveling from one position to the other.
- [Elements](https://en.wikipedia.org/wiki/Element_(mathematics)) $x \in A$ means that a is an element of a 
- Phase space: a solution to a given system an [[Ordinary Differential Equations|ODE]] 
- 


![](https://i.imgur.com/qusPOUo.png)
> Figure 1. First column: ground truth predictions (upper) and divergence (lower). Second column: current predictions. Third column: divergence estimates. Fourth column: posterior divergence z-values.

**This resources is usefull to show how the different data points collected extrapolate data.**
- 





# Global heat transfer[^Nat_geoGraphic] 
- Currents "play a key role in determining how the ocean distributes heat energy throughout the planet, thereby regulating and stabilizing climate patterns."
- "The movement of this heat through local and global ocean currents affects the regulation of local weather conditions and temperature extremes, stabilization of global climate patterns, cycling of gases, and delivery of nutrients and larva to marine ecosystems."
- Deeper currents are driven by the temperature as well as the density is effected
==Ecological effects of ocean currents.==
**The ocean can effect the climate because it transfers heat thought the globe this effects the movement of the water underneath the surface because the density of water effected by heat **


# Ecology[^Ocean_Currents_and_marine_life ] 
- Traditionally ocean currents have not been used for marine biology 
- Some models are not accurate enough to predict the traversal of marine biology  "lacked resolution"
	- "Nowadays, higher resolution models provide a far more realistic view of currents"
- plankton drifts with currents
- We can mesure the connectivity of 2 different ecological places with the newer current models. Basicaly how much marine biology is connected from one physical site to another because of the ocean currents and. how independant are different sites
- "transforming our understanding of how insects travel large distances."
- we can also mesure the currents backwards from data collected from animals.

==How is modeling important and what are the effects.==
**Marine biology is effected by currents and the as the currents move around animals such as plankton which intern are nutrients for other animals this is important because it shows the importance of modeling of ocean currents.  Overall this study shows how different physical places can be connected though the ocean currents.**


&emsp;

# Resources 
<iframe width="560" height="315" src="https://www.youtube.com/embed/rB83DpBJQsE?si=Louow-fSMQeYor0J" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>




[^1]: [Su, F., Fan, R., Yan, F. _et al._ Widespread global disparities between modelled and observed mid-depth ocean currents. _Nat Commun_ **14**, 2089 (2023).](https://rdcu.be/dBUSO)
[^2]:[ECCO Website](https://www.ecco-group.org/)
[^3]: [ECCO publications](https://www.ecco-group.org/storymaps.htm?id=95)
[^4]:https://rdcu.be/dBUSO 
[^5]: [Gaussian Processes at the Helm(holtz): A More Fluid Model for Ocean Currents](https://arxiv.org/pdf/2302.10364.pdf)
[^Helmholtz_Wiki]: [Helmholtz Wikipedia ](https://en.wikipedia.org/wiki/Helmholtz_decomposition)

[^Nat_geoGraphic]: [Ocean Currents and Climate National Geographic](https://education.nationalgeographic.org/resource/ocean-currents-and-climate/)

[^Ocean_Currents_and_marine_life ]: [Hays, Graeme C. “Ocean currents and marine life.” _Current biology : CB_ vol. 27,11 (2017): R470-R473. ](doi:10.1016/j.cub.2017.01.044)

