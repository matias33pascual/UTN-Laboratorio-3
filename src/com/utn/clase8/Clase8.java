/*
    Clase 8

    THIS y SUPER EN HERENCIA DURANTE EL RUNTIME (ejecucion del programa)
        * ejemplos en clases Persona y Empleado
        * uso de metodos publicos
        * uso de metodos privados
        * uso de atributos

    REFERENCIAS POLIMORFICAS
        * ejemplo con Object y Persona
        * instance of
        * utilizando referencias y casteos

    CLASES FINAL y ABSTRACT
        * diferencia entre final y abstract
        * ejemplos de uso
 */

package com.utn.clase8;

public class Clase8 {
    public static void init() {
        Persona persona = new Persona();
        Empleado empleado = new Empleado();

        //persona.saludar();
        //empleado.saludar();

        // ***************************************************

        //empleado.ejemploObtenerNombre_empleado();

        // ***************************************************

        //empleado.ejemploApellido_empleado();

        // ***************************************************

        ejemploCasting();
    }

    private static void ejemploObject() {
        /**
         * IMPORTANTE: EL COMPILADOR VERIFICA EL TIPO DE REFERENCIA,
         * NO EL TIPO DE OBJETO
         */

        Object[] arregloDeObject = new Object[10];

        Object objeto = new Object();
        Persona persona = new Persona();

        arregloDeObject[0] = objeto;
        arregloDeObject[1] = persona;

        // el tipo de referencia es Object
        //arregloDeObject[1].saludar(); // error: este metodo no esta en la clase object
        //System.out.println(arregloDeObject[1].apellido); // error: apellido no esta en object

        /**
         * el metodo o atributo que se invoca debe estar en la clase del tipo declarado
         */

    }

    private static void ejemploCasting() {
        // casting: convertir de un tipo de referencia a otro

        Object[] arregloDeObject = new Object[10];

        Object objeto = new Object();
        Persona persona = new Persona();

        arregloDeObject[0] = objeto;
        arregloDeObject[1] = persona;

        // casteamos al tipo Persona
        Persona persona1 = (Persona) arregloDeObject[1];
        persona1.saludar();

        System.out.println("--------------------");

        // error: este objeto no es de clase Persona
        //Persona persona2 = (Persona) arregloDeObject[0];
        //persona2.saludar();

        /** para no tener este error: */
        if (arregloDeObject[0] instanceof Persona) {

            /*
                si comprobamos que el objeto es una instancia de Persona,
                entonces hacemos el casteo
            */

            Persona persona3 = (Persona) arregloDeObject[0];
            persona3.saludar();

            System.out.println("------------------------");

            // o tambien podemos hacerlo sin crear una nueva referencia
            ((Persona) arregloDeObject[0]).saludar();
        }
    }
}
