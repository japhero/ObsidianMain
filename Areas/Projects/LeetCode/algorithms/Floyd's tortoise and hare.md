The algorithms purpose is to find cycles in a linked list data structure.

## Fast and Slow pointers
The algorithm has 2 pointers that simultaneously continue on  the given [[Linked list]] they do this until they reach one another or the next node returns [[null]] meaning that the list is not a loop.

![[linked list graphic|400]]

If this keeps going eventually as said in the algorithm the pointers will reach the same point.


## Why the pointers meet 
we know that the pointers will always meet because mathematically the distance between the fast and slow pointer will always change by 1. This is because we go 2 nodes on the fast pointer and one node on the slow pointer. This again shows how the "hare" will always catch up to the "tortoise".

$Slow - Fast = -1$

$changeInDistance = -1$

## Code 
The purpose of this code is to find out if this set of linked list nodes has a loop.
```python
def hasCycle(startingNode:linkedNode) -> bool:
    slow,fast = startingNode,startingNode
    
    while fast and fast.next:
        fast = fast.next.next
        slow = slow.next
        
        if fast == slow:
            return True
    return False
```
> 	Its using the node class from [[Linked list]]
> 	Also same code used in [[141. Linked List Cycle]]

The .next is just getting the property of the node which is just the next node. Find more in-depth things at [[Linked list]]. Then its returning **True** if fast and slow are equal because it must loop it to exists. Then returns **false** if we find one of the nodes returns null.


---

#### Usage info 
[[time complexity]] : $O(n)$

#### Extra resources #resource
[Wikipedia](https://en.wikipedia.org/wiki/Cycle_detection#Floyd's_tortoise_and_hare) 
[neetcode explanation](https://youtu.be/gBTe7lFR3vc?t=342)  #Video


