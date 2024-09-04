package com.codegym.lessons.module02.lesson12.example01.common;

//import com.codegym.lessons.module02.lesson12.example01.notsync.Table;
import com.codegym.lessons.module02.lesson12.example01.sync.Table;

public class TestSynchronization1 {
    public static void main(String[] args) {
        Table obj = new Table();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        //t2.setPriority(10);
        //t1.setPriority(1);
        t1.start();
        t2.start();
    }

}
