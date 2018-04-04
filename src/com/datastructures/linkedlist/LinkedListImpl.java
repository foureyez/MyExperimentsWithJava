package com.datastructures.linkedlist;

public class LinkedListImpl implements LinkedList {

	private Node head;
	private Node currNode;
	private int length;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getCurrNode() {
		return currNode;
	}

	public void setCurrNode(Node currNode) {
		this.currNode = currNode;
	}

	@Override
	public void deleteNode(int data) {

	}

	@Override
	public void addNode(int data) {

		if (head == null) {
			head = new Node(data);
			head.next = null;
		} else {
			Node tmp = head;
			Node newNode = new Node(data);
			newNode.next = null;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
		}
	}

	@Override
	public int getLength() {
		Node tmp = head;
		length = 0;
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}

		return length;
	}

	@Override
	public void printList() {
		Node tmp = head;
		if (head != null) {
			while (tmp != null) {
				System.out.print(tmp.data + " -> ");
				tmp = tmp.next;
			}
			System.out.println();
		} else {
			System.out.println("No Data");
		}
	}

	@Override
	public void reverseLinkedList() {
		Node tmp;
		Node prev = null, curr = head;

		while (curr.next != null) {
			tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}
		curr.next = prev;
		head = curr;
		System.out.println("Linked List Reversed");
		printList();
	}

	@Override
	public void swapNodesData(int a, int b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void swapNodesReference(int a, int b) {
		Node tmp = null;
		Node nodeA = head, nodeB = head;
		Node prevA = null, prevB = null;

		/**
		 * If a and b are equal no need to swap
		 */
		if (a == b) {
			return;
		}

		/**
		 * Find Node a
		 */
		while (nodeA != null && nodeA.data != a) {
			prevA = nodeA;
			nodeA = nodeA.next;
		}

		/**
		 * Find Node b
		 */
		while (nodeB != null && nodeB.data != b) {
			prevB = nodeB;
			nodeB = nodeB.next;
		}

		/**
		 * If Either of the node is not found
		 */
		if (nodeA == null || nodeB == null) {
			return;
		}

		if (nodeA == head) {
			head = nodeA;
		} else {
			prevA.next = nodeB;
		}

		if (nodeB == head) {
			head = nodeB;
		} else {
			prevB.next = nodeA;
		}

		tmp = nodeA;
		nodeA = nodeB;
		nodeB = tmp;
	}

	@Override
	public void generateLinkedList(int length) {
		head = new Node((int) (Math.random() * 10));
		Node tmp = head;
		Node node;
		while (--length != 0) {
			node = new Node((int) (Math.random() * Math.random() / Math.random() * 100));
			tmp.next = node;
			tmp = tmp.next;
		}
		setCurrNode(head);
		System.out.println("Linked List Generated");
	}
}
