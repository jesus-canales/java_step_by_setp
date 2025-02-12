package com.entrecodigosycafe.buclefor;

public class ForArray {

    public static void ejecutar () {
        String [] nombres = {"Juan", "María", "Luis", "Ana", "Ysabel"};

        System.out.println("Interacción sobre un array de nombres: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre en índice: " + i + ": " + nombres[i]);
        }
    }
}
