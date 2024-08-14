package com.codegym.lessons.module01.lesson18;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("uno");
        queue.add("dos");
        queue.add("tres");
        queue.add("atres");

        queue.offer("ados");

        System.out.println(queue);
    }

}
