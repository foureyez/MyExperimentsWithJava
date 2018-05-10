package com.algorithm.linkedlist;

public interface LinkedList {

	public void addNode(int data);

	public void deleteNode(int data);

	public int getLength();

	public void printList();

	public void reverseLinkedList();

	public void swapNodesReference(int a, int b);

	public void swapNodesData(int a, int b);

	public void generateLinkedList(int length);

}
