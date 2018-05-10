package com.algorithm.array;

import com.util.ArrayUtil;

public class MergeSort {

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		ArrayUtil.printArray(arr);

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		ArrayUtil.printArray(arr);
	}

	public static void mergeSort(int[] arr, int l, int h) {
		if (l < h) {
			int mid = (l + h) / 2;

			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, h);

			merge(arr, l, mid, h);
		}
	}

	static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

}
