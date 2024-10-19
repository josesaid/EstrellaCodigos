package com.codegym.lessons.module02.lesson20.threads.sample;

class Productor extends Thread {
    private Buffer buffer;

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for(int i=1; i<=Buffer.SIZE;i++){
                buffer.producir(i);
                System.out.println("Producido: " + i);
                Thread.sleep(1 * 1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Productor terminó");
    }

}