package com.codegym.lessons.module01.lesson12;

public class PersonaEqualsExample {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("omar");
        p1.setEdad(20);
        Persona p2 = new Persona();
        p2.setNombre("amor");
        p2.setEdad(20);

        Gato g1 = new Gato();

        System.out.println( p1.equals(p2) );

        System.out.println(p1.getEdad());
        System.out.println(p2.getEdad());

        System.out.println(p1.hashCode() == p2.hashCode());
        /*
        String representacion01 = p1.toString();
        String representacion02 = p2.toString();
        System.out.println(representacion01.equalsIgnoreCase(representacion02));
         */
    }

}
