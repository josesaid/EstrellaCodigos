package com.codegym.lessons.module01.lesson05;

import java.util.Scanner;
/*
Segundo número más pequeño ingresado
*/
public class Edgar {
    public static void main(String[ ]  args) {
//escribe aquí tu código
        Scanner in= new Scanner(System.in);
        int contador= 0;//evaluar el error
        int min= Integer.MAX_VALUE;
        int mxm= Integer.MIN_VALUE;
        int segundo= Integer.MAX_VALUE;
//recorro y me quedo con un minimo,
//recorro y me quedo con un maximo
//recorro nuevamente y
// si el numero entrante distinto de minimo y menor al maximo mas cercano
//es el numero
        while(in.hasNextInt()){
            int number= in.nextInt();
            contador++ ;
            if(number< min){ //tengo el minimo
                min= number;
//}else if(number> mxm){
//mxm= number;
            }
            else{
                if(min< number&&number< segundo){
                    segundo= number;
                }
            }
        }
        if(contador> 2){
            System.out.print(segundo);
        }
    }
}