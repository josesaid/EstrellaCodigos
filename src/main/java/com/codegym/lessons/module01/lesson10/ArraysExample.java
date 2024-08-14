package com.codegym.lessons.module01.lesson10;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        String []nombres  = {"Santigo", "Andres", "Paola", "Alex", "Jose Manuel", "Nesthor", "Daniel",
                "Giovani", "Benjamin", "Freddy", "Franklin", "Smith", "Said"};

        String []estudiantes  = {"Santigo", "Andres", "Paola", "Alex", "Jose Manuel", "Nesthor", "Daniel",
                "Giovani", "Benjamin", "Freddy", "Franklin", "Smith"};

        String []instructores = {"Said"};

        String representacion = Arrays.toString(nombres);
        System.out.println(representacion);


        System.out.println(Arrays.equals(estudiantes, instructores));
        System.out.println(Arrays.equals(estudiantes, estudiantes));

        String []arrayVacio = new String[100];

        Arrays.fill(arrayVacio, "HOLA");
        System.out.println(Arrays.toString(arrayVacio));

        instructores = new String[]{"Said", "Pedro"};

        // CRUD = Create, Read, Update and Delete List
                //Java Collections Framework

        Arrays.sort(estudiantes);
        System.out.println(Arrays.toString(estudiantes));

    }


}
