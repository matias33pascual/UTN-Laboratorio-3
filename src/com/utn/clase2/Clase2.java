/*
    Clase 2

    CREANDO OBJETOS
        * getters y setters

    MODIFICADORES DE ACCESO: public, default y private.
        * Dentro de la misma clase: todos.
        * Dentro del mismo paquete: public, default.
 */

package com.utn.clase2;

import com.utn.clase2.Departamento;
import com.utn.clase2.Persona;

public class Clase2 {

    public static void init(){
        ejemploOverride();
        ejemploModificadoresAcceso();
    }

    public static void ejemploModificadoresAcceso() {
        Persona persona = new Persona();

        //persona.nombre = "Juan";   // error, nombre es private.
        // No puede ser accedido fuera de la clase.

        persona.peso = 60.5;       // error, peso es default.
                                    // No puede ser accedido fuera del paquete.

        persona.altura = 2.1;        // altura es public
        // puede ser accedido desde cualquier lado
    }

    public static void ejemploOverride() {
        Persona persona = new Persona();
        persona.setNombre("Matias");

        Departamento departamento = new Departamento();

        // persona tiene sobreescrito el toString()
        System.out.println(persona.toString());

        // departamento no tiene sobreescrito el toString()
        System.out.println(departamento.toString());

        System.out.println("------------");

        // sin .toString() es lo mismo
        System.out.println(persona);
        System.out.println(departamento.toString());
    }
}
