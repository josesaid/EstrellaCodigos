package com.codegym.lessons.module01.lesson06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un nombre: ");
        String nombre = scanner.nextLine();
        String acumulador = nombre+",";
        while(!nombre.equals("")){
            System.out.println("Dame un nombre: ");
            nombre = scanner.nextLine();
            acumulador +=nombre+",";
        }
        String []palabras = acumulador.split(",");

        System.out.println("acumulador: "+ acumulador);
        System.out.println("Las palabras fueron: " + palabras.length);

        palabras = new String [17];
        System.out.println(palabras[0]);

        palabras[10] = "Liliana";
        System.out.println(palabras[10]);
        System.out.println(palabras[16]);
        //System.out.println(palabras[17]);

        System.out.println(palabras);




        //Esto no es parte de la lección de hoy...
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Pablo");
        nombres.add("Paco");

        System.out.println(nombres);
    }

}
