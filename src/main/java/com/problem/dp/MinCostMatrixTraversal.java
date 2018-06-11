package com.problem.dp;

public class MinCostMatrixTraversal {

    public static void main(String args[]) {
        int costMatrix[][] = {{1, 2, 3}, {4, 8, 2}, {1, 5, 3}};
        System.out.println("minimum cost to reach (2,2) = " + minCost(costMatrix, 2, 2));
    }

    private static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    private static int minCost(int costMatrix[][], int m, int n) {
        int i, j;
        int totalCostMatrix[][] = new int[m + 1][n + 1];

        totalCostMatrix[0][0] = costMatrix[0][0];

        for (i = 1; i <= m; i++)
            totalCostMatrix[i][0] = totalCostMatrix[i - 1][0] + costMatrix[i][0];

        for (j = 1; j <= n; j++)
            totalCostMatrix[0][j] = totalCostMatrix[0][j - 1] + costMatrix[0][j];

        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                totalCostMatrix[i][j] = min(totalCostMatrix[i - 1][j - 1], totalCostMatrix[i - 1][j], totalCostMatrix[i][j - 1]) + costMatrix[i][j];

        return totalCostMatrix[m][n];
    }
}
