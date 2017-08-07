package com.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {

	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, i, a[], zeroCount, oneCount, twoCount;
		String input[];
		int t = Integer.parseInt(br.readLine());

		while (t-- != 0) {
			int temp;
			zeroCount = oneCount = twoCount = 0;
			n = Integer.parseInt(br.readLine());
			a = new int[n];
			input = br.readLine().split(" ");
			
			for (i = 0; i < n; i++) {
				a[i] = Integer.parseInt(input[i]);
			}
		}

	}
}
