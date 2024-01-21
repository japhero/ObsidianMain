
# Dump
- one period is one repetition in a cycle 
- one period is represented by the symbol $T$ 
- the inverse of $T$ is frequency $f$ so

- frequency depends on repeated behavior.
- $\sin$ is a frequency.
- sin = frequency 
- human can her low as 20 hz and high as 20,000 hz or 20 kHz (kilo hertz)
- diffrent $\sin$'s add together to make more complex waves.
- all frequency's are a sum of sins 

## Fourier series 
 
 <img src = https://i.imgur.com/HGYCpAU.png width = 400>
- allows us to calculate theoretically calculate any frequency.  
- "gives a way to examin the motions of the physical world".
- the longer the segment taken by the Fourier series the lower the time resolution

## window function
- applied to frequency to "smoth" it out. 
- is called a window function but is actually just applying a sinusoid. 
- hop length is the length "hoped" before applying another window function

## Aliasing
- happnes when we sample a frequency to low causes the sample have an unclear value as when reconstructing the sample it gives too little data to let us acuralty reconstruct what it is.
<img src = "https://i.imgur.com/8ZiRvHI.png" width = 400>
- sample must be 2 times the max frequency to unambigiously give us the correct sin wave.
- $$f_{s} > 2 * f_{max}$$
- Nyquist criterion $\uparrow$
- for any sampled sinosiod there will be an infinite number of higher fequency sinosiods that fit the sample.
- its called aliasing becuase the thing that is shown instead of the real thing is an alias of the real thing. Thats why aliasing is when the wrong thing is rebulit from the sample.
- 
<img src = "https://i.imgur.com/yPT4gZ1.png" width = 50%>

## Quantization 
coverting the sampled values into bits of data.
- fewer the bigs the greater the noise. 

# decible
the amount of power loss over time/resistance
- $power\space ratio = \log_{10}\left( \frac{P_{1}}{P_{0}} \right)$
- $power, \space P=\propto p,$
- $decibles=20\log_{10}\left( \frac{p_{1}}{p_{0}} \right)$

## frequency 
 - is measured in $Hz$ 
 - is inverse of $T$ 
 - by proxy cycles per second
 -  $f=\frac{1}{T}$

## Hertz
- represented by the abreviation hz
- is  cycles per second 



--- 
# Resources
[Applied DSP video series ](https://youtube.com/playlist?list=PL_QS1A2ZqaG7p50cd0AgLeG9Q3TN64vZJ&si=i68ty8GA_uiu-2Lj)