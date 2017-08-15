package com.problem.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author arawat
 * Find out the first non repeating character in a given string.
 *
 */
public class FirstNonRepeatingChar {

	// Can also use Hashmap for quick solution

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		int[] count = new int[256];

		for (int i = 0; i < input.length(); i++) {
			count[(int) input.charAt(i)]++;
		}

		for (int i = 0; i < input.length(); i++) {
			if (count[(int) input.charAt(i)] == 1) {
				System.out.println(input.charAt(i));
				break;
			}
		}

	}
}
