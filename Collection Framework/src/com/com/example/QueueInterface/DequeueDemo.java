package com.com.example.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {

    public static void main(String[] args) {
        ArrayDeque arrayDeque=new ArrayDeque();
        arrayDeque.add(10);
        arrayDeque.addFirst(10);
        arrayDeque.addFirst(20);
        arrayDeque.addLast(30);
//     arrayDeque.push(10);
        arrayDeque.add(null);
        System.out.println(arrayDeque);
    }
}
