package com.codegym.lessons.module01.lesson08;

public class PrivateExample {
    public static void main(String[] args) {
        Auto elAutoDeJoseManuel = new Auto();
        Auto autoDeSaid = new Auto();

        elAutoDeJoseManuel.setPlaca("JFK-987");

        System.out.println(elAutoDeJoseManuel.getPlaca());


        autoDeSaid.setPlaca("ABC-246");

        System.out.println(autoDeSaid.getPlaca());
    }

}
