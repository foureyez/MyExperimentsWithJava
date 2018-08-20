package com.problem.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.algorithm.DisjointSet;

/**
 * @author arawat
 *         Given a set of n jobs where each job i has a deadline di >=1 and profit pi>=0. Only one job can be scheduled at a time. Each job takes 1 unit of time
 *         to complete. We earn the profit if and only if the job is completed by its deadline. The task is to find the subset of jobs that maximizes profit
 *         TAGS : [GREEDY, UNION-FIND]
 */
public class JobScheduling {
    public static void main(String[] args) {
        List<Job> arr = new ArrayList<Job>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));
        System.out.println("Following jobs need to be executed for maximum profit");
        printJobScheduling(arr);
    }

    private static void printJobScheduling(List<Job> jobs) {
        Collections.sort(jobs);
        int maxDeadLine = findMaxDeadline(jobs);
        DisjointSet set = new DisjointSet(maxDeadLine);

        for (Job job : jobs) {

            // Find max available free slot for this job
            int availableSlot = set.find(job.deadline);

            if (availableSlot > 0) {
                set.union(set.find(availableSlot - 1), availableSlot);
                System.out.println(job.id);
            }
        }

    }

    private static int findMaxDeadline(List<Job> jobs) {
        int max = Integer.MIN_VALUE;

        for (Job job : jobs) {
            max = Math.max(job.deadline, max);
        }
        return max;
    }
}

class Job implements Comparable<Job> {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        super();
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public int compareTo(Job o) {
        // Default comparator (Compares in decreasing order of profit value)
        return o.profit - this.profit;
    }

    @Override
    public String toString() {
        return "Job [id=" + id + ", deadline=" + deadline + ", profit=" + profit + "]";
    }
}
