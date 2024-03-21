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
-  We can relate the model to how the oceans use energy because this model simulates the energy of the ocean using vector field.
	- Does this mean that are modeling based off a differential equation?
- Is the study interpreting the data of the boueys and then creating a model?
- "our goal is to reconstruct the vector field from sparse observations."
- "Our primary goals are (1) prediction of the field F at new locations, not observed in the training data, and (2) estimation of the divergence, itself a function of location and which we define next as part of the Helmholtz decomposition. Secondarily, we are interested in recovering vorticity, another functional of F described below."
- The Helmholtz Decomposition is used to extrapolate the data used in the training of the boueys to a model and to have a high covariance inbetween those 2.
- 
- 


### New vocab
- **covariance**: Covariance is a statistical tool that measures the relationship between two random variables
- **[Divergence](https://en.wikipedia.org/wiki/Divergence)**:In [vector calculus](https://en.wikipedia.org/wiki/Vector_calculus "Vector calculus"), **divergence** is a [vector operator](https://en.wikipedia.org/wiki/Vector_operator "Vector operator") that operates on a [vector field](https://en.wikipedia.org/wiki/Vector_field "Vector field"), producing a [scalar field](https://en.wikipedia.org/wiki/Scalar_field "Scalar field") giving the quantity of the vector field's source at each point. More technically, the divergence represents the volume density of the outward [flux](https://en.wikipedia.org/wiki/Flux "Flux") of a vector field from an infinitesimal volume around a given point. [[Divergence]]





[^1]: [Su, F., Fan, R., Yan, F. _et al._ Widespread global disparities between modelled and observed mid-depth ocean currents. _Nat Commun_ **14**, 2089 (2023).](https://rdcu.be/dBUSO)
[^2]:[ECCO Website](https://www.ecco-group.org/)
[^3]: [ECCO publications](https://www.ecco-group.org/storymaps.htm?id=95)
[^4]:https://rdcu.be/dBUSO 
[^5]: [Gaussian Processes at the Helm(holtz): A More Fluid Model for Ocean Currents](https://arxiv.org/pdf/2302.10364.pdf)


