package com.utn.clase10.resolucionEjercicios.referencia;

import java.util.Stack;

public class ListaBasica extends ListaReproduccion {
    // esta clase tiene que implementar los metodos que
    // ListaReproduccion implementa como interfaz

    private Stack<Cancion> miLista;

    public ListaBasica() {
        this.miLista = new Stack<>();
    }

    @Override
    public void reproducir() {

    }

    @Override
    public void agregarCancion(Cancion cancion) {
        this.miLista.push(cancion);
    }

    @Override
    public void eliminarCancion(Cancion cancion) {

    }

    @Override
    public void verMiLista() {

    }
}
