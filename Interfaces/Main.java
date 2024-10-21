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
       Avion avion = new Avion();
       Carro carro = new Carro();
       
       int encender_a = avion.Encender();
       int encender_c = carro.Encender();
       
       int apagar_a = avion.Apagar();
       int apagar_c = carro.Apagar();
       
       List<ITransporte> transportes = new ArrayList();
       
       transportes.add(avion);
       transportes.add(carro);
       
       for(ITransporte t: transportes){
           System.out.println(t.getClass()+" "+t.Apagar());
           System.out.println(t.getClass()+" "+t.Encender());
       }
    }
    
}
