package com.codegym.lessons.module02.lesson14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CachedThreadPoolTaskExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Submit tasks to the executor service
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }

}
