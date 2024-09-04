package com.example;

import java.util.ArrayList; // <---
import java.util.HashMap; // <---
import java.util.List; // <---

public class Main {
    public static void main(String[] args) {
       
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Andres", 34);
        edades.put("Jorge", 13);
        edades.put("Pedro", 90);
        System.out.println("edades.get('Andres'): "+edades.get("Andres"));
        System.out.println("edades.values(): "+edades.values());
        System.out.println("edades.containsKey('Andres'): "+edades.containsKey("Andres"));
        System.out.println("edades.containsKey('Jorge'): "+edades.containsKey("Jorge"));

        List<String> letras = new ArrayList<>(); // Una lista vacia de String

        if(letras.isEmpty()){
            System.out.println("Lista vacia!");
            System.out.println("letras.size(): "+letras.size());
        }

        letras.add("A");
        letras.add("B");
        letras.add("D");
        //["A"]["B"]["D"]
        //  0    1    2 
        //["A"]["B"]["C"]["D"]
        //  0    1    2    3
        System.out.println(letras);
        letras.add(2, "C");
        System.out.println(letras);

        System.out.println("letras.contains('B'): "+letras.contains("B"));
        System.out.println("letras.contains('F'): "+letras.contains("F"));

        System.out.println("letras.indexOf('C'): "+letras.indexOf("C"));
        System.out.println("letras.indexOf('F'): "+letras.indexOf("F"));

        int indexOf = letras.indexOf("C");

        System.out.println("letras.get(indexOf): "+letras.get(indexOf));
        System.out.println("letras.subList(1, 3): "+letras.subList(1, 3));
        
        letras.remove(indexOf);
        letras.remove("D"); // Solo con elementos diferentes de int

        System.out.println(letras);

        letras.clear();

        System.out.println(letras);
        */

    }

}
