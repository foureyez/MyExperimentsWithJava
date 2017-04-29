package javaexp.practise.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase >= 0) {
            String[] rowsAndBlocks = br.readLine().split(" ", 2);

            int rowNum = Integer.parseInt(rowsAndBlocks[0]);
            int blockNum = Integer.parseInt(rowsAndBlocks[1]);
            int[][] array = new int[rowNum][3];
            int[][] adjMatrix = new int[rowNum][3];

            for (int i = 0; i < blockNum; i++) {
                String[] columns = br.readLine().split(" ");
                int j = Integer.parseInt(columns[0]);
                int k = Integer.parseInt(columns[1]);

                adjMatrix[j - 1][k - 1] = -1;
            }

            for (int i = 0; i < rowNum; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(adjMatrix[i][j] + "\t");
                }
                System.out.println();
            }
            testCase--;
        }
    }
}
