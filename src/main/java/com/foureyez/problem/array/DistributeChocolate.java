package com.foureyez.problem.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given n boxes containing some chocolates arranged in a row. There are k
 * number of students. The problem is to distribute maximum number of chocolates
 * equally among k students by selecting a consecutive sequence of boxes from
 * the given lot. Consider the boxes are arranged in a row with numbers from 1
 * to n from left to right. We have to select a group of boxes which are in
 * consecutive order that could provide maximum number of chocolates equally to
 * all the k students. An array arr[] is given representing the row arrangement
 * of the boxes and arr[i] represents number of chocolates in that box at
 * position i. ---------- Input : arr[] = {2, 7, 6, 1, 4, 5}, k = 3 Output : 6
 * ---------- The subarray is {7, 6, 1, 4} with sum 18. ---------- Equal
 * distribution of 18 chocolates among 3 students is 6.
 * 
 * @author arawat
 */
public class DistributeChocolate {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 6, 1, 4, 5 };
		int k = 3;

		System.out.println(findMaxConsecutiveBoxSeq(arr, k));
	}

	private static int findMaxConsecutiveBoxSeq(int[] arr, int k) {

		Map<Integer, Integer> occ = new HashMap<>();
		int[] sum = new int[arr.length];
		int rem, max = 0;
		sum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}

		for (int i = 0; i < sum.length; i++) {
			rem = sum[i] % k;

			if (rem == 0) {
				max = sum[i] > max ? sum[i] : max;
			} else if (occ.get(rem) != null) {
				if (max < sum[i] - sum[occ.get(rem)]) {
					max = sum[i] - sum[occ.get(rem)];
				}
			} else {
				occ.put(rem, i);
			}
		}

		return max / k;
	}
}
