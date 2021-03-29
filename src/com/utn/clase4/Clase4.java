/*
    Clase 4

    CONSTRUCTORES
        * Constructor vacio
        * Constructor con parametros
        * Poliformismo en los constructores
        * Ejemplo en la clase Autor

    STRING
        * String.format: https://www.javatpoint.com/java-string-format
        * Ejemplo de metodos
        * Arrays.toString()
        * Ejemplo de Arrays.sort() y Arrays.ToString()

    STRING BUILDER
        * https://docs.oracle.com/javase/tutorial/java/data/buffers.html
        * Utilizacion en la clase Libro para mostrar autores
 */

package com.utn.clase4;

import java.util.Arrays;
import java.util.Locale;

public class Clase4 {
    public static void init() {
        //ejemploStringMetodos();
        //ejemploStringBuilder();
        ejemploArraysToString();
    }

    public static void ejemploStringMetodos() {

        // INICIALIZAR UN STRING

        // dos formas de hacer lo mismo
        String frase = new String("  Hola Mundo!  ");
        String otraFrase = "  Hola Mundo!  ";

        // EJEMPLOS

        /* cada metodo devuelve un nuevo string. No cambia el orginial */
        String fraseConFormato_1 = frase.toUpperCase(Locale.ROOT);
        String fraseConFormato_2 = frase.replace('!', '?');
        String fraseConFormato_3 = frase.trim();

        System.out.println(frase);

        // OTROS EJEMPLOS DE METODOS DE STRING

        // saber con que caracter empieza
        String stringOriginal = "buenos dias";
        boolean comienzaConB = stringOriginal.startsWith("B");

        if (comienzaConB) {
            System.out.println("comienza con B");
        }
        else {
            System.out.println("no comienza con B");
        }

        // otra forma de hacer lo mismo
        /* nos ahorramos asignar una variable */
        if (stringOriginal.startsWith("B")) {
            System.out.println("comienza con B");
        }
        else {
            System.out.println("no comienza con B");
        }

        boolean terminaConB = stringOriginal.endsWith("B");
        int length = stringOriginal.length();   // tam del string
        int lugarDeUnCaracter = stringOriginal.indexOf("b");

        System.out.println(stringOriginal.indexOf("dias"));
        // buenos dias
        // 01234567891
        //           0
        // en este ejemplo, buenos dias arranca en index 7
    }

    public static void ejemploStringBuilder() {

        // iniciamos su capacidad con 1
        StringBuilder builder = new StringBuilder(1);

        // agregamos una cadena de caracteres
        builder.append("hola ");

        // imprimimos su capacidad actual
        System.out.println(builder.capacity());

        // agregamos otra cadena
        builder.append("mundo ");

        // imprimimos su capacidad actual
        System.out.println(builder.capacity());

        // borramos los caracteres que estan desde el 0 inclusive hasta uno antes del 3
        builder.delete(0,3);    // imprime: a mundo

        // h o l a _ m u n d o
        // 0 1 2 3 4 5 6 7 8 9

        // imprimimos su valor actual
        System.out.println(builder);

        // reemplazamos los caracteres entre 0 y 3, con el string HOLA m
        builder.replace(0,3, "HOLA m");

        // imprimimos su valor actual
        System.out.println(builder);
    }

    public static void ejemploArraysToString() {
        // ejemplo de como ver un arreglo por consola
        String[] nombres = {"matias, daniel, pascual"};

        // forma incorrecta
        System.out.println(nombres);

        // forma correcta
        System.out.println(Arrays.toString(nombres));

        // otra forma de hacer lo mismo
        String string = Arrays.toString(nombres);
        System.out.println(string);

        // -------------------------------------------

        // ejemplo de Arrays.sort() y Arrays.toString()
        int[] numeros = { 1,2, 8,9,78,45,6,1,2,6,10 };

        // ordeno los numeros
        Arrays.sort(numeros);

        // muestro el resultado
        System.out.println(Arrays.toString(numeros));
    }
}
