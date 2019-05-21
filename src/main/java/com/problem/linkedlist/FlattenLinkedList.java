package com.problem.linkedlist;

import com.algorithm.linkedlist.LinkedList;

/**
 * @author arawat
 */
public class FlattenLinkedList {
    public static void main(String[] args) {
        Node node = new Node();
        node.data = 1;
        FlattenLinkedList fll = new FlattenLinkedList();
    }

    private void doFlatten(LinkedList list) {

    }
}

class Node {
    int data;
    Node next;
    Node down;
}