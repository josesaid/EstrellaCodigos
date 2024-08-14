package com.codegym.lessons.module01.lesson16;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        Carro carroSaid = new Carro();
        carroSaid.setMarca("Chevrolet");
        carroSaid.setModelo("Cruze");
        carroSaid.setColor("Blanco");
        Carro carroJoseManuel = new Carro("Toyota", "Corolla", "Rojo");
        Carro carroSebastian = new Carro("Tesla", "Model X", "Plateado");
        Carro carroMartinElotes = new Carro("Carrito de Elotes", "Chambeador", "Tutti frutti");

        List<Carro> carrosList = new ArrayList<>();
        carrosList.add(carroSaid);
        carrosList.add(carroJoseManuel);
        carrosList.add(carroSebastian);
        carrosList.add(carroMartinElotes);

        /*for(Carro carro : carrosList){
            System.out.print(carro.toString().toUpperCase()+"\n -> ");
        }*/
        boolean teslaFound = false;
        for(int i=0; !teslaFound && i<carrosList.size(); i++){
            if(carrosList.get(i).getMarca().equals("Tesla")) {
                //carrosList.remove(i);
                teslaFound = true;
            }
        }
        if(teslaFound){
            carrosList.remove(carroSebastian);
            System.out.println("tesla eliminado");
        }

        System.out.println(carrosList);
        carrosList.clear();
        System.out.println(carrosList);
    }

}


@Data
@NoArgsConstructor
@AllArgsConstructor
class Carro{
    private String marca;
    private String modelo;
    private String color;
}