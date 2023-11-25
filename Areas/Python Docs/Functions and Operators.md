# Functions 
#python #codeDocs 
## len()
Len is a function that takes an object as an argument and returns the length.
```python
list = ["beans","toast","knife","england"]
tuple = {"eggs","sausage"}

print(len(list))
print(len(tuple))

# this would return 4,2
```
The argument may be a sequence (such as a string, bytes, tuple, list, or range) or a collection (such as a dictionary, set, or frozen set)
*** 
## .copy()
**Python List Copy() methods** return a shallow copy of a list. A shallow copy of a list is a list that shares the same memory location as the old list, meaning functions like **append** and **pop** will apply to both the copy and the new function.

![[copy-list-in-python.png |500]]
## .deepcopy()
Deep copy creates a deep copy of the list, meaning it is stored in a new memory location separate from the original copy.

```python
list =[1,2,3]
shallowCopy = list.copy()
deepCopy = list.deepcopy()

list.append(4)

print(f"deep:{deepCopy} shallow: {shallowCopy}")
# OUTPUT:
# deep:[1,2,3] shallow: [1,2,3,4]
```
Notice how when appending to the original it also affects the shallow copy while the deep copy remains unaffected this is a result of the change in memory location. 
*** 

# Operators 

## Match statements/Switch case

```python
def errorName(errorCode):
	match errorCode:
		case 400:
			return "No connection"
		case 200:
			return "operation failed"
		case 300:
			return "Failed init"
print(errorName(300))
# This would print out "Failed init" 
```
This is just pythons way of doing switch cases another way to handle large numbers of cases without elif statements for days makes your code more readable.
> [!todo]- TODO:
> python has a diffrent reason for implement [[Match statement]] and should do its own note for higher level overview 


--- 
