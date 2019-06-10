package com.foureyez.problem.array;

/**
 * Given a binary matrix, find out the maximum size square sub-matrix with all 1s.
 * Let the given binary matrix be M[R][C]. The idea of the algorithm is to construct an auxiliary size matrix S[][] in which each entry S[i][j] represents size
 * of the square sub-matrix with all 1s including M[i][j] where M[i][j] is the rightmost and bottommost entry in sub-matrix.
 * 
 * @author arawat
 */
public class MaxSizeSquareSubMatrix {
    public static void main(String args[]) {
        int M[][] = {{0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}};

        printMaxSubSquare(M);
    }

    private static void printMaxSubSquare(int[][] m) {
        int r = m.length;
        int c = m[0].length;
        int max_of_s, max_i, max_j, i, j;
        int s[][] = new int[r][c];

        // Inserting the values for first row and column
        for (i = 0; i < r; i++) {
            s[i][0] = m[i][0];
        }

        for (j = 0; j < c; j++) {
            s[0][j] = m[0][j];
        }

        for (i = 1; i < r; i++) {
            for (j = 1; j < c; j++) {
                if (m[i][j] == 1) {
                    s[i][j] = Math.min(s[i - 1][j], Math.min(s[i][j - 1], s[i - 1][j - 1])) + 1;
                } else {
                    s[i][j] = 0;
                }
            }
        }

        /*
         * Find the maximum entry, and indexes of maximum entry
         * in S[][]
         */
        max_of_s = s[0][0];
        max_i = 0;
        max_j = 0;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (max_of_s < s[i][j]) {
                    max_of_s = s[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        System.out.println("Maximum size sub-matrix is: ");
        for (i = max_i; i > max_i - max_of_s; i--) {
            for (j = max_j; j > max_j - max_of_s; j--) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
