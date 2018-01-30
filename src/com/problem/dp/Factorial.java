package com.problem.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 * @author arawat
 * Finding the factorial of a number using memorization
 *
 */
public class Factorial {
	
	static long mod = 1000000007;
	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			long fact = getFactorial(n);
			System.out.println(fact);
		}
	}

	private static long getFactorial(int n) {
		long cache[] = new long[n+1];
		cache[0] = 1;
		for (int i = 1; i <= n; i++) {
			cache[i] = (i * cache[i-1])%mod; 
		}
		return cache[n];
	}
}
