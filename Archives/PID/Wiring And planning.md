This is the wiring and planning of the [[PID Code Documentation|PID]] project

# Electrical wiring
#Engineering

The wiring Consists of 3 main circuits  

# Planning/Research 

## PID Planning 
Originally the class had not found a circuit python PID library, so i thought i might do the class a favor by creating one along with a graphing utility. Eventually we found a library and i realized i didn't have the time to create my own, although the graphing utility 

### Paul's PID
The source to my own PID is [here](https://github.com/japhero/PID-project/blob/master/LibCode/PIDNoClass.py) for anyone interested, it uses my own graphing library based in the MatPlotLib PyPI library. It uses a Tkinter window to control the setpoint and the graphs of the PID input and output in a new window. Note, the graphing library (plotLive) might have its own repository at some point.

#### PID math 
To write my own PID, I had to learn the math that calculates the function of PID. As i had never taken any advance calculus classes so the words Integral and Derivative were new concepts, to understand these I created a list of resources that helped me understand the math and PID in general.

#### PID links #resource 
* [Bret proportional on measurement ](http://brettbeauregard.com/blog/2017/06/introducing-proportional-on-measurement/)
* [integral calculation with trapezoids](https://en.wikipedia.org/wiki/Trapezoidal_rule)
* [Integrals kahn academy](https://youtu.be/__Uw1SXPW7s)
* [wiki on PID](https://en.wikipedia.org/wiki/PID_controller#Fundamental_operation)

### Takeaways 
Overall writing my own PID was a very good way to learn the system and definitely helped me understand the system and how it works and also refreshed me on more complex code when writing the graphing utility.

## LCD planning 
Planning for the LCD was done by creating 2 code prototypes. The first was done in class and was the encoder assignment. The second was a sort of simulation program run in a TK window that basically simulated a LCD locally as to help with debugging. We preferred making code prototypes over pudo code because often you only find bugs or issues in your concepts after a pratical application.

### Takeaways from LCD 
Overall again trying to make several ideas and applying them practically was definitely a way to figure out what was a good idea and bad one. Another lesson was to test your programs.

## RPM planning 
To plan for the RPM i created another test program that runs through python. This program was just a concept tester that ran over the math with a set interval so that we could predict results. 
```python
import time
time1=0
time2=0
RPM =0

for totalInterrupts in range(8): # simulates the total interrupts going up
    time.sleep(1)
	# debug statements
    print(f"\
    RPM: {RPM}\
    T1: {time1}\
    T2: {time2}\
    mod {totalInterrupts %2}\
    X {totalInterrupts}\
    ")

	#RPM compute function
    if totalInterrupts % 2 == 0:
        time1= time.monotonic()
        RPM = 60/((time1-time2))

    elif totalInterrupts % 2 == 1:
        time2 = time.monotonic()
        RPM = 60/((time2-time1))

## outputs 59.9 for all loops
``` 
> [Source](https://github.com/japhero/PID-project/blob/master/code/testCode.py)


### Takeaway RPM 
Always add more time for unconventional bugs as that was the number 1 issue by far not the math or the timings but things like runtime efficiency causing us to skip interrupts or power consumption.


# Wiring
The wiring was 3 main circuits, although practically it was just 3 circuits and the rest required more of just "plug and play" style not really a circuit

<img src = "https://i.imgur.com/wU3Dmu0.png"  width =600> #Wiring

> note that we didn't separately wire the 9volt and 6volt but because the modified backpack doesn't exist we had to use those parts 

### LCD wiring 
Our solution to the "LCD" problem or the fact that the LCD draws a lot of current to start, blocking the microcontroller from booting if it is turned on was to initialize the LCD power in the script by creating a transistor to allow the flow of power and then by virtue of the script turning the LCD on it has to innit for the LCD to even turn on.


## MOSFET Transistor
The MOSFET was one of the more challenging things to use because it was a different transistor type and no one had really documented it, so we researched the individual part to figure out the specs and find a matching wiring diagram which as it turns out isn't too different from the current transistor layout it just allows way more current and voltage giving us more SPEEEEED.

<img src="https://i.stack.imgur.com/AjURy.png" width =600> #Wiring 

> Thanks to [This](https://electronics.stackexchange.com/questions/179084/driving-dc-motor-using-a-single-mosfet-why-does-the-motor-spin-without-applying) beautiful stack exchange user for finding this.


