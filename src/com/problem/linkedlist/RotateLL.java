package com.problem.linkedlist;

import com.algorithm.linkedlist.Node;

public class RotateLL {

    public static void main(String[] args) {

        Node head = new Node(1);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 4);
        addNode(head, 5);
        printList(head);

        // Rotate LL by x positions counterclockwise
        head = rotateList(head, 3);
        printList(head);
        printRevList(head);

    }

    private static Node rotateList(Node head, int i) {
        Node tmp = head;
        Node endNode = null;
        int length = getLength(head);
        i = i % length;

        while (--i > 0) {
            tmp = tmp.next;
        }

        endNode = tmp;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = head;
        head.prev = tmp;
        head = endNode.next;
        endNode.next = null;
        return head;
    }

    private static int getLength(Node head) {
        int length = 0;
        Node tmp = head;

        while (tmp != null) {
            length++;
            tmp = tmp.next;

        }
        return length;
    }

    private static void addNode(Node head, int i) {
        Node node = new Node(i);
        Node tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = node;
        node.prev = tmp;
    }

    private static void printList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    private static void printRevList(Node head) {
        Node tmp = head;
        while (tmp.next != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.print(tmp.data + " ");

        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.prev;
        }
    }
}
