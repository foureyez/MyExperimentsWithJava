package com.problem.graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ProblemTwo {
    public static void main(String args[]) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input[];
	int n, m, k, a, b;

	input = br.readLine().split(" ");
	n = Integer.parseInt(input[0]);
	m = Integer.parseInt(input[1]);
	k = Integer.parseInt(input[2]);

	int nodes[] = new int[n];
	int weightMap[] = new int[10001];
	ArrayList<Integer>[] adj = (ArrayList<Integer>[]) new ArrayList[n];
	input = br.readLine().split(" ");
	for (int i = 0; i < n; i++) {
	    nodes[i] = Integer.parseInt(input[i]);
	    adj[i] = new ArrayList<>();
	    weightMap[nodes[i]] = i + 1;
	}

	for (int i = 0; i < m; i++) {
	    input = br.readLine().split(" ");
	    a = Integer.parseInt(input[0]) - 1;
	    b = Integer.parseInt(input[1]) - 1;
	    adj[a].add(nodes[b]);
	    adj[b].add(nodes[a]);
	}

	for (int i = 0; i < n; i++) {
	    if (adj[i] != null && adj[i].size() != 0) {
		Collections.sort(adj[i], Collections.reverseOrder());
		if (adj[i].get(k - 1) != 0) {
		    System.out.println(weightMap[adj[i].get(k - 1)]);
		}
	    } else {
		System.out.println("-1");
	    }
	}
    }
}
