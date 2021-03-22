/*
    CLASE DE APOYO PARA VER COMO FUNCIONA EL MODIFICADOR DE ACCESO DEFAULT
 */

package com.utn.clase2;

public class Departamento {

    public Departamento() {
        Persona persona = new Persona();

        // persona.nombre = "Juan"; // error, nombre es private
                                    // No puede ser accedido fuera de la clase

        persona.peso = 60.5;        // peso es default
                                    // puede ser accedido dentro del mismo paquete

        persona.altura = 2.1;       // altura es public
                                    // puede ser accedido desde cualquier lado
    }
}
