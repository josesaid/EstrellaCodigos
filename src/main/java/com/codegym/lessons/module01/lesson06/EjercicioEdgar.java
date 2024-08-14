package com.codegym.lessons.module01.lesson06;


public class EjercicioEdgar {
    public static void main(String[] args) {
        /*String[] palabras = new String[]{
                "Hello", "Hello", "World",
                "Java", "Tasks", "World" };
         */

        String[] palabras = new String[]{
                "Hello", "Hello", "Hello", "p", null,
                "Java", "Java", null, null, "Tasks", "World", null, null, null };

        for(int i=0;i<palabras.length; i++){
            String palabraAComparar = palabras[i];
            for(int j=i+1; palabras[i]!=null && j<palabras.length; j++){
                if(palabraAComparar.equals(palabras[j])){
                    palabras[i] = null;
                    palabras[j] = null;
                }
            }
            //palabraAComparar = null;
            System.out.println("");
        }

        System.out.println("Array al final: ");
        for(String p : palabras){
            System.out.println(p);
        }
    }

}
