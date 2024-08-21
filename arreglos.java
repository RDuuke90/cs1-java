/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas = {23, 4, 10, 0, 2, 3, 10};
        //              0  1   2  3  4  5  6
        System.out.println(notas[4]); // P = 4; I=(P-1) 3 = 2
        notas[4] = 88;
        int ii = 4;
        System.out.println(notas[ii]); // 88
        int n = 7;
        int[] algo = new int[n];
        algo[0] = 23;
        algo[1] = 10;
        //...algo[6] = 33;
        for(int i = 0; i < algo.length; i++){
            algo[i] = i*10;
        }
        for(int p = 0; p < algo.length; p++){
            System.out.println("["+p+"]"+algo[p]);
        }
        /** Solicitar 5 notas double y
         * guardar en un arreglo (vector)
         * e imprimir si gano cuando su promedio
         * sea mayor o igual que 3 o 
         * perdio si es menor que 3
         */
        /** Solicitar 5 notas double y
         * guardar en un arreglo (vector)
         * e imprimir si gano cuando su promedio
         * sea mayor o igual que 3 o 
         * perdio si es menor que 3
         */
        double[] notasA = new double[5];
        double notaF = 0;
        Scanner sc = new Scanner(System.in);
        for(int e = 0; e < notasA.length; e++){
            System.out.print("Ingrese la nota: ");
            notasA[e] = sc.nextDouble();
            sc.nextLine();
        }
        
        for(int e = 0; e < notasA.length; e++){
            notaF += notasA[e];
        }
        
        if ((notaF/notasA.length) >= 3.0) {
            System.out.print("Calite!!");
        } else {
            System.out.print("Cambie de carrera");
        }
    }
    
}
