
# Electrical wiring

The wiring Consists of 3 main circuits  

# Planning/Research 

## PID Planning
Originally the class had not found a circuit python PID library, so i thought i might do the class a favor by creating one along with a graphing utility. Eventually we found a library and i realized i didn't have the time to create my own, although the graphing utility 

### Paul's PID
The source to my own PID is [here](https://github.com/japhero/PID-project/blob/master/LibCode/PIDNoClass.py) for anyone interested, it uses my own graphing library based in the MatPlotLib PyPI library. It uses a Tkinter window to control the setpoint and the graphs of the PID input and output in a new window. Note, the graphing library (plotLive) might have its own repository at some point.

#### PID math 
To write my own PID, I had to learn the math that calculates the function of PID. As i had never taken any advance calculus classes so the words Integral and Derivative were new concepts, to understand these I created a list of resources that helped me understand the math and PID in general.

* [Bret proportional on measurement ](http://brettbeauregard.com/blog/2017/06/introducing-proportional-on-measurement/)
* [integral calculation with trapezoids](https://en.wikipedia.org/wiki/Trapezoidal_rule)
* [Integrals kahn academy](https://youtu.be/__Uw1SXPW7s)
* [wiki on PID](https://en.wikipedia.org/wiki/PID_controller#Fundamental_operation)
### Takeaways 
Overall writing my own PID was a very good way to learn the system and definitely helped me understand the system and how it works and also refreshed me on more complex code when writing the graphing utility.
