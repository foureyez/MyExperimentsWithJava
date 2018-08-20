package com.algorithm.linkedlist;

public class LinikedListUtil {

    /**
     * Adds a Node in the Singly Linked List
     * (Do not use for doubly linked list.)
     * 
     * @param head - Head should not be null (Otherwise node will not be added.
     * @param data - The value of the Node to be inserted.
     */
    public static void addNode(Node head, int data) {
        Node newNode = new Node(data);

        if (head != null) {
            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    public static void addNodeDoubly(Node head, int data) {
        Node newNode = new Node(data);

        if (head != null) {
            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
            newNode.prev = tmp;
        }
    }

    /**
     * Prints the linked list data.
     * 
     * @param head
     */
    public static void printList(Node head) {
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

    /**
     * Returns the linked list as a string.
     * 
     * @param head
     */
    public static String toString(Node head) {
        StringBuffer list = new StringBuffer();

        Node tmp = head;
        if (head != null) {
            while (tmp != null) {
                list.append(tmp.data + " -> ");
                tmp = tmp.next;
            }
        }

        return list.toString();
    }
}
