
# Dump
- open gl has its own language that is shader code the point of shaders is that they run on the gpu instead of the cpu. This is a major change from other code previously run because it has all been run on cpu threads. Some major projects and games use open gl like doom (could be direct x) along with star citizen.

## Why do header files exist (video LLL)
- **Linker**

- including the library statically means importing it which intern is the same as just copying the code into the library
- **comand run**
	- first the **compile pass** happens which is a process that takes the code and turns it into objects (obj)
	- The **linker** faze takes all the object files and outputs and executable file.
		- the linker faze as in the name links all the dependancies together so all of the compiled object files
- when compiling if we have an undefined function the object file will depend on the reference to the function
- again if we have an undefined function the linker will not be able to find the reference for that file and therefore compiling will fail.
- The header acts as a API and exposes the header of each function defined in the c++ file  that corresponds with the .h file.
- although the header only declares the functions and doesnt define the function.



---
# Resources

[opengl toutorial](https://www.opengl-tutorial.org/beginners-tutorials/tutorial-1-opening-a-window/)