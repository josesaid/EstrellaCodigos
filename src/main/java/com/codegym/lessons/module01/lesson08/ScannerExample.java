package com.codegym.lessons.module01.lesson08;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resultado = suma(s);
        System.out.println("resultado: " + resultado);
    }

    static int suma(Scanner scanner){ //vargs
        System.out.println("escribe el numero:");
        int numero = scanner.nextInt();
        int sumatoria = 0;
        while(numero > 0){
            sumatoria += numero;
            System.out.println("escribe el numero:");
            numero = scanner.nextInt();
        }
        return sumatoria;
    }

}
class Persona{

}