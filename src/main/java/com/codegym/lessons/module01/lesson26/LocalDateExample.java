package com.codegym.lessons.module01.lesson26;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        //System.out.println(hoy);

        LocalDate ayer = hoy.minusDays(-1);
        System.out.println(ayer);

        LocalDate siguienteViernes = LocalDate.now().plusWeeks(-1);
        System.out.println(siguienteViernes);

        LocalDate agosto062025 = hoy.plusDays(2)
                .plusWeeks(1)
                .plusMonths(1)
                .plusYears(1);

        System.out.println(agosto062025);


        /*System.out.println(manana);
        List<LocalDate> diasReservados = new ArrayList<>();
        diasReservados.add(hoy);
        diasReservados.add(manana);

        System.out.println(diasReservados);
         */
    }

}
