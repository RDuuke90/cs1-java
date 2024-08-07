/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

import java.util.Scanner;


/**
 *
 * @author ESTUDIANTE
 */
public class Cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /**
        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Ingrese la edad:");
        //int edad = Integer.parseInt(sc.nextLine());
        int edad = sc.nextInt();
        System.out.println("Tu edad es: "+edad);
        * **/
        
        String cafe = "Cafe";
        int precio = 1000;
        
        System.out.println("¡¡¡ Ventas de Café doña Lily !!!");
        System.out.print("Con azucar: [1] -> Sí | [0] -> No: ");
        
        int azucar = sc.nextInt();
        sc.nextLine();
        
        if(azucar == 1){
            cafe += " con azucar";
            precio += 300;
        } else {
            cafe += " sin azucar";
        }
                
        System.out.print("Con leche: [S] -> Sí | [N] -> No: ");
        
        String leche = sc.nextLine();
        
        if(leche.equals("S")){
            cafe += ", con leche";
            precio += 500;
        } else {
            cafe += ", sin leche";
        }
        
        System.out.print("Con licor: [R] -> Ron | [A] -> Amaretto | [W] -> Whiskey :");
        
        String licor = sc.nextLine();
        
        if(licor.equalsIgnoreCase("R")){
            cafe += " y ron";
            precio += 1000;
        } else if(licor.equals("A")){
            cafe += " y amaretto";
            precio += 1500;
        } else if(licor.equals("W")){
            cafe += " y whiskey";
            precio += 2000;
        } else {
            cafe += " y sin licor";
        }
        
        System.out.println(cafe + ". Precio: $"+precio);

        


        
    }
    
}
