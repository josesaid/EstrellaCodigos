package com.codegym.lessons.module01.lesson26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class DateTimeFormatterExample01 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasSena = LocalDate.of(2024, Month.JULY, 26);
        System.out.println(olimpiadasSena);

        int dias = olimpiadasSena.getDayOfYear() - hoje.getDayOfYear();
        System.out.println(dias + " dias para as Olímpiadas en Sena (Paris)!");

        Period periodo = Period.between(hoje, olimpiadasSena);
        System.out.println(periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String valorFormatado = olimpiadasSena.format(formatador);
        System.out.println("Las olimpiadas son el : " + valorFormatado);

        System.out.println(" --- Medida de tempo ---");

        //DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm:ss:SS:nnnn");
        DateTimeFormatter formatadorComHoras =
                new DateTimeFormatterBuilder()
                .appendPattern("dd/MMMM/yyyy")
                .toFormatter(new Locale("es", "CO"));

        DateTimeFormatter fecha6 = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy hh:mm");
        System.out.println("EEEE, dd/MMMM/yyyy hh:mm:ss: " + fecha6.format(LocalDateTime.now()));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(">>" + agora.getMonth());
        System.out.println(agora);
        System.out.println(agora.format(formatadorComHoras));



    }


}
