package com.com.example.QueueInterface;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue q=new java.util.PriorityQueue();

        q.add(5);
        q.add(0);
        q.offer(9);
        q.offer(11);

//        q.add("Deepak");
//        q.add("Gourav");
//        q.add("Vineet");
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.element());
        //System.out.println();
    }
}
