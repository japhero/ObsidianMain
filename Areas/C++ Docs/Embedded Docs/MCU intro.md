

# Dump


## Pointers
- Dereferencing means putting a * in front of a pointer as to represent the memory being pointed to. In other words dereferencing returns the value stored in the address that the pointer is “pointing” to.
	- What this lets us do is use pointers to describe the bytes that are the register memory.
- Volatile keyword tells the compiler that the memory being represented by the pointer is beyond the scope of the program.
-  How do we assign pointers?
	- When we assign pointers we assign the location in memory that pointer represents EG: `int* var = 0x24`
		- Note that for `int* var1,var2` only `var1` is a pointer
- using the and symbol in front of a variable forces the variable to return its address instead of its value. Eg: `int* var1 = &var2` var1 would be "pointing" at var2
- Null pointers are pointers that are initialized with `NULL` as the address
	- C++ has the keyword `nullptr`

## References 
- A reference is a "name constant for an address"
- You cant change the reference to reference another variable.
- references dereference and reference implicitly (confusing but remember, that references are a type and referencing is an operation)


## Registers 
- Register is a part in memory but that it directly affects the CPU with things such as clock cycles or pins
	- For example `Digitalwrite` in the Arduino framework changes the register for that specific pin to make it `HIGH` or `LOW`




# Resources 

<iframe width="560" height="315" src="https://www.youtube.com/embed/videoseries?si=rrpEZGPLJH854Z1q&amp;list=PLNyfXcjhOAwOF-7S-ZoW2wuQ6Y-4hfjMR" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

[Singapor Collage Pointer lesson](https://www3.ntu.edu.sg/home/ehchua/programming/cpp/cp4_PointerReference.html)
