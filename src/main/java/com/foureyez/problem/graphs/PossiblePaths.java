package com.foureyez.problem.graphs;

import com.foureyez.algorithm.graph.DepthFirstSearch;
import com.foureyez.api.graph.Graph;

/**
 * Find the number of possible paths that can be taken from point A to point B
 * 
 * @author arawat
 */
public class PossiblePaths {
	public static void main(String[] args) {
		Graph<Integer> G = new Graph<Integer>(6);

		G.addEdge(0, 1);
		G.addEdge(0, 3);
		G.addEdge(2, 0);
		G.addEdge(2, 1);
		G.addEdge(1, 3);

		int s = 2, d = 3;

		System.out.println(countPaths(G, s, d));
	}

	private static int countPaths(Graph<Integer> G, int s, int d) {
		return countPathsRecursion(G, s, d, 0);
	}

	private static int countPathsRecursion(Graph<Integer> G, int v, int d, int count) {

		G.setVisited(v, true);

		if (v == d) {
			count++;
		} else {

			for (Integer i : G.getNeighbours(v)) {
				if (!G.isVisited(i)) {
					count = countPathsRecursion(G, i, d, count);
				}
			}
		}

		G.setVisited(v, false);

		return count;
	}
}
