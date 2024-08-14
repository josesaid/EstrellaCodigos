package com.codegym.lessons.module01.lesson03;

public class Comparaciones {
    public static void main(String[] args) {
        final int MAX_PARTICIPANTES = 50;
        int numeroParticipantes = 37;
        if(numeroParticipantes<=MAX_PARTICIPANTES) {
            System.out.println("Los primeros " + MAX_PARTICIPANTES + " participantes si pueden entrar en la llamada...");
        }else {
            System.out.println("A partir del participante #" + (MAX_PARTICIPANTES + 1) + " no podrá entrar en la llamada");
        }
        System.out.println("FIN");
    }

}
