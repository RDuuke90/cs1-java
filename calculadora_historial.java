/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int seleccion = 0;
        String historial = "";
        do{
            System.out.println("CALCULADORA!!");
            System.out.println("1) Realizar operacion");
            System.out.println("2) Ver ultimo registro");
            System.out.println("3) Salir");
            System.out.print("Ingrese opcion: ");
            seleccion = sc.nextInt();
            sc.nextLine();
            
            switch (seleccion) {
                case 1:
                    System.out.print("Ingrese el 1er numero: ");            
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el operador + o -: ");
                    String operador = sc.nextLine();
                    System.out.print("Ingrese el 2do numero: ");            
                    int b = sc.nextInt();
                    sc.nextLine();
                    int resultado;
                    if(operador.equals("+")){
                        resultado = a+b;
                    } else{
                        resultado = a-b;
                    }
                    System.out.println(a + operador + b + " = "+resultado);
                    historial = a + operador + b + " = "+resultado;
                    break;
                case 2:
                    if(historial.isEmpty()){
                        System.out.println("No hay historial");
                    } else {
                        System.out.println("La ultima operacion es: "+historial);
                    }
                    break;
                default:
                    seleccion = 3;
                    break;
            }
        } while(seleccion != 3);
    }
    
}
