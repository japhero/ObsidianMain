

# low pass filter
the filter has a cirtain cuttoff value 

[butterworth filter implemented](https://github.com/curiores/ArduinoTutorials/blob/main/BasicFilters/Design/LowPass/ButterworthFilter.ipynb)

apply coefficients based on [[Bilinear transform]] in a [[linear time-invariant system]]. 

- uses a Discrete time system 

apply [this](https://docs.scipy.org/doc/scipy/reference/generated/scipy.signal.butter.html) Spicy function and use the coefficients from that with  [this](https://docs.scipy.org/doc/scipy/reference/generated/scipy.signal.sosfilt.html#scipy.signal.sosfilt) function to plot the data

## Info Mpu
- what is the frequency that i want to cutoff to allow me to get the right changes.
- at what frequency does the mpu collect data. 


# Relevant notes
[[Filtering accelerometer Data]]
[[Ordinary Differential Equations]]
[[Laplace Transform]]
[[linear time-invariant system]]
[[Bilinear transform]]
[[Transfer Functions]]
[[Applied signal processing]]


---

[stack overflow](https://dsp.stackexchange.com/questions/3026/picking-the-correct-filter-for-accelerometer-data)
[low pass filter](https://www.analog.com/en/design-center/glossary/low-pass-filter.html#:~:text=A%20low%2Dpass%20filter%20(LPF,attenuates%20all%20signals%20below%20it.)
[medium](https://medium.com/@ab.jannatpour/kalman-filter-with-python-code-98641017a2bd)


<iframe width="560" height="315" src="https://www.youtube.com/embed/mwn8xhgNpFY?si=VzPphci_FYKh6sFG" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
<iframe width="560" height="315" src="https://www.youtube.com/embed/HJ-C4Incgpw?si=zQ0TxsTOCQRIQ5g0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
<iframe width="560" height="315" src="https://www.youtube.com/embed/lagfhNjMuQM?si=kM1CqiO4I79PbPA2" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>