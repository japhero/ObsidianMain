- **Method for coverting a continuous system into a desecrate system** 
- its also called tustins method.
	- and trapezoidal integration 
- **Equations** 
	- $s=\frac{2}{t}\left( \frac{{z-1}}{z+1} \right)$
		- bilinear transform
	- $z=\frac{{1+\frac{t}{2}}}{1-\frac{t}{2}s}s$
		- Inverse bilinear transform
		- linear first order approximation  of $e^{st}$
	- T = sample time.
	- $s$ and $z$ are inverses.
- Need defintion of $s$ plane.
- we can map continuous functions from the s domain to the z domain. 
- **Plugging in transform function of s into the equation maps to the z.**
- $z=e^{st}$
- Using Series we can approximate z
- $z\approx 1+st$
- write as a polynomial fraction
- $z=\frac{{a+bs}}{c+ds}$
- still is a linear first order approximation.
- [[taylor series]]
- 

## Desecrate vs Continuous time systems. 
**A continuous-time signal has values for all points in time in some (possibly infinite) interval.** **A discrete time signal has values for only discrete points in time**


## Z-transform 
$$X(z)=\mathcal{Z}{x[n]}=\sum_{n=0}^∞ x[n]z^{-n}$$

---

# Resources 

<iframe width="560" height="315" src="https://www.youtube.com/embed/88tWmyBaKIQ?si=COcsuUwZCIE1NEcW" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>