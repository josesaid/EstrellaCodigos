package com.codegym.lessons.module02.lesson18.listexample;

import com.codegym.lessons.module01.lesson12.Persona;

import java.util.ArrayList;
import java.util.List;

/**
 * The type List example with warning.
 */
public class ListExampleWithWarning {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        m1();
    }

    /**
     * M 1.
     */
    @SuppressWarnings({"unchecked"})
    static void m1(){
        List items = new ArrayList();
        items.add(new String("Hola"));
        items.add(5);
        items.add(new Object[]{});
        items.add(new Persona());
        System.out.println(items);
    }

}
