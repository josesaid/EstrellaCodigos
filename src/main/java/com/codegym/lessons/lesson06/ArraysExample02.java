package com.codegym.lessons.lesson06;

public class ArraysExample02 {
    public static void main(String[] args) {
        int [] longitudes  = new int[args.length];
        for(int i=0; i< args.length; i++){
            //String cadena = args[i];
            //System.out.println(cadena.toUpperCase());
            longitudes[i] = args[i].length();
            String nombre = args[i];
            System.out.println(nombre + "->" + longitudes[i]);
        }
    }

}
