*Paul weder*

# Applied Modeling of the ocean currents.
![[Pasted image 20240325142958.png|right|300]]Modeling the oceans is very important and is required for the overall understanding of our planet. Modeling in the context of the ocean means finding the velocity of the currents of the ocean. Practically we can think of this as where do the oceans go, in what direction do they move.  

&emsp;




## Math ![|right|300](https://i.imgur.com/hTArdJK.png)
One might ask how does math play a role in modeling the ocean, and that would be a fair question as there are many ways to represent the way that the vast expanse of the ocean fluctuates one specific way to do this would be to represent every point with a velocity vector or a vector field. 

&emsp;

&emsp;

&emsp;

&emsp;
### Applied approach[^5] 
One of the core issues with modeling the ocean is that we cant for one moment of time give the absolute reading of every point on earth that's why the main challenge of modeling the ocean isn't creating a theoretical model but accurately approximating all points in data from the little amount of data originally collected. The data is collected in the form of buoy velocities[^Nat_buoy_data] , which is stored in terms of longitude and latitude in the form 
$$
(x_{m}^{(1)},y_{m}^{(2)})^T ∈ \mathbb{R}^2
$$
> $x,y$ represent the latitude and longitude of a buoy
> $T/\text{Transpose}$ turns the vector into a column vector.
> $\in$ means that its an element of the 2d vector field $\mathbb{R}^2$.

Then data is then represented under a Helmholtz decomposition[^Helmholtz_Wiki],the decomposition allows the data to be put into an equation that represents fluid flow better than a vector field as its in terms of divergent velocity and rotation.
$$\underbrace{F}_{ocean \space flow} = \underbrace{grad\, Φ}_{divergent \space velocity} + \underbrace{rot \, Ψ }_{rotational \space velocity}$$
> note that divergence and curl can be written as a function of $F$.  (not shown)
> $δ = div(F)$
> $ζ=curl(F)$ 

This stream function is representative of the overall Helmholtz decomposition and is how the data is represented and then used to make predictions extrapolating the current trends extracted from the given data.


&emsp;

![|right](https://i.imgur.com/2rJnFpt.png)
## Why does modeling the ocean matter?




The ocean is made up of millions of animals and is the largest ecosystem on 
the planet[^Un_article] modeling the ocean is one of best ways to expand our understanding of the ocean. Even with modern technology the larger picture concerning the ocean currents is still very small as we still have only $3\%$ of the worlds oceans mapped out accurately[^1] .


&emsp;


## Ecological effects of ocean currents 

Although the models of the ocean currents have not been typically used for the study of marine life[^Ocean_Currents_and_marine_life ] modern models have allowed scientists to build an "understanding of how currents impact the connectivity of marine populations"[^Ocean_Currents_and_marine_life ] . An example of this would be sea turtles or wales as even though they are strong swimmer the currents can still effect them heavily.

&emsp;

![](https://i.imgur.com/hX9k1g4.png)>

> Shows the movement of plankton and other marine life through the Atlantic[^Ocean_Currents_and_marine_life ] (figure b)

The movement of marine life is a complex endeavored and as seen in the image animals an animal or plant drifting east off Florida might simply circulate within the Sargasso Sea (indicated in red) or alternatively might be carried across to northern Europe in the Gulf Stream and North Atlantic Current.


&emsp;

## Energy transfer facilitated by currents. 
Currents don't only transfer animals but determine how the planet distributes heat energy, which intern regulates and stabilizes climate patterns [^Nat_geoGraphic]. This heat transfer is also relative to the modeling of the currents as the change in heat is also a change in density and therefor a change in divergence. Another form of energy transfer is animals in the sense that microorganisms such as plankton are directly transferred as a result of the ocean currents, these animals are the food source for other animals such as wales. The ocean current transfers energy in the form of calories and in the form of heat.


![700](https://i.imgur.com/G30t28h.png)
> [^state_of_the_climate]



![right|300](https://i.imgur.com/9dpzSos.png)
### Heat transfer and Climate change.[^climate_change_gov_article]
Climate change as a dilemma has obvious grave consequences for humans and the ocean is a part of that as many people know one of the main implications in the rising global temperatures is the increase in the sea level and the disastrous consequences that would have. Global mean sea level has risen about 8–9 inches (21–24 centimeters) since 1880[^climate_change_gov_article] . The ocean is gaining so much water because the increased temperatures are melting the poles and other water sources are entering the sea causing it to rise. 

&emsp;

&emsp;






[^1]: [Su, F., Fan, R., Yan, F. _et al._ Widespread global disparities between modelled and observed mid-depth ocean currents. _Nat Commun_ **14**, 2089 (2023).](https://rdcu.be/dBUSO)
[^2]:[ECCO Website](https://www.ecco-group.org/)
[^3]: [ECCO publications](https://www.ecco-group.org/storymaps.htm?id=95)
[^4]:https://rdcu.be/dBUSO 
[^5]: [Berlinghieri, Renato, et al. "Gaussian processes at the Helm (holtz): A more fluid model for ocean currents." _arXiv preprint arXiv:2302.10364_ (2023).](https://arxiv.org/pdf/2302.10364.pdf)
[^Helmholtz_Wiki]: [Helmholtz Wikipedia ](https://en.wikipedia.org/wiki/Helmholtz_decomposition)

[^Nat_geoGraphic]: [Ocean Currents and Climate National Geographic](https://education.nationalgeographic.org/resource/ocean-currents-and-climate/)

[^Ocean_Currents_and_marine_life ]: [Hays, Graeme C. “Ocean currents and marine life.” _Current biology : CB_ vol. 27,11 (2017): R470-R473. ](doi:10.1016/j.cub.2017.01.044)

[^Nat_buoy_data]:[National Buoy Data center](https://www.ndbc.noaa.gov/) 

[^Un_article]: [5 things you should know about the UN Ocean Conference, a chance to save the planet’s largest ecosystem
](https://www.un.org/en/desa/5-things-you-should-know-about-un-ocean-conference-chance-save-planet%E2%80%99s-largest-ecosystem#:~:text=The%20Ocean%20is%20the%20planet's%20largest%20ecosystem%2C,billions.%20But%20its%20health%20is%20in%20danger.)

[^state_of_the_climate]: [Johnson, G.C., Lyman, J.M. , Boyer, T., Cheng, L., Domingues, C.M., Gilson, J., Ishii, M., Killick, R., Monselesan, D., Purkey, S.G., Wijffels, S.E. (2018). Ocean heat content [in _State of the Climate in 2017_]. Bulletin of the American Meteorological Society, 99(8), S72–S77.](https://www.climate.gov/news-features/featured-images/2017-state-climate-ocean-heat-content)


[^climate_change_gov_article]:[Climate Change: Global Sea Level](https://www.climate.gov/news-features/understanding-climate/climate-change-global-sea-level)