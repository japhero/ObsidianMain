==NOTE THIS IS FOR C NOT FOR C++==


# Preprocessor DUMP
- Program run on the files before build 
- Main pourpace is to do text substitution
- What is text substitution
- any statement starting with # are directives for the preprocessor
- "The preprocessor is a [program](https://en.wikipedia.org/wiki/Computer_program "Computer program") that processes its input data to produce output that is used as input in another program."
	- Usually the output is a compiler and with C and C++ this is the case.
## `#include`
- Include brings the contents of a file into the file that the include is it.
	- Similar to import?
- Note this is recursive for all includes in that file then 
- **SYNTAX**
	- using quotes around the filename in `#include` causes the [[#Preprocessor]] to look at the local directory for that filename before looking at the system directories. Using angled brackets (<>) on the the other hand will only look at system directories.

## `#define`
- `#define` lets you define a new symbol that gets replaced with a text string in the preprocessor output
	- litterally goes in and replaces every instance of that symbol with the string that it was defined with. For example if i have `#define num 123` any instance of `num` found later will just literally be replaced by the string 123.
	- note that it doesnt do this for defined strings meaning that if a string contains the symbol it wont be replaced.
- Can also define functions such as `#define func(a) (a+1)` these functions can have parameters. The parameters are again just passed as strings. So if i would use `func(3)` in my program that would execute as `(3+1)`.
	- Think of this as a constant function

### Macros 
- What are macros 
	- any usage of `#define`?
	- a preprocessed function or conditional?

## `#if`
- Is a form conditional compilation 
- **SYNTAX**
	- Closes with `#endif` and can use `#else` and `elif`.
- Can be used to conditionalize what librarys are used or change the general way code is compiled based on the hardware or operating system as an example.


---
# Resources 
[Real python](https://realpython.com/c-for-python-programmers/)
[Microsoft learn-Preprocessor](https://learn.microsoft.com/en-us/cpp/preprocessor/preprocessor?view=msvc-170)

**Wikipedia**
- [Preprocessor](https://en.wikipedia.org/wiki/Preprocessor#:~:text=In%20computer%20science%2C%20a%20preprocessor,as%20input%20in%20another%20program.)
- [Conditional Compilation](https://en.wikipedia.org/wiki/Conditional_compilation)

<iframe width="560" height="315" src="https://www.youtube.com/embed/r9jqJZEeXho?si=C1c2F4hoPW8YqCKp" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

