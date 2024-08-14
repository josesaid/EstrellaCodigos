package com.codegym.lessons.module01.lesson10;

public class StringExample01 {
    public static void main(String[] args) {
        //String texto = "Hoy es jueves 28 de marzo del 2024.";
        //texto = texto.toUpperCase();
        //System.out.println( texto );
        StringBuilder sb = new StringBuilder();
        sb.append("Hoy es jueves 28 de marzo del 2024.");
        sb.append(" Y son las 7.45pm CST.");
        sb.reverse().reverse().insert(10, "BOTELLA DE AGUA");
        System.out.println(sb);
        String substring = sb.substring(15);
        //System.out.println(sb.toString());
        System.out.println(substring);

        int index = sb.delete(1,60).indexOf("7");
        System.out.println(index);
        //sb.setCharAt(0, 'X');
        sb.insert(0, "X");
        System.out.println(sb);
    }



}
