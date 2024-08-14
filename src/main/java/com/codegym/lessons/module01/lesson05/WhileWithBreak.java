package com.codegym.lessons.module01.lesson05;

public class WhileWithBreak {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x = x + 1;
            if (x == 6){
                break;
            }
        }
        System.out.println("Afuera del break...x vale: " + x);
    }

}