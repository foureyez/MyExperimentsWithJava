package com.foureyez.algorithm.tree;

import java.util.PriorityQueue;

public class BinaryTree extends SimpleTree {
    static PriorityQueue<Integer> queue = new PriorityQueue<>();
    
    public static void main(String[] args) {
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        
        
        System.out.println(queue);
        //queue.remove();
        System.out.println(queue);
    }
}
