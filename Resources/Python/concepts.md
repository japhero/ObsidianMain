# Vocab list to explain words or meanings
Used in case a word is forgotten or needs reference.


### Instance
An instance is the area/scope of an object that has been created
```python
class test():
	def __init__(self,x):
		self.x = x
	obj1 = test(1)
	obj2 = test(1)
```
>An instance is **a single copy of the software running on a single physical or virtual server**. If you run two copies of the software on the same physical or virtual server, that counts as two instances.

Both objects of the class test have a value of one, but they are both in a different **instance**. The instance is the space where the object is handled. This is important because different objects can be handled and output different things based on the input. 
***
## Context managers  
Context managers let us allocate and release reasorces when we please. Context managers can be used to for example open files or closing network connections if you dont properly open and close these reasorces they stay open and keep taking reasorces from you.
```Copy
with open('test.txt','r') as x:
	text =x.read()
```
This opens the file "test" and reads the contense from the file. This lets the file get opened and read stored and closed again. 
***
## Self
usage of self in an example.
```Copy
Class obj():

	def __init__(self,x):
		self.x = x
newObj = obj(2)
print(newObj.x)
# Returns 1
```
The use of self is pointing to the [instance](concepts.md###Instance) of the class, in this case the class of **obj**. Self represents the object when called it then operates with the class's variable instead of the argument given at definition.

## Data types
Documentation for data types and their uses and features.

### lists 

### tuple

### ints 

### float 

### Dictionarys 



