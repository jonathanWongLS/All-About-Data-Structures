# Array
### A. What It Is?
An array is a collection of items stored in contiguous (ordered) memory locations.

### B. Tell me more!
The primary advantages and drawbacks of arrays are as follows:

- Advantages:
  - Fast Access Time: Allows O(1) time complexity for accessing any element, assuming the index is known. This is due to the contiguous storage of elements.
- Drawbacks:
  - Static Size: Arrays are static in size, making resizing an O(N) operation or requiring dynamic memory allocation techniques, such as realloc in C or C++.
  - Insertions and Deletions: Average time complexity for insertions and deletions is O(N) because shifting elements is necessary.

In summary, while arrays provide fast access to elements, their static size and complexities associated with resizing and dynamic memory allocation should be considered based on specific use cases.

### C. What are the time complexities in Big-O notation? 
| Operation |  Time Complexity |
|-----------|------------------|
| Insert End|        O (1)     |
| Remove End|        O (1)     |
| Insert Mid|        O (N)     |
| Remove Mid|        O (N)     | 