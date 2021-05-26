package com.utn.clase15;

import java.util.List;

/** T es para Tipo de dato */
public class Caja <T> {
    private List<T> elementos;
    private int tope;

    public Caja(int tope) {
        this.tope = tope;
    }

    public boolean agregarElementos(T elemento) {
        if(this.tope < elementos.size()) {
            elementos.add(elemento);
            return true;
        }
        return false;
    }
}
