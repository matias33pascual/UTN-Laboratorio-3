package com.utn.clase5;

public class ItemDeVenta {
    private int stock;  // libro no puede acceder a este atributo
    protected int cantidadEnStock;
    public boolean existeEnStock;
    String nombre;

    public ItemDeVenta() {

    }

    @Override
    public String toString() {
        return "cantidad en stock: " + this.stock;
    }
}
