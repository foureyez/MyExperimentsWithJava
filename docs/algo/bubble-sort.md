# Bubble Sort

Bubble sort is based on the idea of repeatedly comparing pairs of adjacent elements and then swapping their positions if they exist in the wrong order.
Time Complexity : O(n2)

The **inner loop** is simple, just compare the current element (curr) with the next element (next)
if (curr > next)
	swap(curr, next)

Due to this, with each **outer loop** iteration the **max element** in the array will be pushed to the end of the array.

E.g.
#### One Pass of outer loop
**8** 5 1 4 2 ) –> ( 5 **8** 1 4 2 ), Here, algorithm compares the current and its next element, and swaps since 8 > 5.  
( 5 **8** 1 4 2 ) –>  ( 5 1 **8** 4 2 ), Swap since 8 > 1  
( 5 1 **8** 4 2 ) –>  ( 5 1 4 **8** 2 ), Swap since 8 > 4  
( 5 1 4 **8** 2 ) –> ( 5 1 4 2 **8** ), Swap since 8 > 2  

So, the max element 8, is placed in the correct position.  
In the same way,   
for the second pass of outer loop, the second maxiumum element will shift to its correct position in the sorted array (i.e.second from the right) and so, the inner loop can go from 0 to arr.length - i - 1 (i being the outer loop index).

Think of it like this way,
The maximum element of the array gets "bubbled" up in each outer loop of bubble sort to acquire its correct position.
So for the next loop we don't have to consider that element, hence the loop will go from 0 to length - i

