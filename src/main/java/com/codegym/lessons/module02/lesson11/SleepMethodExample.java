package com.codegym.lessons.module02.lesson11;

import java.time.LocalDateTime;

public class SleepMethodExample {
    private static final int SEGUNDOS = 1000 * 5;
    public static void main(String[] args) throws InterruptedException {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getHour());

        for(int i=0; i<5;i++){
            System.out.println(i);
            Thread.sleep(SEGUNDOS);
        }
    }

}
