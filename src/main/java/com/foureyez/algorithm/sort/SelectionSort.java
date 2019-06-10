package com.foureyez.algorithm.sort;

public class SelectionSort {
	public void sort(int[] arr) {
		int minIndex;
		for (int i = 0; i < arr.length; i++) {

			minIndex = i;
			// Find the index of the minimum element in the array
			for (int j = i; j < arr.length; j++) {
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}

			// Swap that element with ith element
			swap(arr, i, minIndex);
		}
	}

	private void swap(int[] arr, int i, int j) {
		int tmp;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
