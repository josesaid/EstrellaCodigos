package com.codegym.lessons.module01.lesson11;
public class WideningExample {
    public static void main(String[] args) {
        byte b = 10;
        byte s = 20;
        byte c = (byte)(b + s);


        double dd = 10.3d;
        double z  = (c + dd);
        System.out.println("z: " + z);

        long l = b * b;

        float i = (float)(b + s);
        System.out.println("i: " +i );

        //widening
        short s2 = b;
        System.out.println(s2);

        b = 120;
        metodoQueRecibeSoloLongs(b); //widening
        metodoQueRecibeSoloLongs(s2);
        metodoBoxing(b); //Autoboxing <- Boxing  -> unboxing
        multipleArguments(1,2, 3); //Var-args


    }

    static void metodoQueRecibeSoloLongs(long l){
        System.out.println("metodoQueRecibeSoloLongs: " + l);
    }

    //Wrappers Classes
    static void metodoBoxing(Byte myByte){
        float f = myByte.floatValue();
        System.out.println("F: " + f);
        byte b = myByte.byteValue();
        System.out.println("b: " + myByte); //unboxing
    }




    static void multipleArguments(int ...x){
        for(int i : x){
            System.out.print("i: " + i);
        }
    }
}
