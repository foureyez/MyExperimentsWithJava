#Bubble Sort

Bubble sort is based on the idea of repeatedly comparing pairs of adjacent elements and then swapping their positions if they exist in the wrong order.
Time Complexity : O(n2)

With each outer loop iteration the **max element** in the array will be pushed to the end of the array.

One Pass of outer loop
----------------------

**8** 5 1 4 2 ) –> ( 5 **8** 1 4 2 ), Here, algorithm compares the current and its next element, and swaps since 8 > 5.
( 5 **8** 1 4 2 ) –>  ( 5 1 **8** 4 2 ), Swap since 8 > 1
( 5 1 **8** 4 2 ) –>  ( 5 1 4 **8** 2 ), Swap since 8 > 4
( 5 1 4 **8** 2 ) –> ( 5 1 4 2 **8** ), Swap since 8 > 2

So, the max element 8, is placed in the correct position.
In this way, for the next pass of outer loop, the inner loop can go from 0 to arr.length - i - 1.