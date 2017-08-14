package com.problem.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, num = 0,i;
		String[] input;
		int[] a;
		int t = Integer.parseInt(br.readLine());

		while (t-- != 0) {

			n = Integer.parseInt(br.readLine());
			input = br.readLine().split(" ");
			a = new int[n];
			for (i = 0; i < n - 1; i++) {
				a[i] = Integer.parseInt(input[i]);
			}

			for (i = 0; i < n - 1; i++) {
				if( i + 1 != a[i]){
					num = i+1;
					break;
				}
			}
			
			if(i == n-1){
				num = i+1;
			}

			System.out.println(num);

		}
	}

}
