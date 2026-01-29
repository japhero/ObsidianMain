#book_Notes #ECE_2544 

# Dump


- Typical layers of abstraction for computer architecture go as follows 

|          Algorithms          |
| :--------------------------: |
|    Programming languages     |
|      Operating systems       |
| instruction set architecture |
|      microarchitecture       |
|      register transfers      |
|         logic gates          |
|     transistor circuits      |
|                              |

**Overview of digital design process**
1. Specification: Write a specification for the behavior of the circuit, if one is not already available.
2. Formulation: Derive the truth table or initial Boolean equations that define the required logical relationships between inputs and outputs.
3. Optimization: Apply two-level and multiple-level optimization to minimize the number of logic gates required. Draw a logic diagram or provide a netlist for the resulting circuit using logic gates.
4. Technology mapping: Transform the logic diagram or netlist to a new diagram or netlist using the available implementation technology.
5. Verification: Verify the correctness of the final design.


## Number Representations 1.4


- Within binary multiplication the multiplication is always a 1 or a zero and therefore can never be greater than each individual input 
- 



## Decimal Codes 1.5


- Given $n$ bits to represent a set of things we can use the formula $2^n-1$ to find the number of "items" or numbers represented by the numbers going from 0 to again $2^n-1$
	- To accurately represent a number you must include the 0's along with the ones this sounds redundant but it indicates the total size of the information even if $1$ is allways represented with $\dots0001$ the zeros indicate the scale and is an important peice of info. 

**ANCII** Character Code
- 7 bit structure 
- Only English
- Also has control characters that serve as communication symbols for systems
	- (STX or 0010000 )  is start of text for example 
	- (EOT or 0100000) is end of transmission

**Parity Bit**
- The parity bit is added to make the total number of 1's either even or odd. This is of course called even parity or odd parity which can be used to ensure the validity of data. (weak checksum)  
- Even is the most common form of parity bit
- The reciver of the ANCII code can check for missing data by making sure that the data is truly odd or even and if this changes recognize an error 


 




# Anki cards 

- [ ]  Radix point 
- [ ] Most significant bit 
- [ ] least significant bit 
- [ ] Radix 
- [ ] formula for the number of numbers representable by $n$ bits
	- [ ] $0 \to 2^n-1$
- [ ] What is a parity bit and what does it do
- [ ] Describe ANCII code system


