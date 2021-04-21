package com.utn.clase11;

public class Persona {
    final static char HOMBRE = 'H';
    final static char MUJER = 'M';
    private int dni;
    private String nombre;
    private int edad;
    private Character sexo;
    private Double peso;
    private Double altura;

    public Persona() {
        /// valores por defecto al momento de la creacion del objeto
        this.generaDNI();
        this.nombre = "";
        this.edad = 0;
        this.sexo = HOMBRE;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo, Double peso, Double altura) {
        this.generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    private void generaDNI(){
        // De esta manera generamos un numero entre 1 a 50000000.
        this.dni = (int) (Math.random()*50000000+1);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    // mostrar que pasa si hago esto en el hashmap
    @Override
    public int hashCode() {
        return 20;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        if (sexo == HOMBRE) {
            this.sexo = sexo;
        }
        else{
            this.sexo = MUJER;
        }
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
