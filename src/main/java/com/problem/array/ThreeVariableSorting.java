package com.problem.array;

/**
 * @author arawat
 *         Given an array of 0's, 1's and 2's
 *         sort the array in such a way so that the same elements are together.
 */
public class ThreeVariableSorting {
    public static void main(String args[]) {
        int[] a = new int[] {0, 2, 1, 1, 0, 2, 1, 2, 0};

        threeElementSortTwo(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    private static void threeElementSortOne(int[] a) {

    }

    /**
     * Solved using dutch national flag algorithm.
     * The problem was posed with three colours, here `0', `1' and `2'. The array is divided into four sections:
     * ..
     * a[1..Lo-1] zeroes (red)
     * a[Lo..Mid-1] ones (white)
     * a[Mid..Hi] unknown
     * a[Hi+1..N] twos (blue)
     * ..
     * ..
     * The unknown region is shrunk while maintaining these conditions
     * ..
     * Lo := 1; Mid := 1; Hi := N;
     * while Mid <= Hi do
     * Invariant: a[1..Lo-1]=0 and a[Lo..Mid-1]=1 and a[Hi+1..N]=2; a[Mid..Hi] are unknown.
     * case a[Mid] in
     * 0: swap a[Lo] and a[Mid]; Lo++; Mid++
     * 1: Mid++
     * 2: swap a[Mid] and a[Hi]; Hi--
     */
    private static void threeElementSortTwo(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    swap(a, low, mid);

                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(a, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
