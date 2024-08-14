package com.codegym.lessons.module01.lesson02;

public class MemoryExample {

    public static void main(String[] args) {
        long initialMemory = Runtime.getRuntime().totalMemory();
        System.out.println("initialMemory : " + initialMemory);
        for(int i=0; i<1_000_000; i++){
            Object obj = new Object();
            String str = obj.toString();
            char []array = str.toCharArray();
            //System.out.println(array);
        }
        long endingMemory =  Runtime.getRuntime().freeMemory();
        //long endingMemory = Runtime.getRuntime().totalMemory();
        System.out.println("endingMemory  : " + endingMemory);
    }

}
