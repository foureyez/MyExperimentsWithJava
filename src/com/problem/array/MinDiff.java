package com.problem.array;

import com.algorithm.array.MergeSort;
import com.util.ArrayUtil;

/**
 * 
 * Given an unsorted array, find the minimum difference between any pair in
 * given array.
 *
 */
public class MinDiff {

	private static int MAX_VALUE = 999999;

	public static void main(String[] args) {
		int arr[] = { 2, 56, 34, 57, 67, 89 };
		ArrayUtil.printArray(arr);

		System.out.println("Minimum Difference is: " + findMinDiff(arr));
	}

	private static int findMinDiff(int[] arr) {
		int diff = MAX_VALUE, currDiff;

		MergeSort.mergeSort(arr, 0, arr.length - 1);

		for (int i = 1; i < arr.length; i++) {
			currDiff = Math.abs(arr[i] - arr[i - 1]);
			if (currDiff < diff) {
				diff = currDiff;
			}
		}

		return diff;
	}

}
