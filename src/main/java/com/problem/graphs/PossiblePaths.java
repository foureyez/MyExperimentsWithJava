package com.problem.graphs;

import com.algorithm.graph.Graph;

/**
 * Find the number of possible paths that can be taken from point A to point B
 * 
 * @author arawat
 */
public class PossiblePaths {
	public static void main(String[] args) {
		Graph G = new Graph(6);

		G.addEdge(0, 1);
		G.addEdge(0, 3);
		G.addEdge(2, 0);
		G.addEdge(2, 1);
		G.addEdge(1, 3);

		int s = 2, d = 3;
		boolean[] visited = new boolean[G.V()];
		System.out.println(countPaths(G, visited, s, d));
	}

	private static int countPaths(Graph G, boolean[] visited, int s, int d) {
		return countPathsRecursion(G, visited, s, d, 0);
	}

	private static int countPathsRecursion(Graph G, boolean[] visited, int v, int d, int count) {

		visited[v] = true;

		if (v == d) {
			count++;
		} else {
			for (int i : G.adj(v)) {
				if (!visited[i]) {
					count = countPathsRecursion(G, visited, i, d, count);
				}
			}
		}

		visited[v] = false;

		return count;
	}
}
