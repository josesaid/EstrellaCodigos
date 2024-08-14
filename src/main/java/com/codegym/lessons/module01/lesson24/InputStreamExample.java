package com.codegym.lessons.module01.lesson24;

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        String path = "/Users/josesaidolanogarcia/DeleteMe/File01.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStream input = new BufferedInputStream(fileInputStream ) ;
            byte[]byteArray = input.readAllBytes();
            String contenido = new String(byteArray);
            System.out.println("Contenido: " +contenido);
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}