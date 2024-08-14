package com.codegym.lessons.module01.lesson03;

import java.time.LocalDate;

public class Comparaciones02 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es : " + hoy);
        boolean resultado = conectarseAOtroSistema(hoy);
        System.out.println(resultado);
    }

    public static boolean conectarseAOtroSistema(LocalDate fecha){
        String laFechaDeHoy = fecha.toString();
        //if (laFechaDeHoy.contains("2024-05-05"))
        if (laFechaDeHoy.equals("2024-04-05"))
            return true;
        else
            return false;
    }

}
