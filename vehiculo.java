/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<HashMap> vehiculos = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
           System.out.println("======== Menu =========");
           System.out.println("1 -> Crear Vehiculo");
           System.out.println("2 -> Listar Vehiculos");
           System.out.println("3 -> Buscar por Placa");
           System.out.println("4 -> Salir");
           System.out.println("=======================");
           System.out.print("Seleccione opcion: ");
           opcion = sc.nextInt();
           sc.nextLine();
           
           switch(opcion){
            
                case 1:
                    System.out.print("Ingrese el modelo: ");
                    int modelo = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Ingrese la marca: ");
                    String marca = sc.nextLine();
                    
                    System.out.print("Ingrese la placa: ");
                    String placa = sc.nextLine();     
                    
                    HashMap<String, Object> vehiculo = new HashMap();
                    vehiculo.put("modelo", modelo);
                    vehiculo.put("marca", marca);
                    vehiculo.put("placa", placa);
                    boolean existe = false;
                    
                    
                    if(vehiculos.isEmpty()){
                        vehiculos.add(vehiculo);
                        System.out.println("Vehiculo agregado!!");
                        break;
                    } else {
                        for(HashMap in_vehiculo: vehiculos) {
                            if(in_vehiculo.get("placa").equals(placa)){
                                System.out.println("Placa existente: "+placa);
                                existe = true;
                                break;
                            }
                        }
                    }
                    
                    if(! existe) {
                        vehiculos.add(vehiculo);
                        System.out.println("Vehiculo agregado!!");
                    }
                    break;
                case 2:
                    if(vehiculos.isEmpty()){
                        System.out.println("No hay vehiculos");
                        break;
                    }
                    for(HashMap in_vehiculo: vehiculos){
                        System.out.println(in_vehiculo);
                    }
                    break;
                case 3:
                    if(vehiculos.isEmpty()){
                        System.out.println("No hay vehiculos");
                        break;
                    }
                    
                    System.out.print("Ingrese la placa: ");
                    String placaBuscar = sc.nextLine();
                    for(HashMap in_vehiculo: vehiculos){
                        if(in_vehiculo.get("placa").equals(placaBuscar)){
                            System.out.println(in_vehiculo);
                            break;
                        }
                    }
                    break;
                case 4:
                    opcion = 0;
                    break;
                default:
                    System.out.println("La seleccion "+opcion+" no es valida");
                    break;
                    
            }
        } while(opcion!=0);
    }
    
}
