package com.codegym.lessons.module01.lesson21;

public class StackTraceExample {
    public static void main(String[] args) {
       /* Thread thread = Thread.currentThread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getStackTrace());

        System.out.println("-----------------");
        metodoA();
        StackTraceElement[] stackTraceElement = thread.getStackTrace();
        for(StackTraceElement ste : stackTraceElement){
            System.out.println("1.-" + ste.getClassName());
            System.out.println("2.-" + ste.getClass());
            System.out.println("3.-" + ste.getFileName());
            System.out.println("4.-" + ste.getMethodName());
        }
        System.out.println("--");
        */
        try {
            metodoA();
        }catch(Exception e){
            StackTraceElement[] stackTraceElement = e.getStackTrace();
            for(StackTraceElement ste : stackTraceElement){
                System.out.println("1.-" + ste.getClassName());
                System.out.println("2.-" + ste.getClass());
                System.out.println("3.-" + ste.getFileName());
                System.out.println("4.-" + ste.getMethodName());
                System.out.println("5.-" + ste.getLineNumber());
            }
        }finally{
            System.out.println("Adiós...");
        }
    }

    private static void metodoA() {
        System.out.println("metodo A");
        new ClaseB().metodoB();
    }
    //SaidFileNotFoundException
    //FileNotFoundException
    //IOException
    //Exception
}
