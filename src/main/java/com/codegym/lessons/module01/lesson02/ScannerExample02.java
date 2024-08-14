package com.codegym.lessons.module01.lesson02;

import java.util.Scanner;

public class ScannerExample02 {

    public static void main(String[] args) {
        String str = "10  20  30  40  50  60";
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int resultado = a + b;
        System.out.println("resultado: " + resultado);

        /*
        String str = "10#20#30#40#50#60";
        String []items = str.split("#");
        int sumatoria = 0;
        for(String item : items){
            int i = Integer.parseInt(item);
            sumatoria += i;
        }

        System.out.println("sumatoria: " + sumatoria);
         */
    }

}
