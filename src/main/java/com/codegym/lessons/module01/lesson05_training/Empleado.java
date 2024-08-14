package com.codegym.lessons.module01.lesson05_training;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    private String nombre;
    private int edad;
    private String email;
    private String area;
}
