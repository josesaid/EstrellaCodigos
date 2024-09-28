package com.codegym.lessons.module02.lesson18.override;

/**
 * The type Override example.
 */
public class OverrideExample {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        IBrincable instancia = new Infante();
        instancia.brincar();
    }

    /**
     * Metodo.
     */
    @Deprecated
    static void metodo(){
        System.out.println("aaaa");
    }

}
