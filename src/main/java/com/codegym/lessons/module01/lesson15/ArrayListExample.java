package com.codegym.lessons.module01.lesson15;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int []array = new int[]{1,2,3,4,5};
        ArrayList lista = new ArrayList();
        lista.add("Hola");
        lista.add(2);
        lista.add(true);
        lista.add(array);

        System.out.println(lista);

        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Hola");
        /*cadenas.add(4);
        cadenas.add(true);
        cadenas.add(array);
         */
        cadenas.add("Hola 2");
        cadenas.add("Said");

        System.out.println(cadenas);



    }
}
