#physics #PHYS_2306 #Physics_Book_Notes 


# Gauss's Law (intro)
- The **electric flux** through a closed surface is proportional to the amount of charge $Q_{in}$ enclosed within the surface. 
- Usefull for finding the electric fields of charge distributions that have a high degree of semetry

- Good semetry 
	- The symmetry of the field must match the symmetry of the charge distribution 
	- We care about planar symmetry, cylindrical symmetry and spherical symmetry.

- What is flux?
	- The amount of electric field passing through a surface is its flux.

- How is Gauss's law used?
	- Easier than superposition
	- To use gauss's law we calculate the electric flux through a gaussian surface surrounding the charge 

![[Pasted image 20260402152119.png#invert|300]]


Gauss's law can be used to establish several properties in electrostatic equilibrium 
- Any excess charge is all on the surface 
- The interior electric field is zero 
- The external filed is perpendicular to the surface 

![[Pasted image 20260402152240.png#invert]]




### 24.1 Symmetry 
- We say that a charge distribution is symmetric if there is a group of _geometric transformations_ that don’t cause any _physical_ change.
	- This means the object can be translated (displaced) rotated and or reflected without any physical changes in the surface. (CYLINDRICAL SYMMETREY)
- Again the symmetry of the electric field must match the symmetry of the charge distribution. 
	- The symmetry applies to the electric field as well as the distribution meaning the rotation reflection and displacement must have the same effect on both.

![[Pasted image 20260402153006.png#invert|center|400]]
> Circular charge distribution


### Three Fundamental Charge symmetries 24.1.2
![[Pasted image 20260402153206.png#invert|400]]

### Concept of flux 24.2

**Definition of a gaussian surface**
- suppose we surround a region of space with a _closed surface_, a surface that divides space into distinct inside and outside regions. Within the context of electrostatics, a closed surface through which an electric field passes is called a Gaussian surface.
- An imaginary surface mathematical not physical although they can coincide


- The electric field, in some sense, “flows” _out of_ a closed surface surrounding a region of space containing a net positive charge and _into_ a closed surface surrounding a net negative charge. The electric field may flow _through_ a closed surface surrounding a region of space in which there is no net charge, but the _net flow_ is zero.
- The electric field pattern through the surface is particularly simple if the closed surface matches the symmetry of the charge distribution inside.


- The flux is this amount of electric filed flow through a surface.


### Calculating electric flux 24.3

- The flux of a nonuniform filed through a curved surface is described by a surface integral
	- Where a surface integral is just the small peices of flux through the small peices of surface summed up 


#### Basic flux definition 24.3.1

- The component of flow perpendicular to the gaussian surface is the flow rate
$$
v_{\perp}A=vA\cos (\theta)
$$
> where $v_{\perp}$ is the perpendicular component to the surface $A$

![[Pasted image 20260402154527.png#invert]]

- Electric flux $(\Phi)$ 
$$
\Phi=E_{\perp}A=EA\cos(\theta)
$$
- this can also be the dot product $\vec{ E} \cdot\vec{A}$ where $\vec{A}$ is the area vector with area $A$ in the $\hat{n}$ direction where $\hat{n}$ is the normal vector to the gaussian surface. 



> [!definition] Electric Flux of a constant electric field 
> $$
> \begin{align}
> \Phi_{e}  & = \vec{E} \cdot  \vec{A}  \\
>  & =EA\cos(\theta)
> \end{align}
> $$


#### Electric flux through a nonuniform Electric Field

- the electric flux through a surface can be calculated as the sum of the fluxes through smaller pieces of the surface hence we use a surface integral


> [!Definition] Flux through a Surface with non-uniform Electric Field 
> $$
> \Phi_{e} = \int \vec{E} \, d \vec{A}  
> $$


**Solving tactics for evaluating surface integrals**
1. If the electric filed is everywhere tangent to a surface, the electric flux through the surface is $\Phi_{e}=0$
2. If the electric filed is everywhere perpendicular to a surface and has the same magnitude $E$ at every point, the electric flux through the surface is $\Phi_{e}=EA$.


#### The Electric flux through a closed surface 
- the integral is the same only the symbol changes and we write it as 
$$
\Phi_{e} = \oint \vec{E} \cdot d \vec{A}
$$
-  A closed surface has a distinct inside and outside. The area vector is defined to always point _toward the outside_. This removes an ambiguity that was present for a single surface, where could point to either side.


**Tactics finding the flux through a closed surface**
1. Chose a gaussian surface made up of pieces that are everywhere tangent to the electric field or everywhere perpendicular to the electric field 
2. the use the other [[#Electric flux through a nonuniform Electric Field|tactics section]] to evaluate the flux 


#### Electric flux is independent of surface shape and radius

- The electric flux depends on the amount of charge but _not_ on the radius of the sphere. Although this may seem a bit surprising, it’s really a direct consequence of what we _mean_ by flux. Think of the fluid analogy with which we introduced the term “flux.” If fluid flows outward from a central point, all the fluid crossing a small-radius spherical surface will, at some later time, cross a large-radius spherical surface. No fluid is lost along the way, and no new fluid is created



> [!definition] The flux through any closed surface surrounding a point charges $q_{1},q_{2},\dots q_{n}$
> $$
> \Phi_{e} = \oint \vec{E} \cdot d \vec{A} = \frac{Q_{in}}{\epsilon_{0}}
> $$
> > where $Q_{in} =q_{1}+q_{2}+\dots+q_{n}$

- **the net electric flux is zero through a closed surface that does not contain any net charge.**


#### Conductors 
- The electric field is zero at all points inside the conductor 
- Any excess charge resides entirely on the exterior surface.
- The external electric filed is perpendicular to the surface and of magnitude $\frac{n}{\epsilon_{0}}$ where $n$ is the surface charge density 
- The electric field is zero inside any hole within a conductor unless there is a charge in the hole 


### Problem solving strategy 

- Settup 
	- Determine the symmetry of its electric field 
	- Chose and draw a gaussian surface with the same symmetry 
	- You need not enclose all the charge within the gaussian surface
	- be sure every part of the gaussian surface is either tangent to or perpendicular to the electric field 
- Solve the mathematical representation based on gauss's law 
$$
\Phi_{e} = \oint \vec{ E} \cdot  d\vec{A} = \frac{Q_{in}}{\epsilon_{0}}
$$
- evaluate this integral 