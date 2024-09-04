/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> letras = new ArrayList(); //[]
        
        // isEmpty() Entrega True/False
        if(letras.isEmpty()){
            System.out.println("Lista vacia!");
        }
        
        letras.add("A");
        letras.add("B");
        letras.add("D");
        // ["A"]["B"]["D"]
        //   0    1    2
        letras.add(2, "C");
        // ["A"]["B"]["C"]["D"]
        //   0    1    2    3
        System.out.println(letras);
        
        System.out.println("letras.get(3): "+letras.get(3));
        
        System.out.println("letras.indexOf('D'): "+letras.indexOf("D"));
        
        System.out.println("letras.contains('F'): "+letras.contains("F"));
        
        System.out.println("letras.size(): "+letras.size());
        
        List<String> sub_lista = new ArrayList();
        
        sub_lista = letras.subList(1, 3);
        
        System.out.println("sub_lista: "+sub_lista);
        
        sub_lista.clear();
        
        System.out.println("sub_lista.clear(): "+sub_lista);
        
        letras.remove("D");
        System.out.println("letras.remove('D'): "+letras);
        letras.remove(0);
        System.out.println("letras.remove(0): "+letras);
        
        List<String> frutas = new ArrayList();
        
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("manzana");
        frutas.add("naranja");
        
        int numManzanas = 0;
        
        for(String fruta: frutas){
            if(fruta.equalsIgnoreCase("manzana")){
                numManzanas++;
            }
        }
        
        if(numManzanas > 1){
            int index = frutas.indexOf("manzana");
            frutas.remove(index);
        }  
    }
    
}
