/*
    Clase 7

    HERENCIA
        * Herencia en UML
        * Constructores con herencia
        * Clase abstracta y metodos abstractos
        * Sobreescritura de metodos
        * Ejemplo de herencia de una clase que hereda de otra clase
        * Diferencia entre super y this
        * Modificador de acceso: protected
        * Clase Object

        Referencias utiles:

        constructores y super:
        https://www.arquitecturajava.com/java-constructores-y-super/

        clase object:
        https://javadesdecero.es/clases/object/
 */
package com.utn.clase7;

import com.utn.clase7.ejemploHerencia.Animal;

public class Clase7 {
    public static void init() {
        ejemploHerenciaPolimorfismoConArreglos();
    }

    public static void ejemploHerenciaAbstract() {
        //com.utn.clase7.Animal animal = new com.utn.clase7.Animal();   // error: es una clase abstracta, no puede instanciarse

        Perro perro = new Perro();
        Gato gato = new Gato();
        Persa gatoPersa = new Persa("gato persa");

        perro.hacerRuido();
        gato.hacerRuido();
        gatoPersa.hacerRuido();
    }

    public static void ejemploHerenciaPolimorfismo() {
        com.utn.clase7.ejemploHerencia.Animal
                animal = new com.utn.clase7.ejemploHerencia.Perro();

        Animal animal1 = new com.utn.clase7.ejemploHerencia.Perro();

        animal.emitirSonido(); // utilizara el de Perro

        //animal.agarrarPelota(); // error este metodo no esta en la clase animal
    }

    public static void ejemploHerenciaPolimorfismoConArreglos() {
        com.utn.clase7.ejemploHerencia.Animal[]
                animales = new com.utn.clase7.ejemploHerencia.Animal[5];

        animales[0] = new com.utn.clase7.ejemploHerencia.Perro();
        animales[1] = new com.utn.clase7.ejemploHerencia.Gato();

        com.utn.clase7.ejemploHerencia.Gato gato = new com.utn.clase7.ejemploHerencia.Gato();
        com.utn.clase7.ejemploHerencia.Perro perro = new com.utn.clase7.ejemploHerencia.Perro();

        animales[2] = gato;
        animales[3] = perro;

        animales[4] = new com.utn.clase7.ejemploHerencia.Animal();

        int i = 0;  // usada como ejemplo para saber la posicion del animal en el arreglo
        for(Animal animal : animales) {
            System.out.print(i + ": ");

            animales[0].emitirSonido();
            animal.emitirSonido();

            i++;
        }

        System.out.println("------------------------------------");

        for(Animal animal : animales) {
            if (animal instanceof com.utn.clase7.ejemploHerencia.Perro) {
                System.out.println("es un perro");
            }
            else if (animal instanceof com.utn.clase7.ejemploHerencia.Gato){
                System.out.println("es un gato");
            }
            else {
                System.out.println("es otro animal");
            }
        }
    }
    public static void ejemploClaseObject() {
        // algunos ejemplos de los metodos de claseObject

        Animal animal = new Animal();
        Animal animal2 = new Animal();

        System.out.println(animal.getClass());

        System.out.println(animal.equals(animal2));

        System.out.println(animal.hashCode());
        System.out.println(animal2.hashCode());

        System.out.println(animal.toString());
    }
}
