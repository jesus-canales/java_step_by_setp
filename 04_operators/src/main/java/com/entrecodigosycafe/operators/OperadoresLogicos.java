package com.entrecodigosycafe.operators;

public class OperadoresLogicos {

    public static void ejecutar () {

        // Operador Y (and)
        boolean condicion1 = (6 > 5);
        boolean condicion2 = (8 < 10);
        System.out.println(" (6 > 5) && (8 < 10) " + (condicion1 && condicion2));

        // Operador o (or)
        boolean condicion3 = (3 > 5);
        boolean condicion4 = (7 < 10);
        System.out.println("(3 > 5) || (7 < 10): " + (condicion3 || condicion4));

        // Operador negación !
        boolean inicioSesion = false;
        boolean nuevaSesion = !inicioSesion;
        System.out.println("Negación lógica (!inicioSesion): " + nuevaSesion);

    }
}
