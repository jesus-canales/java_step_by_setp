package com.entrecodigosycafe.buclefor;

public class ForSuma {

    public static void ejecutar () {
        int n = 10;
        int suma = 0;

        System.out.println("Calcular la suma de los primeros " + n + " números:");
        for ( int i = 1; i <= n; i++) {
            suma += i;
            System.out.println("La suma de " + i + ": " + suma);
        }
        System.out.println("La suma total es: " + suma);
    }
}
