package com.algorithm.sort;

public class QuickSort {

	public void sort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);

			sort(arr, p, q - 1);
			sort(arr, q + 1, r);
		}
	}

	private int partition(int[] arr, int low, int high) {

		int pivot = arr[high]; // Partitioning using pivot element as the last element of the array.
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
