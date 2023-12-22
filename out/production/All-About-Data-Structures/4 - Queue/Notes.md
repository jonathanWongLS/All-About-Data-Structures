# Queues 
### A. What It Is?
    A queue is a data structure that follows the First-In-First-Out (FIFO) principle. It means that the element added first will be the first one to be removed.

    An easier way to understand is:
    Imagine a line of people waiting for a bus. The first person to arrive will be the first person to board the bus, following the First-In-First-Out (FIFO) principle.

    Now, let's translate this scenario into programming:

    * A line of people represents a queue of tasks.
    * The people who arrive represent new tasks being added to the queue.
    * The people who board the bus represent tasks being processed or removed from the queue.

    Queues have two main operations: enqueue and dequeue.

    - Enqueue: 
    Adds an element to the end of the queue. If the queue is full, then it is said to be in an overflow condition.

    - Dequeue: 
    Removes an element from the front of the queue. The elements that are left in the queue after this operation are re-arranged. If the queue is empty, then it is said to be in an underflow condition.

### B. Tell me more!
    If we want to push an element to the front or back, we can add them like we did in linked lists but most languages like Java will have a function to do this for the in-built queue. 
    
    The same will happen when popping the front and back element. 

    Therefore, these four elements will take a constant time complexity O(1)!

### C. What are the time complexities in Big-O notation? 
| Operation |  Time Complexity |
|-----------|------------------|
| Push Front |        O (1)     |
| Pop Front  |        O (1)     |
| Push Back  |        O (1)     |
| Pop Back   |        O (1)     |