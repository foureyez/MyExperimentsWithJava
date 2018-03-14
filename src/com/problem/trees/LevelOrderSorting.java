package com.problem.trees;

import java.util.LinkedList;
import java.util.Queue;

import com.datastructures.tree.Node;
import com.datastructures.tree.SimpleTree;
import com.datastructures.tree.TreeFactory;
import com.datastructures.tree.TreeType;

/**
 * Given a Binary tree, the task is to print all its levels in sorted order.
 */
public class LevelOrderSorting {

	public static void main(String args[]) {
		SimpleTree tree = null;
		tree = TreeFactory.createTree(TreeType.BINARY_TREE);

		printSortedLevels(tree);
	}

	private static void printSortedLevels(SimpleTree tree) {
		Queue<Node> queue = new LinkedList<>();
		Node node = tree.getRoot();
		queue.add(node);

		int nodeCount = queue.size();

		while (true) {
			while (nodeCount > 0) {
				node = queue.peek();

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}

			}
		}

	}
}
