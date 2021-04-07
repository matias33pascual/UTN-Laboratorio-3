package com.utn.clase6;

public class Empleado extends Persona {
    private String departamento;


    // super debe ser la primer linea de codigo

    public Empleado(String nombre, int edad, String departamento) {
        // los comentarios no cuentan como primera linea
        super(nombre, edad);

        this.departamento = departamento;

        // si usaramos super en esta posicion, tendriamos un error
        // super(nombre, edad);
    }

    public void saludar() {

    }

    public String toString() {
        return super.toString() + "\n" + "departamento: " + this.departamento;
    }
}
