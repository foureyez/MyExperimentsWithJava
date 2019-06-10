package com.foureyez.algorithm.linkedlist;

public class ReverseLinkedList {

    public void reverseLinkedList(Node head) {

    }

    public Node reverseDoublyLinkedList(Node head) {
        Node prev = null, curr = head, tmp;

        while (curr.next != null) {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        curr.next = prev;

        return curr;
    }
}
