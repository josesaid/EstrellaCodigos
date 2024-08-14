package com.codegym.lessons.module01.lesson12;

public class ConstructoraSaid {

    public static void main(String[] args) {
/*
        Casa c0 = new Casa("verde chiclamino");
        System.out.println(c0);

        Casa c6 = new Casa(4);
        System.out.println(c6);
        System.out.println(c6.toString());

        Biblioteca b1 = new Biblioteca();
        System.out.println(b1.numeroLibros); //100

        Biblioteca b2 = new Biblioteca(200);
        System.out.println(b2.numeroLibros); //200
*/
        //Residencia r1 = new Residencia("Blanca lujosa1 ");
        Residencia r2 = new Residencia("Blanca", 10, 20);
        System.out.println(r2.toString());



        Casa c1 = new Casa("azul");
        Casa c2 = new Casa("azul");
        Casa c3 = new Casa("blanco");
        Casa c4 = new Casa("Verde");
        Casa c5 = new Casa("naranja");

        System.out.println(c1 == c2);

        c2 = null;
        System.out.println(c1.equals(null));


        System.out.println("-----------");
        Residencia r4 = new Residencia("BLANCA");
        Residencia r5 = new Residencia(25);
        Residencia r6 = new Residencia("Melon", 26);

        //System.out.println(r4.getNumeroBanios());
        //System.out.println(r5.getNumeroBanios());
        System.out.println(r4);
        System.out.println(r5);

    }

}
