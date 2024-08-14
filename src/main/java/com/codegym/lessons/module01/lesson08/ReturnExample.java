package com.codegym.lessons.module01.lesson08;

public class ReturnExample {
    public static void main(String[] args) {
        String texto1 = "El dia de hoy estuvimos viendo en clase el uso de Overloading asi como vamos a ver los niveles de acceso...";
        String texto2 = convierteAMayusculas(texto1);
        System.out.println("texto2: " + texto2);
        printNumbers();
        System.out.println("bye");
    }



    private static String convierteAMayusculas(String linea) {
        return linea.toUpperCase();
    }


    static public void printNumbers(){
        for(int i=0; i<10; i++){
            if(i==5)
                return ;
            System.out.print(i+" ");
        }
    }
}
