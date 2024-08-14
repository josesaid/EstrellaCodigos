package com.codegym.lessons.module01.lesson17;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> participantes = new HashMap<>();
        participantes.put(1, "Juan");
        participantes.put(2, "Enrique GDL");
        participantes.put(2, "Alicia");
        participantes.put(3, "Jorge");
        participantes.put(4, "Diego");
        //participantes.put(5, "Enrique Valencia");
        participantes.put(5, "Enrique");
        participantes.put(7, "Said");

        System.out.println(participantes.size());
        System.out.println(participantes.get(2));
        System.out.println(participantes.containsKey(5));
        System.out.println(participantes.containsKey(6));
        System.out.println(participantes.containsValue("Juan"));
        System.out.println(participantes.containsValue("Pedro"));
        String elementoEliminado = participantes.remove(7);
        System.out.println("elementoEliminado : " + elementoEliminado);
        System.out.println(participantes.size());
        for(int participanteId : participantes.keySet()){
            System.out.println("participanteId: " + participanteId);
        }

        participantes.put(10, "Isabel");
        System.out.println("VALUES: " + participantes.values() );
        List<String> participantesLista = new ArrayList<>(participantes.values());
        for(String p : participantesLista){
            System.out.println(p);
        }
        participantes.put(10, "Antonio");
        //-----------------
        //intentaré añadir un nombre duplicado, pero no tendré éxito.

        //
        Set<String> names = new HashSet<>(participantes.values());
        for(String nombre : names){
            System.out.println("nombre: " + nombre);
        }
        //--------
        System.out.println("--------------------------------------------------------");
        Set<Map.Entry<Integer, String>> filas = participantes.entrySet();
        for(Map.Entry fila : filas){
            System.out.println("Fila:  Key: " + fila.getKey() + " y su valor es: " + fila.getValue());
        }


    }

}
