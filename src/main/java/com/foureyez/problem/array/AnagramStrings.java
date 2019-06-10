package com.foureyez.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * Given two strings A and B find out of they are anagrams or not.
 *
 */
public class AnagramStrings {

	public static void main(String[] args) throws IOException {
		String lineA, lineB;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		lineA = br.readLine();
		lineB = br.readLine();

		System.out.println(checkAnagramStrings(lineA, lineB));
	}

	private static boolean checkAnagramStrings(String a, String b) {
		int count[] = new int[256];

		if (a.length() != b.length()) {
			return false;
		} else {
			for (int i = 0; i < a.length(); i++) {
				count[(int) a.charAt(i)]++;
			}

			for (int i = 0; i < b.length(); i++) {
				count[(int) b.charAt(i)]--;
			}

			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0) {
					return false;
				}
			}

			return true;
		}
	}

}
