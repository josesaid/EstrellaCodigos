package com.codegym.lessons.module02.lesson11;

public class DemoMyThreadImplementationClass {
    public static void main(String[] args) {
        MyThreadImplementationClass hilo3 = new MyThreadImplementationClass();
        hilo3.setName("Hola soy el hilo 3");
        hilo3.start();

        MyThreadImplementationClass hilo4 = new MyThreadImplementationClass();
        hilo4.setName("Hola soy el hilo 4");
        hilo4.start();
    }

}
