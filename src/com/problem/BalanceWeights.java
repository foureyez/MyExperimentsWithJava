package com.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalanceWeights {

	static int diff;
	static int dp[];
	
	public static void main(String[] args) throws IOException {
		String input[];
		int weights[];
		
		int n, x, sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		weights = new int[n];
		dp = new int[n];
		input = br.readLine().split(" ");
		x = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			weights[i] = Integer.parseInt(input[i]);
			sum += weights[i];
		}

		int sol = isBalance(weights, n, 0, sum, x);

		if (sol == -1) {
			System.out.println("Perfectly Balanced within " + diff);
		} else if (sol == 1) {
			System.out.println("Perfectly Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}

	static int isBalance(int[] weights, int n, int left, int right, int x) {
		int leftTree;
		int rightTree;
		
		if (Math.abs(left - right) == 0) {
			return 1;
		}

		if (Math.abs(left - right) <= x) {
			diff = Math.abs(left - right);
			return -1;
		}

		if (n == 0 && Math.abs(left - right) > x) {
			return 0;
		}

		leftTree = isBalance(weights, n - 1, left + weights[n - 1] + 1, right - weights[n - 1], x);
		rightTree = isBalance(weights, n - 1, left, right, x);
		
		if (leftTree == 1 || rightTree == 1) {
			return 1;
		} else if (leftTree == -1 || rightTree == -1) {
			return -1;
		}
		return 0;
	}
}
