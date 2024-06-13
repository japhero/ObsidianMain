Although type hinting isn't required in python its very useful if you want to use you code as a library and generally good practice when making code as it prevents you from passing the wrong type to a variable and then generating errors. 


# Hinting  Functions 
you can hint at the the return type of a function with an arrow before the indent.
```python
def addThings(x,y) -> int:
	return x +y
```
notice that here we are showing that the return type of the `addthings` function will be `int`.

## Hinting Attributes
Hinting Attributes is done with a colon and then the type for example `hello: str`
This declares a variable hello with the type String
```python
def findIndex(word: str, index: int) -> str:
	return word[index]
```
> greater example using a whole function hinting at its attributes and its return.




> [!TODO]- Python 3.12 has new type hinting
> Sources please


---
# Resource's
#python #code