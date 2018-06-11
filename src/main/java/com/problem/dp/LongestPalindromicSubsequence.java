package com.problem.dp;

import java.io.IOException;

import com.util.InputReader;

/**
 * @author foureyez
 *         Given a sequence, find the length of the longest palindromic subsequence in it.<br>
 *         If the given sequence is “BBABCBCAB”, then the output should be 7 as “BABCBAB” is the <br>
 *         longest palindromic subseuqnce in it. “BBBBB” and “BBCBB” are also palindromic subsequences <br>
 *         of the given sequence, but not the longest ones.
 *         <br>
 *         // Every single character is a palindrome of length 1
 *         L(i, i) = 1 for all indexes i in given sequence
 *         // IF first and last characters are not same
 *         If (X[i] != X[j]) L(i, j) = max{L(i + 1, j),L(i, j - 1)}
 *         // If there are only 2 characters and both are same
 *         Else if (j == i + 1) L(i, j) = 2
 *         // If there are more than two characters, and first and last
 *         // characters are same
 *         Else L(i, j) = L(i + 1, j - 1) + 2
 */
public class LongestPalindromicSubsequence {

    public static void main(String args[]) throws IOException {
        InputReader inputReader = new InputReader();
        String input = inputReader.getLine();

        System.out.println(longestPlaindromicSubsequenceDP(input.toCharArray()));
        System.out.println(longestPlaindromicSubsequence(input.toCharArray(), 0, input.length() - 1));
    }

    /**
     * Basic Recursive Approach
     */
    public static int longestPlaindromicSubsequence(char[] input, int i, int j) {

        if (i == j) {
            return 1;
        }

        if (input[i] == input[j] && i == j - 1) {
            return 2;
        }

        if (input[i] == input[j]) {
            return longestPlaindromicSubsequence(input, i + 1, j - 1) + 2;
        }

        return Math.max(longestPlaindromicSubsequence(input, i + 1, j), longestPlaindromicSubsequence(input, i, j - 1));
    }

    /**
     * Dynamic Programming Approach
     * (Using Memoization for storing the result of overlapping subproblems)
     */
    private static int longestPlaindromicSubsequenceDP(char[] input) {
        int i = 0, j = 0;
        int n = input.length;
        int a[][] = new int[n][n];
        int subLength;

        for (i = 0; i < n; i++) {
            a[i][i] = 1;
        }

        for (subLength = 2; subLength <= n; subLength++) {
            for (i = 0; i < n - subLength + 1; i++) {

                j = i + subLength - 1;

                if (input[i] == input[j] && subLength == 2) {
                    a[i][j] = 2;
                } else if (input[i] == input[j]) {
                    a[i][j] = a[i + 1][j - 1] + 2;
                } else {
                    a[i][j] = Math.max(a[i + 1][j], a[i][j - 1]);
                }
            }
        }

        return a[0][n - 1];
    }
}
