package com.codegym.lessons.module02.lesson12.example01.common;

//import com.codegym.lessons.module02.lesson12.example01.notsync.Table;
import com.codegym.lessons.module02.lesson12.example01.sync.Table;

public class MyThread2 extends Thread {
    private Table t;
    MyThread2(Table table){
        this.t = table;
    }
    public void run(){
        t.printTable(100);
    }

}
