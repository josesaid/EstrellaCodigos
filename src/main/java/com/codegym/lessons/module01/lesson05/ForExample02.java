package com.codegym.lessons.module01.lesson05;

public class ForExample02 {
    public static final int FIN = 25;

    public static void main(String[] args) {
        for(int i=1; i<=FIN ; i++){
            if(i%2==0 &&  i<=24) {
                System.out.println(i);
            }
        }
    }
}
