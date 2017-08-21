package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalTriangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n, i, j, arr[][];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];

		for (i = 0; i <= n; i++) {
			for (j = 0; j < i; j++) {
				if (j == 0 || j == i) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
