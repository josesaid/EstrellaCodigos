package com.codegym.lessons.module02.lesson09;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;

public class JavaReflection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Cuadrado ce = Cuadrado.class.newInstance();
        //ce.medir();

        Method method = Cuadrado.class.getDeclaredMethod("medir");
        method.setAccessible(true);
        method.invoke(ce);
/*
        System.out.println(Rectangulo.class.getSuperclass().getCanonicalName());
        System.out.println(Rectangulo.class.getCanonicalName());




        //Integer i = new Integer("5");
        int i = 5;

        Class c = Cuadrado.class;
        System.out.println(c.getName());
        Method[]methods = c.getMethods();


        Constructor[] constructores = c.getConstructors();
        System.out.println("Constructores actuales: " + constructores.length);
        for(Constructor constructor : constructores){
            String name = constructor.getName();

            System.out.println(name+" y tiene: " + constructor.getParameterCount() + " argumentos");
        }
*/
    }

}
