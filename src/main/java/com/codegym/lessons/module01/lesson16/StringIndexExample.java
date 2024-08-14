package com.codegym.lessons.module01.lesson16;

public class StringIndexExample {
    public static void main(String[] args) {
        String texto = "El dia de hoy Said revisó varios temas, pero al final terminado un poco cansado";
        int indice = texto.indexOf("carro");
        System.out.println(indice);

        int index = texto.indexOf("Said");
        System.out.println(index);
    }
}
