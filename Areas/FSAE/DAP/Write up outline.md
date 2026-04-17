





# The Problem Set
In a broad sense the goal of this dap was to develop the firmware for the temperature sensor board developed last semester by Aryan. This board has a MLX90640 a 34x24 IR array and $I^2C$ driver to communicate with the MCU an STM32H753VIT6. The job of the MCU and therefore the firmware is to communicate with the IR sensor process the data given by the IR sensor into a small valuable packet of information and send it through the can network to the VCU so that it can be stored to make suspension adjustments later. The original plan was to get strips of tire data eg average of the top of the tire average of the center of the tire and the overall average and send these packets to the VCU. This scope was cut to only sending the average of the sensor to allow the project to finish on time. 



# Firmware Architecture


## Why not "bear metal"? 
For a powerful MCU package as the one on the board it would have been much easier and arguably simpler to simply use the SDK that ST provides and "bear metal" the processing and data input operations as they aren't likely to take up enough memory or CPU time to require the concurrency that an RTOS provides.  Zephyr was chosen for 3 reasons 
1.  Future development would require me to learn it as it is the framework used for most if not all boards in FSAE
2.  Zephyr allows the code written in this DAP to be reusable in other zephyr projects



## Architecture Philosophy 
When designing the architecture of this program and implementing the code the goals were to create modular reusable pieces of code. More specifically since the "image processing" done on the data takes much more testing and likely a variation of different convolution algorithms. Implementing the code so that <u>other</u> people can easily implement a processing algorithm while all $I^2C$ communication and temperature data processing is handled by the existing code 





