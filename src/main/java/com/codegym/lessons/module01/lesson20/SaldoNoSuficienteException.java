package com.codegym.lessons.module01.lesson20;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class SaldoNoSuficienteException extends Exception{
    private List<Articulo> articulosNoComprados = new ArrayList<>();
    public SaldoNoSuficienteException(String message, Articulo articuloImposibleDeComprar){
        super(message);
        articulosNoComprados.add(articuloImposibleDeComprar);
    }

    public List<Articulo> getListaArticulosNoComprados(){
        return this.articulosNoComprados;
    }

}

@Data
@AllArgsConstructor
class Articulo{
    String nombre;
    int precio;
}