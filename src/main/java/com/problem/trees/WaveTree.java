package com.problem.trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given a binary tree rooted at 1. Initially, all the nodes of the tree have some initial values Vi. Wave operation is to be applied on the tree.
 * After applying the wave operation,
 * Value of each node in the tree = Sum of all initial values of nodes in its subtree.
 * You are required to add 1 more node with value X to the tree such that:
 * 1. The tree remains binary after adding the node to the tree.
 * 2. After applying the wave operation to this tree (the tree after adding node with value X), the sum of tree is minimum.
 * Sum of tree = sum of values of all nodes in the tree.
 * Print the minimum sum of the tree.
 * Input :
 * First line of input contains 2 integers N and X , number of nodes in the tree and value of new node to add respectively.
 * Second line contains N space separated integers denoting value of each node.
 * Each of the following N - 1 lines contains 2 integers u and v , representing edge between node u and node v.
 * Output :
 * Print the minimum sum possible after adding node with value X and applying wave operation such that tree remains binary tree.
 * 
 * @author arawat
 */
public class WaveTree {

    static long[] answerArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int[] values;
        List<Integer> tree[];

        input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int newVal = Integer.parseInt(input[1]);

        values = new int[n + 2];
        tree = new ArrayList[n + 2];
        answerArr = new long[n + 2];
        input = br.readLine().split(" ");

        // Reading the values for all the nodes
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(input[i]);
        }
        values[n + 1] = newVal;
        for (int i = 0; i < n + 2; i++) {

            tree[i] = new ArrayList<>();
        }

        // Reading adjacency of nodes
        for (int i = 0; i < n - 1; i++) {
            input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            tree[u].add(v);
            tree[v].add(u);
        }

        int newNodePos = bfs(tree);
        tree[newNodePos].add(n + 1);

        evaluateSumArray(tree, values, 1, -1);

        long ans = 0;
        for (int i = 0; i <= n + 1; i++) {
            System.out.print(answerArr[i] + " ");
            ans += answerArr[i];
        }

        System.out.println(ans);
    }

    private static long evaluateSumArray(List<Integer>[] tree, int[] values, int node, int p) {

        long temp = values[node];

        for (int i = 0; i < tree[node].size(); i++) {
            if (tree[node].get(i) == p)
                continue;

            temp += evaluateSumArray(tree, values, tree[node].get(i), node);
        }
        return answerArr[node] = temp;
    }

    private static int bfs(List<Integer>[] adj) {

        List<Integer> queue = new LinkedList<>();
        queue.add(1);

        while (!queue.isEmpty()) {

            int curr = queue.remove(0);

            if (curr == 1) {
                if (adj[1].size() < 2)
                    return 1;
                if (adj[1].size() > 2)
                    throw new RuntimeException();
            } else {
                if (adj[curr].size() < 3) {
                    return curr;
                } else if (adj[curr].size() > 3) {
                    throw new RuntimeException("Should not happen");
                }
            }

            for (int a : adj[curr]) {
                queue.add(a);
            }
        }

        return -1;
    }
}
