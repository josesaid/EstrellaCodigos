package com.codegym.lessons.module01.lesson08;

public class ArrayAsReference {
    public static void main(String[] args) {
        int[][]array = {{2,4}, {5, 6, 7}, {8,9,10, 11}};
        fill(array, -1);
    }

    private static void fill(int[][] array, int valor) {
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = array[i][j] * valor;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
