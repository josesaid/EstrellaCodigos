package com.codegym.lessons.module01.lesson08;

//POJO, Bean, JavaBeans, entity
class Auto extends Vehiculo {

    private String placa;

    //mnenomico
    public void setPlaca(String p){
        this.placa = p;
    }
    public String getPlaca() {
        return placa;
    }
    void cambiarAceite(){
        introducirLllaveCorrecta();
    }
    void sonarClaxon(){
        introducirLllaveCorrecta();
    }

    private void introducirLllaveCorrecta(){}


}