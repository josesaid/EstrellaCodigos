package com.codegym.lessons.module01.lesson05_training;

public class WhileExample20 {
    public static void main(String[] args) {
        int i=1;
        while(i<=20){
            i++;
            if(i%7==0) {
                continue;
            }
            System.out.println(i);

        }
    }

}
