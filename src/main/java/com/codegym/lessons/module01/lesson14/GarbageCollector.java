package com.codegym.lessons.module01.lesson14;

public class GarbageCollector extends Object{

    public static void main(String[] args) {
        GarbageCollector s1 = new GarbageCollector();
        GarbageCollector s2 = new GarbageCollector();

        s1 = null;
        s2 = null;
        System.gc();

    }

    public void finalize() {

        System.out.println("object is garbage collected");
    }

}
