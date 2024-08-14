package com.codegym.lessons.module01.lesson10;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("El dia de hoy no podia crear una instancia del tipo de dato StringBuilder por distraido");
        sb.insert(13, " ").insert(13,", 3 de mayo,");
        sb.replace(0, 10, "XXX").deleteCharAt(6);
        sb.delete(0, 3);
        int index = sb.indexOf("StringBuilderuuu");
        System.out.println("index : " + index );

        int index2 = sb.lastIndexOf("distraido");
        System.out.println("index2: " + index2 );

        System.out.println(sb.charAt(35));

        System.out.println(sb.substring(9,13));

        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.length());
    }

}
