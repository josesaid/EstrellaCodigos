package com.codegym.lessons.module01.lesson05_training;

public class WhileKevin01 {
    public static void main(String[] args) {
        int height = 1;
        while (height <= 10) {
            int width = 1;
            //El siguiente while permite pintar cada columna
            while (width <= 20) {
                if (height == 1) {
                    System.out.print('A');
                } else if(height == 10) {
                    System.out.print('D');
                } else if (width == 1 ) {
                    System.out.print('I');
                } else if (width == 20) {
                    System.out.print('d');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}
