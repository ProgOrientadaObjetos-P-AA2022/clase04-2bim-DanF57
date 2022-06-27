/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    //nombres del propietario, placa, valor a cancelar.

    protected String nombrePro;
    protected String placa;
    protected double valorCancelar;

    public void establecerNombre(String n){
        nombrePro = n; 
    }

    public void establecerPlaca(String n){
        placa = n;
    }

    public abstract void calcularValorCancelar();
    
    public String obtenerNombre(){
        return nombrePro;
    }

    public String obtenerPlaca(){
        return placa.toUpperCase();
    }

    public double obtenerValorCancelar(){
        return valorCancelar;
    }
}
