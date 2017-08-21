package com.learn.ds.arrays;

public class QuickSort {

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		quickSort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}

	private static void quickSort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}
	}

	private static int partition(int[] arr, int p, int r) {
		int temp, x = arr[r];
		int i = p - 1;

		for (int j = p; j < r; j++) {
			if (arr[j] <= x) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		temp = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = temp;

		return i + 1;
	}

}
