package com.codegym.lessons.module01.lesson03;

public class OperadorTernario {
    public static void main(String[] args) {
        String nombre = "Kevin000";
        int edad = 27;
        boolean mayorDeEdad = false;
        boolean esKevin = false;
        /*if(nombre.equalsIgnoreCase("kevin")){
            esKevin = true;
        }
        if(edad>=18){
            mayorDeEdad = true;
        }*/

        // ? :

        esKevin = nombre.equalsIgnoreCase("kevin") ? true : (nombre.equals("Kevin123") ? true : criterioFinal(nombre) );
        mayorDeEdad = (edad>=18)?true:false;

        System.out.println("¿esKevin?: " + esKevin);
        System.out.println("¿Es mayorDeEdad?: " + mayorDeEdad);
    }

    private static boolean criterioFinal(String nombre) {
        return nombre.toUpperCase().equals("KEVIN456");
    }

}
