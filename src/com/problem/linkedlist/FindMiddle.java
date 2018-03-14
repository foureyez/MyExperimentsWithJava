package com.problem.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMiddle {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList linkedList = new LinkedList();
		String[] input = br.readLine().split(" ");

		for (String s : input) {
			
		}

		findMiddle(linkedList);
	}

	private static void findMiddle(LinkedList linkedList) {
	}
}

class LinkedList {
	Node head;

	public void addNode(Node node) {
		if (head == null) {
			head = node;
		} else {

		}
	}
}

class Node {

	int data;
	Node next;

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}