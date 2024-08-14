package com.codegym.lessons.module01.lesson14;

import java.io.IOException;

public class RuntimeExample {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("open -n /Applications/Calculator.app");
            //Runtime.getRuntime().exec("open -n Calculator.app");
            //Runtime.getRuntime().exec("Calculator.app");
            //Runtime.getRuntime().exec("/Applications/Calculator.app/Contents/MacOS/Calculator");
            //Runtime.getRuntime().exec("/Applications/Calculator.app");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
