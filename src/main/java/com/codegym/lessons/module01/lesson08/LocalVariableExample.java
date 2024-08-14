package com.codegym.lessons.module01.lesson08;

public class LocalVariableExample {
    static int x = 10;

    public static void main(String[] args) {

        System.out.println(x);
        int i=0;
        for(i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println(i);

        otraCosa:{
            int z = 40;
        }

        System.out.println("Hola!");

        algo:
            {
                int z  = 123;
            }

        int z = 200;
        System.out.println(z);
    }
}
