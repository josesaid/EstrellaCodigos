package com.codegym.lessons.module01.lesson20;

import java.util.ArrayList;
import java.util.List;


public class Exception02Example {
    public static void main(String[] args) {
        List<String> issues = new ArrayList<>();
        int saldo = 1_000;
        try{
            int saldoResultante = comprarArticulo(saldo);
            System.out.println("saldoResultante: " +saldoResultante);
        }catch(SaldoNoSuficienteException e){
            //System.out.println("Tus matematicas no son correctas, por favor revisa tu saldo actual antes de comprar algun articulo");
            //System.out.println("Operación incorrecta, no se cuenta con suficiente saldo...");
            System.err.println(e.getMessage());

            //algun familiar o amigo nos regaló dinero
            saldo = 5000;

            for(Articulo articulo : e.getListaArticulosNoComprados()){
                System.out.println("Intentando comprar el articulo: " + articulo.getNombre()+" que cuesta: " +articulo.getPrecio());
                boolean puedoComprarConElNuevoSaldo = puedoComprar(saldo, articulo.getPrecio());
                if(puedoComprarConElNuevoSaldo){
                    System.out.println("ahora, compro el"+ articulo.getNombre()+" que cuesta: " +articulo.getPrecio());
                    saldo = saldo - articulo.getPrecio();
                }
            }


        }finally {

            System.out.println("Hallar o no hallar excepcion, apareceré....");
            System.out.println("Despues de todos los errores, al final me quedó un saldo de: " + saldo);
            issues = null;
            System.gc();
        }

    }

    static private int comprarArticulo(int saldo) throws SaldoNoSuficienteException {
        boolean tengoSaldo = true;
        System.out.println("intentando comprar una playera");
        tengoSaldo = puedoComprar(saldo, 350);
        if(tengoSaldo==true){
            saldo = saldo - 350;
            System.out.println("Saldo actualizado después de comprar la playera: " + saldo);
        }

        System.out.println("intentando comprar los zapatos negros");
        //comprando los zapatos negros
        tengoSaldo = puedoComprar(saldo, 550);
        if(tengoSaldo==true){
            saldo = saldo - 550;
            System.out.println("Saldo actualizado después de comprar los zapatos negros: " + saldo);
        }

        //comprando el pantalon
        System.out.println("intentando comprar un pantalon de 250");
        tengoSaldo = puedoComprar(saldo, 250);
        if(tengoSaldo==true){
            saldo = saldo - 550;
        }else{
            //System.out.println("no puedes comprar el articulo de 250, porque actualmente tienes: " + saldo);
            throw new SaldoNoSuficienteException("**No puedes comprar un pantalon de 250, porque solo tienes: "+ saldo, new Articulo("pantalon", 250));
        }

        return saldo;
    }

    static private boolean puedoComprar(int saldo, int precioArticulo){
        return saldo>=precioArticulo ? true : false;
    }

}
