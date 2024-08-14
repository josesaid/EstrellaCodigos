package com.codegym.lessons.module01.lesson17;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, Avion> aviones = new TreeMap<>();

        aviones.put(1990, new Avion("F14", "1990"));
        aviones.put(1991, new Avion("F15", "1991"));
        aviones.put(1992, new Avion("F16", "1992"));
        aviones.put(1993, new Avion("F17", "1993"));

         Set<Map.Entry<Integer, Avion>> avionesEntrySet =  aviones.entrySet();

        for(Map.Entry avion: avionesEntrySet ){
            //System.out.println("Key: " + avion.getKey() + " y su valor es: " + avion.getValue() );
            Object o = avion.getValue();
            Avion a = (Avion)o;
            System.out.println("Key: " + avion.getKey() + " y su valor es: [" + a.getNombre()+", "+a.getAnio()+"]");
        }



        List<Persona> nombrePersonasMartes = new ArrayList<>();
        nombrePersonasMartes.add(new Persona());
        List<List<Persona>> uniquePersonasList = new ArrayList<>();
        uniquePersonasList.add(nombrePersonasMartes);

    }


}

class Persona{}
