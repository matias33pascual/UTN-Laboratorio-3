package com.utn.clase7;

/**
 * Persa heredea de Gato, que a su vez hereda de Animal
 *
 * Gato no es una clase abstracta, sin embargo se puede heredar sin problemas
 */

public class Persa extends Gato {

    public Persa() {

    }

    public Persa(String nombre) {
        super(nombre);
    }

    @Override
    public void caminar() {
        this.ubicacion = "otro sillon";
    }

    /// mostrar como queda el @Override/Implements methods...
    @Override
    public void hacerRuido() {


        System.out.println("----");

        /// llama al hacerRuido de Gato
        super.hacerRuido(); // como no es un constructor, puedo ponerlo en cualquier
                            // linea

        System.out.println("Soy Persa");  // supongamos que el gato habla
    }
}
