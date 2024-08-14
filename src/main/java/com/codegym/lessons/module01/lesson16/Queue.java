package com.codegym.lessons.module01.lesson16;

import java.util.PriorityQueue;
import java.util.Random;

public class Queue {
    public static void main(String[] args) {
        Random random = new Random();

        PriorityQueue<Integer>numeros = new PriorityQueue<>();
        numeros.add(random.nextInt(100));
        numeros.add(random.nextInt(100));
        numeros.add(random.nextInt(100));

        if(numeros.contains(random.nextInt(100))){
            System.out.println("Que suerte!");
        }else{
            System.out.println("Sigue intentando...");
        }

        System.out.println(numeros);
        numeros.clear();
        System.out.println(numeros);
    }

}
