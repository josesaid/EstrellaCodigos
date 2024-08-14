package com.codegym.lessons.module01.lesson08;

public class Metodo01 {
    public static void main(String... args) {
        int x = 10;
        int y = 20;
        int z = suma(1,2,3,4);
        System.out.println(z);

    }

    static int suma(int ... info){ //vargs
        int sumatoria = 0;
        for(int numero : info){
            sumatoria = sumatoria + numero;
        }
        return sumatoria;
    }

}
