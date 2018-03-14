package com.learn.ds.arrays;

import com.util.ArrayUtil;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		ArrayUtil.printArray(arr);

		quickSort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		ArrayUtil.printArray(arr);
	}

	public static void quickSort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);

			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1, j, temp;

		for (j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		temp = arr[high];
		arr[high] = arr[i + 1];
		arr[i + 1] = temp;

		return i + 1;
	}

}
