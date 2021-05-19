/*
    Clase 14

    Utilizacion de Github
        * INTRODUCCION
        * GIT EXTENSIONS

    Utilizacion de archivos
        * Escribir
        * Leer

    JSON
        * Utilizando gson
 */

package com.utn.clase14;

import com.google.gson.Gson;
import com.utn.clase11.Persona;

import java.io.*;

public class Clase14 {
    public static void init() {
        escribiendoArchivo();
        leyendoArchivo();
        ejemplo_json();
    }

    public static void escribiendoArchivo() {

        try {
            // ABRO EL ARCHIVO
            BufferedWriter fSalida = new BufferedWriter(
                    new FileWriter(new File("mi_archivo.txt"))
            );

            fSalida.write("Hola mundo!");
            fSalida.newLine();
            fSalida.write("bienvenido!");

            fSalida.close();

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leyendoArchivo() {
        // si no existe el archivo... salgo de la funcion
        if(!new File("mi_archivo.txt").exists())
            return;

        BufferedReader fEntrada = null;

        try{
            fEntrada = new BufferedReader(
                    new FileReader(new File("mi_archivo.txt"))
            );

            String linea = null;

            while((linea = fEntrada.readLine()) != null) {
                System.out.println(linea);
            }

        }catch(IOException e) {
            System.out.println(e.getMessage());

        } finally {

            // CIERRO EL ARCHIVO AL FINALIZAR

            if(fEntrada != null) {
                try {
                    fEntrada.close();
                }
                catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void ejemplo_json() {
        Gson gson = new Gson();

        // serializacion
        String fraseOriginal = "hola mundo!";

        String json = gson.toJson(fraseOriginal);

        // deserializacion
        String frase = gson.fromJson(json, String.class);

        System.out.println(frase);

        // USANDO UN OBJETO
        Persona persona = new Persona();
        persona.setNombre("Damian");

        String jsonPersona = gson.toJson(persona);

        System.out.println("json: " + jsonPersona);

        Persona nuevaPersona = gson.fromJson(jsonPersona, Persona.class);

        System.out.println("persona: " + nuevaPersona);
    }
}


