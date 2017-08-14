package com.problem.graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

/**
 * 
 * Edge Existence ***********************************************************
 * You have been given an undirected graph consisting of N nodes and M edges.
 * This graph can consist of self-loops as well as multiple edges. In addition,
 * you have also been given Q queries. For each query , you shall be given 2
 * integers A and B. You just need to find if there exists an edge between node
 * A and node B. If yes, print "YES" (without quotes) else , print "NO"(without
 * quotes).
 *
 */

class EdgeExistence {
	public static void main(String args[]) throws Exception {

		String lineArr[];
		StringBuilder result = new StringBuilder();
		final int v, e, n;
		int a, b;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		lineArr = br.readLine().split(" ");

		v = Integer.parseInt(lineArr[0]);
		e = Integer.parseInt(lineArr[1]);

		int adj[][] = new int[v+1][v+1];

		try{
			for (int i = 0; i < e; i++) {
				lineArr = br.readLine().split(" ");
				adj[Integer.parseInt(lineArr[0])][Integer.parseInt(lineArr[1])] = 1;
				adj[Integer.parseInt(lineArr[1])][Integer.parseInt(lineArr[0])] = 1;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}

		n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			lineArr = br.readLine().split(" ");

			a = Integer.parseInt(lineArr[0]);
			b = Integer.parseInt(lineArr[1]);

			if(adj[a][b] == 1 || adj[b][a] == 1){
				result.append("YES\n");
			}else{
				result.append("NO\n");
			}
		}
		
		System.out.println(result);
	}
}
