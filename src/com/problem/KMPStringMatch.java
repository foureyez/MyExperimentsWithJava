package com.problem;

public class KMPStringMatch {

    public static void main(String[] args) {
        StringMatch("PiyushChush", "Piy");
        StringMatch("PiyushChush", "ush");
        StringMatch("PiyushChush", "Pip");

    }

    static void StringMatch(String txt, String pat) {
        boolean flag = false;
        int M = pat.length();
        int N = txt.length();

        int[] lps = new int[M];
        lps = computeLPS(pat, M, lps);

        int i = 0, j = 0;

        while (i < N) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == M) {
                flag = true;
                System.out.print("Found match at:" + (i - j) + " ");
                j = lps[j - 1];
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        if (!flag)
            System.out.println("No Match Found");
        System.out.println();
    }

    static int[] computeLPS(String pat, int M, int[] lps) {

        lps[0] = 0;
        int i = 1;
        int len = 0;
        while (i < M) {

            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }

            }
        }

        return lps;
    }

}
