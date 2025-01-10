package com.entrecodigosycafe.tiposdatos;

public class Moto implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La moto está arrancando");
    }

    @Override
    public void detener() {
        System.out.println("La moto se ha detenido");
    }
}
