package com.codegym.lessons.module01.lesson11;

public class Polimorfismo {
    public static void main(String[] args) {
        Instructor said = new Instructor();
        said.setNombre("Jose Said");
        said.saludar();
        said.impartirAsesoria();


        Participante nesthor = new Participante();
        nesthor.setNombre("Nesthor");
        nesthor.recibeAsesoria();
        nesthor.saludar();
        nesthor.hablar();

        saludarSoloPersonas(said);
        saludarSoloPersonas(nesthor);

        //corregir lo siguiente:
        //SerHumano ser = new SerHumano();
        SerHumano ser = new Participante();
        respirarAireContaminado(ser);

    }

    static void saludarSoloPersonas(Persona persona){
        persona.saludar(); //VMI - Invocacion de metodos virtuales
    }

    static void respirarAireContaminado(SerHumano humano){
        humano.respirar();
    }

}
