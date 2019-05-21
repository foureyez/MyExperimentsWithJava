package com.algorithm.linkedlist;

public class LinkedList {

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

    public int getLength() {
        return length;
    }

    public void reverseLinkedList() {

    }

    public void swapNodesData(int a, int b) {

    }

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

    public void generateLinkedList(int length) {
        head = new Node((int) (Math.random() * 10));
        Node node, tmp = head;

        int i = 0;
        while (i < length) {
            node = new Node((int) (Math.random() * Math.random() / Math.random() * 100));
            tmp.next = node;
            tmp = tmp.next;
        }

        setCurrNode(head);
        this.length = length;
    }
}
