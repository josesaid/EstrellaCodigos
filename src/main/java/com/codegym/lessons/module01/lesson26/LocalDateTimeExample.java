package com.codegym.lessons.module01.lesson26;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LocalDateTime diaFecha = LocalDateTime.of(2024, 06, 28, 20, 15, 10, 250);
        System.out.println(diaFecha);
    }

}
