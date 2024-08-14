package com.codegym.lessons.module01.lesson19;

public class SwitchExample {
    public static void main(String[] args) {
        short x = 11;
        System.out.println("Antes del switch...x vale: " + x);
        switch (x){
            case 2, 4, 6, 8, 10:
                System.out.println("x: "+ x+", es un numero par...");
                break;
            default:
                System.out.println("otro valor: "+ x);
                break;
            case 1,3,5,7,9:
                System.out.println("x: "+ x+", es un numero IMpar...");
                break;
        }
        System.out.println("afuera del switch: " + x);
    }
}
