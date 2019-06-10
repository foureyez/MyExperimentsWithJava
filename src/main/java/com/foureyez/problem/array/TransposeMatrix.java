package com.foureyez.problem.array;

import java.util.Date;

public class TransposeMatrix {
	public static void main(String args[]) {
	    System.out.println(new Date());
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		transpose(a);
	}

	private static void transpose(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[0].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
