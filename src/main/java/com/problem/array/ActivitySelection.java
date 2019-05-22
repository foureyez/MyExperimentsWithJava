package com.problem.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author arawat You are given n activities with their start and finish times.
 *         Select the maximum number of activities that can be performed by a
 *         single person, assuming that a person can only work on a single
 *         activity at a time.
 * 
 */
public class ActivitySelection {
	public static void main(String[] args) {
		int s[] = { 1, 3, 0, 5, 8, 5 };
		int f[] = { 2, 4, 6, 7, 9, 9 };
		List<Activity> activities = new ArrayList<>();

		for (int i = 0; i < s.length; i++) {
			Activity act = new Activity();
			act.start = s[i];
			act.end = f[i];

			activities.add(act);
		}

		// Sort the activities in increasing order of their end time
		Collections.sort(activities);
		System.out.println(activities.get(0));
		int i = 0;
		for (int j = 1; j < activities.size(); j++) {
			if (activities.get(j).start >= activities.get(i).end) {
				System.out.println(activities.get(j));
				i = j;
			}
		}

	}
}

/**
 * Creating an Activity class so that list of activities can easily be sorted in
 * increasing order of end time.
 */
class Activity implements Comparable<Activity> {
	public int start;
	public int end;

	@Override
	public int compareTo(Activity o) {
		return this.end - o.end;
	}

	@Override
	public String toString() {
		return "Activity [start=" + start + ", end=" + end + "]";
	}
}
