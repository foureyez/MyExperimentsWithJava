package com.problem.graphs;

import java.util.Iterator;
import java.util.Stack;

import com.algorithm.graph.Graph;

/**
 * Find the number of possible paths that can be taken from point A to point B
 * 
 * @author arawat
 */
public class PossiblePaths {
    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(1, 3);

        int s = 2, d = 3;
        System.out.println(countPaths(graph, s, d));
    }

    private static int countPaths(Graph graph, int s, int d) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (curr == d) {
                count++;
            }

            Iterator<Integer> it = graph.getAdj()[curr].iterator();
            while (it.hasNext()) {
                int el = it.next();

                if (!graph.isVisited()[el]) {
                    stack.push(el);
                    graph.setVisited(el, true);
                }
            }
            graph.resetVisited();
        }

        return count;
    }
}
