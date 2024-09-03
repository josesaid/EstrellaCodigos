package com.codegym.lessons.module02.lesson12.sync;

public class Table {
    public synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

}
