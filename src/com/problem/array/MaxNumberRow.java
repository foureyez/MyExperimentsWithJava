package com.problem.array;

/**
 * Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
 * 
 * @author arawat
 */
public class MaxNumberRow {

    public static void main(String[] args) {
        int a[][] = {{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        rowWithMaxOnes(a);
    }

    private static void rowWithMaxOnes(int[][] a) {
        int r = a.length;
        int c = a[0].length;

        int rowIndex = 0;

        int j = findFirstOne(a);
        j = j == -1 ? c - 1 : j;

        for (int i = 1; i < r; i++) {
            while (j >= 0 && a[i][j] == 1) {
                j = j - 1;
                rowIndex = i;
            }
        }
        System.out.println(rowIndex);
    }

    private static int findFirstOne(int[][] a) {

        for (int i = 0; i < a[0].length; i++) {
            if (a[0][i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
