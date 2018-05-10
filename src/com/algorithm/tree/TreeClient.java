package com.algorithm.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is the main class in which all the operations performed on trees can be
 * executed.
 */
public class TreeClient {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleTree tree = null;

		printTreeTypes();
		int choice = Integer.parseInt(br.readLine());

		if (TreeType.getTreeType(choice) == null) {
			System.out.println("Invalid Choice");
		}

		tree = TreeFactory.createTree(TreeType.getTreeType(choice));

		printTreeOperations();

		while (choice != 5) {
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("Coming Soon!");
				break;
			case 2:
				System.out.println("Recursive");
				tree.inorderTraversal(tree.getRoot());
				System.out.println("\nIterative");
				tree.inorderTraversal();

				break;
			case 3:
				System.out.println("Recursive");
				tree.preorderTraversal(tree.getRoot());
				System.out.println("\nIterative");
				tree.preorderTraversal();
				break;
			case 4:
				System.out.println("Recursive");
				tree.postorderTraversal(tree.getRoot());
				System.out.println("\nIterative");
				tree.postorderTraversal();
				break;
			case 5:
				System.out.println("Iterative");
				tree.levelorderTraversal();
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}

	private static void printTreeOperations() {
		System.out.println("===========TREE OPERATIONS==============");
		System.out.println("1.View Tree");
		System.out.println("2.Inorder Traversal");
		System.out.println("3.Preorder Traversal");
		System.out.println("4.Postorder Traversal");
		System.out.println("5.Levelorder Traversal");
	}

	private static void printTreeTypes() {
		System.out.println("===========TREE TYPES==============");
		System.out.println("1.Binary Tree");
		System.out.println("2.Binary Search Tree");
	}
}
