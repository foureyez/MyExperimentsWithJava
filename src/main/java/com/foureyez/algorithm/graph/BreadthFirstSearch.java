package com.foureyez.algorithm.graph;

import java.util.LinkedList;
import java.util.List;

public class BreadthFirstSearch {
    private boolean[] isVisited;

    public BreadthFirstSearch(int V) {
        isVisited = new boolean[V];
    }

    public int search(List<Integer>[] adj, int s) {
        List<Integer> queue = new LinkedList<>();
        queue.add(s);

        while (!queue.isEmpty()) {

            int curr = queue.remove(0);

            if (isVisited[curr]) {
                continue;
            }

            isVisited[curr] = true;

            for (Integer a : adj[curr]) {
                if (!isVisited[a]) {
                    queue.add(a);
                }
            }
        }
        return 0;
    }
}
