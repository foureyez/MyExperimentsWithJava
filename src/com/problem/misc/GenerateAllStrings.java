package com.problem.misc;

import com.problem.array.ArrayUtil;

/**
 * Generate all possible strings of 0's and 1's
 * 
 * @author arawat
 *
 */
public class GenerateAllStrings {
	static int a[];

	public static void main(String[] args) {
		int n = 3;
		a = new int[n];
		generateAllPossibleString(n);
	}

	private static void generateAllPossibleString(int n) {
		if (n < 1) {
			ArrayUtil.printArray(a);
		}else {
			a[n-1] = 0;
			generateAllPossibleString(n-1);
			a[n-1] = 1;
			generateAllPossibleString(n-1);
		}
	}
}
