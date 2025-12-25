package org.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LearningThreads {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Producing : " + i);
                    queue.put(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int value = queue.take();
                    System.out.println("Consuming : " + value);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
