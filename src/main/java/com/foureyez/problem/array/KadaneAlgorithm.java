package com.foureyez.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * Find the sum of contiguous subarray within a one-dimensional array of numbers
 * which has the largest sum.
 *
 */
public class KadaneAlgorithm {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, currMax, overallMax, maxElement;
		String[] input;
		int start = 0, end = 0;

		int T = Integer.parseInt(br.readLine());

		while (T-- != 0) {
			n = Integer.parseInt(br.readLine());
			input = br.readLine().split(" ");

			int a[] = new int[n];
			maxElement = Integer.parseInt(input[0]);
			currMax = overallMax = 0;

			for (int i = 0; i < n; i++) {

				a[i] = Integer.parseInt(input[i]);
				currMax += a[i];

				if (a[i] > maxElement) {
					maxElement = a[i];
					end = i;
				}

				if (currMax < 0) {
					start = i;
					end = i;
					currMax = 0;
				} else if (overallMax < currMax) {
					overallMax = currMax;
					end = i;
				}
			}

			/**
			 * If all the elements in the array are negative
			 */
			if (currMax == 0) {
				System.out.println(maxElement + " : " + start + " : " + end);
			} else {
				System.out.println(overallMax + " : " + start + " : " + end);
			}

        }
    }
}
