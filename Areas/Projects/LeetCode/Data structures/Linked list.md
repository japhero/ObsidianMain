The [[linked List]] data structure is a way to store and access data. It typically consists of [[node|nodes]]. Each node has 2 parts the data value and then the pointer to the next node. There are different types of linked lists, they differ in the way that the nodes point to the next. Some types of linked lists include
* [[#Singly linked list]]
* [[# Doubly linked list]]
* [[# Circular linked list]]

### Code Example
```python
class linkedNode():
    def __init__(self,data) -> None:
        self.data = data 
        self.next = None
        
# Creating nodes 
node1 = linkedNode(3)
node2 = linkedNode(2)
node3 = linkedNode(5)
node4 = linkedNode(-1)

#Linking nodes
node1.next = node2
node2.next = node3
node3.next = node4
node4.next = None
```

![[code into linked list]]
> note this is a [[#Singly linked list]]

---


## Singly linked list
Each [[node]] inside of the list should point to another [[node]] until it points to [[null]]
![[linked list no loop]]
This one differs because it has a finite ending. Its also much easier to detect this type of linked list because you can always find a [[null]] at the end.
