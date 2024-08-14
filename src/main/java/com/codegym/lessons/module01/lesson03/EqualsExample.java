package com.codegym.lessons.module01.lesson03;

public class EqualsExample {
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "HOLA";
        String s3 = s1.toUpperCase();
        System.out.println(s1.equals(s2)); //Hola es_igual_a? HOLA
        System.out.println(s1.equals(s3)); //Hola es_igual_a? HOLA
        System.out.println(s2.equals(s3)); //HOLA es_igual_a? HOLA

        System.out.println(s1.toUpperCase() == s2.toUpperCase());
    }

}
