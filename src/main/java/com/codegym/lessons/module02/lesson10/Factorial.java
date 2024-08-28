package com.codegym.lessons.module02.lesson10;

public class Factorial {
    public static void main(String[] args) {
        int numero  = 3; //6*5*4*3*2*1;
        int resultado = factorial(numero);
        System.out.println(resultado);
    }
    public static int factorial(int num)
    {
        if (num >= 1)
            return num * factorial(num - 1);
        else
            return 1;
    }
}
