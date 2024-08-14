package com.codegym.lessons.module01.lesson05_training;

import java.time.LocalDate;
import java.time.Month;


public class ElseIfExample {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        if(hoy.getYear() == 2025){
            System.out.println("el año es 2025");
        }else if(hoy.getYear() == 2026){
            System.out.println("El año es 2026");
        }else if(hoy.getYear() == 2027){
            System.out.println("El año es 2027");
        }else if(hoy.getYear() == 2028){
            System.out.println("El año es 2028");
        }else{
            System.out.println("No fue ningunno de los anteriores, sino: " + hoy.getYear());
        }

        Month mes = hoy.getMonth();
        int valor = mes.getValue();
        Month mayo = mes.plus(1);
        //System.out.println("valor: " + valor);
        System.out.println(mayo.getValue());

        LocalDate fecha = hoy.minusMonths(1).minusDays(14);
        System.out.println(fecha);
    }

}
