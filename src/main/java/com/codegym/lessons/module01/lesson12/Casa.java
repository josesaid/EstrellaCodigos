package com.codegym.lessons.module01.lesson12;


public class Casa extends Object{
    private String color;
    private int numeroVentanas;
    public Casa(){
        this.color = "blanco";
        numeroVentanas = 0;
    }

    public Casa(int numVentanas){
        this.color = "blanco aperlado";
        this.numeroVentanas = numVentanas;
    }
    public Casa(String colorCasa){
        this.color = colorCasa;
        System.out.println("Se ha creado una casa");
    }
    public Casa(String colorCasa, int numeroVentanas){
        this.color = colorCasa;
        this.numeroVentanas = numeroVentanas;
        System.out.println("Se ha creado una casa");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        //return Objects.equals(color, casa.color);
        return casa.color.equals(this.color);
    }

    @Override
    public int hashCode() {
        return 7 * color.length();
    }

    @Override
    public String toString() {
        return "Casa {" +
                "color: '" + color + '\'' +
                ", NUMERO de Ventanas es: " + numeroVentanas +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroVentanas() {
        return numeroVentanas;
    }

    public void setNumeroVentanas(int numeroVentanas) {
        this.numeroVentanas = numeroVentanas;
    }
}
