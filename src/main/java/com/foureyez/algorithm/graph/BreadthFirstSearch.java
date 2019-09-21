package com.foureyez.algorithm.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.foureyez.api.graph.Graph;

public class BreadthFirstSearch {
	private Graph<?> G;

	public BreadthFirstSearch(Graph<?> graph) {
		this.G = graph;
	}

	/**
	 * @param G      - Source Graph
	 * @param source - Source node
	 * @param target - Target node to find
	 */
	public List<Integer> perform(int source, int target) {
		Map<Integer, Integer> cameFrom = new HashMap<Integer, Integer>();

		Queue<Integer> queue = new LinkedList<>();
		queue.add(source);

		while (!queue.isEmpty()) {
			int tmp = queue.remove();
			G.setVisited(tmp, true);

			if (tmp == target) {
				break;
			}

			for (int i : G.getNeighbours(tmp)) {
				if (!G.isVisited(i)) {
					cameFrom.put(i, tmp);
					queue.add(i);
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
