package com.codegym.lessons.module01.lesson26;

import java.util.Calendar;

public class GregorianCalendarExample01 {
    public static void main(String[] args) {
        int year = 2024;
        int day = 15;
        //Calendar date = new GregorianCalendar(year, Calendar.JANUARY, day);
        int hour = 19;
        int minutes = 35;
        int seconds = 10;
        //Calendar date = new GregorianCalendar(year, Calendar.JANUARY, day, hour, minutes, seconds);
        Calendar date = Calendar.getInstance(); //usa la hr actual de ejecución
        System.out.println(date.getTime());

        System.out.println(date.get(Calendar.ERA));
        System.out.println(date.get(Calendar.YEAR));

        System.out.println(date.get((Calendar.DAY_OF_WEEK) ));
        System.out.println(date.get((Calendar.DAY_OF_MONTH) ));

        date.set(Calendar.DAY_OF_MONTH, 2);
        System.out.println(date.get((Calendar.DAY_OF_MONTH) ));

    }
}
