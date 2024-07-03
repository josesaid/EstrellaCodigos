package com.codegym.lessons.lesson04;

public class ClaseParaMostrarDebuggerTools {
    public static void main(String[] args) {
        Automovil vw = new Automovil();
        vw.setMarca("Volkswagen");
        vw.setModelo(null);
        vw.setAnio(1972);

        System.out.println(vw);
        System.out.println(vw.toString());



    }

}
