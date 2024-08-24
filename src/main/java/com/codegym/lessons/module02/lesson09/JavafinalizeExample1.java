package com.codegym.lessons.module02.lesson09;

class Triangulo {
    void dibujar(){}
}
public class JavafinalizeExample1 {
    static Triangulo t1;
    static Triangulo t2;
    public static void main(String[] args) {
        t1 = new Triangulo();
        t1.dibujar();
        t2 = new Triangulo();
        t2.dibujar();
        JavafinalizeExample1 obj = new JavafinalizeExample1();
        System.out.println(obj.hashCode());

        // calling garbage collector
        System.gc();
        System.out.println("end of garbage collection");
        obj = null;
    }

    @Override
    protected void finalize() {
        t1 = null;
        t2 = null;
        System.out.println("finalize method called");
    }
}
