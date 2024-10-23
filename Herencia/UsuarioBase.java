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
public class UsuarioBase {
    public String nombre;
    public String apellido;
    
    public String nombreCompleto(){
        return this.nombre + " " + this.apellido;
    }
}
