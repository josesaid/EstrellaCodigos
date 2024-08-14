package com.codegym.lessons.module01.lesson15;

import java.util.ArrayList;
import java.util.List;

public class ControlEscolar {
    public static void generarReporte(Escuela escuela) {
        System.out.println(escuela.getNombre());
        System.out.println("-------------");
        int contador = 1;
        List<Grupo> gruposEscolares = escuela.getGrupos();
        for(Grupo gradoEscolar : gruposEscolares){
            List<Alumno> alumnos = gradoEscolar.getAlumnos();
            for(Alumno estudiante : alumnos){
                System.out.println(contador++ + " " + estudiante.toString());
            }
            System.out.println("##############################################");
        }

        List<Grupo>gruposEscolares2 = escuela.getGrupos();
        Grupo grupoPrimariaPrimerAnio = gruposEscolares2.get(0);
        List<Alumno> alumnosPrimerAnio = grupoPrimariaPrimerAnio.getAlumnos();
        Alumno pepe1 = alumnosPrimerAnio.get(0);
        Alumno pedro = alumnosPrimerAnio.get(1);

        Alumno pepe2 = escuela.getGrupos().get(0).getAlumnos().get(0);
        System.out.println(pepe1.equals(pepe2));

        //vamos a expulsar a pedro:
        System.out.println("Pedro??" + pedro);

        boolean estaPedroPresente = alumnosPrimerAnio.contains(pedro);
        System.out.println("estaPedroPresente: " + estaPedroPresente);

        System.out.println("Antes de expular a pedro: " + alumnosPrimerAnio);
        alumnosPrimerAnio.remove(pedro);
        System.out.println("Despues de expular a pedro: " + alumnosPrimerAnio);

        //si la lista tiene elementos muestralos, sino mencionalo...
        if(escuela.getGrupos().isEmpty()){
            System.out.println("LA escuela: " + escuela.getNombre()+" no tiene gruposm asociados");
        }else{
            System.out.println("la escuela: "+ escuela.getNombre()+" tiene los siguientes grupos: ");
            ArrayList<Grupo> gruposEscolares3 = escuela.getGrupos();
            for(int i = 0;i <gruposEscolares3.size(); i++){
                Grupo grupo = gruposEscolares3.get(i);
                System.out.println(grupo.getAlumnos());
            }
        }

    }

}
