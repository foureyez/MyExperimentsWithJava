package com.problem.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosestPalindrome {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i;
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            i = 0;

            while (true) {
                if (isPalindrome(n - i)) {
                    System.out.println(n - i);
                    break;
                } else if (isPalindrome(n + i)) {
                    System.out.println(n + i);
                    break;
                }
                i++;
            }

        }
    }

    private static boolean isPalindrome(int n) {

        String m = n + "";
        int l = m.length() - 1;
        int i = 0;

        if (l <= 0) {
            return true;
        }

        while (i <= l - i) {
            if (m.charAt(i) != m.charAt(l - i)) {
                return false;
            }
            i++;
        }

        return true;
    }
}
