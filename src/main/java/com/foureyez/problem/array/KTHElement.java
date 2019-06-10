package com.foureyez.problem.array;

import java.io.IOException;

import com.foureyez.util.InputReader;

/**
 * Given two sorted arrays of size m and n respectively, find the element that
 * would be at the k’th position of the final sorted array.
 */
public class KTHElement {
    public static void main(String args[]) throws NumberFormatException, IOException {

        InputReader inputReader = new InputReader();
        int t = inputReader.getInt();

        while (t-- > 0) {
            int[] inputArgs = inputReader.getIntArray();

            int[] a1 = new int[inputArgs[0]];
            int[] a2 = new int[inputArgs[1]];

            a1 = inputReader.getIntArray();
            a2 = inputReader.getIntArray();

            int num = findPosition(a1, a2, inputArgs[2]);

            System.out.println(num);
        }

    }

    private static int findPosition(int[] a1, int[] a2, int k) {
        int i = 0, j = 0;
        int n = 0;
        int[] merged = new int[a1.length + a2.length];

        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                merged[n] = a1[i];
                i++;
            } else {
                merged[n] = a2[j];
                j++;
            }
            n++;
        }

        while (i < a1.length) {
            merged[n++] = a1[i++];
        }

        while (j < a2.length) {
            merged[n++] = a2[j++];
        }

        return merged[k - 1];
    }
}
