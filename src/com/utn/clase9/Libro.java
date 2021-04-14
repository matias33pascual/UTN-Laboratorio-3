package com.utn.clase9;

import com.utn.clase4.Autor;

import java.util.Arrays;

public class Libro {
    private String titulo;
    private int precio;
    private int stock;
    private Autor autor;
    private Autor[] autores = new Autor[10];

    public Libro() {

    }

    // ejemplo de una forma de organizar un constructor cuando tiene muchos parametros
    public Libro(String titulo,
                 int precio,
                 int stock,
                 String nombre,
                 String apellido,
                 String email,
                 char genero) {

        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;

        // en este ejemplo, creamos un nuevo autor en base a los parametros pasados en el
        // constructor de libro
        this.autor = new Autor(nombre, apellido, email, genero);
    }

    public Libro(String titulo, int precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;

        // en este ejemplo, el autor fue pasado por parametro
        this.autor = autor;
    }

    // --------------------------------------------------

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // en Java podemos devolver un arreglo
    public Autor[] getAutores() {
        return autores;
    }
    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    // --------------------------------------------------

    public String mostrarAutores() {
        StringBuilder nombres = new StringBuilder();

        for (Autor autor : autores) {
            if (autor != null) {
                nombres.append(autor.getNombre());
                nombres.append(" ");
                nombres.append(autor.getApellido());
                nombres.append(", ");
            }
        }

        return this.titulo + ", escrito por: " + nombres + '\n';
    }

    @Override
    public String toString() {
        return
                "titulo: " + this.titulo +
                "precio: " + this.precio +
                "stock: " + this.stock +
                "autor: " + Arrays.toString(autores);
    }
}
