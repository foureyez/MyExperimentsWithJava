package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * Pascal’s triangle is a triangular array of the binomial coefficients. Every
 * entry in a line is value of a Binomial Coefficient. The value of ith entry in
 * line number line is C(line, i). The value can be calculated using following
 * formula.
 * 
 * <pre>
 * C(line, i) = line! / ( (line-i)! * i! )
 * </pre>
 */
public class PascalTriangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		generatePascalTriangleOne(n);
		generatePascalTriangleTwo(n);
	}

	/**
	 * We observe that every entry is sum of the two values above it. So we can
	 * create a 2D array that stores previously generated values. To generate a
	 * value in a line, we can use the previously stored values from array.
	 * 
	 */
	private static void generatePascalTriangleOne(int lines) {
		int[][] arr = new int[lines + 1][lines + 1];

		for (int i = 0; i < lines; i++) {
			for (int j = 0; j <= i; j++) {
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

	/**
	 * We know that ith entry in a line number line is Binomial Coefficient C(line,
	 * i) and all lines start with value 1. The idea is to calculate C(line, i)
	 * using C(line, i-1). It can be calculated in O(1) time using the
	 * following.<br>
	 * 
	 * C(line, i) = line! / ( (line-i)! * i! ) C(line, i-1) = line! / ( (line - i +
	 * 1)! * (i-1)! )<br>
	 * 
	 * We can derive following expression from above two expressions.<br>
	 * C(line, i) = C(line, i-1) * (line - i + 1) / i<br>
	 * 
	 * So C(line, i) can be calculated from C(line, i-1) in O(1) time.
	 * 
	 */
	private static void generatePascalTriangleTwo(int lines) {
		for (int i = 1; i <= lines; i++) {

			int C = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(C + " ");
				C = C * (i - j) / j;
			}
			System.out.println();
		}
	}

}
