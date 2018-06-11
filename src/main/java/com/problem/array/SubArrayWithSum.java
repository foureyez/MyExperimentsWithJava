package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given an unsorted array of integers, find a subarray which adds to a given
 * number. If there are more than one subarrays with sum as the given number,
 * print any of them.
 *
 */
public class SubArrayWithSum {

	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] input;

		while (t-- != 0) {
			input = br.readLine().split(" ");

			int n = Integer.parseInt(input[0]);
			int sum = Integer.parseInt(input[1]);

			int a[] = new int[n];
			input = br.readLine().split(" ");

			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(input[i]);
			}

			findSubArrayWithSumOne(a, sum);
			findSubArrayWithSumTwo(a, sum);
		}
	}

	/**
	 * Checks the sum for every possible subarray of the given array.<br>
	 * O(N2) complexity
	 */
	private static void findSubArrayWithSumOne(int[] a, int sum) {
		int n = a.length;
		int currSum = 0, j = -1, i;

		for (i = 0; i < n; i++) {
			currSum = a[i];
			if (currSum == sum) {
				j = i;
				break;
			}

			for (j = i + 1; j < n; j++) {
				currSum += a[j];

				if (currSum == sum) {
					break;
				}
			}

			if (currSum == sum) {
				break;
			}

		}

		if (sum != currSum) {
			System.out.println("No subarray with given sum exists");
		} else {
			System.out.println("Sum Found between " + i + " and " + j);
		}
	}

	/**
	 * The idea is to maintain sum of elements encountered so far in a variable (say
	 * curr_sum). Let the given number is sum. Now for each element, we check if
	 * curr_sum – sum exists in the map or not. If we found it in the map that
	 * means, we have a subarray present with given sum, else we insert curr_sum
	 * into the map and proceed to next element. If all elements of the array are
	 * processed and we didn’t find any subarray with given sum, then subarray
	 * doesn’t exists.The idea is to maintain sum of elements encountered so far in
	 * a variable (say curr_sum). Let the given number is sum. Now for each element,
	 * we check if curr_sum – sum exists in the map or not. If we found it in the
	 * map that means, we have a subarray present with given sum, else we insert
	 * curr_sum into the map and proceed to next element. If all elements of the
	 * array are processed and we didn’t find any subarray with given sum, then
	 * subarray doesn’t exists.<br>
	 * O(N) complexity.<br>
	 * 
	 * NOTE : Will not work for all negative elements.
	 * 
	 */
	private static void findSubArrayWithSumTwo(int[] a, int sum) {

		Map<Integer, Integer> map = new HashMap<>();
		int currSum = 0;

		for (int i = 0; i < a.length; i++) {
			currSum += a[i];

			if (currSum == sum) {
				System.out.println("Sum Found between 0 and " + i);
				return;
			}

			if (map.containsKey(sum - currSum)) {
				System.out.println("Sum Found between " + map.get(sum - currSum) + 1 + " and " + i);
				return;
			}

			map.put(currSum, i);

		}

		System.out.println("No subarray with given sum exists");
	}
}
