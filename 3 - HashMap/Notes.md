# HashMap
### A. What It Is?
    HashMaps are unordered data structures unlike the Array and the Linked List. When trying to understand what hashmaps are, we first need to know two things:
    - Key
    - Value

    Imagine keys as indexes in the array as we talked about. The difference is that:
    - Index: Numbers from 0 to N (where N is the length of the array/linked list) and in order (E.g. 0, 1, 2, 3, 4)
    - Key: Can be a number, character, string, or any legal datatype! (E.g. 21, "cAt", 'R')

    Values are the values that are indexed by the key. So, if the hashmap has the key-value pairs like below:

    'C'     -> "Cat"
    23      -> "Number"
    "frog"  -> 45

    The key 'C' has the value "Cat", the key 23 has the value "Number", and the key "frog" has the value 45.

### B. Tell me more!
    Inserting into, removing from and searching through a hashmap will take constant time (O(1))! 
    This is true as we would absolutely need to know the key to retrieve the corresponding value. Just like how you would need a key to access some potentially expensive treasure in a chest!

    The reason why many programmers love hashmaps is because of the quick constant SEARCH time complexity as compared to array and linked lists which would take O(N) as the worst case complexity. 

### C. What are the time complexities in Big-O notation? 
| Operation |  Time Complexity |
|-----------|------------------|
| Insert |        O (1)     |
| Remove |        O (1)     |
| Search |        O (1)     |