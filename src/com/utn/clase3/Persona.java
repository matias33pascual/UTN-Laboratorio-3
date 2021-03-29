package com.utn.clase3;

public class Persona {
    private static int id = 0;
    private int mId;

    public Persona() {
        this.mId = generarNuevoId();
    }

    private int generarNuevoId() {
        return ++id;
    }

    public void nuevoId(int id) {
        this.mId = id;
    }

    @Override
    public String toString() {
        return String.valueOf(this.mId);    // convierte y devuelve el valor de mId, que es int
    }

    public static int getId() {
        return id;
    }
}
