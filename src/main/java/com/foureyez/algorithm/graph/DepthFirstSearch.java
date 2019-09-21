package com.foureyez.algorithm.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.foureyez.api.graph.Graph;

public class DepthFirstSearch {
	private Graph<?> G;

	public DepthFirstSearch(Graph<?> graph) {
		this.G = graph;
	}

	/**
	 * @param G      - Source Graph
	 * @param source - Source node
	 * @param target - Target node to find
	 */
	public List<Integer> perform(int source, int target) {
		Map<Integer, Integer> cameFrom = new HashMap<Integer, Integer>();

		Stack<Integer> stack = new Stack<>();
		stack.push(source);

		while (!stack.isEmpty()) {
			int tmp = stack.pop();
			G.setVisited(tmp, true);

			if (tmp == target) {
				break;
			}

			for (int i : G.getNeighbours(tmp)) {
				if (!G.isVisited(i)) {
					cameFrom.put(i, tmp);
					stack.push(i);
				}
			}
		}

		return calculatePath(cameFrom, target);
	}

	private List<Integer> calculatePath(Map<Integer, Integer> cameFrom, int target) {
		List<Integer> path = new ArrayList<Integer>();
		path.add(target);

		while (cameFrom.get(target) != null) {
			path.add(cameFrom.get(target));
			target = cameFrom.get(target);
		}

		return path;
	}
}
