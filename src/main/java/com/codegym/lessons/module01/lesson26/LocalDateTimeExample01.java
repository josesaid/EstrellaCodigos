package com.codegym.lessons.module01.lesson26;

import java.time.LocalDateTime;

public class LocalDateTimeExample01 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.getMonth().name());
        System.out.println(time.getHour());
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getDayOfYear());
        System.out.println(time.getDayOfWeek());

        System.out.println(time.getHour()+ ":" + time.getMinute()+ ":" + time.getSecond());
    }

}
