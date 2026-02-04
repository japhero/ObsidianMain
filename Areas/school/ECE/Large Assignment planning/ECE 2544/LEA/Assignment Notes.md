#ECE_2544 #ECE_Learning_Experience




## Verilog syntax for transistors

`nmos instance_name(drain, source, gate); `
`pmos instance_name(drain, source, gate);`




# Reading Notes  

**Objectives** 
The purpose of this assignment is to model logic gates and logic circuits at the transistor level using complementary MOS (CMOS) processes. After completing this assignment, you will have gained familiarity with writing modules using CMOS transistors in the Verilog HDL, and with general principles that will transfer to writing other structural models using primitives. Knowledge of transistor usage in logic gates will be required for the remainder of this course.


- Make sure to include header block/description 



## Sections 

**Complete the follow transistor level designs only using CMOS logic**
- A NOT gate; use the module named `not_t`. 
- A 2-input NAND gate; use the module named `nand_t`. 
- A 2-input NOR gate; use the module named `nor_t`.
- A 2-input AND gate; use the module named `and_t.` 
- A 2-input OR gate; use the module named `or_t`.
- 2-input XNOR gate; use the module name `xnore_t`
- Implement a simplified expression given as 
	- $f(a,b,c)=a'c'+ac+bc'$
	- again use only CMOS logic to implement this 
	- Give it the name `sop_t`


- Verification 
	- Create the waveform with the test file and create a image verifying the results of the name `LE_A_waveform_YOURPID.PNG`


- Canvas submission 
	- TransistorModels_YOURPID.v 
	- LE_A_waveform_YOURPID.PNG (or .PDF or .JPEG)


