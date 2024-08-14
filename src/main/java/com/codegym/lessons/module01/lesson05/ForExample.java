package com.codegym.lessons.module01.lesson05;

public class ForExample {
    public static void main(String[] args) {
        boolean sixFound = false;

        //ejecuta el ciclo, mientras six no haya sido encontrado
        //o que six no sea true
        //1.- Inicialización, 2.- Condición, 3.- Iteración
        for(int i = 0; !sixFound; i++){
            System.out.println(i);
            if(i==6)
                sixFound = true;
        }
    }

}
