#FSAE 





### Scheduling 
- is there a parent scheduling object inside main that handles the priority of threads 
	- Check docs 

### Hardware 
- What does heartbeat do 
	- lets the can system know that the system is still active 
- Why is the diagnostics thread established in the hardware class?
	- This was later changed but at the time worked to only do diagnostics for the hardware innits 
- Within the diagnostics thread wont a while(1) loop cause the process to hang or does the scheduler automatically abort the process at that time?
	- Nope becasue `k_msleep(DIAG_PERIOD_MS);` is passed which sleeps the scheduler so other threads can run 

