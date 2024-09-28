package com.codegym.lessons.module02.lesson18.varargs;

/**
 * The type Variable arguments example.
 */
public class VariableArgumentsExample {
    //var args

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        metodo(50, 100, 200);
    }


    /**
     * Metodo.
     *
     * @param numeros the numeros
     */
    @SafeVarargs
    static void metodo(int ... numeros){
        for(int i : numeros){
            System.out.println(i);
        }
    }

}
