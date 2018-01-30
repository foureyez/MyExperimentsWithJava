package com.problem.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.learn.ds.trees.Node;
import com.learn.ds.trees.SimpleTree;
import com.learn.ds.trees.Tree;
import com.learn.ds.trees.TreeFactory;
import com.learn.ds.trees.TreeType;

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

		while (!queue.isEmpty()) {
			node = queue.remove();
			System.out.print(node.data + "->");

			if (node.left != null) {
				queue.add(node.left);
			}
			
			if (node.right != null) {
				queue.add(node.right);
			}

		}
	}
}
