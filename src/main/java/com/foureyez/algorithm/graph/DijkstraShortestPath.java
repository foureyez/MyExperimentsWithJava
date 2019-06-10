package com.foureyez.algorithm.graph;

import java.util.List;

public class DijkstraShortestPath {

    /**
     * This method gives a shorted path array using Djikstra's algorithm by consuming a graph in the form of 2-D array.
     * 
     * @param graph - 2D array of weighted graph.
     * @param source - Source vertex from which the shortest distance of all the nodes is calculated.
     * @return Array dist[V] containing the minimum distance of each vertex from the source.
     */
    public int[] findShortestPath(int[][] graph, int source) {

        int V = graph.length;
        int dist[] = new int[V];
        boolean[] isVisited = new boolean[V];

        /*
         * Set Each vertex as not visited and
         * distance of each vertex from source is Infinity(theoretically).
         */
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            isVisited[i] = false;
        }

        // Distance of source from itself is zero.
        dist[source] = 0;

        // Find shortest path for all remaining vertices.
        for (int i = 0; i < V - 1; i++) {

            int u = getMinimumDistance(dist, isVisited);

            isVisited[u] = true;
            for (int v = 0; v < V; v++) {
                if (!isVisited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        return null;
    }

    /**
     * @param graph - Array of arrayList to define the adjacency list for each vertex.
     * @param source - Source vertex from which the shortest distance of all the nodes is calculated.
     * @return Array dist[V] containing the minimum distance of each vertex from the source.
     */
    public int[] findShortestPath(List<Integer>[] graph, int source) {
        return null;
    }

    private int getMinimumDistance(int[] dist, boolean[] isVisited) {

        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (dist[i] < min && !isVisited[i]) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
