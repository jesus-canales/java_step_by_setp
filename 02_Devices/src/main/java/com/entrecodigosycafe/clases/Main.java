package com.entrecodigosycafe.clases;

public class Main {
    public static void main(String[] args) {
        Device Computadora = new Device("Computadora", "Asus", "Gris");
        System.out.println("El dispositivo es " + Computadora.getNombre() + " la marca es " + Computadora.getMarca() + " el color es " + Computadora.getColor());
        Computadora.promocion();
    }
}
