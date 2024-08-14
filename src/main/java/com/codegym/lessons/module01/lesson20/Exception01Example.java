package com.codegym.lessons.module01.lesson20;

public class Exception01Example {
    public static void main(String[] args) {
        /*String s = null;
        try{
            System.out.println(s.toUpperCase());
        }catch(NullPointerException e){
            System.out.println("Hubo una excepttion, verifique: " +e.getMessage());
        }*/

        int saldo = 100;
        int resultado = 0;
        boolean errorEncontrado=false;

        try{
            resultado = 100 / 0;
        }catch(ArithmeticException e){
            errorEncontrado = true;
            System.err.println("Excepción encontrada: " +e.getMessage());
        }catch(NullPointerException  e){
            errorEncontrado = true;
            System.err.println("Excepción encontrada: " +e.getMessage());
        }catch(Exception e){
            errorEncontrado = true;
            System.err.println("Excepción encontrada: " +e.getMessage());
        }finally{
            if(errorEncontrado==true) {
                System.out.println("WS - Falló por una operación no permitida");
                resultado = -1;
            }
            else {
                System.out.println("Todo en orden");
                resultado = 10;
            }
        }

        System.out.println("resultado: " + resultado);

    }

}
