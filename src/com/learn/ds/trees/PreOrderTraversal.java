package com.learn.ds.trees;

import com.datastructures.tree.Node;
import com.util.TreeUtils;

public class PreOrderTraversal {

	public static void main(String args[]) {
		Node node = TreeUtils.createBinaryTree(10);
		rTraverse(node);
		System.out.println("=================");
		iTraverse(node);
	}

	private static void rTraverse(Node node) {
		if (node != null) {
			System.out.println(node.data);
			rTraverse(node.left);
			rTraverse(node.right);
		}
	}

	private static void iTraverse(Node node) {

	}
}
