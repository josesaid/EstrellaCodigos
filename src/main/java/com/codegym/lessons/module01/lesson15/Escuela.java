package com.codegym.lessons.module01.lesson15;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

import static com.codegym.lessons.module01.lesson15.ControlEscolar.generarReporte;

@Data
public class Escuela {
    private String nombre;
    private ArrayList<Grupo> grupos = new ArrayList<>();

    public static void main(String[] args) {
        Escuela primariaNiñosHeroes = new Escuela();
        primariaNiñosHeroes.setNombre("Primaria Niños Heroes de Nacozari");

        Grupo grupoPrimerAnio = new Grupo();
        Grupo grupoSegundoAnio = new Grupo();

        List<Alumno> alumnosPrimariaPrimerAnio = grupoPrimerAnio.getAlumnos();
        alumnosPrimariaPrimerAnio.add(new Alumno("Pepe", "Hernandez", "Fernandez"));

        grupoPrimerAnio.getAlumnos().add(new Alumno("Pedro", "Fernandez", "Fernandez"));
        grupoPrimerAnio.getAlumnos().add(new Alumno("Paco", "Fernandez", "Garcia"));

        grupoSegundoAnio.getAlumnos().add(new Alumno("Gaby", "Hernandez", "Matias"));
        grupoSegundoAnio.getAlumnos().add(new Alumno("Alicia", "Hernandez", "Fernandez"));
        grupoSegundoAnio.getAlumnos().add(new Alumno("Fernanda", "Mares", "Castro"));

        primariaNiñosHeroes.getGrupos().add(grupoPrimerAnio);
        primariaNiñosHeroes.getGrupos().add(grupoSegundoAnio);

        generarReporte(primariaNiñosHeroes);
    }

    }
