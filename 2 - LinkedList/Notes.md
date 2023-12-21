# Linked List
### A. What It Is?
    A pretty similar data structure to arrays as it is a contiguous set of values. But what's difference is in the way the data is stored in the Random Access Memory (RAM)! 
    
    In arrays, the values are stored in order in the RAM:
    RAM -> [ 1 | 2 | 3 | 4 | 5 | 6 ] 

    However, linked lists may store the values at different spots:
    RAM -> [ 5 |  | 2 |  |  | 3 | 1 |  | 4 ]

    But how does this work then if they are all jumbled up!?

    The answer is POINTERS! The first element has a pointer that points to the second element. The second element has one that points to the third one and so on ... 

    The pointer to the next element is usually stored as the next element's memory address.


### B. Tell me more!
    Let's say we have 4 elements in our linked list and we want to ACCESS the 3rd element. 

    Just access it with the index, that is 3 then? Not really. We cannot randomly access it in constant time just like arrays. How we can do it is we can access the 3rd element by starting at element at index 1. Then, moving on to the next element pointed to by element indexed at 1's pointer. And so on.

    So, let's talk about insertion and removal of the elements!

    If we want to insert at the end of the linked list, we would have to store a pointer to the last element, create a new node for the new element and storing a pointer to the newly created element in the PREVIOUSLY last element but NOW second to last element.

    In the case of removing the last element, we would normally change the pointer to the last element to a NULL value which means the last element is no longer connected to the linked list!

    Similarly, if we were to insert or remove elements in the middle of the list, we would do the same thing where we would modify the pointers of the relevant nodes. 

    For example, if I wanted to insert a node between Node C and D. The new node will point to D and node C will point to the new node. If I wanted to then remove the new node, I would change node C's pointer to node D and the new node is no longer connected!


### C. What are the time complexities in Big-O notation? 
| Operation |  Time Complexity |
|-----------|------------------|
| Insert End|        O (1)     |
| Remove End|        O (1)     |
| Insert Mid|        O (1)     |
| Remove Mid|        O (1)     | 