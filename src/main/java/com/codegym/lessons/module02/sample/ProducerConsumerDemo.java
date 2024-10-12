package com.codegym.lessons.module02.lesson20.threads.sample;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.poll();
        notifyAll();
        return value;
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            int value = 1;
            while (true) {
                buffer.produce(value);
                System.out.println("Produced " + value);
                value++;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1 * 1000);
                int value = buffer.consume();
                System.out.println("Consumed " + value);

            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerDemo {

    public static final int CAPACITY = 1;
    public static void main(String[] args) {
        Buffer buffer = new Buffer(CAPACITY);

        Producer producer = new Producer(buffer);
        producer.start();

        Consumer consumer = new Consumer(buffer);
        consumer.start();



    }

}
