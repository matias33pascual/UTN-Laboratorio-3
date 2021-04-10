package com.utn.borrador;

public class Borrador {
    private int hora;
    private int minuto;
    private int segundo;

    public static void init() {
        //Empleado empleado = new Empleado();

        Persona persona = new Empleado();

        System.out.println(persona.toString());
    }



}
