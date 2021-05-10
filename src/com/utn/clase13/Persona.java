package com.utn.clase13;

public class Persona {
    private String nombre;

    public Persona() {
    }

    // -----------------------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    // -----------------------------------------------------------------------------

    public void setNombre(String nombre) throws NombreNoValidoExcepcion {
        if(nombre == "no valido") {
            throw new NombreNoValidoExcepcion("no puede ingresar ese nombre");
        }
        else {
            this.nombre = nombre;
        }
    }
}
