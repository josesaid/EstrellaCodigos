package com.codegym.lessons.module01.lesson16;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Character, Integer> caracteres = new HashMap<>();
        String texto = "El dia de hoy Said revisó varios temas, pero al final terminado un poco cansado";
        texto = texto.toUpperCase();
        for(int i=0; i<texto.length(); i++){
            char c = texto.charAt(i);
            if(!caracteres.containsKey(c)){
                caracteres.put(c, 1);
            }else{
                //int contador = caracteres.get(c);
                //contador = contador+1;
                caracteres.put(c, caracteres.get(c)+1);
            }
        }

        for (Map.Entry<Character,Integer> entry : caracteres.entrySet()){
            System.out.println(entry.getKey()+" aparece: " + entry.getValue() + " veces.");
        }

    }

}
