package com.codegym.lessons.module01.lesson05_training;

public class ForExample {
    public static void main(String[] args) {
        for(int i=100; i>0; i--){
            if(i<10 && i>1){
                continue;
            }
            if(i % 2 ==0){
                System.out.println(i+" es numero par");
            }else{
                System.out.println(i+" es numero impar");
            }
        }
        System.out.println("bye");
    }

}
