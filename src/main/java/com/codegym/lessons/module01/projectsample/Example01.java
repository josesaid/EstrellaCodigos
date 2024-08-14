package com.codegym.lessons.module01.projectsample;

import java.io.*;

public class Example01 {

    public static void main(String[] args) throws IOException {
        //String path = "//Users//josesaidolanogarcia//archivos//cambios.txt";
        String path = "//Users//josesaidolanogarcia//archivos//said_encriptado.txt";

        FileManager fileManager = new FileManager();
        int cambio = fileManager.obtenerDesplazamineto(path);

        //Desencriptar instance = new Desencriptar();
        //instance.desencriptar(cambio, new Object());

    }

}
