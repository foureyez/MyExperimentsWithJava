package com.foureyez.api.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph<E> {
	private final int V;
	private int E;
	private List<List<Integer>> neighbours;
	private boolean[] isVisited;
	private int[][] costMatrix;

	public Graph(int V) {
		this.V = V;
		neighbours = new ArrayList<List<Integer>>(V);
		costMatrix = new int[V][V];
		isVisited = new boolean[V];

		for (int i = 0; i < V; i++) {
			neighbours.add(new ArrayList<Integer>());
		}
	}

	/**
	 * @param a     - ID of the first Node
	 * @param b     - ID of the second Node
	 * @param costA - Cost of going from a to b
	 * @param costB - Cost of going from b to a
	 * @return Is process successful
	 */
	public int addEdge(int a, int b, int costA, int costB) {

		try {

			neighbours.get(a).add(b);
			neighbours.get(b).add(a);
			costMatrix[a][b] = costA;
			costMatrix[b][a] = costB;

			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * @param a    - ID of the first Node
	 * @param b    - ID of the second Node
	 * @param cost - Cost of going from a to b OR b to a
	 * @return Is process successful
	 */
	public int addEdge(int a, int b, int cost) {
		return addEdge(a, b, cost, cost);
	}

	/**
	 * @param a - ID of the first Node
	 * @param b - ID of the second Node
	 * @return - Is process successful
	 */
	public int addEdge(int a, int b) {
		return addEdge(a, b, 1, 1);
	}

	public List<Integer> getNeighbours(int id) {
		return neighbours.get(id);
	}

	/**
	 * @param id - ID of the Node to fetch
	 * @return - The actual Node object
	 * @throws NodeNotFoundException
	 */
	public E getNode(int id) throws NodeNotFoundException {
		return null;
	}

	public int cost(int a, int b) {
		return b;
	}

	public boolean isVisited(int id) {
		return isVisited[id];
	}

	public void setVisited(int id, boolean status) {
		isVisited[id] = status;
	}

	public int getVertexCount() {
		return V;
	}

	public int getEdgeCount() {
		return E;
	}
}
