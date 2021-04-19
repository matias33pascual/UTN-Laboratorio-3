package com.utn.clase10.resolucionEjercicios.referencia;

public class Cancion {
    private String nombre;
    private String duracion;
    private Genero genero;

    public Cancion() {
    }

    public Cancion(String nombre, String duracion, Genero genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
