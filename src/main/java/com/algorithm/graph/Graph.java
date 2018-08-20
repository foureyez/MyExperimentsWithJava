package com.algorithm.graph;

import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer> adj[];
    private boolean visited[];
    private int V;

    public Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int a, int b) {
        adj[a].add(b);
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    public int getV() {
        return V;
    }

    public boolean[] isVisited() {
        return visited;
    }

    public void setVisited(int i, boolean status) {
        visited[i] = status;
    }
    
    public void resetVisited() {
        visited = new boolean[V];
    }
}
