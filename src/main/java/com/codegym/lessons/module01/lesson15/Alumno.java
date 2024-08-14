package com.codegym.lessons.module01.lesson15;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
}
