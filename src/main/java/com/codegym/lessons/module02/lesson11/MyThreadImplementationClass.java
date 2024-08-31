package com.codegym.lessons.module02.lesson11;

public class MyThreadImplementationClass extends Thread{
    public void run(){
        System.out.println("MyThreadImplementationClass >> Ejecutando una tarea (hilo) - Nombre: "
                + Thread.currentThread().getName() );

        //Runtime.getRuntime().exec("notepad.exe")
    }

}
