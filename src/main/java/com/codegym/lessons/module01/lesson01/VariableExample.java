package com.codegym.lessons.module01.lesson01;

public class VariableExample {
    public static void main(String[] args) {
        int edad = 40;
        edad = 41;

        String nombreAlumno = "Eduardo";
        System.out.println(nombreAlumno);
        System.out.println(edad);

        int a, b, c;
        int d;

        String nombre, apellidoPaterno, apellidoMaterno;
        String correoElectronico;
        int edadEmpleado;

        nombre = "Juan";
        apellidoPaterno = "Perez";
        apellidoMaterno = "Hernandez";
        edadEmpleado = 18;
        correoElectronico = "elTerribleJuan@gmail.com";

        int edadTotal = edad + edadEmpleado;
        System.out.println("edadTotal es: " + edadTotal);
    }

 }