package com.codegym.lessons.module01.lesson25;

import org.w3c.dom.ls.LSOutput;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class PathExample {
    static private final String ARCHIVO = "/Users/josesaidolanogarcia/2024-06-25/file03.txt";

    public static void main(String[] args) {
        System.out.println("LocalDate.now(): " +  LocalDate.now());

        Path path = Paths.get(ARCHIVO);
        Path path2 = Paths.get("/users/DeleteMe/file01");
        Path path3 = Path.of("/users/DeleteMe/file01");
        System.out.println(path3.getParent());
        System.out.println(path3.getFileName());
        System.out.println(path3.getRoot());
        System.out.println(path3.toAbsolutePath());
        System.out.println(path3.normalize());
        System.out.println(path3.resolve(path2));
        System.out.println(path2.toAbsolutePath());
        System.out.println(">>" + path3.getNameCount());
        System.out.println("index[2]: " + path3.getName(2-1));
        System.out.println(path3.toFile().isDirectory());

        System.out.println(path3.toAbsolutePath());
    }

}
