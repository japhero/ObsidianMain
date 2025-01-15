
###  **Neutral** 
Linear slides down with claw closed facing away from the central part of the robot 
- Neutral is the sample cary state 
- Specimen will also be held in a natural state 


### **Upper bucket deposit** 

- linear slides are up to nearly max height 

### **high chamber deposit**

### **Ground intake** 
- Would be intake for submersible 
- wrist needs to be up when entering sub 

---
## Notes 


- 2 motors drive the linear slides 
- every state is a different button 
- when switching states we allways return to neutrual before going to the next for example claw claw extended
- extension control will be global  
- Lofty goal of making linear slides and claw relatively filed oriented (keep both incase confusion)



---
## Control mapping 


**Triggers**
- left and right trigger always do claw regardless of state (except when in conflict with other states)

**Bumpers**
- left and right bumper move the claw "wrist"

**Buttons**
- Buttons will be used to move between the major states
1. [[#**Neutral**]]
2. [[#**Upper bucket deposit**]]
3. [[#**high chamber deposit**]]
4. [[#**Ground intake**]]


**joysticks**
- d pad up/down will be used to fine tune "wrist" position
- Left joystick (x) will do claw rotation
 - Right joystick (y) is used for linear slide adjustments 



