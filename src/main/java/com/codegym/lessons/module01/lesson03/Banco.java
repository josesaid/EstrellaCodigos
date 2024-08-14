package com.codegym.lessons.module01.lesson03;

public class Banco {
    public static void main(String[] args) {
        int saldo = 10_000;
        int pago = 2_000;
        int monto = saldo - pago;
        System.out.println(monto);
        boolean condition01 = (pago >1_000);
        boolean condition02 = (saldo > 5_000);
        boolean condition = condition01 && condition02;
        if(condition){
            System.out.println("haz algo porque el escenario para hacer algo es el adecuado");
        }else{
            System.out.println("La condicion no se cumplio, puedes hacer otra cosa");
        }
        System.out.println( condition ? "haz algo porque el escenario para hacer algo es el adecuado" : "La condicion no se cumplio, puedes hacer otra cosa" );
        /*if(!condition){
            System.out.println("La condicion no se cumplio, puedes hacer otra cosa");
        }else{
            System.out.println("haz algo porque el escenario para hacer algo es el adecuado...");
        }*/
    }
}
