package com.codegym.lessons.module01.lesson05;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            if(i==5)
                continue;
            System.out.println(i);
        }
    }

}
