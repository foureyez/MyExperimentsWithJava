# Merge Sort

Merge Sort is a divide and conquer algorithm. Essentially what it does is 2 things:
* Split array (usually into two equal parts) - Split recursively until the size of the two halves becomes 1, when it happens merge process begins.
* Merge array (merge the splitted pieces together such that they are sorted).

Time Complexity : O(nLogn)

This is an example diagram for merge sort execution sequence taken from [GeeksForGeeks](https://www.geeksforgeeks.org)
![logo](https://www.geeksforgeeks.org/wp-content/uploads/Merge-Sort-Tutorial.png "Logo Title Text 2")

As you can guess, the main logic of merge sort is in the merge() method.

[Source Code](https://github.com/foureyez/MyExperimentsWithJava/blob/master/src/main/java/com/foureyez/algorithm/sort/MergeSort.java)