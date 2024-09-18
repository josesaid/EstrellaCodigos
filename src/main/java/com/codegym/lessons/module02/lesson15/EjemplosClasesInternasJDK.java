package com.codegym.lessons.module02.lesson15;

import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractList;

public class EjemplosClasesInternasJDK {
    public static void main(String[] args) {
        AbstractList instance = new AbstractList() {
            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };

        //-----------

        Integer integer = Integer.valueOf(1);

        //-----------

        InputStream is = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

    }

}
