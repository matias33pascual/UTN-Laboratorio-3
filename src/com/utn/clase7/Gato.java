package com.utn.clase7;

/// GATO ES UNA SUBCLASE DE ANIMAL
/// GATO EXTIENDE ANIMAL
public class Gato extends Animal {

    /// si no tenemos un constructor vacio en la clase padre, tendremos error
    public Gato() {
        this.ubicacion = "sillon";
    }

    /// este constructor tiene su constructor correspondiente en su clase padre
    public Gato(String nombre) {
        super(nombre);
    }

    // sobreescribimos el metodo hacerRuido de la clase padre
    @Override
    public void hacerRuido() {
        System.out.println("miaauuu");
    }
}
