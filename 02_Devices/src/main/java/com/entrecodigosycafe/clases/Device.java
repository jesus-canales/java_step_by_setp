package com.entrecodigosycafe.clases;

public class Device {
    private String nombre;
    private String color;
    private String marca;

    public Device (String nombre, String marca, String color) {
        this.nombre = nombre;
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void promocion(){
        System.out.println("Aproveche los días de promoción");
    }
}
