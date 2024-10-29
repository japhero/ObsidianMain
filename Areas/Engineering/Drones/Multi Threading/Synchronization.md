[GFG article](https://www.geeksforgeeks.org/multithreading-in-python-set-2-synchronization/)
Is Synchronization when we have to manage multiple threads at the same time 


- **Critical section** refers to the parts of the program where the shared resource is accessed.
- A **race condition** occurs when two or more threads can access shared data and they try to change it at the same time. As a result, the values of variables may be unpredictable and vary depending on the timings of context switches of the processes.
	- <img src = "https://i.imgur.com/Ovv4CHA.png" width =300> 
	- Describes how Diffrent threads can cause a race condition.
