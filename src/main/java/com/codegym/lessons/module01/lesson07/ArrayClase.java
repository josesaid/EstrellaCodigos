package com.codegym.lessons.module01.lesson07;

import java.util.Arrays;

public class ArrayClase extends Object{

    public static void main(String[] args) {
        String[]nombres = {"Pedro", "Juan", "Pablo"};
        System.out.println(nombres.toString());
        System.out.println(nombres);

        // Create a 2D array
        int[][] mat = new int[2][2];
        mat[0][0] = 99;
        mat[0][1] = 151;
        mat[1][0] = 30;
        mat[1][1] = 5;
        int[][] mate = { {99,151}, {30,5} };

        boolean sonIguales = Arrays.equals(mat[0], mate[0]);
        System.out.println("sonIguales: " + sonIguales);



        // print 2D integer array using deepToString()
        System.out.println(Arrays.deepToString(mat));
    }

}
