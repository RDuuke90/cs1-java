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
public class Avion implements ITransporte
{
    @Override
    public int Encender()
    {
        return 10;
    }
    
    @Override
    public int Apagar()
    {
        return 25;
    }
}
