package com.utn.clase7;

/**
 * Michi heredea de Gato, que a su vez hereda de Animal
 *
 * Gato no es una clase abstracta, sin embargo se puede heredar sin problemas
 */

public class Michi extends Gato {

    @Override
    public void caminar() {

    }

    /// mostrar como queda el @Override/Implements methods...
    @Override
    public void hacerRuido() {

        /// llama al hacerRuido de Gato
        super.hacerRuido();
        System.out.println("Soy michi");  // supongamos que el gato habla
    }
}
