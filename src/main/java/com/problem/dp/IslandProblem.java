package com.problem.dp;

/**
 * Given a boolean 2D matrix, find the number of islands. A group of connected
 * 1's forms an island. For example, the below matrix contains 5 islands.
 *
 */
public class IslandProblem {

	private int ROW = 5;
	private int COL = 5;

	private boolean[][] isVisited = new boolean[5][5];

	public static void main(String args[]) {
		int[][] a = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } };

		IslandProblem i = new IslandProblem();
		i.findIslands(a);
	}

	private void findIslands(int[][] a) {
		int count = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a[i][j] == 1 && !isVisited[i][j]) {
					performDFS(a, i, j, isVisited);
					count++;
				}
			}
		}

		System.out.println(count);
	}

	private void performDFS(int[][] a, int row, int col, boolean[][] isVisited) {
		int[] adjRow = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] adjCol = { -1, 0, 1, -1, 1, 0, -1, 1 };

		isVisited[row][col] = true;

		for (int i = 0; i < 8; i++) {
			if (isValid(a, row + adjRow[i], col + adjCol[i], isVisited)) {
				performDFS(a, row + adjRow[i], col + adjCol[i], isVisited);
			}
		}
	}

	private boolean isValid(int[][] a, int row, int col, boolean[][] isVisited) {
		if (row >= 0 && col >= 0 && row < ROW && col < COL && a[row][col] == 1 && !isVisited[row][col]) {
			return true;
		}
		return false;
	}
}
