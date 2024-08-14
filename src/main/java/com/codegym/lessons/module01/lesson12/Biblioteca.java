package com.codegym.lessons.module01.lesson12;

public class Biblioteca {
    int numeroLibros;

    public Biblioteca(){
        numeroLibros = 100;
    }
    public Biblioteca(int numeroLibros){
        this.numeroLibros = numeroLibros;
        //setNumeroLibros(numeroLibros);
    }

    public void setNumeroLibros(int numeroLibros){
        this.numeroLibros = numeroLibros;
    }

}
