package com.problem.linkedlist;

import com.algorithm.linkedlist.Node;

public class SumLinkedList {
    static int carry = 0;
    static Node result = null;

    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(2);

        addNode(head1, 9);
        addNode(head1, 4);

        addNode(head2, 9);

        calculateSum(head1, head2);
        printList(result);
    }

    private static void calculateSum(Node head1, Node head2) {
        Node a = null;

        int len1 = calculateLength(head1);
        int len2 = calculateLength(head2);
        int diff = Math.abs(len1 - len2);

        if (len1 > len2) {
            a = head1;

            while (diff-- > 0) {
                a = a.next;
            }

            addEqualLengthList(a, head2);
            propagateCarry(head1, a);
        } else {
            a = head2;
            while (diff-- > 0) {
                a = a.next;
            }

            addEqualLengthList(head1, a);
        }
    }

    private static void propagateCarry(Node head1, Node a) {
        if (head1 != a) {
            propagateCarry(head1.next, a);

            int sum = head1.data + carry;
            carry = sum / 10;
            sum = sum % 10;

            addNode(result, sum);
        }
    }

    private static void addEqualLengthList(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return;
        }

        System.out.println("He" + head1.data);
        addEqualLengthList(head1.next, head2.next);

        int sum = head1.data + head2.data + carry;
        carry = sum / 10;
        sum = sum % 10;
        System.out.println("Sum :" + sum);
        addNode(result, sum);
    }

    private static int calculateLength(Node head) {
        int length = 0;
        Node tmp = head;

        while (tmp != null) {
            length++;
            tmp = tmp.next;

        }
        return length;
    }

    public static void addNode(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            result = newNode;
        } else {
            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    private static void printList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
}
