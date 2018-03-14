package com.datastructures.linkedlist;

public class LinkedList {

	private Node head;

	public void reverseLL() {
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

	public void swapNodes(int a, int b) {
		Node tmp = head;
		Node nodeA, nodeB, prevA, prevB;

		nodeA = nodeB = head;
		prevA = prevB = null;

		while (tmp != null) {
			if (nodeA.data != a) {
				prevA = nodeA;
				nodeA = nodeA.next;
			}

			if (nodeB.data != b) {
				prevB = nodeB;
				nodeB = nodeB.next;
			}
			tmp = tmp.next;
		}

		if (prevA != null) {
			prevA.next = nodeB;
		} else {
			head = nodeB;
		}

		if (prevB != null) {
			prevB.next = nodeA;
		} else {
			head = nodeA;
		}
	}

	public void generateLL(int length) {
		head = new Node((int) (Math.random() * 10));
		Node tmp = head;
		Node node;
		while (--length != 0) {
			node = new Node((int) (Math.random() * Math.random() / Math.random() * 100));
			tmp.next = node;
			tmp = tmp.next;
		}

		System.out.println("Linked List Generated");
	}

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

	public void deleteNode(int data) {

	}

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

	
}
