package com.codegym.lessons.module02.lesson14;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.*;

public class WorkStealingPoolExample {
    public static void main(final String[] arguments) throws InterruptedException {
        ExecutorService executor = Executors.newWorkStealingPool();

        ThreadPoolExecutor mypool = (ThreadPoolExecutor)  Executors.newCachedThreadPool();
        System.out.println("size of mypool: " + mypool.getPoolSize());

        executor.submit(new ThreadImpl());
        executor.submit(new ThreadImpl());


        ScheduledExecutorService scheduledExecutorService =  Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            long epoch = Instant.now().toEpochMilli();
            System.out.print("Fixed rate task executed at " + epoch);
            LocalDateTime ldt = Instant.ofEpochMilli(epoch).atZone(ZoneId.systemDefault()).toLocalDateTime();
            System.out.print(" -> " + ldt + "\n");

        }, 2, 3, TimeUnit.SECONDS);

        // Let the main thread sleep for 10 seconds to observe the scheduled task execution
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadPoolExecutor mypool2 = (ThreadPoolExecutor)scheduledExecutorService;
        System.out.println("Total number threads scheduled): "+ mypool2.getTaskCount());
        executor.shutdown();
        scheduledExecutorService.shutdown();
    }

}
