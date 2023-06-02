This is the explanation for individual code segments and ideas for future reference and for grading of the PID assignment 



## RPM computation
The RPM computation is the system which takes the Rotations per minute and also manages the overall debug functions to efficiently allow consistent output.

### Initial development Problems
The first solutions and the problems with those solutions
* ASYNCIO was a solution that was put on the table but seemed to be a way to simulate the asynchronous ability that interrupts gave us. This however didn't seem to be plausible as the Library would be to difficult to use in the short time frame that we had and would force us to have everything in classes as to keep persistent variables, making the code much harder to write and much more complicated.
* Polling was the second option and the currently implemented solution. Polling is just checking the pin for a constant cycle and updating variables on the change in that pin. This differs with interrupts, as the program doesn't stop and run the interrupt loop as soon as the interrupt pin is triggered. This causes problems as if the value is switching faster than the program loop than it simply will skip that input.

### Code analysis and explanation

```python
def RPMcompute(self):
        
        if photoIn.value and photoIn.value != self.lastPollingVal:
            self.totalInterrupts += 1 
            self.lastPollingVal = True

            if self.totalInterrupts % 2 == 0:
                self.time1= time.monotonic()
                self.RPM = 1/((self.time1-self.time2))
            
            elif self.totalInterrupts % 2 == 1:
                self.time2 = time.monotonic()
	                self.RPM = 60/((self.time2-self.time1))
                return self.RPM
                
        if  not photoIn.value:
            self.lastPollingVal = False

```
>Code of the compute function in the RPMCalculator class.

## Approach
We approach the problem of calculating rpm by getting 2 time variables, one at the first interrupt of the Circle (2 Interrupts per full rotation)  and one at the second interrupt. Then we subtract the second by the first to get the difference, then on the next cycle we just subtract inversely doing the now "first" but actually second minus the now second. The way that we easily maintain a loop of number is the Modulo operator (<span style="color:orange"> %</span>) which just divides by a set number and the returns the remainder of that division.  This is very useful when it comes to controlling loops as it sets a forever infinitely increasing number to forever repeat at an interval of <span style = color:lightgreen > 0 until N-1 </span> that's also how we treat the RPM calculations as seen in the code we take an MOD 2 of the total interrupts and therefore can easily forever split the increasing number of interrupts into groups of 0 and 1 as every even interrupt will be 0 and every odd will be 1 giving us the opportunity to get the times and preform the calculations instead of resetting a counter every loop.

###  Problems 
* Originally Didn't debounce the rpm calculation, Time 1 or Time 2 this ment that on every loop i would get a new time because it doesn't matter to the program if I just got a new interrupt it will treat the constant loop of the old interrupt number as the current, meaning that it will get a new time for an interrupt that hasn't happened. This was fixed by just putting the rpm calculation inside the actual polling function.
* The speed of the execution of the original was an issue as printing and doing the calculation every time slowed down the RPM calculation so much that it sometimes skipped over some interrupts giving a very inconsistent number and sometimes throwing a can't divide by 0 error because interrupt time 1 and 2 would be the same and turn out to be 0 and when trying to divide 60 by that number it would throw an error.

<img src = "https://i.imgur.com/rEf0TpX.png" width =400>

> The graphic is an example of how rpm would be computed for the first for interrupts.

#### Calculation

``` python
RPM = 60/((self.time2-self.time1))
```
![](https://i.imgur.com/743DyXs.png)

The calculation is just taking the time between the interrupt second interrupt/A full rotation - the time of the last full rotation. You may ask why wouldn't you just get the time at full rotation this is because of the function used Monatomic time is a set point of time not a sort of stopwatch, therefore we can't just call it and assume the timer started on the first interrupt for example if want the time in between 8am and 10am we would take 10 and subtract 8.

## Reflection on RPM
RPM was definitely a new problem, the math was easy to understand and implement, but the new aspect was the fact that we had to worry about code efficiency and runtime as the execution time was an actual factor because of the speed that some of the wheels run at. It was definitely very annoying that the interrupt feature was disabled and that was the major difference between this project and the Arduino version in my opinion, making it much harder.

## Printing to the LCD

The printing wasn't really A problem, butt more of a QOL decision I made to improve the look and let the system use the resources more efficiently to accommodate for the polling.

  

``` python
class LCDPrinter:

    def __init__(self,innitPrint,LCDObject):
        self.LCDObject = LCDObject
        self.innitPrint = innitPrint
        self.lastPrint = self.innitPrint


    def print(self,UsrString):
        self.Usrinput = UsrString
        #later implement system to print on multiple collums 
        if self.Usrinput != self.lastPrint:
            # for x in range(32):
            #     self.LCDObject.print(" ")
            self.LCDObject.clear()
            self.LCDObject.print(str(self.Usrinput))
            self.lastPrint = self.Usrinput
```

  

This is the function for printing, all it really is a debounce for strings(words). This allows the metro/computer to not constantly have to send clear commands to the LCD as to not stack words forever.

  

## LCD Menu

The LCD menu is a system of messages on the LCD that change based on the rotary encoder and its button. These messages let the user control the activation of PID and the set point. The two menu options are "PID state" and "Change Set point" these change with the scroll wheel and then the action is done when the button is pressed.

  

![](https://i.imgur.com/TrHH6lq.png)


The blue is what happens on button press and Red is what happens on scroll

  
  
  

### Iterations

* The first iteration was a Tkinter window because i had not set up the LCD for debugging, yet the system was "FrankenCode"/Spaghetti code and a very legacy approach using Modulo to loop over a list of strings that were then printed to the LCD. The problem was the fact that it was hard to enter an individual item/tree.

* The second and final Iteration is one where we separate prints into different commands on a menu function, and then to change the LCD we just call different values on that menu function. This allows separation between the logic of the menu and the actual printing, making the code much easier to understand and write, as one system is independent of another.

  

### Code explanation

#### Scrolling
Scrolling is when you turn the rotary encoder, that encoder returns a value for how many turns you have in either direction. 1  increment on the encoder clockwise is +1 and 1  counterclockwise is -1 so the value of <span style = color:orange > (encoder.position) </span> is a range of -<span>&#8734;</span> to +<span>&#8734;</span> therefore to separate the encoder values we can either read and process the values by doing Modulo of that number, or we can clamp that value to make sure that when we pass our range we bring it in. We can clamp the value with something such as:
```python
if x > maxVal:
	x = maxVal
elif x < minVal:
	x = minVal
# this is what dylan currently uses to set his motor speed.
```
The current modulo approach is to do 
```python
abs(Position) % numberOfItems
```
Although the modulo Approach is a little harder to understand its much simpler code wise and definitely removes complexity with scope avoiding even more global variables and lines. 


#### Actions
The actions are the lines of code that run when a menu item is selected and a button is pressed. Currently, if look at the tree in  [[#LCD Menu]] you can see the rough description of the actions. Again because we have 2 selection options we are going to have 2 actions, although if we had a longer tree such as in most 3D printers we could have more options. 
```python
oldVal = False
def debouncedFunc(CurrVal,OldVal):
	if currVal and not OldVal:
		#ALL functions that should be Debounced 
		oldVal = True
	elif not OldVal
		oldVal = False
```
Above is a simple debounce function and the main way that we check to make sure that we only execute the code on press and don't infinitely loop over the execution. More in Depth explanation of  debounce in  [[Robot arm#Controlling the button state|Controlling the button state]].  

```python
def menu(item):
    if item == 1:
        printer.print(f"PID \nRPM: {RPMCalc.RPM}")
    elif item == 2:
        printer.print(f"PIDOFF \nRPM: {RPMCalc.RPM}")
    elif item == 3:
        printer.print(f"ChangeSetpoint \nRPM: {RPMCalc.RPM}")
    elif item == 4:
        printer.print(f"setpoint = {setpoint}")
```
This is the different print messages separating the printing and the handling is a common theme among this code . Overtime i have realized that in general  separating aspects of code makes debugging, documentation and Reading much, much easier even though the code is a lot longer the goal is not to write short lines that no one can understand but to be efficient and also at the same time write concise readable code.


```python
PIDon = False
while True:
    if abs(enc.position) % 2 == 0 and PIDon:
        menu(1)
        PIDon == True
        if btnControl(encBtn.value):
            PIDon = False
    elif abs(enc.position) % 2 == 0 and not PIDon:
        menu(2)
        PIDon = False
        if btnControl(encBtn.value):
            PIDon = True
    elif abs(enc.position) % 2 == 1 and btnControl(encBtn.value):
        enteredVal = abs(enc.position)
        while encBtn.value:
            menu(4)
            RPMCalc.printingDelayCounter += 1
            RPMCalc.debug(DelayInterval=500)
            RPMCalc.RPMcompute()
            setpoint = 100*(abs(enc.position) - enteredVal)
    else:
        menu(3)
    
    RPMCalc.printingDelayCounter += 1
    RPMCalc.debug(DelayInterval=500)
    RPMCalc.RPMcompute()
```
This is the main handler for the LCD object, and the fact that it's not a class or a function shows the crunch on this project :). Anyway the code is split into the different cases the first 2 ifs are for PID on/off all they do is change the name on button press and then the corresponding variable/flag. The actual tree part of the menu is formed by adding a new while true loop that waits for the user to press the button after selecting a new setpoint. Copying the loop is made convenient by the fact that the majority of the code is in the RPM class, making just copying over the functions painless and the exact reason they were created.


