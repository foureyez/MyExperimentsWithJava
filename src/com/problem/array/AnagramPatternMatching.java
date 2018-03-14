package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given a text and a pattern, write a function that prints all occurrences of
 * pattern and its permutations (or anagrams) in text.
 *
 */
public class AnagramPatternMatching {
	private static final int MAX = 256;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		String pattern = br.readLine();

		findPattern(text, pattern);
	}

	public static void findPattern(String text, String pattern) {
		int[] countText = new int[MAX];
		int[] countPattern = new int[MAX];

		int n = text.length();
		int m = pattern.length();
		System.out.println(n + ":" + m);

		for (int i = 0; i < m; i++) {
			countText[text.charAt(i)]++;
			countPattern[pattern.charAt(i)]++;
		}

		for (int i = m; i < n; i++) {

			if (compare(countText, countPattern)) {
				System.out.println("Pattern found at: " + (i - m));
			}

			countText[text.charAt(i)]++;
			countText[text.charAt(i - m)]--;
		}

		if (compare(countText, countPattern)) {
			System.out.println("Pattern found at: " + (n - m));
		}

	}

	private static boolean compare(int[] a, int[] b) {
		for (int i = 0; i < MAX; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}

		return true;
	}
}
