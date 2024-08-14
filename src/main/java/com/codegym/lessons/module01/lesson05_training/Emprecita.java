package com.codegym.lessons.module01.lesson05_training;

public class Emprecita {
    public static void main(String[] args) {
        Empleado e = new Empleado("Juan", 35, "juan@empresa.com", "Informatica");
        System.out.println(e);
        e.setNombre("Juan Perez");
        System.out.println(e);
    }
}
