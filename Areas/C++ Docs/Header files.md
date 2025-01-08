
# Dump 
it seems that header files are a way for the preprocess to identify and declare the functions given in between files 




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