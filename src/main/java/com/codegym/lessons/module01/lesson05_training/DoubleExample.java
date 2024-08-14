package com.codegym.lessons.module01.lesson05_training;

public class DoubleExample {
    public static void main(String[] args) {
        /*double num1 = -5.45;
        int res1 = (int) Math.floor(num1);
        System.out.println(res1);
         */
        double num1 = -5.45;
        int res1 = Double.valueOf(Math.floor(num1)).byteValue();
        System.out.println(res1);

        double num2 = 5.999999999999999;
        int res2 = (int) Math.floor(num2);
        System.out.println(res2);


        //floor round ceil
        //Math.floor()
        //Math.round()
        //Math.ceil()
    }

}
