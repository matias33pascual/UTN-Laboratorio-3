package com.utn.clase12.ejercicio_2;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int dni;

    public Persona() {

    }

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // region METODOS ABSTRACTOS
    public abstract void login();
    public abstract void logout();
    // endregion

    // region GETTERS y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    // endregion
}