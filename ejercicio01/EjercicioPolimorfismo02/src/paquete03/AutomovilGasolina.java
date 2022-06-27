package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil{
    /*
    número de galones máximo del tanque, 
    costo de cada galón, 
    iva (valor fijo de 10%); 
    el valor total a cancelar es igual a 
    : (costo x galón) * (número de galones) + el iva de ((costo x galón) * (número de galones)). 
    */
    double numGalon;
    double costoGalon;
    double iva = 0.1;

    public void establecerNumGalon(double ng){
        numGalon = ng;
    }

    public void establecerCostoGalon(double cg){
        costoGalon = cg;
    }

    public void establecerIva(double iv){
        iva = iv;
    }

    public double obtenerNumGalon(){
        return numGalon;
    }

    public double obtenerCostoGalon(){
        return costoGalon;
    }

    public double obtenerIva(){
        return iva;
    }

    @Override
    public void calcularValorCancelar(){
        valorCancelar = (costoGalon * numGalon) + (iva * (costoGalon*numGalon));
    }

    @Override 
    public String toString(){
        String cadena = String.format("Propietario: %s\nPlaca: %s\nNuméro de galones máximos: %.2f\n"+
        "Costo por galón: %.2f\nValor a cancelar: %.2f\n\n", nombrePro, placa, numGalon, costoGalon, valorCancelar);
        return cadena;
    }
    
}
