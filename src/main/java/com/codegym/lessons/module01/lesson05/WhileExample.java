package com.codegym.lessons.module01.lesson05;

public class WhileExample {
    public static void main(String[] args) {
        int n = 5;
        while(n > 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("n:" + n);
        /*
        //-----

        n = 5;
        for(n=5; n>0; n--){
            System.out.println(n);
        }
        System.out.println("n:" + n);
         */
    }

}
