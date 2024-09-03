package com.codegym.lessons.module02.lesson12.common;

import com.codegym.lessons.module02.lesson12.notsync.Table;
//import com.codegym.lessons.module02.lesson12.sync.Table;

public class TestSynchronization1 {
    public static void main(String[] args) {
        Table obj = new Table();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }

}
