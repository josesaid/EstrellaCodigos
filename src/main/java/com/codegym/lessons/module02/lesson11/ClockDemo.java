package com.codegym.lessons.module02.lesson11;

public class ClockDemo {
    public static void main(String[] args)
            throws InterruptedException {
        Thread thread = new Thread(
                new Clock());
        thread.start();
        Thread.sleep(1000 * 10);
        thread.interrupt();
    }

}
