package com.codegym.lessons.module01.lesson13;

public class OuterClass {

    void metodoInstancia(){
        System.out.println("innerMethod");
        OuterClass.InnerStaticClass reference =  new OuterClass.InnerStaticClass();
        reference.innerStaticMethod();
        System.out.println("texto: " + OuterClass.InnerStaticClass.texto );
        OuterClass.InnerStaticClass.metodoEstatico(); //Excepción a la regla.
    }
    class InnerClass{
        void innerMethod(){
            System.out.println("innerMethod");
            OuterClass.InnerStaticClass reference =  new OuterClass.InnerStaticClass();
            reference.innerStaticMethod();
            System.out.println("texto: " + OuterClass.InnerStaticClass.texto );
            OuterClass.InnerStaticClass.metodoEstatico(); //Excepción a la regla.
        }
    }
    static class InnerStaticClass{

        private static String texto = "Algo secreto";
        void innerStaticMethod(){
            System.out.println("innerStaticMethod");
        }
        static void metodoEstatico(){
            System.out.println("metodoEstatico");
        }
    }

    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.innerMethod();

        OuterClass outerInstance = new OuterClass();
        outerInstance.metodoInstancia();
        //InnerStaticClass innerInstance = new InnerStaticClass();
        //innerInstance.innerStaticMethod();



    }

    //IoC - Principle
    //Dependency Injection - Design pattern
}
