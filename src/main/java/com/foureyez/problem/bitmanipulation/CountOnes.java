package com.foureyez.problem.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * Counting the number of 1's in a number.
 *
 */
public class CountOnes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.println(countOnes(n));
	}

	private static int countOnes(int n) {
		int count = 0;
		while (n > 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}

}
