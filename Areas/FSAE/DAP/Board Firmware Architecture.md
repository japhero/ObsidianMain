
## Sensor behavior notes
MLX906...BAA
	
- after the sensor board is turned on it takes 4 minutes for it to reach maximum accuracy 
- Increasing the polling rate for the sensor increases the noise passed down to the data
	- Pixels at the corners of the sensor will have worse noise performance than pixels at the center


### reading data
- The sensor alternates between subpage 1 and subpage 2 







# Dump

&emsp;

## Functional Requirements 
- Take in Data from the camera sensor 
- Parse the data by doing computations on the data
	- Convolution algorithm 
- Push the conglomerated data to the canbus 
- Log errors/interface with some form of debugger 


## Lose structure

### ~~USART/SPI~~
- could create a UNIX wrapper over both interfaces to standardize the interface
- What does the SPI/USART interface actually do currently besides flashing the chip. 
	- I dont think i need to interact with this interface unless its through the debugger. 

### Data Processing 
- Wrapper for the data processing and mainly just abstracts away transferring data
- could be redundant because it has a lot of overlap with the CAN output 
	- This is already implemented as an interface so abstracting the process would still make sense 
### MLX Driver (Thermal Camera)
- The output should be the entire set of data and should be passed to the processing object
- Manage internally which buffer of data is being passed to the camera sensor 
- Contains an m $I^2C$ driver to Communicate with the sensor 



### initialize 
- Set the polling rate for the sensor
- Set the timestamp for warmup 
- Set sensor into measurement mode 
- Get EPROM constants to calculate temperature 

### Reading data 

- Have the mutex control a pointer that points in-between two internal buffers where one buffer contains the updated data and the other buffer is passed to the thermal pipeline to process data







*** 
### Threading 
- Need to use a mutex to handle writing to and reading from the data given by the temperature sensor

**Threads**
- Reading data from the $I^2C$ into memory 
- Processing data from memory into concise useful data 
	- center tire temp 
	- avg tire temp
	- etc
- 