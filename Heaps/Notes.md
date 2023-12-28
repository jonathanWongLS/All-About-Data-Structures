# Heap
### A. What It Is?
    Heaps are visualised in a tree format and we have two types of heaps:
    - Min Heap
    - Max Heap

    In a Min Heap, the minimum value is always the root of the tree and the children will be greater than the root!

    That means every level in the tree will be completely full except the last level. 

    Whenever a node is added, we must adjust the tree. 
    Whenever a node is deleted, we must adjust the tree.

### B. Tell me more!
    Eventhough heaps are visualised as trees, they are typically implemented as arrays under the hood! This is done so that we can get the child of a node.
    
    Let's say we want to get the left and right children of index i! To get the left child, we simply multiply the index i by 2. To get the right child, we multiply the index i by 2 AND add it by 1.
    - Index of left child: 2*i
    - Index of right child: 2*i + 1

    AND to get the parent where you have the index of a child, no matter the index is odd or even, we simply carry out the following mathematical equation:
    FLOOR( (i - 1) / 2 ) 
    - FLOOR is just rounding down to the nearest whole number!
    
    AND WAIT THERE'S MORE!
    How do we get the last node in the heap?
    Keep track of the length and get the last element of the array! You've got your last node!

    The main benefit of a heap is that we can get the minimum value (in a min heap) or the maximum value (in a max heap) in constant time. 
    
    But to pop the minimum value, we would take O(log N) time which is pretty efficient. 
    
    We take a non-constant time as we would need to shift up the smallest or largest value (in a min heap or max heap respectively) so that the nodes are in the positions they are supposed to be in.

### C. What are the time complexities in Big-O notation? 
| Operation |  Time Complexity |
|-----------|------------------|
| Insert    |        O (log N)     |
| Delete    |        O (log N)     |
| Min / Max |        O (1)     |