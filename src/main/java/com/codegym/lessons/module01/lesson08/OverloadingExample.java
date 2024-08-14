package com.codegym.lessons.module01.lesson08;

public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println(suma(10, 20));
        System.out.println(suma(10.1f, 20.1f));
        byte b1 = 5;
        byte b2 = 6;
        System.out.println(suma(b1, b2));
    }

    public static int suma(int x, int y){
        return x+y;
    }
    protected static float suma(float x, float y){
        return x+y;
    }
    private static long suma(byte x, byte y){
        System.out.println("byte");
        return (long)x+y;
    }

}
