package com.foureyez.algorithm.graph;

public class DepthFirstSearch {

	private boolean[] isVisited;
	private int[] edgeTo; // If v is connected to the source s.
	private int s; // Source (Starting point for DFS.)

	public DepthFirstSearch(Graph G, int s) {
		isVisited = new boolean[G.V()];
		edgeTo = new int[G.V()];
		dfs(G, s);
	}

	// Generate edgeTo data with respect to source passed using DFS.
	public void dfs(Graph G, int v) {
		isVisited[v] = true;

		for (Integer i : G.adj(v)) {
			if (!isVisited[i]) {
				dfs(G, i);
				edgeTo[i] = v;
			}
		}
	}

	public boolean hasPath(int v) {
		return isVisited[v];
	}
}
