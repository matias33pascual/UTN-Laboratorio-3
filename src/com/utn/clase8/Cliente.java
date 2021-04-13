package com.utn.clase8;

import java.util.UUID;

/**
 * mostrar que pasa cuando se extiende una clase con metodos abstractos
 */

// esta clase es final, por lo que no podra ser heredada

public final class Cliente extends Usuario {

    private UUID id;
    private int numeroCuenta;

    public Cliente() {

    }

    // region implementando metodos abstractos

    @Override
    public void conectarse() {
        System.out.println("conectandose...");
    }

    @Override
    public void desconectarse() {
        System.out.println("desconectandose...");
    }

    @Override
    public void comprobarConneccion() {
        System.out.println("comprobando coneccion...");
    }

    // endregion

    public Cliente(UUID id, int numeroCuenta) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
