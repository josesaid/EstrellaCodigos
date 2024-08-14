package com.codegym.lessons.module01.lesson14;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector02 {
    public static void main(String[] args) {
        printMemoryInfo();
        List<Persona> personas = new ArrayList<>();
        Persona p = null;
        for (int i=0;i<1_000_000;i++){
            p = new Persona("", "");
            personas.add(p);
        }
        printMemoryInfo();

        //Sugiero que se limpie la estructura de datos "persona"
        personas = null;
        System.gc();


        //Despliega la información de memoria, pero ya con nueva data.
        printMemoryInfo();

    }

    static void printMemoryInfo(){
        Runtime rt = Runtime.getRuntime();
        long total_mem = rt.totalMemory();
        long free_mem = rt.freeMemory();
        long used_mem = total_mem - free_mem;
        System.out.println("total_mem: " + total_mem);
        System.out.println("free_mem: " + free_mem);
        System.out.println("Used memory: " + used_mem);
        System.out.println("-------------------------------");
    }

}
