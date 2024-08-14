package com.codegym.lessons.module01.lesson06;

import java.time.LocalDate;

public class ArrayExample03 {
    public static void main(String[] args) {
        LocalDate[] fechas1 = new LocalDate[3];
        fechas1[0] = LocalDate.now().minusDays(1);
        fechas1[1] = LocalDate.now();
        fechas1[2] = LocalDate.now().plusDays(1);

        LocalDate[] fechas2 = new LocalDate[]{
                LocalDate.now().minusDays(1),
                LocalDate.now(),
                LocalDate.now().plusDays(1)
        };

        LocalDate[] fechas3 = {
                LocalDate.now().minusDays(1),
                LocalDate.now(),
                LocalDate.now().plusDays(1)
        };

        //mnemonico
        for(LocalDate fecha : fechas1){
            System.out.print(fecha+" ");
        }
        System.out.println("\n----------------");
        for(LocalDate fecha : fechas2){
            System.out.print(fecha+" ");
        }
        System.out.println("\n----------------");
        for(LocalDate fecha : fechas3){
            System.out.print(fecha+" ");
        }
    }

}
