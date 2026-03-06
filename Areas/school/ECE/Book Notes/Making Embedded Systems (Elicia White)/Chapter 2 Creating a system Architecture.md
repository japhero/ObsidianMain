#ECE #book_Notes 


# Dump 


## intro
- Start with the project functions then create a system architecture 

- 4 types of diagrams are recommended
	- Contex diagram 
	- block diagram
	- Organigram
	- Layering diagram
	- 
- 

## Diagrams


**Context diagrams**
- Focuses on the relationship between the device and others 
- How will the device be used the consumer

> [!NOTE]- Sample context diagram
> ![[Pasted image 20260305190627.png|center|400]]
> 


**Block diagram**
- Each item in the circuit is a block and the comunication between those is also an object
- Should be provided by the EE (circuit diagram)
- goal should be to break a complex system into small parts

> [!NOTE]- Sample block diagram
> ![[Pasted image 20260305191119.png#invert]]

**Organigram**
- like an Org chart
- Upper level blocks control the lower level blocks
- 

> [!NOTE]- Example Organigram
> ![[Pasted image 20260305191859.png]]

**layering Diagram**
- Looks for layers and represents objects by their estimated size 
- If there are multiple uses of a lower level object they should all touch the lower level object

> [!NOTE]- Layering Diagram Example
>  ![[Pasted image 20260305192256.png]]




## Design for change

**Encapsulation**
- As in the diagrams above we have been able to group functionality together different groups of functionality can be grouped together to create object
	- In the organigram, look for objects that are used by only one other object. Are these both fixed? If they are unlikely to change or are likely to change together as you evolve the system, consider combining them. If they change independently, it is not a good area to consider for encapsulation.
	- In the layering diagram, look for collections of objects that are always used together. Can these be grouped together in a higher-level interface to manage the objects? You’d be creating a hardware abstraction layer.
	- Which modules have lots of interdependencies? Can they be broken apart and simplified? Or can the dependencies be grouped together?
	- Can the interfaces between vertical neighbors be described in a few sentences? That makes it a good place for encapsulation to help you create an interface (for others to reuse your code or just for ease of testing).


### Driver Interface
- many are based on UNIX API used to call devices. 
- The interface is:
	- Open 
		- opens the driver (sometimes innit)
	- close
		- Cleans up the driver for use 
	- read
		- reads data from the device 
	- write 
		- Sends data to device 
	- ioctl
		- input/output (IO) control
		- Is discouraged because of its lack of structure but is still popular


**Sample SPI UNIX interface**
``` c++
spi.open()
    
spi_open()
    
SpiOpen(WITH_LOCK)
    
spi.ioctl_changeFrequency(THIRTY_MHz)
    
SpiIoctl(kChangeFrequency, THIRTY_MHz)
```

- there are two modern unix driver methods
	- `select/poll` waits for the device to change state. 
	- `mmap` changes the memory map the driver shares with the code that calls it 
	- WTF do both of these mean?



### Adapter Pattern
- is sometimes called wrapper 
- Converts the interface of an objet into one that is easier for a client. Written over software API's to hide ugly interfaces. 
- Each driver is an adapter 
- If you implement the same UNIX wrapper on several drivers for example different drivers for different memory modules this lets your do dependance injection with components 


**Sample Interface diagram**
![[Pasted image 20260305201400.png#invert|center|300]]


- In the context of a UNIX wrapper implemented onto SPI what would an open command actually look like?
	- It depends on the call, if open is called on a higher level object like a camera driver it in turn calls the open for an SPI driver. 

### Creating interfaces
- innit functions
	- "Initialization may happen as objects are instantiated during startup, or it may be a function called as the system initializes. To keep modules encapsulated (and more easily reused), high-level functions should be responsible for initializing the modules they depend upon. A good `init` function should be able to be called multiple times if it is used by different subsystems. A very good `init` function can reset the subsystem (or hardware resource) to a known good state in case of partial system failure."
	- 