package com.codegym.lessons.module01.lesson19;

public class SwitchEnumExample {
    public static void main(String[] args) {
        DIAS dia = DIAS.X;
        System.out.println(dia.ordinal());
        DIAS[] dias = DIAS.values();
        for(DIAS dia2 : dias){
            System.out.println(dia2.toString());
        }

        switch (dia){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println(dia+" es laboral");
                break;
            case SABADO:
                System.out.println("Sabado se lava la ropa");
                break;
            case DOMINGO:
                System.out.println("Domingo, es mi dia libre");
                break;
            default:
                System.out.println("ESTE dia no existe: " + dia);
        }
        System.out.println("Afuera del switch....");
    }

}


