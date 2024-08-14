package com.codegym.lessons.module01.lesson03;

public class IfExample {

    public static void main(String[] args) {
        int hora = 6;
        int minutos = 58;
        String horario = "pm";
        boolean minutosCorrectos = false;
        boolean horaCorrecta = false;
        boolean horarioCorrecto = false;

        if(minutos>=0 && minutos <=60){
            minutosCorrectos = true;
        }else{
            minutosCorrectos = false;  //Esta linea no debería de ir...pero la dejo solo como referencia.
        }

        if(hora >=7 && hora <=9){
            horaCorrecta = true;
        }else{
            horaCorrecta = false;
        }

        // == compara referencias en memoria
        // mientras que el método equals, compara valores (en este ejemplo, compara las cadenas de texto)
        if(horario.equalsIgnoreCase("PM")) {
            horarioCorrecto = true;
        }else {
            horarioCorrecto = false;
        }

        /*
        if(minutosCorrectos == true)
            if(horaCorrecta ==true)
                if(horarioCorrecto ==true)
         */
        if(minutosCorrectos && horaCorrecta && horarioCorrecto){
            System.out.println("Todo esta en orden para tomar la sesion de Java");
        }else{
            System.out.println("No se puede tomar la sesión fuera de horario... ");
        }


    }

}
