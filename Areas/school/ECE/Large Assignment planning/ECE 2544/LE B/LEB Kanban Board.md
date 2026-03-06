---

kanban-plugin: board

---

## Character Set Design [1]

- [ ] Write a short note as to why this sequence is unique or special so i can flesh it out later


## Circuit Modeling [2]



## Technology Mapping [3]

- [ ] Calculate initial transistor count
- [ ] **Preliminary Documentation**
	
	- [ ] Table out the changes in logic gates
	- [ ] Write down the reasons for certain technology mapping implementations
- [ ] fix HEX0_4 on the circuit diagram
- [ ] Change the NOR in the mapped section to nands


## Verilog Implementation [4]

- [ ] Finish the module headder


## Simulation [5]



## Board Testing [6]



## Documentation [7]

- [ ] Review Lab manual report Guidelines
- [ ] List the requirements and constrains
- [ ] Include the character set with codes and visual representation
- [ ] Design Implementation
	- [ ] Include Complete truth table
	- [ ] Include all 7 Kmaps
- [ ] **Technology Mapping**


## Done

- [ ] Review ssd0.v Example
- [ ] **Implement simplified logic design from technology mapping** 
	- [x] Module for segment 0
	- [x] Module for segment 1
	- [ ] Module for segment 2
	- [ ] Module for segment 3
	- [ ] Module for segment 4
	- [ ] Module for segment 5
	- [ ] Module for segment 6
	- [ ] Module for segment 7
- [ ] Verify outputs match expected character patterns/Truth table
- [ ] Run functional simulation where the inputs are a 4 bit input counting up to all VALID combinations
- [ ] Create final logic diagram after logic minimization
- [ ] Complete Technology mapping on the generated K-Map diagrams
- [ ] Create Logic Diagram from K-map SOP
- [ ] **Create the Karnaugh maps one for each segment**
	
	- [x] K-map for segment 0(out[0])
	- [x] K-map for segment 1(out[1])
	- [x] K-map for segment 2(out[2])
	- [x] K-map for segment 3(out[3])
	- [x] K-map for segment 4(out[4])
	- [x] K-map for segment 5(out[5])
	- [x] K-map for segment 6(out[6])
	
	- [x] Derive the SOP equations for each K-Map
- [ ] Document truth tables and K-maps. Make the kmaps in latex and create the final project report Document
- [ ] Create the SOP equations 
	- [x] EQ 1
	- [x] EQ 2
	- [x] EQ 3
	- [x] EQ 4
	- [x] EQ 5
	- [x] EQ 6
	- [x] EQ 7
- [ ] **Create truth table for the given inputs.** 
	* Make sure to mark don't cares within the truth table.
- [ ] **Verify drawing to make sure it**
	- [x] Includes the code `0000`
	- [x] bit 0 cannot be the MSB
		- This means that your code has to read from right to left where bit zero is the rightmost bit
	- [x] Must have 9-13 unique characters 
	- [x] Every Segment must have been lit up except for DP (the dot)
- [ ] Design 9-13 Unique Characters using the 7 segment display
- [ ] Assign unique 4-bit codes to each character




%% kanban:settings
```
{"kanban-plugin":"board","list-collapse":[false,false,false,false,false,false,false,false],"show-checkboxes":false}
```
%%