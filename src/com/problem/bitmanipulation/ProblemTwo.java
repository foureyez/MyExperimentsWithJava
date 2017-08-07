package com.problem.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author abhir To find if the ith bit is set or not(1 or 0)
 *
 */
public class ProblemTwo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int i = Integer.parseInt(br.readLine());
		System.out.println(checkBit(n, i));
	}

	private static boolean checkBit(int n, int i) {
		boolean isSet = false;

		if (n != 0 && ((n & (1 << i)) != 0))
			return true;
		return false;
	}

}
