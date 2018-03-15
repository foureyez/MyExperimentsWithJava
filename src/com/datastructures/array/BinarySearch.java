package com.datastructures.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		int num, queries;
		StringBuffer ans = new StringBuffer();

		String strArr[] = br.readLine().split(" ");

		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}

		queries = Integer.parseInt(br.readLine());

		while (--queries >= 0) {
			num = Integer.parseInt(br.readLine());
			ans.append(binarySearch(arr, num) + "\n");
		}
		System.out.println(ans);
	}

	public static int binarySearch(int[] arr, int num) {
		int pos = -1;
		int high, low;
		boolean reverse = false;
		low = 0;
		high = arr.length;
		int mid;
		if (arr[0] > arr[1]) {
			reverse = true;
		}
		while (high >= low) {
			mid = (high + low) / 2;
			if (num == arr[mid]) {
				pos = mid;
				break;
			} else if (num > arr[mid]) {
				if (reverse) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else if (num < arr[mid]) {
				if (reverse) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		if (pos == -1) {
			return pos;
		}
		if (reverse) {
			return arr.length - pos;
		}
		return pos + 1;
	}
}

// sample input
// 100
// 100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76
// 75 74 73 72 71 70 69 68 67 66 65 64 63 62 61 60 59 58 57 56 55 54 53 52 51 50
// 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24
// 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
// 20
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 20