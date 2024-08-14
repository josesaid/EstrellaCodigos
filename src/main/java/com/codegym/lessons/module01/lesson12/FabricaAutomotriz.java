package com.codegym.lessons.module01.lesson12;

public class FabricaAutomotriz {
    public static void main(String[] args) {
        Carro focus = new Carro("Ford", "2024", "Azul", "Explorer XLS");
        Carro vocho = new Carro("VW", "1972", "amarillo", "Limited");

        Carro tesla = new Carro("Tesla", "Blanco", "Limited");

        Carro cruze = new Carro("2023", "Blanco");

        System.out.println(new Carro().toString());
    }

}
