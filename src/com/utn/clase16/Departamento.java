package com.utn.clase16;

import java.io.Serializable;

public class Departamento implements Serializable {
    public String nombre;

    public Departamento() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
