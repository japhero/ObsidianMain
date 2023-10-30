```python
def disFromStart(currNode):
	counter = 0
	while currNode != start:
		currNode = currNode.sourceNode()
		counter += 1 

AStar(start,end,H_score):
# H score is just distance function 
	P_queue = queue.priority_queue
	
	while end not in P_queue:
		node = P_queue.get()
		
		
		for neighbor in node.get_neighbors()
			f_set = H_score(neighbor) + disFromStart(neighbor)
			
			# hscore being the absolute distance to end. 
			
			# disance from start function being the G score .
			
			# adding them then gives us our "cost" which we can pass
			# into the queue which then makes a decision on what to
			# queue next based on what has the lowest score/"cost"
			
			

			P_queue.add(neighbor)
			# on adding it should rearange the queue 
```
