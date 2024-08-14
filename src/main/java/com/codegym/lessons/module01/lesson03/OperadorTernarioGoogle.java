package com.codegym.lessons.module01.lesson03;

public class OperadorTernarioGoogle {
    public static void main(String[] args) {
        int numero = 8;
        String mensaje = "";
        if (numero > 10) {
            mensaje = "El número es mayor que 10";
        } else {
            mensaje = "El número es menor o igual a 10";
        }
        mensaje = (numero>10)?"El número es mayor que 10":"El número es menor o igual a 10";
        System.out.println(mensaje);
    }
}
