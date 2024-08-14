package com.codegym.lessons.module01.lesson07;

public class ArrayBidimensionalExample {
    static int X = 2; //filas
    static int Y = 3; //columnas
    public static void main(String[] args) {
        int contador = 1;
        int [][]array = new int [X] [Y];

        //Este for nos permite iterar sobre el array X
        for(int i=0; i<array.length;i++ ){

            //Este for nos permite iterar sobre el array Y
            for(int j=0; j<array[i].length; j++ ){
                array[i][j] = contador++;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        /*for(int i=0; i<array.length;i++ ){
            for(int j=0; j<array[i].length; j++ ){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/
    }

}
