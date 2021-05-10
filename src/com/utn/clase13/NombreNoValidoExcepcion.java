package com.utn.clase13;

public class NombreNoValidoExcepcion extends Exception {
    public NombreNoValidoExcepcion() {
        super();
    }

    public NombreNoValidoExcepcion(String mensaje) {
        super(mensaje);
    }
}
