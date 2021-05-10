/*
CLASE 11:
    MAP
        * Concepto
        * Utilizacion

    HASHMAP
        * Como implementarlo

    MOSTRAR REFERENCIA
        * TEORIA: Clase 14 - Collection - Set.pdf
        * Como elegir que usar

    RESOLUCION
        * Ejercicio 1. Como utilizar Hashmap en el ejercicio
*/

package com.utn.clase11;

import java.util.HashMap;
import java.util.Map;

public class Clase11 {
    public static void init() {
        //ejemplo_Map();
        //ejemplo_Hashmap();
        ejercicio_1();
    }

    private static void ejemplo_Hashmap() {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        HashMap<Integer, Persona> hashMap = new HashMap<>();

        hashMap.put(persona1.hashCode(), persona1);
        hashMap.put(persona2.hashCode(), persona2);
        hashMap.put(persona3.hashCode(), persona3);

        // que pasa si el hashcode no esta bien implementado...
        hashMap.forEach(
                (k,v) -> {
                    System.out.println("key: " + k);
                    System.out.println("value.hashcode: " + v.hashCode());
                    System.out.println("value: " + v);
                    System.out.println("------------------");
                }
        );
    }

    private static void ejemplo_Map() {
        Map<Integer, String> documentoPersonas = new HashMap<>();

        documentoPersonas.put(123, "Pablo");
        documentoPersonas.put(123, "Otro Pablo");   // no admite duplicados
        documentoPersonas.put(345, "Pedro");
        documentoPersonas.put(567, "Paola");

        documentoPersonas.forEach(
                (k,v) -> {
                    System.out.println("key: " + k);
                    System.out.println("value: " + v);
                    System.out.println("------------");
                }
        );
    }

    private static void ejercicio_1() {
        // creo los objetos de las clases personas

        Persona per1 = new Persona();
        Persona per2 = new Persona("Juan", 20, 'H');
        Persona per3 = new Persona("Maria", 30, 'M', 50.0, 1.60);

        // los agrego al hashmap segun su hashcode
        HashMap<Integer, Persona> lista_hash = new HashMap<Integer, Persona>();

        lista_hash.put(per1.getDni(), per1);
        lista_hash.put(per2.hashCode(), per2);
        lista_hash.put(per3.hashCode(), per3);

        // recorro el map y muestro sus valores
        for (Map.Entry<Integer, Persona> entry : lista_hash.entrySet()) {

            // adquiero el valor de persona dentro de esa posición
            Persona persona_value = entry.getValue();

            System.out.println(persona_value.toString());
        }

        // otra forma de hacer lo mismo
        lista_hash.forEach(
                (k,v) -> System.out.println(v.toString())
        );
    }
}
