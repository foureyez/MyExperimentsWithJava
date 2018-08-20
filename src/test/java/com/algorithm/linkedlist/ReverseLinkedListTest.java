package com.algorithm.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void testReverseDoublyLinkedList() {
        Node head = new Node(1);

        LinikedListUtil.addNodeDoubly(head, 2);
        LinikedListUtil.addNodeDoubly(head, 3);
        LinikedListUtil.addNodeDoubly(head, 10);
        LinikedListUtil.addNodeDoubly(head, 4);

        String expected = "4 -> 10 -> 3 -> 2 -> 1 -> ";

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        head = reverseLinkedList.reverseDoublyLinkedList(head);

        Assert.assertEquals(expected, LinikedListUtil.toString(head));

    }

}
