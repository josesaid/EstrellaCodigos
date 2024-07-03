package com.codegym.lessons.lesson06;

public class ArrayExample01 {
    public static void main(String[] args) {
        System.out.println("antes");
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println("despues");
    }
}
