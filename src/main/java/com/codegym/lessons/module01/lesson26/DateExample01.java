package com.codegym.lessons.module01.lesson26;

import java.util.Date;

public class DateExample01 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);

        System.out.println("-> " + today.getYear());
        System.out.println(today.getYear()+1900);
        System.out.println("Mes: "  + today.getMonth());
        System.out.println(today.getDate());

        System.out.println(today.getHours());
        System.out.println(today.getMinutes());
        System.out.println(today.getSeconds());

        today.setYear(2024);
        System.out.println(today.getYear());
        today.setMonth(today.getMonth()+1);
        System.out.println("Mes: "  + today.getMonth());
    }
}
