/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ESTUDIANTE
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(10);
        numeros.add(13);
        numeros.add(34);
        numeros.add(90);
        //[10][13][34][90] -> 
        //  0   1   2   3
        for(int elemento: numeros){
            System.out.println(elemento);
        }
        
        numeros.remove(3);
        //numeros.size();
        
        
        for(int elemento: numeros){
            System.out.println(elemento);
        }
        
        HashMap<String, String> usuario = new HashMap<>();
        
        usuario.put("nombre", "Juan");
        usuario.put("apellido","Duque");
        usuario.put("nombre", "Carlos");
        /*
        {
            "nombre": "carlos",
            "apellido": "duque"
        }
        */
        System.out.println(usuario.get("nombre"));
        /*
        
        
        int[][] numeros = new int[3][3];
        int sumatoria = 0;
        for(int fila=0; fila<3; fila++){
            for(int columna=0; columna<3;columna++){
                int r = 0;
                if ((columna + fila) == (numeros.length -1)){
                    numeros[columna][fila] = r;
                } else {
                    r = rand.nextInt(10) + 1;
                    numeros[columna][fila] = r;
                }
                
                if(columna > fila){
                    sumatoria += r;
                }
                
                System.out.print("["+columna+"]["+fila+"]="+numeros[columna][fila]);
            }
            System.out.println();
        }
        
        System.out.println("Sumatoria: "+sumatoria);
               
        */
        
        
    }
    
}
