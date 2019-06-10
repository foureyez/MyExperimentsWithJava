package com.foureyez.problem.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * There are n stairs, a person standing at the bottom wants to reach the top.
 * The person can climb either 1 stair or 2 stairs at a time. Count the number
 * of ways, the person can reach the top.
 */
public class StairCase {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		while (testCases-- > 0) {
			int flightCount = Integer.parseInt(br.readLine());

			int ways = waysToClimb(flightCount);
			System.out.println(ways);
		}
	}

	private static int waysToClimb(int n) {
		if (n == 2 || n == 1 || n == 0) {
			return n;
		}
		return waysToClimb(n - 1) + waysToClimb(n - 2);
	}
}
