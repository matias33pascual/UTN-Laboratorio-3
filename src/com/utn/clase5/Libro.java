package com.utn.clase5;

public class Libro extends ItemDeVenta {

    private int cantidadHojas;

    public Libro() {

    }

    // mostrar que pasa cuando uso @Override/Implements Methods
    @Override
    public String toString() {
        String stringDelObjetoPadre = super.toString();

        return stringDelObjetoPadre + ", cantidad de hojas: " + this.cantidadHojas;
    }
}
