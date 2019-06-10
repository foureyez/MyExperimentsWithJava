package com.foureyez.algorithm.graph;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph {

    private int V;
    List<Integer>[] adj;

    public UndirectedGraph(int v) {
        V = v;
        adj = (List<Integer>[]) new ArrayList[V];

        for (int i = 0; i < v; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }
}
