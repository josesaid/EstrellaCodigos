package com.codegym.lessons.module02.lesson18.functionalinterfaceannotation;

/**
 * The type Process eventos ejemplo.
 */
/*

* */public class ProcessEventosEjemplo implements IOperacion{

    @Override
    public void procesarEvento() {
        System.out.println("algo");
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        new ProcessEventosEjemplo().procesarEvento();
    }
}
