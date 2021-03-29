package com.utn.clase2;

public class Persona {

    /// EJEMPLOS DE MODIFICADORES DE ACCESO EN LOS ATRIBUTOS
    public double altura;   // public
    double peso;            // default
    private String nombre;  // private
    private int edad;

    // --------------------------------------------------

    // CONSTRUCTOR VACIO
    public Persona() {

    }

    // CONSTRUCTOR CON PARAMETROS
    public Persona(double altura, double peso, String nombre, int edad) {
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
        this.edad = edad;
    }

    // --------------------------------------------------

    /// GETTERS Y SETTERS
    public void setEdad(int edad) {this.edad = edad;}
    public int getEdad() {return this.edad;}

    public double getAltura() {return this.altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public double getPeso() {return this.peso;}
    public void setPeso() {this.peso = peso;}

    public String getNombre() {return this.nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    // --------------------------------------------------

    // @Override:
    //      . se asegura que el metodo que estoy sobreescribiendo exista
    //      . debe tener el mismo nombre y los mismos parametros

    @Override
    public String toString() {

        // este metodo devuelve los datos que aparecen al mostrar el objeto
        // lo sobreescribo para que muestre los datos que me interesan

        return "Persona{" +
                "altura=" + altura +
                ", peso=" + peso +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
