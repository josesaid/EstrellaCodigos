package com.codegym.lessons.module02.lesson09;

import java.sql.SQLException;

public class Cuadrado {
    public Cuadrado(int ...varargs){}
    protected Cuadrado(int a, int b, int c) throws ArrayIndexOutOfBoundsException{}
    private Cuadrado(int a, int b)throws NullPointerException {}
    Cuadrado(int a)throws SQLException {}
    public Cuadrado(){}


    private void medir(){
        System.out.println("Medir...");
    }


}
