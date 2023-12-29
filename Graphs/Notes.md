# Graph
### A. What It Is?
    It is a node with edges that connect nodes together! Linked list, trees and prefix trees can be considered as graphs as well. 
    
    A general graph can have NO restrictions where the edge can have any direction the programmer intends. This can make it a little complicated.

    We can represent a graph with an adjacency list which has two columns:
    - Node
    - Neighbors

    Every single node has a list of neighbors in the form of an array.

    There are 9 terminologies to know when we talk about graphs:
    1. Vertex: A node in the graph which can hold a label and are joined with edges.
    2. Edge: A line that connects two vertices and can hold a weight. An edge can be either uni-directional or bi-directional based on what you need!
    3. Cycle: Exists when there is a path from Node A along edge(s) and end back at Node A.
    4. Acyclic: A graph that contains NO cycles
    5. Connected: When every vertex has a path to another vertex
    6. Directed: When there is a direction to the connections
    7. Undirected: Not directed :D
    8. Weighted: Edges have a weight associated with them
    9. DAG: Directed, Acyclic graph

### B. Tell me more!
    Since there can be many different algorithms that can be used with graphs, we will have varying time complexities and they will depend on the algorithm itself.
    
    We can represent a graph in two ways:
    -   Adjacency list (mentioned above)
    -   Adjacency matrix
    But we usually use an Adjacency list over an Adjacency matrix due to the massive space needed for the matrix: O(V^2)

### C. What are the time complexities in Big-O notation? 
    Big O is commonly stated in terms of V and E 
    - V: Vertex
    - E: Edge
    O(V * E) means that we will check every vertex, and on every vertex we check every edge. 

    Complexity varies based on different algorithms!
