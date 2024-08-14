package com.codegym.lessons.module01.lesson18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVersusLinkedList {

    // 1 second = 1_000_000_000 nano seconds
    final static int NANO_SECONDS = 1_000_000_000;
    final static int SIZE = 10_000;
    final static int HALF_INDEX = SIZE / 2;

    public static void main(String[] args) {

//Agregar un elemento:
        long starttime = System.nanoTime();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<SIZE;i++){
            list.add(i);
        }
        long endtime = System.nanoTime();

        double result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para la adición de elementos en un ArrayList:       " + result);

//Insertar un elemento:
        starttime = System.nanoTime();
        list.add(HALF_INDEX,5);
        endtime = System.nanoTime();
        result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para la inserción de 1 elemento en un ArrayList:    " + result);


//Obtener un elemento:
        starttime = System.nanoTime();
        int elemento = list.get(HALF_INDEX);
        endtime = System.nanoTime();
        result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para la obtención de 1 elemento en un ArrayList:    " + result);
/*
//Establecer un elemento:
        starttime = System.nanoTime();
        for(int i=0;i<SIZE;i++){
            list.set(i,100);
        }
        endtime = System.nanoTime();
        result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para establecer elementos en un ArrayList:          " + result);

//Eliminar un elemento:
        starttime = System.nanoTime();
        elemento = list.remove(SIZE - 1);
        endtime = System.nanoTime();
        result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para la eliminación de 1 elemento en un ArrayList:  " + result);
*/
//--------------------------------------------------------------------------------------------------------
        starttime = System.nanoTime();
        list = new LinkedList<Integer>();
        for(int i=0;i<SIZE;i++){
            list.add(i);
        }
        endtime = System.nanoTime();
        result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para la adición de elementos en un LinkedList:      " + result);


//Insertar un elemento:
        starttime = System.nanoTime();
        list.add(HALF_INDEX,5);
        endtime = System.nanoTime();
        result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para la inserción de 1 elemento en un LinkedList:   " + result);


//Obtener un elemento:
        starttime = System.nanoTime();
        elemento = list.get(HALF_INDEX);
        endtime = System.nanoTime();
        result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para la obtención de 1 elemento en un LinkedList:   " + result);
/*
//Establecer un elemento:
        starttime = System.nanoTime();
        for(int i=0;i<SIZE;i++){
            list.set(i,100);
        }
        endtime = System.nanoTime();
        result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para establecer elementos en un LinkedList:         " + result);

//Eliminar un elemento:
        starttime = System.nanoTime();
        elemento = list.remove(SIZE - 1);
        endtime = System.nanoTime();
        result = (double)(endtime - starttime)/ NANO_SECONDS;
        System.out.println("resultado para la eliminación de 1 elemento en un LinkedList: " + result);
*/
    }


}

