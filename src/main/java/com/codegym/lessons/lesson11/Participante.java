package com.codegym.lessons.lesson11;

public class Participante extends Persona{

    public void recibeAsesoria(){
        System.out.println("Recibe asesoria en Java");
    }

    public void hablar(){
        System.out.println("El participante está hablando...");
    }

    @Override
    public void respirar() {
        System.out.println("respinando como un participante");
    }
}
