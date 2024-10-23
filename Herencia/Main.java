/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Usuario jorgePerez = new Usuario("Jorge", "Perez", 17);
        
        System.out.println("Nombre Completo: "+jorgePerez.nombreCompleto());
        
        if (jorgePerez.soyMayorDeEdad()){
            System.out.println("Soy Mayor");
        } else {
            System.out.println("Soy Menor");
        }
    }
    
}
