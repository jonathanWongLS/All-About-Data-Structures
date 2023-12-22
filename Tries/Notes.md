# Trie / Prefix Trie
### A. What It Is?
    Another kind of tree where each node contains a single character and each node can have up to 26 children usually (also the number of alphabets!). 

### B. Tell me more!
    If you wanted to insert the word "ANT" into the Trie and you have two nodes connected where they are (in order):
    A -> N

    We can just reuse the existing nodes and simply create a node for the character 'T' and connect the N to the new node! Resulting in the nodes:
    A -> N -> T
    We can do this in O(N) where N is the size of the word!

    To search a word from the trie, we can do this in O(N) as well!

    An interesting fact is that this is great for an autocomplete feature such as the one we usually see when texting our friends!

### C. What are the time complexities in Big-O notation? 
| Operation |  Time Complexity |
|-----------|------------------|
| Insert    |        O (N)     |
| Search    |        O (N)     |