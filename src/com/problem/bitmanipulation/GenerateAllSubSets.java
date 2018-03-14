package com.problem.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.util.StringUtils;

public class GenerateAllSubSets {
	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		char[] a = StringUtils.toCharArray(input);

		generateAllSubsets(a);
	}

	private static void generateAllSubsets(char[] a) {
		int n = a.length;

		/**
		 * Left shift 1 to n positions (equivalent to 2^n).<br>
		 * As we will get 2^n subsets for a n size set.
		 */
		int powNum = 1 << n;

		for (int i = 0; i < powNum; i++) {

			System.out.print("{");

			for (int j = 0; j < n; j++) {

				/**
				 * Checking if the jth bit is 1 or not in i.<br>
				 * Check BitSet problem for explaination.
				 */
				if ((i & (1 << j)) != 0) {
					System.out.print(a[j] + ",");
				}
			}
			System.out.println("}");
		}
	}

}
