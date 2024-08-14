package com.codegym.lessons.module01.lesson17;

import java.util.*;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        /*
        data.put("Jose Manuel", "Martinez");
        data.put("Antonio", "Xilcahua");
        data.put("Roberto Ernesto", "Cardenas");
        data.put("Ferenc", "Yaya");
        data.put("Ayrton", "Schmidt");
        data.put("Samarina", "Antonsich");
        data.put("Miroslava", "Ambrocio");
         */
        data.put("Jose Manuel", null);
        data.put(null, "Xilcahua");
        data.put("Roberto Ernesto", "Cardenas");
        data.put("Ferenc", "Yaya");
        data.put("Ayrton", "Schmidt");
        data.put("Samarina", "Antonsich");
        data.put("Miroslava", "Ambrocio");
        //data.put("Algo", null);

        Set<Map.Entry<String, String>> filas =  data.entrySet();
        for( Map.Entry<String, String> entrada : filas){
            System.out.println("key: " + entrada.getKey()+ ", y su value es: " + entrada.getValue());
        }

        boolean estaSaid = data.containsKey("Said");
        System.out.println("estaSaid: " +estaSaid);

        boolean estaAntonio = data.containsKey("Antonio");
        System.out.println("estaAntonio: " + estaAntonio);

        boolean estaApellidoMartinez = data.containsValue("Martinez");
        System.out.println("estaApellidoMartinez: " + estaApellidoMartinez);

        String apellidoAyrton = data.get("Ayrton");
        System.out.println("El apellido de Ayrton es: " + apellidoAyrton);

        //Object object = data.get("PEDRO");
        Object object = data.get("Miroslava");

        if(object ==null){
            System.out.println("Este key [PEDRO] no existe en la data");
        }else{
            //aqui object no es nulo y si tiene algo...
            String apellido = (String)object;
            System.out.println("apellido que si existe: " + apellido);
        }

        System.out.println(data.size());

        Collection<String> valores = data.values();
        Iterator<String> apellidosIterator = valores.iterator();
        while(apellidosIterator.hasNext()){
            String apellido = apellidosIterator.next();
            System.out.println("Apellido: " + apellido);
        }

        if(data.containsKey("Jose Manuel")){
            data.put("Jose Manuel", "Martinez");
        }

        if (data.containsValue("Xilcahua")){
            //data.put(null, "Xilcahua");
            data.put("Antonio", "Xilcahua");
        }

        filas =  data.entrySet();
        for( Map.Entry<String, String> entrada : filas){
            System.out.println("key: " + entrada.getKey()+ ", y su value es: " + entrada.getValue());
        }

        if(data.containsKey(null)){
            System.out.println("Encontró la llave nula");
            data.remove(null);
        }

        if(!data.containsKey(null)){
            System.out.println("Todo ya esta limpio y sin valores nulos");
        }

        filas =  data.entrySet();
        for( Map.Entry<String, String> entrada : filas){
            System.out.println("1key: " + entrada.getKey()+ ", y su value es: " + entrada.getValue());
        }

    }


}
