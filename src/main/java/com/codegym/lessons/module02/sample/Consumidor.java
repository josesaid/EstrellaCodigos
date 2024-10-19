package com.codegym.lessons.module02.lesson20.threads.sample;

public class Consumidor extends Thread {
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1 * 1000);
                int value = buffer.consumir();
                System.out.println("Consumido: " + value);
                if (buffer.isFin()) {
                    System.exit(0);
                    Thread.currentThread().setName("consumidor.lobo1");
                }
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Consumidor terminó");
    }

}

