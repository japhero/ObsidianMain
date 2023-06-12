![](https://upload.wikimedia.org/wikipedia/commons/5/5d/Astar_progress_animation.gif)

### keywords
* __Nodes__ are relationships between points
* __Weight__ is the length or distance/difference between position and target.

## Algorithm notes 
* We try to find the most optimal path and we sort "priority"

### Set
 Different functions are what we use to evaluate the "optimal path" and the future path.

#### H set component
*   __H__  is a part of the set that takes the ==absolute distance from the current node to the endpoint==t it doesn't account for things in the way.
	* H can be several formulas for example __Euclidean distance__.
	* Maby normal $\sqrt{(\frac{x_1 -x_2}{2})^2+(\frac{y_1-y_2}{2})^2}$ distance formula "this is Manhattan I believe"
	* ![[distance Comparison  | graphic comparing distance formulas]]
	* H is important because it represents the ==theoretical least cost or shortest distance.==
#### G and F set components
* The g set component or the function of __g__ is the actual distance found during operation from the ==start node to the current node== 
* This means if we can calculate the G function unless we have reached that "node".
* ![[G component|300]]
* ##### F set 
	* F set is the addition of  [[#G and F set components | G]] and [[#H set component|H]] 
	* so $f(x) = G(x)+H(x)$
	* The F set is a way to evaluate the 2 wants/targets of a the program or how to weigh the outcome combining the G and H sets is a way to assign a "optimal" weight to it or how optimal is this point. The question that values has helps us answer the question what node should I look at next.
 [example with nodes](https://youtu.be/JtiK0DOeI4A?list=PLFiR2kPtlWf4wdMuA745-JNiFWyFt-Nah&t=574)
### set calculation notes
* Every node that we haven't found is set to infinity this is because when deciding what node to take we will always take the shortest path.
* 
### open set/Priority que.
Its called an open set but in the code it will be a dictionary or hashmap.
* The open set is a ==list of all of the nodes found and their __F set__ values.== The reason these are created is to find the node area to evaluate.
* This again shows the purpose of the sets which is to compare the value of closest theoretical distance and actual distance to get to that point.
