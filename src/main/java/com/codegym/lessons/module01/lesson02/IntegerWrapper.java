package com.codegym.lessons.module01.lesson02;

public class IntegerWrapper {
    public static void main(String[] args) {
        String texto  = "123.";
        float f = Float.parseFloat(texto);
        System.out.println(f);
        /*int numero = Integer.parseInt(texto);
        System.out.println( numero + 10 );

        float numero2 = Float.parseFloat(texto);
        System.out.println(numero2);

        try{
            texto = "123.a3";
            numero = Integer.parseInt(texto);
        }catch(Exception e){
            System.err.println("Hubo un error, por favor revisa tus numeros");
        }*/

    }

}
