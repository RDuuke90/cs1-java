package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // palabra = significado
        //   key      valor
       // Key , Value; HashMap Edades de Alumnos
       // Integer = int; Float = float; String = String; Doublle = double
       HashMap<String, Integer> edades = new HashMap<>();
       edades.put("mario", 30);
       edades.put("carlos", 25);
       System.out.println(edades);

       System.out.println("edades.get(mario'): "+edades.get("mario"));

       System.out.println("edades.get('juan'): "+edades.get("juan"));

       System.out.println("edades.isEmpty(): "+edades.isEmpty());
        
       System.out.println("edades.containsKey('carlos'): "+edades.containsKey("carlos")); 

       System.out.println("edades.containsKey('jorge'): "+edades.containsKey("jorge"));
       
       System.out.println("edades.values(): "+edades.values());
       System.out.println("edades.keySet():"+edades.keySet());

       System.out.println(edades.remove("carlos"));
       // Colleciones 

        /**
        Edades
         * 
         *     *
         * *   *
         * *___*______ Nombres
         * C   M
         */
        /**
         * "nombre": string
         * "edad": int
         * "ciudad": string
         * "puntuacion": double
         * "titulos": list<string>
         * 
         * Object => Tranformarse en cualquier cosa, sin necesidad
         * de ser un String
         *  */
        
         HashMap<String, Object> usuario = new HashMap<>();
         usuario.put("nombre", "jorge");
         usuario.put("edad", 25);
         usuario.put("ciudad", "bello");
         usuario.put("puntuacion", 9.5);

         System.out.println(usuario);

        //usuario.put("ciudad", "medellin");

         System.out.println(usuario);

         List<HashMap<String, Object>> usuarios = new ArrayList<>();

         usuarios.add(usuario);

         System.out.println(usuarios);
        // List -> Dict más basicas que se encuentra en el desarollo

        HashMap<String, Object> usuario_2 = new HashMap<>();
         usuario_2.put("nombre", "carlos");
         usuario_2.put("edad", 55);
         usuario_2.put("ciudad", "bogota");
         usuario_2.put("puntuacion", 7.0);

         usuarios.add(usuario_2);

         System.out.println(usuarios);
        // String => Int, FLoat Integer.parse
        // Clase mayor a una menor
         int totalEdades = 0;
         for(HashMap user: usuarios){
            System.out.println("Nombre: "+user.get("nombre"));
            System.out.println("Edad: "+user.get("edad"));
            if ((Integer) user.get("edad") > 18){
                System.out.println("Es mayor que 18");
            }

            if (user.get("ciudad").equals("bogota")) {
                System.out.println("Es de bogota");
            }

         }

        usuarios.sort(
            (valor1, valor2) -> ((Integer) valor1.get("edad")).compareTo((Integer) valor2.get("edad"))
        );
        
        int index = 0;
        int edadMaxima = 0;
        for(HashMap u : usuarios){
            if(edadMaxima < (Integer) u.get("edad")){
                edadMaxima = (Integer) u.get("edad");
                index += 1;
            }
        }

        //for, if, while, arreglos y listas <-!! es mas complejo y largo
        //sort, isEmpty <-!! mas dificl al principio

        System.out.println(usuarios);
        System.out.println(edadMaxima);
    }

}
