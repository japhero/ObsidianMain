Default `dict` is very similar to the [[concepts#Dictionaries|dict]] type in Python and is a subclass of the [[concepts#Dictionaries|dictionary]] type. the major difference is that the [[defaultdict]] type handles the `KEYVALUE` error differently. A default `value` is automatically given to that `key`. In order to provide this functionality, the Python `defaultdict` type does two things:

1. It overrides [`.__missing__()`](https://docs.python.org/3/library/collections.html#collections.defaultdict.__missing__).
2. It adds `.default_factory`, a writable instance variable that needs to be provided at the time of instantiation. 

The instance variable `.default_factory` will hold the first argument passed into [`defaultdict.__init__()`](https://docs.python.org/3/reference/datamodel.html#object.__init__). This argument can take a valid Python callable or `None`. If a callable is provided, then it’ll automatically be called by `defaultdict` whenever you try to access or modify the value associated with a missing key.

## Simple terms
in simple terms the item passed to at initiation of the `default_dict` object will be returned as a **value** when you query a key that doesn't exist they key queried will also then be added to the dictionary with the `.default_factory` as a value. 

> [!Example]-
> If I have a default dict with initialized with the `list` type as its factory and i create query a value lets say food eaten: `myDefaultDict["food_eaten"]` I would get back a empty list because my factory creates that empty list on that error. 
> ```python
> myDefaultDict = defaultdict(list) # dict created with list as the "factory"
> print(myDefaultDict["food_eaten"])
> 
> # Prints []
> ```
> 
> 
> 


> [!TODO]- TODO:
> 
>  (Make less of a straight rip from the article)
> 
> 

---
# Resources
[Real Python](https://realpython.com/python-defaultdict/#understanding-the-python-defaultdict-type) 