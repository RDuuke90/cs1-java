/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author ESTUDIANTE
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int medellin_celcius, 
            medellin_fahrenheit,
            paris_fahrenheit,
            paris_celcius;
        double const_fahrenheit = 1.8; 
        double const_celcius = 0.5;
        int const_temperature = 32;
        // F = (c * 9/5) C = (f - 32)
        medellin_celcius = 27;
        
        medellin_fahrenheit = (int) ((int)medellin_celcius * const_fahrenheit) + const_temperature;
        
        System.out.println("Medellin C to F:"+medellin_fahrenheit);
        
        paris_fahrenheit = 79;
        
        paris_celcius = (int) ((int) (paris_fahrenheit - const_temperature) * const_celcius);
        
        System.out.println("Paris F to C:"+paris_celcius);

    }
    
}
