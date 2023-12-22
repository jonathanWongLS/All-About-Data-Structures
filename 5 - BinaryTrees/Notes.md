# Binary Trees
### A. What It Is?
    A binary tree is a data structure where each node has a maximum of two children. 

    Each node is a pair of data, where the first data element is called the "key" and the second data element is called the "value". 
    
    The keys are used to construct a sorted array, with the left subtree being less than the key, and the right subtree being greater than the key. 
    
    This process is repeated recursively for each subtree, which gives us the name "binary search tree".

### B. Tell me more!
    The benefit of a binary tree over the HashMap is that it is ordered! We can do a Depth First Search (DFS) on the tree to obtain the values in order!

### C. What are the time complexities in Big-O notation? 
| Operation |  Time Complexity      |
|-----------|------------------     |
| Insert    |        O (log N)      |
| Remove    |        O (log N)      |
| Search    |        O (log N)      |