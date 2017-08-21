package com.learn.ds.trees;

public class BinaryTree {
	public Node root;

	public boolean isBalanced(Node node) {
		int leftHeight, rightHeight;
		if (node == null) {
			return true;
		}

		leftHeight = getHeight(node.left);
		rightHeight = getHeight(node.right);

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		return true;
	}

	private int getHeight(Node node) {
		if(node == null){
			return 0;
		}
		
		return 1 + Math.max(getHeight(node.left), getHeight(node.right));
	}
}
