package com.codegym.lessons.module01.lesson16;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List valores = new ArrayList();
        valores.add("Amos");
        valores.add(new Carrito());
        valores.add(3.141529);
        valores.add(true);

        System.out.println(valores);

        List<String> nombres = new ArrayList<>();
        nombres.add("Amos");
        nombres.add("Ferenc");
        nombres.add("Ayrton");
        //nombres.add(new Carrito()); //no se puede porque el método add espera solo Strings, no carritos

        boolean resultado = nombres.contains("Ayrton");
        System.out.println("resultado: " + resultado);
        System.out.println(nombres);

        for(String item : nombres){
            System.out.println("item: " + item);
        }
        for(int i=0; i<nombres.size();i++){
            String nombre = nombres.get(i);
            System.out.println("nombre: " + nombre);
        }

        System.out.println(nombres.add("Jean"));
        System.out.println(nombres);

        System.out.println(nombres.remove("Ferenc"));
        System.out.println(nombres);

        nombres.clear();
        System.out.println(nombres);

    }

}

@Data
class Carrito{}