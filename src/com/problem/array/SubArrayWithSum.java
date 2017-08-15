package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author arawat
 * Given an array and a sum find out the subarray of the
 * given array which sums up to that number
 *
 */
public class SubArrayWithSum {

	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, sum, i, j = -1, currSum = 0;
		String[] input;
		int a[];
		int t = Integer.parseInt(br.readLine());

		while (t-- != 0) {
			input = br.readLine().split(" ");
			n = Integer.parseInt(input[0]);
			sum = Integer.parseInt(input[1]);
			a = new int[n];

			input = br.readLine().split(" ");

			for (i = 0; i < n; i++) {
				a[i] = Integer.parseInt(input[i]);
			}

			for (i = 0; i < n; i++) {
				currSum = a[i];
				if (currSum == sum) {
					j = i;
					break;
				}

				for (j = i + 1; j < n; j++) {
					currSum += a[j];
					if (currSum > sum) {
						break;
					}

					if (currSum == sum) {
						break;
					}
				}

				if (currSum == sum) {
					break;
				}

			}

			if (sum != currSum) {
				System.out.println(-1);
			} else {
				System.out.println(i + 1 + " " + (int) (j + 1));
			}
		}
	}
}
