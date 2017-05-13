package com.learn.ds.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {

	private static Node head;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data, choice, a, b;
		System.out.println("============LINKED LIST================");
		System.out.println("1. Generate a Linked List");
		System.out.println("2. Add Node");
		System.out.println("3. Delete Node");
		System.out.println("4. Swap two Nodes");
		System.out.println("5. Print Linked List");
		System.out.println("6. Reverse Linked List");
		System.out.println("7. Exit");
		System.out.println("=======================================");
		while (true) {
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				generateLL(10);
				break;
			case 2:
				data = Integer.parseInt(br.readLine());
				addNode(data);
				break;
			case 3:
				data = Integer.parseInt(br.readLine());
				deleteNode(data);
				break;
			case 4:
				a = Integer.parseInt(br.readLine());
				b = Integer.parseInt(br.readLine());
				swapNodes(a, b);
				break;
			case 5:
				printList();
				break;
			case 6:
				reverseLL();
				break;
			case 7:
				System.exit(1);
				break;
			default:
				System.out.println("Wrong Input");
			}
		}

	}

	private static void reverseLL() {
		Node tmp;
		Node prev = null, curr = head;
		
		while(curr.next != null){
			tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}
		curr.next = prev;
		head = curr;
		System.out.println("Linked List Reversed");
	}

	private static void swapNodes(int a, int b) {
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

		tmp = nodeA.next;
		nodeA.next = nodeB.next;
		nodeB.next = tmp;
	}

	private static void generateLL(int length) {
		head = new Node((int) (Math.random() * 10));
		Node tmp = head;
		Node node;
		while (--length != 0) {
			node = new Node((int) (Math.random() * Math.random() / Math.random() * 100));
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
		}
		
		System.out.println("Linked List Generated");
	}

	private static void printList() {
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

	private static void deleteNode(int data) {

	}

	private static void addNode(int data) {

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
