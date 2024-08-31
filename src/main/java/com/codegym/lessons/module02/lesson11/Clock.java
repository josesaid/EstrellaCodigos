package com.codegym.lessons.module02.lesson11;

public class Clock implements Runnable{
    public void run(){
        System.out.println("Arrancó");
        Thread thread = Thread.currentThread();
        while(!thread.isInterrupted()){
            try {
                Thread.sleep(1000 * 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                thread.interrupt();
            }
            System.out.println("CodeGym...");
        }
        System.out.println("Terminó...");
    }

}
