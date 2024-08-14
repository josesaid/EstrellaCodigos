package com.codegym.lessons.module01.lesson15;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Grupo extends Object{ //IS A
    private List<Alumno> alumnos = new ArrayList<>();
    //Has A
}
