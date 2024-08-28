package com.codegym.lessons.module02.lesson10;

public class Fibonacci {
    public static void main(String[] args) {
        int numero = 7;
        int resultado = fibonacci(numero);
        System.out.println(resultado);
    }

    private static int fibonacci(int num){
        if(num == 0 || num==1)
            return num;
        else
            return fibonacci(num-1) + fibonacci(num-2);
    }
}
