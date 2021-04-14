package com.utn.clase9;

public class Persona {
    private String nombre = "Usuario";

    // constructores
    public Persona(){}
    public Persona(String nombre) { this.nombre = nombre; }

    // getter y setter
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // metodo
    public void saludar() { System.out.println("hola, soy " + this.nombre); }
}
