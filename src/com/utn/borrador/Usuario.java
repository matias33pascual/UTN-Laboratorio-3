package com.utn.borrador;

public class Usuario extends Persona {

    @Override
    public int numero() {
        return 200;
    }

    @Override
    public String toString() {
        return Integer.toString(this.numero());
    }
}

