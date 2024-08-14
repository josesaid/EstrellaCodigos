package com.codegym.lessons.module01.lesson05;

public class DoWhile {
    public static void main(String[] args) {
        int x =11;
        while(x<=10){
            System.out.println(x++);
        }
        System.out.println("-------");
        for(int i=11; i<=10; ){
            System.out.println(i++);
        }
        System.out.println("*********************");
        int i=11;
        do{
            System.out.println(i++);
        }while(i<=10);
    }

}
