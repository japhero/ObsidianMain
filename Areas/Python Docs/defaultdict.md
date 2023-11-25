Default `dict` is very similar to the [[concepts#Dictionaries|dict]] type in Python and is a subclass of the [[concepts#Dictionaries|dictionary]] type. the major difference is that the [[defaultdict]] type handles the `KEYVALUE` error differently. A default `value` is automatically given to that `key`. In order to provide this functionality, the Python `defaultdict` type does two things:

1. It overrides [`.__missing__()`](https://docs.python.org/3/library/collections.html#collections.defaultdict.__missing__).
2. It adds `.default_factory`, a writable instance variable that needs to be provided at the time of instantiation. 

The instance variable `.default_factory` will hold the first argument passed into [`defaultdict.__init__()`](https://docs.python.org/3/reference/datamodel.html#object.__init__). This argument can take a valid Python callable or `None`. If a callable is provided, then it’ll automatically be called by `defaultdict` whenever you try to access or modify the value associated with a missing key.
## Correct usage
```python
>>> # Correct instantiation
>>> def_dict = defaultdict(list)  # Pass list to .default_factory
>>> def_dict['one'] = 1  # Add a key-value pair
>>> def_dict['missing']  # Access a missing key returns an empty list
[]
>>> def_dict['another_missing'].append(4)  # Modify a missing key
>>> def_dict
defaultdict(<class 'list'>, {'one': 1, 'missing': [], 'another_missing': [4]})
```


> [!TODO]- TODO:
> 
>  (Make less of a straight rip from the article)
> 
> 

---
# Resources
[Real Python](https://realpython.com/python-defaultdict/#understanding-the-python-defaultdict-type) 