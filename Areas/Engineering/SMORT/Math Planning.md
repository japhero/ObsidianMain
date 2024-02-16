
# Dump

- we need to calculate in the loss of fuel mass as the rocket is launched to change the effect on the rocket's velocity and eventual position

- The initial rocket vector is defined as $\vec{V} = v$
- $\hat{i}$ is a [[unit vector]] in the x direction
- Measured relative with [[Frames of reference|respect ]] to earth
- the mass decreases by $dm$
- gass exit velocity $(v-u)\hat i$
- mass decreases by $dm_g$  and velocity decreases by $dv\hat i$ 

 
 

  # [wiki Dump](https://en.wikipedia.org/wiki/Projectile_motion)
-  $$ d = \frac{v^2 \cos(\theta)}{g} \left( v \sin{\theta} +  \sqrt{ v^2 \sin^2({\theta}) +2gy_{0} } \right) $$
### horizontal and vertical displacement 

**Vertical**
$$y =v_{0}t\cos(\theta) - \frac{1}{2}gt^2$$ 
  


---
# Documentation


## Integration
The values given out of the mpu 6050 are acceleration ($m/s^2$) values to convert these into position values we double integrate the acceleration values given. The method used to double integrate is called  the [Trapezoidal rule](https://en.wikipedia.org/wiki/Trapezoidal_rule#Example) where we treat our different points as “trapezoids” to calculate the values this method is illustrated below $\downarrow$.
<img src = "https://upload.wikimedia.org/wikipedia/commons/1/10/WikiTrap.gif" width =500>
On the code side of things, this is already done nicely through the `numpy` package with the `scipy.cumtrapz()` function. All we have to do is input our array of y's into the method and iterate. Note that `cumtrapz` stands for cumulative trapezoidal rule.

## Custom integration
$$\int^b_{a}f(x) \, dx  
\approx \sum_{k=1}^N 
\frac{f(x_{k-1}+f(x_{k}))}{2} 
\Delta x_{k}$$
written  in python by

```python
def integrate(x,y):
    r_array = np.zeros(len(x))
    for i in range(1, len(x)):
        r_array[i] =   y[i-1] +  (y[i-1] + y[i])/2 * (x[i] - x[i-1])
    return r_array
        
	
```




## Program ideas
for the final we can use matplotlib for projected path and then use a CSV file to get the actual path similar to a basic velocity trajectory $\downarrow$

<img src ="https://i.imgur.com/SAANZxH.png" width = 400>




- Don't make it too complicated, just use it for documentation and to learn the math for the actual calculation

## Data filtering 
The data given by the MPU 6050 is very inaccurate in the grand scheme of things $\downarrow$
<img src = "https://i.imgur.com/0IeeR9w.png" width =500>
As seen in this data, we can be off by hundreds of meters just because of faulty data in while stationary. To solve this problem, we are going to design and apply a low pass Butterworth filter. 

### Design 
To design the filter, we have to create our own filter by changing the order of the filter(how many times the derivative is taken) and the cutoff frequency $\omega$. Normally this is done by taking the transfer function 
$$G^2(\omega)=| H(j \omega)|^2=\frac{{G_{0}}^2}{1+\left( -\frac{s^2}{\omega_{c}^2} \right)^2}$$
were $H(s)$ is a complex function of $s= \sigma+j \omega$

Then we would perform a discrete time transform or a bilinear transform to make it relative to points in time instead of infinity close points as in a continuous system. Luckily we dont have to do this and this part of the equation is given by the [Scipy](https://scipy.org/) library.


#### Creating the filter 
when creating a filter we have to remember that our goal is to remove the "frequency" of error if we view that variable change as a frequency. To design our filter we need to know that frequency so that we can cut it off. To figure out what the "error frequency" is we use the [[Fourier Transform]] to graph the frequencies of our data so we can find out what it is. Again the math behind the Fourier transform $\left( \hat{f}(\xi) \int_{-∞}^{∞} f(x)^{i 2\pi \xi x}  \, dx \right)$ Isn't used and we just use the functions `Scipy.fft.fft()` for the "fast Fourier transform" and `Scipy.fft.freq()` to get the $x$ axis.
<img  src ="https://i.imgur.com/4AvfaR8.png" width = 70% >

> The image displays the Fourier transform of a $\sin$ wave combined with another sign wave giving the equation $\sin(2\pi x) +\frac{1}{5}\sin(50\pi x)$ giving us 2 frequencies one of 50 and one of 2, and we can see this in the Fourier transform. 



# Designing filters [Notes](https://en.wikipedia.org/wiki/Filter_design)







---

# Resources
- <a href="https://pressbooks.online.ucf.edu/osuniversityphysics/chapter/9-7-rocket-propulsion/#:~:text=mim).-,%CE%94%20v%20%3D%20u%20ln%20(%20m%20i%20m%20)%20.,m0%20down%20to%20m.">Press Books text</a>
- [Fourm](https://www.physicsforums.com/threads/how-to-calculate-the-trajectory-of-a-mortar-round.293783/)
- [Projectile motion wikipedia](https://en.wikipedia.org/wiki/Projectile_motion#Trajectory_of_a_projectile_with_air_resistance)
- https://docs.endaq.com/en/latest/webinars/Webinar_Intro_Python_Acceleration_CSV_Analysis.html
