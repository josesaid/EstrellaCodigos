package com.codegym.lessons.module02.lesson14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class WorkStealingPoolExample {
    public static void main(final String[] arguments) throws InterruptedException {
        ExecutorService executor = Executors.newWorkStealingPool();

        ThreadPoolExecutor mypool = (ThreadPoolExecutor)  Executors.newCachedThreadPool();
        System.out.println("size of mypool: " + mypool.getPoolSize());

        executor.submit(new ThreadImpl());
        executor.submit(new ThreadImpl());

        System.out.println("Total number threads scheduled): "+ mypool.getTaskCount());
        executor.shutdown();
    }

}
