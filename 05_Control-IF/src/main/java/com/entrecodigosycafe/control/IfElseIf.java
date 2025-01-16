package com.entrecodigosycafe.control;

public class IfElseIf {
    public static void ejecutar () {

        int temperatura = 26;
        System.out.println("Temperatura: " + temperatura + "ºC");

        if ( temperatura <= 0 ) {
            System.out.println("Hace mucho frío");
        } else if ( temperatura > 0 && temperatura <=20 ) {
            System.out.println("El clima es frío");
        } else if ( temperatura > 20 && temperatura <=30 ) {
            System.out.println("El clima es agradable");
        } else {
            System.out.println("Hace mucho calor");
        }

    }
}
