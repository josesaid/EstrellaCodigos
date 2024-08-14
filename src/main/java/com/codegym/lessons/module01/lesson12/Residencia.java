package com.codegym.lessons.module01.lesson12;

//boiler-plate code
public class Residencia extends Casa{
    private int numeroBanios;
    public Residencia(String colorResidencia) {
        super(colorResidencia);
        numeroBanios = 1;
        System.out.println("Residencia creada..." + this );
    }

    public Residencia(int numeroBanios){
        this("Blanco");
        this.numeroBanios = numeroBanios;
    }

    public Residencia(String color, int numeroBanios){
        this(color);
        setNumeroBanios(numeroBanios);
    }
    public Residencia(String color, int numeroBanios, int numeroVentanas){
        this(color);
        setNumeroVentanas(numeroVentanas); //consumo un método heredado de la clase Casa
        setNumeroBanios(numeroBanios);
    }

    public void setNumeroBanios(int numeroBanios) {
        System.out.println("seteando el numero de baños: " + numeroBanios);
        this.numeroBanios = numeroBanios;
    }

    @Override
    public String toString() {
        String residencia =  "Residencia{" +
                "numeroBanios=" + numeroBanios +
                '}';
        String casa = super.toString();
        return residencia  + ">>>>" + casa ;
    }

    public int getNumeroBanios(){
        return this.numeroBanios;
    }

}
