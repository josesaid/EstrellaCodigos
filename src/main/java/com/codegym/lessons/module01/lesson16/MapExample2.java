package com.codegym.lessons.module01.lesson16;

import java.util.Hashtable;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String, String> data = new Hashtable<>();
        data.put("1", "a");
        data.put("2", "b");
        data.put("3", "c");
        data.put("3", "G");
        data.put("4", "d");

        System.out.println(data.size());
        //Set<Map.Entry<String, String>> datos = data.entrySet();
        for(Map.Entry<String, String> fila : data.entrySet()){
            System.out.println(fila.getKey() + " -> " + fila.getValue());
        }
    }

}
