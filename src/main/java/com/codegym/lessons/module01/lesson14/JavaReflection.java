package com.codegym.lessons.module01.lesson14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Persona p = new Persona("Juan", "Perez");

        Class c = p.getClass();

        //p.setNombre(); p si puede hacer uso de esto, porque si esta dentro de sus capacidades
        System.out.println(c.getName());
        System.out.println(c.getClassLoader().getName());
        System.out.println(c.getCanonicalName());
        System.out.println("Simplename:" + c.getSimpleName());
        System.out.println(c.getConstructors().length);
        Constructor[]constructors = c.getConstructors();
        System.out.println("constructor Name:" + constructors[0].getClass().getName());
        System.out.println(c.getInterfaces().length);
        Method[]metodos = c.getMethods();
        for(Method metodo : metodos){
            System.out.println("Metodo: " + metodo.getName());
        }

        // Mostrar como se puede (pero no se debe) ejecutar un metodo privado de otra clase...
        Method method = p.getClass().getDeclaredMethod("metodoNoVisible");
        method.setAccessible(true);
        Object r = method.invoke(p);
    }

}
