package com.algorithm.graph;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private boolean[] isVisited;

    public DepthFirstSearch(int V) {
        isVisited = new boolean[V];
    }

    public int search(List<Integer>[] adj, int s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {

            int curr = stack.pop();

            if (isVisited[curr]) {
                continue;
            }

            isVisited[curr] = true;

            for (Integer a : adj[curr]) {
                if (!isVisited[a]) {
                    stack.push(a);
                }
            }
        }
        return 0;
    }
}
