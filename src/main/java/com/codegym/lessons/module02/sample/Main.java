package com.codegym.lessons.module02.lesson20.threads.sample;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        int size = readPropertiesFile();

        Buffer buffer = new Buffer(size);
        Productor productor = new Productor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        productor.start();
        consumidor.start();

    }

    private static int readPropertiesFile() {
        String size = null;
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(is);
            size = prop.getProperty("numero_elementos");
            System.out.println(size);
            return Integer.parseInt(size);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
