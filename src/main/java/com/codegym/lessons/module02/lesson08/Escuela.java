package com.codegym.lessons.module02.lesson08;

public class Escuela {
    public Escuela(){
        System.out.println("Constructor...");
        System.out.println(cooperacion * 1.10);
    }
    static private float cooperacion;

    {
        System.out.println("bloque de instancia 1");
    }

    static{
        System.out.println("bloque estatico 1");
        cooperacion = 50.6f;
    }

    {
        System.out.println("bloque de instancia 2");
    }

    static {
        System.out.println("bloque estatico 2");
    }

}
