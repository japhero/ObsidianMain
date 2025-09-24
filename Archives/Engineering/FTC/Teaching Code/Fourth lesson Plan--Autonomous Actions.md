
&emsp;


# Slides
&emsp;

**Attendance**

**Sanity check**

## 1: Actions Introduction  

**What are actions**
- talk about how actions are a small reusable snippet of code that executes your mechanical actions
-  Talk about how they fit into the overall trajectory sequence structure  

**Connections overview**
- Talk about how actions are similar to a state machine
- Give diagram about the structure of actions (not code just the idea that they are contained within classes as methods)

## 2: Actions Code Deep-dive

**Simple code example**
- Give a simple code example of a very basic action and then disect the different components of the action. 
- These dissection points being
	- Overview class
	- `Action` object initialization 
	- **The fact that we are returning an instance of an Action object**
	- We are calling methods that return objects rather than calling the individual functions within already created objects **(highlight the return type of `Action`)**

**Built-in Actions**
- Just list the already built-in Actions and explain the ones that dont have to do with execution
	- `SleepAction`: sleep for a duration
	- `SequentialAction`: execute a bunch of actions one after the other
	- `ParallelAction`: execute a bunch of actions at the same time
	- `FollowTrajectoryAction`: follow a trajectory (separate tank and mecanum versions)
	- `TurnAction`: turn in place (separate tank and mecanum versions)
## 3: Executing actions

**How do we execute actions?**
- Show all ways to execute and summarize them
	- `Actions.runblocking()` 
	- `SequentialAction`
	- `ParallelAction`

**Parallel Action**
- Small Code example
- IRL reason to use 

**Sequential Action**
- Small Code example
- IRL reason to use 

****