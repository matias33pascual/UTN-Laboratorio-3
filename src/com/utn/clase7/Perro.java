package com.utn.clase7;

/// PERRO ES UNA SUBCLASE DE ANIMAL
/// PERRO EXTIENDE ANIMAL
public class Perro extends Animal {
    private int hambre;

    public Perro() {
    }

    public Perro(String nombre, int hambre) {
        super(nombre);
        this.hambre = hambre;
    }

    // sobreescribimos el metodo hacerRuido de la clase padre
    @Override
    public void hacerRuido() {
        System.out.println("wof!");

        // usamos super.getNombre() para acceder al nombre, ya que es privado
        System.out.println("nombre del perro: " + super.getNombre());

        // ubicacion es protected, asi que podemos usarla como si fuera una variable
        // privada de Perro
        System.out.println("ubicacion: " + this.ubicacion);
    }

    public void agarrarPelota() {

    }
}
