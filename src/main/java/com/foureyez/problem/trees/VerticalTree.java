package com.foureyez.problem.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.foureyez.algorithm.tree.BinaryTree;
import com.foureyez.algorithm.tree.Node;
import com.foureyez.algorithm.tree.Tree;

/**
 * @author arawat
 *         Given a binary tree, print it vertically.
 */
public class VerticalTree {
    public static void main(String[] args) {
        Tree tree = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);

        tree.setRoot(root);

        printVerticalOrder(tree);
    }

    public static void printVerticalOrder(Tree tree) {
        Node root = tree.getRoot();

        Map<Integer, List<Node>> map = new TreeMap<>();

        // Traversing the tree to build the treeMap
        traverseTree(root, 0, map);

        // Printing the treeMap
        for (Entry<Integer, List<Node>> entry : map.entrySet()) {
            List<Node> nodeList = entry.getValue();
            for (Node node : nodeList) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        }

    }

    private static void traverseTree(Node node, int i, Map<Integer, List<Node>> map) {

        if (node == null) {
            return;
        }

        if (map.get(i) == null) {
            List<Node> nodeList = new ArrayList<>();
            nodeList.add(node);
            map.put(i, nodeList);
        } else {
            map.get(i).add(node);
        }

        traverseTree(node.left, i - 1, map);
        traverseTree(node.right, i + 1, map);
    }
}
