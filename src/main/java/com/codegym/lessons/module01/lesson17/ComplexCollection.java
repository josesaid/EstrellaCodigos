package com.codegym.lessons.module01.lesson17;

import java.util.*;

public class ComplexCollection {

    public static void main(String[] args) {
        ArrayList<String> codeGymParticipantesDeSaid = new ArrayList<>();
        Map<Integer, ArrayList<String>> gruposDeSaid = new HashMap<>();
        gruposDeSaid.put(1, codeGymParticipantesDeSaid);
        Set<Map> gruposUnicosDeSaid = new HashSet<>();
        gruposUnicosDeSaid.add(gruposDeSaid);

        ArrayList<Set> gruposDeInstructores = new ArrayList<>();
        gruposDeInstructores.add(gruposUnicosDeSaid);



        ArrayList<Set<Map<Integer, ArrayList<String>>>> gruposDeInstructores2 = new ArrayList<>();
    }

}
