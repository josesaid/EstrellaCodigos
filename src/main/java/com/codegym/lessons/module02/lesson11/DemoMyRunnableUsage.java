package com.codegym.lessons.module02.lesson11;

public class DemoMyRunnableUsage {
    public static void main(String[] args) {
        MyRunnableClass myRunnableClass = new MyRunnableClass();
        Thread hilo1 = new Thread(myRunnableClass);
        hilo1.setName("hilo leer archivo");
        hilo1.start();

        Thread hilo2 = new Thread(myRunnableClass);
        hilo2.setName("hilo analizar texto");
        hilo2.start();
    }

}
