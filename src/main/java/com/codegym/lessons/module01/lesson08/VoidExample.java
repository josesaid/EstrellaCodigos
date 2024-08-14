package com.codegym.lessons.module01.lesson08;

public class VoidExample {
    public static void main(String[] args) {
        metodo1();
        int x = metodo2();
        Pelota p = metodo3();
    }

    private static Pelota metodo3() {
        return new Pelota();
    }

    private static int metodo2() {
        int x = 20;
        return x;
    }

    private static void metodo1() {
        System.out.println("Metodo1");
    }
}

class Pelota{}