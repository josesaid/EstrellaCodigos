package com.codegym.lessons.module02.lesson12.common;

import com.codegym.lessons.module02.lesson12.notsync.Table;
//import com.codegym.lessons.module02.lesson12.sync.Table;

public class MyThread1 extends Thread {

    private Table t;
    public MyThread1(Table table){
        this.t = table;
    }
    public void run(){
        t.printTable(5);
    }

}
