


# Using Specific of Classes
When creating classes its always really important to decide what is the purpose of this class and what can I do with it, when asking this question we must decide 

# Using decorators 
Using decorators can significantly improve the performance of your code and the actual functionality can increase. Some [[Decorators|decorators]] establish the structure of the class such as [[Data classes|@dataclass]] and others of the method such as `@property`.


# Dependency injection
When we want to use functionality of a system outside our code to make our code more future-proof and usable, we can allow ourselves to "inject" our dependencies into the code through a [[Callables|Callable]] or an argument.
> [!example]- Example: Passing a dependency as an argument 
> ``` python
> def sendEmail(self,text,email_service: Emailservice)
> 	#We are passing whatever emailservice as a argument
> 	#and then type hinting it 
> 	#rest of implementation not shown
> ```


# [[Type hinting]] and [[Docstrings]] 
Type hint everything, this allows for the "user" and your future self to easily see what you meant. This along with docstrings makes the code much more readable and easy to use, especially when in editors such as [[VS code]]  that automatically sort the contents of the docstring when hovering over the class or method that it describes.
> [!example]- Docstrings Example
> 
> ```python
> def add(num1, num2):
>     """
>     Add up two integer numbers.
> 
>     This function simply wraps the ``+`` operator, and does not
>     do anything interesting, except for illustrating what
>     the docstring of a very simple function looks like.
> 
>     Parameters
>     ----------
>     num1 : int
>         First number to add.
>     num2 : int
>         Second number to add.
> 
>     Returns
>     -------
>     int
>         The sum of ``num1`` and ``num2``.
> 
>     See Also
>     --------
>     subtract : Subtract one integer from another.
> 
>     Examples
>     --------
>     >>> add(2, 2)
>     4
>     >>> add(25, 0)
>     25
>     >>> add(10, -10)
>     0
>     """
>     return num1 + num2
> ```


---
# Dump

## Beginning of the video
- Data focused or 
	- Structured information
	- 
- Behavior focused 
	- Grouping methods that belong together
	- 
- Best practices
	- 
- What does the `@dataclass` [[Decorators|Decorators]] do.
- Dont we want to define all of our properties in the `__init__`
- Split up behavior within methods into individual classes.
- Splitting up makes the reuse of classes easy and makes code less error prone

## [Make your classes easier to use ](https://youtu.be/lX9UQp2NwTk?t=524)
- use properties and [[Dunder Methods]]
- [[Decorators|decorators]]
	- `@dataclass`
	- `@property`
	- `@cached_property` (`import functools`)
		- Stores the value once and returns the value after we call it instead of recomputing it 
	- `@lru_cache`
		- uses the **least recently used** cached
- Use [[Type hinting]]
- [[Dunder Methods|Dunder]] 
	- `__str__` 



## [Rely on dependency injection](https://youtu.be/lX9UQp2NwTk?t=857)
- whats dependency injection
	- Inserting diffrent systems for doing something such as diffrent packages that have the same goal but do the same thing.
- provide the classes you create as an argument 

> [!example]- Example: Passing a dependency as an argument 
> ``` python
> def sendEmail(self,text,email_service: Emailservice)
> 	#We are passing whatever emailservice as a argument
> 	#and then type hinting it 
> 	#rest of implementation not shown
> ```

## [When you need classes](https://youtu.be/lX9UQp2NwTk?t=1062)
- Sometimes you can just use a module instead of class
- What are [[Callables]] 
- pass as a function instead of a function

## [Encapsulate everything](https://youtu.be/lX9UQp2NwTk?t=1365)
- Makes sure that some information is hidd


---


--- 

---
# Resources 
#python #
<iframe width="560" height="315" src="https://www.youtube.com/embed/lX9UQp2NwTk?si=MKnNLKMO4jU6IJT9" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
