package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given two sorted arrays of size m and n respectively, find the element that
 * would be at the k’th position of the final sorted array.
 *
 */
public class KTHElement {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			int[] inputArgs = new int[3];
			readAndParseArray(br, inputArgs);
			
			int[] a1 = new int[inputArgs[0]];
			int[] a2 = new int[inputArgs[1]];

			readAndParseArray(br, a1);
			readAndParseArray(br, a2);

			int num = findPosition(a1, a2, inputArgs[2]);

			System.out.println(num);
		}
	

	}

	private static int findPosition(int[] a1, int[] a2, int k) {
		int i = 0, j = 0;
		int n = 0;
		int[] merged = new int[1000];

		while (i<a1.length && j<a2.length) {
			if (a1[i] < a2[j]) {
				merged[n] = a1[i];
				i++;
			} else {
				merged[n] = a2[j];
				j++;
			}
			n++;
		}

		return merged[k - 1];
	}

	private static void readAndParseArray(BufferedReader br, int[] a) throws IOException {
		String[] input = br.readLine().split(" ");

		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(input[i]);
		}
	}
}
