package com.codegym.lessons.module01.lesson26;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        /*int contador = 0;
        try{
            while(contador++ <=5){
                System.out.println(LocalTime.now() );
                Thread.sleep(2000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
*/
        LocalTime time = LocalTime.now()
                .plusHours(-2)
                .plusMinutes(21)
                .plusSeconds(100);
        System.out.println(time);

        LocalTime time2 = LocalTime.of(17, 0, 1, 300);
        System.out.println(time2);
        System.out.println(time2.getHour());
        System.out.println(time2.getMinute());
        System.out.println(time2.getSecond());

    }
}

