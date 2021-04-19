/*
CLASE 10:
    INTERFACES
        * Creacion y utilizacion

    EQUALS
        * Comparamos los atributos de dos objetos segun nuestra preferencia

    HASHCODE:
        * Es un codigo que representa un objeto
        * https://es.wikipedia.org/wiki/HashCode()_(Java)#:~:text=En%20el%20lenguaje%20de%20programaci%C3%B3n,defecto%2C%20por%20la%20clase%20Object.
        * Para que utilizamos el metodo hashCode: https://es.wikipedia.org/wiki/Tabla_hash

    INTERFAZ COMPARABLE
        * Compara dos objetos y devuelve un valor que representa su diferencia

    RESOLUCION:
        * Guia V. Primeros pasos
*/

package com.utn.clase10;

public class Clase10 {
    public static void init() {
        //ejemploEquals();
        //ejemploHashCode();
        //ejemploComparable();
    }

    private static void ejemploEquals() {
        Empleado empleado1 = new Empleado("Guillermo", "Del Toro", "Cine", 23);
        Empleado empleado2 = new Empleado("Michael", "Scott", "Ventas", 1);
        Empleado empleado3 = new Empleado("Michael", "Flamel", "Ventas", 1);

        // comparo el empleado 1 y el empleado 2
        System.out.println("el 1 y el 2: " + empleado1.equals(empleado2));

        // comparo el empleado 2 y el empleado 3
        System.out.println("el 2 y el 3: " + empleado2.equals(empleado3));
    }

    private static void ejemploHashCode() {
        /**
         * el objetivo de hashCode es identificar el objeto con un numero
         * que se utilizara para se guardarlo en una tabla hash
         */

        Empleado empleado1 = new Empleado("Guillermo", "Del Toro", "Cine", 23);
        Empleado empleado2 = new Empleado("Michael", "Scott", "Ventas", 1);
        Empleado empleado3 = new Empleado("Michael", "Flamel", "Ventas", 1);

        System.out.println("Empleado 1: " + empleado1.hashCode());
        System.out.println("Empleado 2: " + empleado2.hashCode());
        System.out.println("Empleado 3: " + empleado3.hashCode());
    }

    private static void ejemploComparable() {
        Empleado empleado1 = new Empleado("Michael", "Scott", "Ventas", 2);
        Empleado empleado2 = new Empleado("Michael", "Flamel", "Ventas", 3);

        System.out.println("Empleados 1 y 2 : " + empleado1.compareTo(empleado2));
    }
}
