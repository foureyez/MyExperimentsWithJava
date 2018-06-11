package com.problem.linkedlist;

import com.algorithm.linkedlist.LinkedList;
import com.algorithm.linkedlist.Node;

public class FindMiddle {

    // Gives the middle of the linked list in O(n) time.
    public int findMiddle(LinkedList linkedList) {
        Node slowPointer = linkedList.getHead();
        Node fastPointer = slowPointer;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer.data;
    }
}