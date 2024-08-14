package com.codegym.lessons.module01.projectsample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    public void crear(Object uno, Integer cadena, File path){

    }

    public int obtenerDesplazamineto(String path) throws IOException {
        //BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        System.out.println("Escribe una linea de texto: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();

        System.out.println("");
        String temp = null;
        int x = 1;
        List<String> lineas = new ArrayList<>();
        while(linea!=null && !linea.equals("s")){
            temp = linea;
            System.out.println(x++ + linea);
            linea = br.readLine();
            lineas.add(linea);
        }
        char[]chars = temp.toCharArray();
        for(int i=0; i<chars.length; i++){
            System.out.print(chars[i]+"|");
        }
        String line2 = new String(chars);
        System.out.println(lineas);
        return -1;
    }

}
