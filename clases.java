package com.example;

/**
 * Marca
 * RAM
 * Modelo
 * Almacenamiento
 */
public class Main {
    public static void main(String[] args) {
       Celular nokia = new Celular(
            "Nokia", 
            16,
            "1011", 
            60.5
       );

       Celular iphone = new Celular(
        "Apple", 
        32, 
        "16", 
        250.0);

        System.out.println(nokia.marca);
        System.out.println(iphone.modelo);

    }

}


package com.example;
public class Celular {
    private int serial;
    public String marca;
    public int ram;
    public String modelo;
    public double almacenamiento;
    
    public Celular (
        String inMarca,
        int inRam,
        String inModelo,
        double inAlmacenamiento
    ) {
        this.modelo = inModelo;
        this.marca = inMarca;
        this.ram = inRam;
        this.almacenamiento = inAlmacenamiento;
    }
}
