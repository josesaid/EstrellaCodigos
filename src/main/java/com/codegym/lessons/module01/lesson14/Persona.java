package com.codegym.lessons.module01.lesson14;

//Java Bean | Pojo | Bean
public class Persona extends Object implements Runnable {
    public Persona(){}
    public Persona(String name, String apellido){
        setNombre(name);
        setApellido(apellido);
    }
    private String nombre;
    private String apellido;


    public String getNombre() {
        return nombre;
    }

    private  void metodoNoVisible(){
        System.out.println("NO123 debería ver esto");
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static void main(String[] args) {
        new Persona("", "").metodoNoVisible();
    }

    @Override
    public String toString() {
        return "La persona se llama: "+nombre +" "+apellido;
    }

    @Override
    public void run() {
    }

}
