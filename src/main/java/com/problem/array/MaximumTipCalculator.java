package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Rahul and Ankit are the only two waiters in Royal Restaurant. Today, the
 * restaurant received N orders. The amount of tips may differ when handled by
 * different waiters, if Rahul takes the ith order, he would be tipped Ai rupees
 * and if Ankit takes this order, the tip would be Bi rupees. In order to
 * maximize the total tip value they decided to distribute the order among
 * themselves. One order will be handled by one person only. Also, due to time
 * constraints Rahul cannot take more than X orders and Ankit cannot take more
 * than Y orders. It is guaranteed that X + Y is greater than or equal to N,
 * which means that all the orders can be handled by either Rahul or Ankit. Find
 * out the maximum possible amount of total tip money after processing all the
 * orders. Input: � The first line contains one integer, number of test cases. �
 * The second line contains three integers N, X, Y. � The third line contains N
 * integers. The ith integer represents Ai. � The fourth line contains N
 * integers. The ith integer represents Bi. Output: Print a single integer
 * representing the maximum tip money they would receive.
 * 
 * @author arawat
 */
public class MaximumTipCalculator {
	static int N, X, Y;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		int[] A, B;

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			input = br.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			X = Integer.parseInt(input[1]);
			Y = Integer.parseInt(input[2]);
			A = new int[N];
			B = new int[N];

			// Reading values for Waiter 'A'
			input = br.readLine().split(" ");
			for (int i = 0; i < input.length; i++) {
				A[i] = Integer.parseInt(input[i]);
			}

			// Reading values for Waiter 'B'
			input = br.readLine().split(" ");
			for (int i = 0; i < input.length; i++) {
				B[i] = Integer.parseInt(input[i]);
			}

			int sum = calculateMaxTip(A, B);
			System.out.println(sum);
		}
	}

	private static int calculateMaxTip(int[] A, int[] B) {
		int sum = 0;
		Node[] diff = new Node[N];
		int j = 0, k = 0;

		// Store the difference b/w two arrays A & B in diff[] along with the current
		// index so that
		// we can sort the diff array without scrambling the index values.
		for (int i = 0; i < N; i++) {
			int value = A[i] - B[i];

			diff[i] = new Node();
			diff[i].index = i;
			diff[i].value = Math.abs(value);

			// If the diff is negative the value in B array is greater, hence waiter B will
			// be chosen.
			diff[i].waiter = value < 0 ? 'B' : 'A';
		}

		Arrays.sort(diff);

		// Loop the sorted diff[] and check which waiter should pick the tab
		// also checking if the limit of each waiter is not exceeded.
		for (int i = 0; i < N; i++) {

			if ('A' == diff[i].waiter) {
				if (j < X) {
					sum += A[diff[i].index];
					j++;
				} else if (k < Y) {
					sum += B[diff[i].index];
					k++;
				}
			} else if ('B' == diff[i].waiter) {
				if (k < Y) {
					sum += B[diff[i].index];
					k++;
				} else if (j < X) {
					sum += A[diff[i].index];
					j++;
				}

			}
		}
		return sum;
	}

}

// Helper Class to store diff[] array data
class Node implements Comparable<Node> {
	int index;
	int value;
	char waiter;

	@Override
	public int compareTo(Node o) {
		return o.value - this.value;
	}
}
