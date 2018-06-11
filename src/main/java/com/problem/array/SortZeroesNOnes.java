package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author arawat 
 * Given an array of zeroes and ones separate out the zeroes and
 * ones from that array.
 *
 */
public class SortZeroesNOnes {
	public static void main(String args[]) throws IOException {
		String input[];
		int i, left, right, n, temp, arr[];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		input = br.readLine().split(" ");
		n = input.length;

		arr = new int[n];
		left = 0;
		right = n - 1;

		for (i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}

		while (left < right) {

			if (arr[left] == 0) {
				left++;
			}

			if (arr[right] == 1) {
				right--;
			}

			if (left < right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}

		}

		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
