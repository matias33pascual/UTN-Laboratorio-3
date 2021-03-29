/*
    Clase 3

    STATIC Y DIFERENCIAS ENTRE TIPO PRIMITIVO Y OBJETO
        * static: atributos y metodos
        * Tipos primitivos
        * Objeto vs tipo primitivo
        * Objeto como parametro
        * Wrappers
 */

package com.utn.clase3;

public class Clase3 {

    public static void init() {
        ejemploStaticId();
        ejemploTipos();
        ejemploObjetos();
        ejemploObjetoComoParametro();
        ejemploWrapper();
    }

    // ejemplo de metodo static
    public static void ejemploStaticId(){
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        System.out.println(persona1 + "\n" + persona2 + "\n" + persona3);
        System.out.println("id: " + Persona.getId());
    }

    public static void ejemploTipos() {
        char unCaracter = 'c';
        byte unByte = 100;
        short unShort = 9000;
        int unInt = 900000000;
        long unLong = 999999999;
        float unFloat = 0.99999999F;
        double unDouble = 0.9999999999999999;
        boolean unBoolean = true;
    }

    public static void ejemploObjetos() {
        // MOSTRANDO LA DIFERENCIA DE ASIGNACION DE VALORES ENTRE TIPOS
        // PRIMITIVOS Y OBJETOS

        // un objeto se crea con el operador new. Cuando un objeto se crea,
        // se devuelve la direccion de memoria donde esta ese objeto

        // la variable persona guarda la direccion de memoria donde esta creado el objeto
        Persona persona1 = new Persona();

        System.out.println("id persona1: " + persona1);   // vemos que su id es el 1

        // la variable persona2 guarda la direccion de memoria de un nuevo objeto
        Persona persona2 = new Persona();
        System.out.println("id persona2: " + persona2); // vemos que su id es el 2

        // ahora asignamos a persona2 la direccion de persona1
        persona2 = persona1;

        // hacemos un cambio en el id de persona1
        persona1.nuevoId(33);

        // y vemos que pasa con el id de persona 2
        System.out.println("id persona2: " + persona2);   // el id de persona 2 ya no es 2, sino 33.

        // esto no pasa con los tipos primitivos
        int variableA = 10;
        int variableB = 20;

        variableA = variableB;
        variableB = 30;

        System.out.println("variables: " + variableA + "," + variableB );  // el valor de ambas variables es independiente
    }

    public static void ejemploObjetoComoParametro() {
        Persona persona = new Persona();
        persona.nuevoId(10);
        pasarObjeto(persona);
    }

    private static void pasarObjeto(Persona personaT) {
        Persona persona1 = new Persona();   // el id de persona1 es 2 (recordemos que creamos un objeto en la funcion
                                            // ejemploObjetoComoParametro)

        System.out.println(persona1);

        persona1 = personaT;                // aca el id de persona1 es el mismo que el personaT
        personaT.nuevoId(60);               // aca ambos pasan a tener el id 60

        System.out.println(persona1);
        System.out.println(personaT);
    }

    public static void ejemploWrapper() {
        Integer miInteger = new Integer(30);

        System.out.println(miInteger.intValue());
    }






}
