package com.codegym.lessons.module01.lesson02;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample {
    static int miVariableStatica;

    public static void main(String[] args) {
        InputStream elInputStreamDeSaid = System.in;
        Scanner scanner = new Scanner(elInputStreamDeSaid);

        System.out.println("Escribe un nombre: ");

        String textoLeido = scanner.nextLine();
        System.out.println("LEIDO: " + textoLeido.toUpperCase());

        try{
            //System.out.println(anios + " años.");
            System.out.println("Escribe la edad: ");
            //int anios = scanner.nextInt();
            //System.out.println(anios + " años.");

            ///
            String edadAsString = scanner.nextLine();
            int edad = Integer.parseInt(edadAsString);
            System.out.println(edad + " años.");
        }catch(Exception e){
            System.out.println("La edad capturada no es un número");
        }
        System.out.println("The end...");
    }

}
