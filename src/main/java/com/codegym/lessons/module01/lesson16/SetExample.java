package com.codegym.lessons.module01.lesson16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Sonar Cube (Open Source - usado para añadir reglas al código)
public class SetExample {

    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();
        //Set<String> nombres = new TreeSet<>();
        //List<String> nombres = new ArrayList<>();
        System.out.println(nombres.add("Smith"));
        System.out.println(nombres.add("Franklin"));
        System.out.println(nombres.add("Smith"));
        System.out.println(nombres.add("Nesthor"));
        System.out.println(nombres.add("Andres"));
        System.out.println(nombres.add("Martin"));
        System.out.println(nombres.add("Smith"));
        System.out.println(nombres.add("Jose Manuel"));
        System.out.println(nombres.add("Freddy"));
        System.out.println(nombres.add("Sebastian"));
        System.out.println(nombres.add("Smith"));
        System.out.println(nombres.add("James"));
        System.out.println("----------------------");
        for(String nombre : nombres){
            System.out.print(nombre+", ");
        }
        System.out.println();
        System.out.println(nombres.size());
        System.out.println(nombres.contains("Said"));
    }
}
