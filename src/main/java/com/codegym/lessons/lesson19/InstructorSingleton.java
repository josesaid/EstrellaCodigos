package com.codegym.lessons.lesson19;

public class InstructorSingleton {

    private static InstructorSingleton instance = null;

    private InstructorSingleton(){
    }

    public static InstructorSingleton getInstance() {
        if(instance ==null)
             instance = new InstructorSingleton();
        return instance;
    }

}
