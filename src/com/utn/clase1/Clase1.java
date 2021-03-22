/*
    Clase 1

    INTRODUCCION A LA SINTAXIS DE JAVA
        * El 'Hola Mundo' en Java
        * Tipos de datos
        * Introducir datos usando la clase Scanner
        * Mostrar datos y String.format
        * Casteo para el ejercicio 1. Integer.valueOf(x)
        * Arreglos en Java
 */

package com.utn.clase1;

import java.io.PrintStream;
import java.util.Scanner;

public class Clase1 {

    public static void holaMundo() {
        System.out.println("hola mundo!");

        // otra forma de hacer lo mismo
        PrintStream salida = System.out;
        salida.println("hola mundo!");
    }

    public static void tipoDatos() {


        // NUMEROS ENTEROS
        byte edad = 30;
        short cantidadLibros = 1234;

        // el guion bajo me permite entender mejor los numeros
        int numeroPersonas = 1_231_232_132;
        long numeroEstrellas = 8_312_313_212_132_131_321L; // L para que sea long

        // al mostrarlo, el guion bajo desaparece
        System.out.println(numeroEstrellas);

        // puedo hacer operaciones y el guion 'desaparece'
        long numeroMenorEstrellas = numeroEstrellas  / 100;

        System.out.println(numeroMenorEstrellas);

        // NUMEROS REALES
        float peso = 50.4F;     // F para que sea float
        double altura = 2.5;

        // CARACTERES
        char letra = 'a';

        // BOOLEANS (verdadero o falso)
        boolean claveCorrecta = false;
    }

    public static void introduciendoDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int numero = 0;
        numero = scanner.nextInt();

        System.out.println("ud ingreso: " + numero);

        // mostrando con String.format
        System.out.println(String.format("ud ingreso %s", numero));

        // string.format ejemplos:
        // https://www.javatpoint.com/java-string-format
    }

    public static void ejercicio1(){
        char C = 't';
        System.out.println(String.format("C: %s", Integer.valueOf(C)));
    }

    public static void arreglos() {
        // arreglo de String inicializado
        String[] nombres = {"matias","daniel","pascual"};

        // arreglo de int de tam 3, sin inicializar
        int[] edades = new int[3];
        edades[0] = 10;
        edades[1] = 20;
        edades[3] = 30;
    }
}