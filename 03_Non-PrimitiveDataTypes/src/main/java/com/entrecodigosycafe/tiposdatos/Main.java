package com.entrecodigosycafe.tiposdatos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Clase Persona");
        clasePersona.ejecutar();

        System.out.println("Interfaz");
        Vehiculo nuevoCoche = new Coche();
        Vehiculo nuevaMoto = new Moto();
        nuevoCoche.arrancar();
        nuevoCoche.detener();
        nuevaMoto.arrancar();
        nuevaMoto.detener();

        System.out.println("Array");
        ListaEdades.ejecutar();

    }
}
