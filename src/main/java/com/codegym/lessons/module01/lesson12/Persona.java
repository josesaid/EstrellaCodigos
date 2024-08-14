package com.codegym.lessons.module01.lesson12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//Pojo, Bean, JavaBean, entity
public class Persona {
    private String nombre;
    private int edad;

    public boolean equals(Object object){
        boolean resultado = false;
        if(this ==object)
            resultado = true;
        if(object == null || this.getClass() != object.getClass())
            resultado = false;
        Persona temp = (Persona)object;
        boolean condicion1 = temp.getNombre().equals(this.getNombre());
        boolean condicion2 = temp.getEdad() == this.getEdad();
        if(condicion1 && condicion2)
            resultado = true;

        return resultado;
    }

    public int hashCode(){
        return nombre.length() * 5 + ( 3 * edad);
    }

}
