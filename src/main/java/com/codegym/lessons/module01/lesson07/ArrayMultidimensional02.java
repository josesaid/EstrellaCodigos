package com.codegym.lessons.module01.lesson07;

public class ArrayMultidimensional02 {
    public static void main(String[] args) {
        int [][]array = new int[10][];
        int contador = 1;
        for(int i=0; i<array.length;i++){
            array[i] = new int[contador];
            llenarArreglo(array[i], contador);
            contador++;
        }
        imprimirArreglo(array);
    }

    private static void llenarArreglo(int[] arreglo, int contador) {
        int numero = 1;
        for(int i=0; i<arreglo.length;i++){
            //arreglo[i] = contador;
            arreglo[i] = numero++;
        }
    }

    private static void imprimirArreglo(int[][] arreglo) {
        for(int i=0; i<arreglo.length;i++){
            for(int j=0; j<arreglo[i].length; j++){
                System.out.print(arreglo[i][j]+" ");
            }
            System.out.println();
        }
    }

}
