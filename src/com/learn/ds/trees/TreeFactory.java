package com.learn.ds.trees;

public class TreeFactory {

    public static SimpleTree createTree(TreeType treeType) {
        SimpleTree tree = null;

        switch (treeType) {
            case BINARY_TREE:
                /**
                 *   20
                 *  / \
                 * 22  8
                 * / \ / \
                 *12 4 3  9
                 *    /\
                 *   10 14
                 *  
                 */
                tree = new BinaryTree();
                tree.setRoot(new Node(20));
                tree.getRoot().left = new Node(22);
                tree.getRoot().right = new Node(8);
                tree.getRoot().left.left = new Node(12);
                tree.getRoot().left.right = new Node(4);
                tree.getRoot().right.left = new Node(3);
                tree.getRoot().right.right = new Node(9);
                tree.getRoot().left.right.left = new Node(10);
                tree.getRoot().left.right.right = new Node(14);
                return tree;
            case BINARY_SEARCH_TREE:
                break;
            default:
                System.out.println("Unknown or null tree passed");
        }

        return tree;
    }
}
