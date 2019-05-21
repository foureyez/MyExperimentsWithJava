package com.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SimpleTree implements Tree {
	
    private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	@Override
	public void inorderTraversal(Node node) {
		if (node == null) {
			return;
		}

		inorderTraversal(node.left);
		System.out.print(node.data + "->");
		inorderTraversal(node.right);
	}

	@Override
	public void inorderTraversal() {
		Stack<Node> stack = new Stack<>();
		Node node = root;

		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				System.out.print(node.data + "->");
				node = node.right;
			}
		}
	}

	@Override
	public void preorderTraversal(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + "->");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}

	@Override
	public void preorderTraversal() {
		Stack<Node> stack = new Stack<>();
		Node node = root;

		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				if (node.right != null) {
					stack.push(node.right);
				}
				System.out.print(node.data + "->");
				node = node.left;
			} else {
				node = stack.pop();
			}
		}
	}

	@Override
	public void postorderTraversal(Node node) {
		if (node == null) {
			return;
		}

		preorderTraversal(node.left);
		preorderTraversal(node.right);
		System.out.print(node.data + "->");
	}

	@Override
	public void postorderTraversal() {
		Stack<Node> stack = new Stack<>();
		Node node = root;

		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.push(node);

				node = node.left;
			}
		}
	}

	@Override
	public void levelorderTraversal() {
		Queue<Node> queue = new LinkedList<>();
		Node node = root;
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

	public boolean isBalanced(Node node) {
		return false;
	}

	public boolean isBalanced() {
		return false;
	}

	public int getHeight(Node node) {
		return 0;
	}

	public int getHeight() {
		return 0;
	}
}
