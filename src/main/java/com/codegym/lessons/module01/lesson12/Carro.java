package com.codegym.lessons.module01.lesson12;

public class Carro extends Object{
    private String marca="";
    private String modelo="";
    private String color="";
    private String version="";

    public Carro(){}
    public Carro(String marca, String modelo, String color, String version) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setColor(color);
        this.setVersion(version);
        System.out.println("1 Se ha creado un carro: " + this.toString() );
    }

    public Carro(String marca, String color, String version){
        this.setMarca(marca);
        this.setColor(color);
        this.setVersion(version);
        modelo = "PENDIENTE";
        System.out.println("2 Se ha creado un carro: " + this.toString() );
    }

    public Carro(String modelo, String color){
        setModelo(modelo);
        setColor(color);
        System.out.println("3 Se ha creado un carro: " + this.toString() );
    }
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*@Override
    public String toString() {
        return marca+", modelo: " + modelo; //super.toString();
    }*/

    @Override
    public String toString() {
        return "Carro[" +
                "Marca='" + marca.toUpperCase() + '\'' +
                ", Modelo='" + modelo.toUpperCase() + '\'' +
                ", Color='" + color.toUpperCase() + '\'' +
                ", Version='" + version.toUpperCase() + '\'' +
                ']';
    }
}
