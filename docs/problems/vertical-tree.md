## Problem Statement
Given a binary tree, print it vertically.

e.g.   
![Example](https://www.geeksforgeeks.org/wp-content/uploads/print-binary-tree-in-vertical-order.png " Logo Title Text 1")        

So, the output would be:
4  
2  
1 5 6  
3 8  
7  
9  

This problem can be solved by using a map(treeMap to be specific).  
We can do this by giving each vertical line a specific index.  
The central line (which goes through root can be index 0).  

Each index (vertical line) will become a key in the map and the corresponding value will be a list of Nodes on that particular line.  
Using this logic we can do a simple tree traversal to build our treeMap.  
Since we are using treeMap, it will guarantee that the keys are sorted meaning we will print the Nodes from left to right in vertical order.  