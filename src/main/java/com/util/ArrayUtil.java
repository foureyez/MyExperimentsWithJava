package com.util;

public class ArrayUtil {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String getArrayAsString(int[] arr) {
        StringBuffer arrayString = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            arrayString.append(arr[i] + " ");
        }
        return arrayString.toString();
    }

    public static int[][] generate2DArray(int m, int n) {
        int a[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) Math.random() * 10;
            }
        }
        return a;
    }
}
