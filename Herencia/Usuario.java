/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ESTUDIANTE
 */
public class Usuario extends UsuarioBase implements IUsuario {
    private int edad;
    
    public Usuario(String in_nombre, String in_apellido, int in_edad){
        this.nombre = in_nombre;
        this.apellido = in_apellido;
        this.edad = in_edad;
    }
    
    public boolean soyMayorDeEdad() {
        return this.edad >= 21;
    }
    
}
