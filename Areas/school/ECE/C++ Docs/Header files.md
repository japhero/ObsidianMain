
# Dump 
- it seems that header files are a way for the preprocess to identify and declare the functions given in between files 
- "Conventionally, header files are used to propagate a bunch of related forward declarations into a code file."
- using the `#include` line makes the [[Preprocessor]] simply copy the contents of the file that is being included where the `#include` statement is find. 
- Overloaded functions are functions with the same name and different parameters 
- It is standard to `#include` the header file in its respective source file. For example if i have a `src.cpp` and a `src.h` within the beginning of the `src.cpp` file you should have the line `#include src.h`. 
 - Angled brackets around the include statement eg (`#include <iostream>`) means the [[Preprocessor]] is looking in the "include directories" folder which is determined by your IDE. Therefore use `""` double quotes when you wish to include a file in the working directory of your project.
 - Best practice for using the header file convention is to use the standard library header files without the .h extension. User-defined headers should still use a .h extension.


### Header guards 
- Header guards are ways for the header file to make sure that its contents has not already been declared. It works by using a [[Preprocessor#Macros|Macro]] that defines the name of the file (conventionally). Other files can now check if this macro was defined and if so chose to compile or not. 


> [!EXAMPLE]- Example main.h file 
> 
> 
> ```cpp
> #ifndef MAIN_H
> #define "main.cpp"
> 
> //define content 
> 
> #endif
> 
> ```


## Questions 
- What are forward declarations 

---
# Resources 
