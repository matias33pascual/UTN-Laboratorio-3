package com.utn.clase16;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private Departamento departamento; // departamento implementa Serializable
    private transient String apellido; // no lo tendremos en cuenta en la serializacion

    // para llevar un control de la version. Tanto el nombre como el numero son importantes
    private static final long serialVersionUID = 123456L;

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + this.getNombre();
    }
}
