/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorahistorico;

/**
 *
 * @author ESTUDIANTE
 */
import java.util.Scanner;
public class CalculadoraHistorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int seleccion = 0, a = 0, b = 0;
        String operador = "", historial = "";
        do{
            System.out.println("1) Operaciones");
            System.out.println("2) Historial");
            System.out.println("3) Salir");
            System.out.print("Seleccion: ");
            
            seleccion = sc.nextInt();
            sc.nextLine();
            
            switch (seleccion) {
                case 1:
                    System.out.print("Nro uno: ");
                    a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Operador + o -: ");
                    operador = sc.nextLine();
                    System.out.print("Nro dos: ");
                    b = sc.nextInt();
                    sc.nextLine();
                    int resultado = 0;
                    if(operador.equals("+")){
                       resultado = a+b;
                    } else {
                       resultado = a-b;
                    }
                    historial = a + operador + b + "="+resultado;
                    System.out.println(historial);
                    break;
                case 2:
                    if(historial.isEmpty())
                    {
                        System.out.println("No hay historial");
                    } else {
                        System.out.println(historial);
                    }
                    break;
                default:
                    break;
            }
            
        }while(seleccion != 3);        
    }
    
}
