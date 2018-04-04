package com.datastructures.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListClient {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList linkedList = new LinkedListImpl();
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
				linkedList.generateLinkedList(10);
				break;
			case 2:
				data = Integer.parseInt(br.readLine());
				linkedList.addNode(data);
				break;
			case 3:
				data = Integer.parseInt(br.readLine());
				linkedList.deleteNode(data);
				break;
			case 4:
				a = Integer.parseInt(br.readLine());
				b = Integer.parseInt(br.readLine());
				linkedList.swapNodesReference(a, b);
				break;
			case 5:
				linkedList.printList();
				break;
			case 6:
				linkedList.reverseLinkedList();
				break;
			case 7:
				System.exit(1);
				break;
			default:
				System.out.println("Wrong Input");
			}
		}

	}
}
