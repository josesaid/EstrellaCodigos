package com.codegym.lessons.module01.lesson25;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamExample {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/josesaidolanogarcia/");
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path ruta : files) {
                System.out.println("ruta: " + ruta.getFileName());
            }
        }
    }

}
