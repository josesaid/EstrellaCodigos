package com.codegym.lessons.module01.lesson07;

public class ArrayMultidimensionalExample {
    static int X = 5;
    static int Y = 5;
    static int Z = 5;
    public static void main(String[] args) {
        int contador = 1;
        int[][][] array = new int[X][Y][Z];
        for(int i=0; i<array.length;i++ ){
            for(int j=0; j<array[i].length; j++ ){
                for(int k=0; k<array[i][j].length; k++){
                    array[i][j][k] = contador++;
                }
            }
        }

        for(int[][]b : array) {
            for (int[] a : b) {
                for (int numero : a) {
                    System.out.println(numero);
                }
            }
        }
    }

}
