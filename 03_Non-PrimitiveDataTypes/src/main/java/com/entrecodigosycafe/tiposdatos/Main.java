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

        System.out.println("Enum");
        Dia diaActual = Dia.MIERCOLES;

        switch ( diaActual ) {
            case LUNES, MARTES, MIERCOLES, JUEVES -> System.out.println("Son días de trabajo a full");
            case VIERNES -> System.out.println("Es inicio de fin de semana");
            case SABADO, DOMINGO -> System.out.println("Es ya fin de semana y el cuerpo lo sabe");
        }

        System.out.println("Cadenas de texto con String");
        TestString.imprimir();

    }
}
