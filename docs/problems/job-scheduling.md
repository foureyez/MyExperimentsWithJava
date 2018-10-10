## Problem Statement
**TAGS** : [GREEDY, UNION-FIND]
Given a set of n jobs where each job i has a deadline di >= 1 and profit pi>=0. Only one job can be scheduled at a time. Each job takes 1 unit of time to complete. We earn the profit if and only if the job is completed by its deadline. The task is to find the subset of jobs that maximizes profit.

## Explaination

As you can guess by the problem statement tags, this problem can be solved by greedy approach.  
The greedy approach states that pick the path which looks the most profitable **now**.

E.g. 

So, since we want to maximize profits the first step would be to sort the jobs in **decreasing** order of **profits**.  
Now there is the problem of executing the jobs at the right time, as each job has to be executed on or before its deadline.  

So the algorithm for this problem will be :  
1. Sort all jobs in decreasing order of profit.
2. Initialize the result sequence as first job in sorted jobs.
3. Do following for remaining n-1 jobs
	* If the current job can fit in the current result sequence 
	  without missing the deadline, add current job to the result.
	  Else ignore the current job.


#### Basic Approach O(n2) time

The main logic of the problem is in the 3rd Step so we'll discuss that part only.

#### Using Disjoint sets

Please read about disjoint sets [here](https://foureyez.github.io/MyExperimentsWithJava/misc/disjoint-set) if you don't know about them yet.


[Go Back](https://foureyez.github.io/MyExperimentsWithJava/overview)
