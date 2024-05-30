

# Early planning and Goals
Starting this very ambitious project the code was meant to do 2 things log the data and approximate an firing angle for the launcher. As a team we decided that this goal was going to be auxiliary to producing and testing the launched projectile as time showed that even the basics required work forcing us to remove some of the scope of the project. In tern the team shifted goals to first completing the projectile rather than the launcher and an integrated firing mechanism. 

## Personal Goals of the project
After the scope of the project was shifted to the projectile one of the main goals for me Paul as the programmer was to try new things and push the code and me into learning. The approach i took to this was to incorporate an advanced system for approximating the position of the projectile and to heavily incorporate mathematical modeling into the project as I had some previous experience doing that writing a [mechanum wheel drivetrain simulator](https://github.com/japhero/FTC-mechanum-drivtrain-simulator) and wanted to keep doing that. 


# Code overview 



> [!TODO]- REDO THIS SHIT 
> Contents


![|right|200](https://i.imgur.com/Vns21p1.png)
The code was supposed to be in 2 parts 
1. [[#Data Logging]]
2. [[#Data Analysis]] 
These run in different parts because one is circuit python and one is regular Python. The program on the board is supposed to simply log data at a set rate usually $1\text{hz}$ while the Analysis parses the data and processes it. 

&emsp;

## Data Logging
The data logging program is exactly as it sounds it logs the value from the LSMDOX(IMU) and the barometer allows it to long height, all axis acceleration variables and time. Data logging also had specific requirements as to make sure that the data would be accurate and useful as to be used later. 
1. Always collect data at relatively even intervals. (this is why time is stored)
2. Contain data that is accurate at the required polling rate.
3. Store the data on an onboard file.

&emsp;


## Polling/writing 

![|right|300](https://i.imgur.com/BiAyjRm.png)

![|right|300](https://i.imgur.com/dFlrbQw.png)

Because the onboard storage is relatively large the original goal was to write to  an onboard CSV file after every 50 data points were collected. This although turned out to be impossible as the act of writing data to the CSV file would create "gaps" or holes as when a file was being written it wouldn't be able to poll the sensors. This is a big problem when collecting data as it means that i can only store variables in the heap (as a variable) which offers much less space than the on board storage (264kB vs 2mb). This forced me to reduce the polling rate as i calculated that i could only store about 10,000 points of data reducing the amount of storage by an order of magnitude. This limitation was adapted around as the final solution to the problem was to store all of the points in ram but to erase any old data after the 10,000 had been collected and to keep doing so until the program loop ended and then that current "slice" of data was written to file.


&emsp;

## Dead Reckoning 
As stated previously one of the wished goals of this project was to push myself and dead reckoning was the way to do it, dead reckoning is a technique for approximating the positing of an object using its previous positions. In this context this means taking the acceleration values out of the [IMU](https://en.wikipedia.org/wiki/Inertial_measurement_unit).

### Translating Acceleration to Position
Translating acceleration to position is pretty straight forward as all we have to do is sum all of the previous acceleration values to get the velocity and then sum them again to get the position. Mathematically we can just take the integral using a numeric method.

$$P(t)=\int \int a(t) \, dt \, dt$$
The best numerical method in this case is trapezoidal integration due to the fact that we can represent the space between 2 points as trapezoids and that this represents no loss in accuracy from the data to the integral as the method is just as accurate as the points. 


![|500|Center](https://i.imgur.com/RenYZuw.png)
The way that this is done in code is using the formula above which in reality is just the formula for a trapezoid $\frac{a_{0}+a_{1}}{2}h$ repeated. This is then implemented in code through the line 5 and 6.
```python 
def dbl_cumtrapz(x,y):
    r_array = np.zeros(len(x))
    for i in range(1, len(x)):
        r_array[i] =   y[i-1] +  (y[i-1] + y[i])/2 * (x[i] - x[i-1])
    r_array[0] = r_array[1] # normalize the first value 
    return r_array

```


&emsp;
### Data filtering 
Data filtering or more specifically [signal processing](https://en.wikipedia.org/wiki/Signal_processing) was where the most time was "wasted" as Cyrus would say as it deem to be the most difficult and trouble some although that was in part intended. The goal of this project was to use a **[discrete second order low pass Butterworth filter](https://en.wikipedia.org/wiki/Butterworth_filter).** to smooth out the acceleration data to reduce the compounding error.



#### What is a Low pass filter 
A low pass filter is a mathematical algorithm and often physical circuit that removes the high frequency part of a certain function and keeps the low frequency part hence the name [[#What is a Low pass filter|low pass]]. Each of these filter functions has a cutoff frequency which in a reductive sense removes this frequency from the data.


![](https://i.imgur.com/EsYiagG.png)
To find out what cutoff frequency to use take the Fourier transform of the data which basically approximates a mathematical equation for the data using a sum of sinusoidal waves. Each of these sinusoidal waves has a certain frequency and by separating them out you can intern find out what frequency the error is as it will be represented as one or many different $\sin$ waves of a similar frequency.


![](https://i.imgur.com/VFMB4Af.png)
> Note that both of these graphs are just examples and not sample data from an IMU.


#### Why Signal Processing Failed 
Signal processing is a complicated and very advanced mathematical realm for someone who was taking calculus 1 at the time. I did learn alot about it and my knowledge was fair and good enough to set up the code to do what i wanted it to do but not really good enough to debug and go much farther beyond what was written in the API documentation. This bogged me down spending hours trying to debug stuff where it was really hard to parse solutions and also was extremely frustrating as often i just had no idea how to approach a problem. 

&emsp;
## Embedded register configuration 
Embedded [register](https://en.wikipedia.org/wiki/Processor_register) configuration is when you change the [CPU registers](https://en.wikipedia.org/wiki/Processor_register) on embedded devices through a certain serial interface usually through $I^2C$ . In my case the LSM6DOX had a cup register which would have allowed me to use built in [[#What is a Low pass filter|low pass filtering]] on the actual hardware removing my need for any external signal processing and only requiring me to integrate the result which in theory I could just do on the pico anyways.
![](https://i.imgur.com/EaLGAi5.png)
> Accelerometer block diagram (if anyone understands what this means contact [me](https://pweder3.dev/) 🙏)


&emsp;

# Wiring 


## Diagram

&emsp;

### IMU choice 
This project started with an [MPU 6050](https://www.adafruit.com/product/3886) but this [IMU](https://en.wikipedia.org/wiki/Inertial_measurement_unit) revealed itself to be too inaccurate to be used for [[#Dead Reckoning]] as the data even when still was so inaccurate that it would be hundreds of meters off. Therefore I switched over to the [LSM6DSOX](https://www.adafruit.com/product/4438) as it was supposed to be more accurate and less error prone. This switch turned out to be a good choice as the [LSM6DSOX](https://www.adafruit.com/product/4438)  was much more accurate.

![[SMORT COMPARISON|900]]
> Take this data with a grain of salt as the [LSM6DSOX](https://www.adafruit.com/product/4438)  data might be inaccurate due to method of integration.

**Bonus meme** Mr Miller often says that the astronauts who landed on the moon had less computing power than us and still managed land on the moon i mean yea but thats like saying Einstein didn't have a calculator i am no Einstein trust me.