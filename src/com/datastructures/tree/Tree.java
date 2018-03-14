package com.datastructures.tree;

public interface Tree {

    /**
     * Inorder traversal of tree (Left -> Root -> Right) RECURSIVE
     */
    public void inorderTraversal(Node node);

    /**
     * Inorder traversal of tree (Left -> Root -> Right) ITERATIVE
     */
    public void inorderTraversal();

    /**
     * Preorder traversal of tree (Root -> Left -> Right) RECURSIVE
     */
    public void preorderTraversal(Node node);

    /**
     * Preorder traversal of tree (Root -> Left -> Right) ITERATIVE
     */
    public void preorderTraversal();

    /**
     * Postorder traversal of tree (Left -> Right-> Root) RECURSIVE
     */
    public void postorderTraversal(Node node);

    /**
     * Postorder traversal of tree (Left -> Right-> Root) ITERATIVE
     */
    public void postorderTraversal();
    
    /**
     * Levelorder traversal of tree (Left -> Right-> Root) ITERATIVE
     */
    public void levelorderTraversal();

    /**
     * Check if the height if left and right child is same. RECURSIVE
     */
    public boolean isBalanced(Node node);

    /**
     * Check if the height if left and right child is same. ITERATIVE
     */
    public boolean isBalanced();

    /**
     * @return the height of the tree. RECURSIVE
     */
    public int getHeight(Node node);

    /**
     * @return the height of the tree. ITERATIVE
     */
    public int getHeight();

}
