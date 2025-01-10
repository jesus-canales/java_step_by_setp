package com.entrecodigosycafe.tiposdatos;

public class clasePersona {
    public static void ejecutar () {
        Persona estudiante = new Persona( "Jesús", 45 );
        estudiante.hablar();
        estudiante.caminar();
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hablar () {
        System.out.println( nombre + " dice hola!!");
    }

    public  void caminar () {
        System.out.println( nombre + " está caminando.");
    }
}
