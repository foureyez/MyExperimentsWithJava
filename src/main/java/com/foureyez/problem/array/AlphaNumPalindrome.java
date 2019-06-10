package com.foureyez.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Jarvis is weak in computing palindromes for Alphanumeric characters. While
 * Ironman is busy fighting Thanos, he needs to activate sonic punch but Jarvis
 * is stuck in computing palindromes. You are given a string containing the
 * alphanumeric character. Find whether the string is palindrome or not. If you
 * are unable to solve it then it may result in the death of Iron Man. Input:
 * The first line of the input contains t, the number of test cases. Each line
 * of the test case contains string 'S'. Output: Each new line of the output
 * contains "YES" if the string is palindrome and "NO" if the string is not a
 * palindrome.
 * 
 * @author arawat
 */
public class AlphaNumPalindrome {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int t;

		t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			input = br.readLine();

			String result = isPalindrome(input.toCharArray()) ? "YES" : "NO";
			System.out.println(result);
		}

	}

	private static boolean isPalindrome(char[] str) {
		int i = 0, j = str.length - 1;

		while (i <= j) {

			boolean isAlphai = isAlphaNum(str[i]);
			boolean isAlphaj = isAlphaNum(str[j]);

			if (isAlphai && isAlphaj) {
				if (Character.toLowerCase(str[i]) != Character.toLowerCase(str[j])) {
					return false;
				}
				i++;
				j--;
			} else {
				if (!isAlphai) {
					i++;
				}

				if (!isAlphaj) {
					j--;
				}
			}
		}
		return true;
	}

	private static boolean isAlphaNum(char c) {
		if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
			return true;
		}
		return false;
	}
}
