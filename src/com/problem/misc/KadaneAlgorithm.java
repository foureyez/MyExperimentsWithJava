package com.problem.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author arawat
 * To Find out the largest possible sum of the subset of the array
 *
 */
public class KadaneAlgorithm {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, sum, max, maxNegative;
		String[] input;
		int T = Integer.parseInt(br.readLine());

		while (T-- != 0) {
			sum = max = 0;
			n = Integer.parseInt(br.readLine());
			input = br.readLine().split(" ");

			int a[] = new int[n];
			maxNegative = Integer.parseInt(input[0]);
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(input[i]);
				sum += a[i];

				if (maxNegative < a[i]) {
					maxNegative = a[i];
				}

				if (sum > max) {
					max = sum;
				}

				if (sum < 0) {
					sum = 0;
				}
			}

			if (sum == 0)
				System.out.println(maxNegative);
			else
				System.out.println(max);

		}
	}
}
