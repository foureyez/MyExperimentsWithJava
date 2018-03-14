package com.problem.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.datastructures.linkedlist.LinkedList;
import com.datastructures.linkedlist.Node;

public class FindMiddle {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList linkedList = new LinkedList();
		String[] input = br.readLine().split(" ");

		for (String s : input) {
			linkedList.addNode(Integer.parseInt(s));
		}

		findMiddle(linkedList);
	}

	private static void findMiddle(LinkedList linkedList) {
		Node slowPointer = linkedList.getHead();
		Node fastPointer = linkedList.getHead();

		while (fastPointer != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}

		System.out.println("Middle of linked List: " + slowPointer.data);
	}
}