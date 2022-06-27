package paquete04;

import paquete02.Automovil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class AutomovilDiesel extends Automovil{
    double numLitros;
    double costoLitros;
    double descuentoLitros;
    
    public void setCostoLitro(double cl) {
        costoLitros = cl;
    }

    public void setDescuentoLitros(double dl) {
        descuentoLitros = dl*numLitros;
    }

     public void setNumLitros(double nl) {
        numLitros = nl;
    }
    
    public double getDescuentoLitros() {
        return descuentoLitros;
    }

    public double getNumLitros() {
        return numLitros;
    }
    
    public double getCostoLitro() {
        return costoLitros;
    }
    
    public double getTotalCancelar(){
        return valorCancelar;
    }
    
    @Override
    public void calcularValorCancelar(){
        valorCancelar = costoLitros *(numLitros - descuentoLitros);
    }

    @Override 
    public String toString(){
        String cadena = String.format("Propietario: %s\n"
        + "Placa: %s\n" + 
        "Numéro de galones máximos: %.2f\n"+
        "Costo por galón: %.2f\nDescuento: %.2f\nValor a cancelar: %.2f\n\n", 
        nombrePro, 
        placa, 
        numLitros, 
        costoLitros, 
        descuentoLitros,
        valorCancelar);
        return cadena;
    }
    
}