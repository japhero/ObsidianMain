
# Dump

- Data focused or 
	- Structured information
	- 
- Behavior focused 
	- Grouping methods that belong together
	- 
- Best practices
	- 
- What does the `@dataclass` [[decorator|decorator]] do.
- Dont we want to define all of our properties in the `__init__`
- Split up behavior within methods into individual classes.
- Splitting up makes the reuse of classes easy and makes code less error prone

## [Make your classes easier to use ](https://youtu.be/lX9UQp2NwTk?t=524)
- use properties and [[Dunder methods]]
- [[decorator|decorators]]
	- `@dataclass`
	- `@property`
	- `@cached_property` (`import functools`)
		- Stores the value once and returns the value after we call it instead of recomputing it 
	- `@lru_cache`
		- uses the **least recently used** cached
- Use [[Type hinting]]
- [[Dunder methods|Dunder]] 
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
# Resources 
#python #
<iframe width="560" height="315" src="https://www.youtube.com/embed/lX9UQp2NwTk?si=MKnNLKMO4jU6IJT9" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
