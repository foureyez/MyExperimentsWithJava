package com.problem.trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import com.algorithm.tree.Node;

/**
 * Given a Binary tree, the task is to print all its levels in sorted order.
 */
public class LevelOrderSorting {

    public static void main(String args[]) {
        Node root = new Node(20);
        root.left = new Node(22);
        root.right = new Node(8);
        root.left.left = new Node(12);
        root.left.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        
        printSortedLevels(root);
    }

    private static void printSortedLevels(Node node) {
        Queue<Node> queue = new LinkedList<>();
        int[] level;
        queue.add(node);

        while (true) {
            int nodeCount = queue.size();
            level = new int[nodeCount];
            if (nodeCount == 0) {
                break;
            }

            while (nodeCount > 0) {
                node = queue.poll();
                level[nodeCount - 1] = node.data;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
                nodeCount--;
            }
            printSortedLevel(level);
        }

    }

    private static void printSortedLevel(int[] level) {
        Arrays.sort(level);

        for (int i = 0; i < level.length; i++) {
            System.out.print(level[i] + " ");
        }
        System.out.println();
    }
}
