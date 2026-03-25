#Zephyr #notes 


# Dump


### Mutexs (Mutual Exclusion locks)
- This is a synchronization primitive used to ensure that one thread at a time can access a resource. The mutex represents which thread has access to the resource . 
- 


### Semaphores
- This is a timing system for a core where it manages what task is currently active. 
	- Zephyr uses the `k_sem` structure with the following methods
		- `k_sem_init()`
		- `k_sem_take()`
		- `k_sem_give()`



## Methods/Functions 

### `constexpr`
- Evaluates the expression at compile time rather than in real time 

### `k_msleep(timeMS);`
- Sleeps the scheduler 



# Resources 
- [Scheduling docs](https://docs.zephyrproject.org/latest/kernel/services/scheduling/index.html)