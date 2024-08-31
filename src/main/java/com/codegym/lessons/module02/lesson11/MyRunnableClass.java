package com.codegym.lessons.module02.lesson11;

public class MyRunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable >> Ejecutando una tarea (hilo) - Nombre: " + Thread.currentThread().getName() );
    }

}
