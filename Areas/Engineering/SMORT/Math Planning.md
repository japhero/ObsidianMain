# Dump

- we need to calculate in the loss of fuel mass as the rocket is launched to change the effect on the rocket's velocity and eventual position

- Innital rocket vector is defined as $\vec{V} = v$
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
# Integration
The values given out of the mpu 6050 are acceleration ($m/s^2$) values to convert these into position values we double integrate the acceleration values given. The method used to double integrate is called  the [Trapezoidal rule](https://en.wikipedia.org/wiki/Trapezoidal_rule#Example) were we treat our diffrent points as "trapezoids" to calculate the values this method is illustrated bellow $\downarrow$.
<img src = "https://upload.wikimedia.org/wikipedia/commons/1/10/WikiTrap.gif" width =500>
On the code side of things this is already done nicely through the `numpy` package with the `np.trapz()` function. All we have to do is input our array of y's into the method and iterate.

```python
order = 300
x = np.linspace(start= 0, stop= 20,num= order)
y = x**2 #(integration for f(x) = x^2)

integrated = np.array([np.trapz(y[:i],x=x[:i] ) for i in range(order) ])  


```



# Program ideas
for the final we can use matplot lib for projected path and then use a CSV file to get the actuall path similar to a basic velecity trajectory $\downarrow$
![[Figure_1.png|400]]


- Dont make it to complicated just use it for documentation and to learn the math for the actual calculation

---

# Resources
- <a href="https://pressbooks.online.ucf.edu/osuniversityphysics/chapter/9-7-rocket-propulsion/#:~:text=mim).-,%CE%94%20v%20%3D%20u%20ln%20(%20m%20i%20m%20)%20.,m0%20down%20to%20m.">Press Books text</a>
- [Fourm](https://www.physicsforums.com/threads/how-to-calculate-the-trajectory-of-a-mortar-round.293783/)
- [Projectile motion wikipedia](https://en.wikipedia.org/wiki/Projectile_motion#Trajectory_of_a_projectile_with_air_resistance)
