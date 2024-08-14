package com.codegym.lessons.module01.lesson15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample02 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Amos");
        nombres.add("Antonio");
        nombres.add("Ferenc");

        nombres.add("Johan");
        nombres.add("Jose Manuel");
        nombres.add("Miroslava");
        nombres.add("Roberto Ernesto");


        //String []a = new String[nombres.size()];
        String []nombresArray = /*(String[])*/nombres.toArray(new String[nombres.size()]);
        for(String item: nombresArray){
            System.out.println("item: " + item);
        }


        for(String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println("--------------------");
        for(int i = 0; i<nombres.size(); i++){
            String nombre = nombres.get(i);
            System.out.println(nombre);
        }

        System.out.println(nombres.contains("Antonio") ?"Antonio si esta en la lista":" Antonio no está en la lista");

        //agrega a la lista en la posición indicada
        nombres.add(3, "Said");

        //set - reemplaza en la posición indicada
        nombres.set(3, "Said");

        System.out.println(nombres);

        boolean eliminoSaid = nombres.remove("Said");
        System.out.println("eliminó  a Said ????: " + eliminoSaid) ;
        System.out.println(nombres);

        nombres.clear();
        System.out.println(nombres);
        System.out.println(nombres.size()==0 ? "lista vacia" : "lista con elementos: " + nombres.size());
    }

}
