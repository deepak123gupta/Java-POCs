package com.com.example.QueueInterface;

import java.util.concurrent.*;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(2);

        // Producer thread
        new Thread(() -> {
            try {
                queue.put("A");
                System.out.println("Produced A");
                queue.put("B");
                System.out.println("Produced B");
                queue.put("C"); // Blocks until consumer takes one
                System.out.println("Produced C");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Consumer thread
        new Thread(() -> {
            try {
                Thread.sleep(2000); // simulate delay
                System.out.println("Consumed: " + queue.take()); // A
               // System.out.println("Consumed: " + queue.take()); // B
                //System.out.println("Consumed: " + queue.take()); // C
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
