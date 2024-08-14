package com.codegym.lessons.module01.lesson05_training;

public class ForExample20 {
    public static void main(String[] args) {
        int i=1;
        for (; i <=20; ) {
            if(i%7==0){
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}
