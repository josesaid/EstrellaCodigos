package com.codegym.lessons.module01.lesson25;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FilesExample {
    public static void main(String[] args) throws IOException {
        createMyOwnFile(Path.of("/users/josesaidolanogarcia/JavaDesdeCeroSaidVersion1.txt"));
        createMyCustomDirectory(Path.of("/users/josesaidolanogarcia/newFolder123456"));
    }

    private static void createMyCustomDirectory(Path directoryPath) {
        log.warn("Beginning method: createMyCustomDirectory");
        Path directoryCreatedPath = null;
        try {
            directoryCreatedPath = Files.createDirectory(directoryPath);
            log.info("directoryCreatedPath: " + directoryCreatedPath);
        } catch (Throwable e) {
            log.error("El directorio no se creó está ocasión, porque ya existía...: ");
        }
        log.warn("Finishing method: createMyCustomDirectory");
    }

    private static void createMyOwnFile(Path path) {
        log.warn("Beginning method: createMyOwnFile");
        Path createdFilePath = null;
        try {
            if (!path.toAbsolutePath().getFileName().toFile().exists()) {
                createdFilePath = Files.createFile(path);
                log.info("File Created at Path : " + createdFilePath);
            } else {
                log.info("el archivo ya existe y no se debería crear...");
            }
        } catch (IOException e) {
            log.error("el archivo no se creó está ocasión, porque ya existía...: ");
        } catch (Throwable e) {
            log.error("Error en: " + e.getMessage());
        }
        log.warn("Finishing method: createMyOwnFile");
    }

}
