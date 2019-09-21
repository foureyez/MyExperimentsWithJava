## Problem Statement
**Tags** Greedy, Array
You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.

Example : Consider the following 3 activities.
     start[]  =  {12, 10, 20};
     finish[] =  {25, 20, 30};
Solution : A person can perform at most two activities. The maximum set of activities that can be executed is {1, 2}
[ These are indexes in start[] and finish[] ] as the first activity (12, 25) overlaps with activities (10,20) and (20, 30).  


#### Explanation
The logic for this problem is to pick the activity which has the least finish time (Greedy approach) as that activity will allow us to 
process the next activity in the shortest amount of time.  

So, we need to sort the activities in **increasing order of their finish time**.

Considering the above example, the sorted array becomes :   
	 start[]  =  {10, 12, 20};  
     finish[] =  {20, 25, 30};  

Here, we'll pick (10,20) as it has the least finish time.  

Now to pick the next activity we just need to check if  
The **start time** of next activity should always be **greater than** the **end time** of previous activity, as otherwise the two activities will overlap and *a person can only work on a single activity at a time*.  

So, referring our sorted activities, (12,25) has the least finish time(25), but  
end time of(10,20) > start time of(12,25)  
This activity will not be executed.  

Lastly, the activity (20,30) will be picked.  

[Source Code](https://github.com/foureyez/MyExperimentsWithJava/blob/master/src/main/java/com/foureyez/problem/array/ActivitySelection.java) 
[Go Back](https://foureyez.github.io/MyExperimentsWithJava/overview)
