package com.codegym.lessons.module01.lesson16;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        //LIFO - Last input, first output
        Stack<Integer> numeros = new Stack<>();
        numeros.push(5);
        numeros.push(10);
        numeros.push(15);
        numeros.push(20);

        Integer topNumber = numeros.peek();
        System.out.println("topNumber: " + topNumber);

        int numeroaEliminar = numeros.pop();
        System.out.println("numeroaEliminar: "+ numeroaEliminar);
        System.out.println(numeros);

        int index =100;
        index = numeros.search(5);
        System.out.println("index: " + index);
        index = numeros.search(10);
        System.out.println("index: " + index);
        index = numeros.search(15);
        System.out.println("index: " + index);

        index = numeros.search(55);
        System.out.println("index: " + index);

        index = numeros.search(20);
        System.out.println("index: " + index);

        /*System.out.println(
                numeros.empty() ? "La pila de numeros esta vacia"
                        : numeros.size() > 5 ? "LA pila tiene al menos 2 elementos":
                        "La pila tiene: "+numeros.size()+" elementos"
        );*/

    }
}
