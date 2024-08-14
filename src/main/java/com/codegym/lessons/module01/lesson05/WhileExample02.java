package com.codegym.lessons.module01.lesson05;

public class WhileExample02 {
    public static void main(String[] args) {
        int n = numeroMagico();
        while(n > 0){
            System.out.println(n);
            //n = n - 10;
            n -=10;
        }
        System.out.println("while N al final tiene: " + n );
        //-----
        ;
        for(n = numeroMagico(); n > 0 ; ){
            System.out.println(n);
            n = n-10;
        }
        System.out.println("for N al final tiene: " + n );
    }

    static int numeroMagico(){
        return 100;
    }
}
