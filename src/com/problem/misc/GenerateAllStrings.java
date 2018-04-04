package com.problem.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.util.ArrayUtil;

/**
 * Generate all possible strings of 0's and 1's.
 */
public class GenerateAllStrings {
	private static int a[];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		a = new int[n];
		generateAllPossibleStringRecursive(n);
		System.out.println("=================");
		generateAllPossibleString(n);
	}

	private static void generateAllPossibleStringRecursive(int n) {
		if (n < 1) {
			ArrayUtil.printArray(a);
		} else {
			a[n - 1] = 0;
			generateAllPossibleStringRecursive(n - 1);
			a[n - 1] = 1;
			generateAllPossibleStringRecursive(n - 1);
		}
	}

	/**
	 * Similar to problem "GenerateAllSubsets". <br>
	 * Better approach according to me.
	 */
	private static void generateAllPossibleString(int n) {
		a = new int[n];

		for (int i = 0; i < (1 << n); i++) {
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) == 0) {
					a[j] = 0;
				} else {
					a[j] = 1;
				}
			}

			ArrayUtil.printArray(a);
		}
	}
}
