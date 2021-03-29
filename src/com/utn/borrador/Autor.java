package com.utn.borrador;

public class Autor {

    private String nombre;
    private String apellido;

    public Autor () {

    }

    public Autor (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void cargarDatos() {
        cargarNombre();
        cargarApellido();
    }

    private void cargarNombre() {
        // el usuario carga los datos
    }

    private void cargarApellido() {
        // el usuario carga los datos
    }

    public void funcionPrubea() {
        Autor autor = new Autor();
        autor.cargarDatos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

