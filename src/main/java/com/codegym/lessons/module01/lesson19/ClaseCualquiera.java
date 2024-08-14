package com.codegym.lessons.module01.lesson19;

public class ClaseCualquiera {
    public static void main(String[] args) {
        System.out.println("HOla Mundo");
        InstructorSingleton x = InstructorSingleton.getInstance();




        x = InstructorSingleton.getInstance();
    }

}
