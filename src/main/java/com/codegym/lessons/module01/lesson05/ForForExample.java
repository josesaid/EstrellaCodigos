package com.codegym.lessons.module01.lesson05;

public class ForForExample {

    public static void main(String[] args) {
        for(int x=1; x<=100; x++){
            for(int y =1; y<=100; y++){
                for(int z=1; z<=100; z++){
                    System.out.println("x: " + x+", y: " + y+", z: " +z);
                }
            }
        }
    }
}
