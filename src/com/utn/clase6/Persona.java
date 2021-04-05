package com.utn.clase6;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {

    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre: " + this.nombre + "\n" + "edad: " + this.edad;
    }
}
