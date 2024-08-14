package com.codegym.lessons.module01.lesson26;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatExample01 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "UK");
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        dateFormatSymbols.setWeekdays(new String[]{
                "Unused",
                "Sad Sunday",
                "Manic Monday",
                "Thriving Tuesday",
                "Wet Wednesday",
                "Total Thursday",
                "Fat Friday",
                "Super Saturday",
        });

        String pattern = "yyyy > MMMMM > EEEEE  ";
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat(pattern, dateFormatSymbols);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }

}
