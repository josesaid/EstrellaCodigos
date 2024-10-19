package com.codegym.lessons.module02.lesson21.time;

import java.time.LocalDateTime;

public class TimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime nowPlus10 = now.plusSeconds(10);
        System.out.println(nowPlus10);

    }
}
