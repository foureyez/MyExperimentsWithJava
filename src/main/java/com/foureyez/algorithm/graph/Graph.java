package com.foureyez.algorithm.graph;

import java.util.LinkedList;

public class Graph {
	private final int V;
	private int E;
	private LinkedList<Integer>[] adj;

	public Graph(int V) {
		this.V = V;
		adj = (LinkedList<Integer>[]) new LinkedList[V];

		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int a, int b) {
		adj[a].add(b);
		adj[b].add(a);
		E++;
	}

	public LinkedList<Integer> adj(int v) {
		return adj[v];
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}
}
