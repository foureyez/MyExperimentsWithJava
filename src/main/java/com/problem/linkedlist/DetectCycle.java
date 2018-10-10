package com.problem.linkedlist;

import com.algorithm.linkedlist.LinkedList;
import com.algorithm.linkedlist.Node;

/**
 * Detect a loop in a singly linked list
 * 
 * @author arawat
 *
 */
public class DetectCycle {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(20);
		list.addNode(4);
		list.addNode(5);
		list.addNode(10);

		list.getHead().next.next.next.next = list.getHead();
		System.out.println(containsCycle(list));
	}

	private static boolean containsCycle(LinkedList list) {

		Node head = list.getHead();
		Node slowPointer = head;
		Node fastPointer = head;

		while (slowPointer != null && slowPointer.next != null && fastPointer != null && fastPointer.next != null
				&& fastPointer.next.next != null) {

			if (slowPointer == fastPointer) {
				return true;
			}

			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}

		return false;
	}
}
