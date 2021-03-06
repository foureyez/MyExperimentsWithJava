package com.foureyez.problem.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * To find if the ith bit is set or not(1 or 0).<br>
 * 1) Left shift given number 1 by k-1 to create a number that has only set bit
 * as k-th bit. temp = 1 << (k-1) <br>
 * 2) If bitwise AND of n and temp is non-zero, then result is SET else result
 * is NOT SET.
 *
 */
public class BitSet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int i = Integer.parseInt(br.readLine());
		System.out.println(checkBit(n, i));
	}

	private static boolean checkBit(int n, int i) {
		if (n != 0 && ((n & (1 << i)) != 0))
			return true;
		return false;
	}

}
