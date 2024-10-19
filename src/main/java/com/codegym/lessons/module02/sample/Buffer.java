package com.codegym.lessons.module02.lesson20.threads.sample;

import lombok.Data;

@Data
public class Buffer {
    public static int SIZE = 1;
    private boolean disponible = false;
    private int contenido;
    private boolean fin = false;
    public Buffer(int size){
        SIZE = size;
    }
    public synchronized void producir(int valor) throws InterruptedException {
        while (disponible) {
            System.out.println("buffer.productor.producir...");
            wait();
        }
        contenido = valor;
        disponible = true;
        System.out.println("Buffer-> Producido: " + valor);
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {
        while (!disponible && !fin) {
            wait();
        }
        disponible = false;
        System.out.println("Buffer-> Consumido: " + contenido);
        if(contenido== SIZE) {
            fin = true;
        }
        notifyAll();
        return contenido;
    }
}

