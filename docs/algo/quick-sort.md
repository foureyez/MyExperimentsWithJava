# Quick Sort
Quick sort is somewhat similar to Merge Sort in that it is also a Divide and Conquer Algorithm.
But unlike merge sort where we recursively split the array in two halves, the split part of quicksort has some logic.

Here are the key steps for quicksort :
* Pick a element in the array on which you want to split the array (pivot element). The different ways to pick the pivot element are :
	* Pick the first element
	* Pick the last element
	* Pick the middle element.
	* Pick a random element.

* After the pivot is selected, we need to move the elements of the array in such a way that all the  
	* elements less than pivot is on its left side while  
    * the elements greater than the pivot is on its right.  (This is the core logic of quicksort)

* Doing this the pivot element occupies its correct position in the to-be sorted array.

* Then do the same thing for both halves of the array  
	* arr[0..pivot_index -1] and arr[pivot_index + 1....n]

[Go Back](https://foureyez.github.io/MyExperimentsWithJava/overview)
