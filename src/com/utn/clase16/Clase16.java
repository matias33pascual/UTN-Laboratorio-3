/*
    Clase 16

    SERIALIZACION
        * interfaz Serializable
        * control de versiones
        * guardando una persona
        * leyendo una persona
        * guardando un arraylist
        * leyendo un arraylist

    Referencias:
        * https://docs.oracle.com/javase/8/docs/platform/serialization/spec/serial-arch.html


 */

package com.utn.clase16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Clase16 {
    public static void init(){
        ejemplo_1();    // guardamos el objeto
        ejemplo_2();    // leemos el objeto guardado
        ejemplo_3();    // guardamos un arraylist
        ejemplo_4();    // leemos un arraylist
    }

    public static void ejemplo_1() {
        /**
         * La serialización permite convertir cualquier objeto (que implemente la
         * interfaz Serializable) en una secuencia de bytes que pueden ser
         * posteriormente leídos para restaurar el objeto original
         */

        // Persona implementa la interfaz Serializable

        Persona persona = new Persona();
        persona.setNombre("Santiago");

        try {
            // guardamos el arraylist en un archivo usando ObjectOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream("personasObject.json"); // podemos agregar datos
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(persona);

            objectOutput.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void ejemplo_2() {
        try {
            FileInputStream fileInputStream = new FileInputStream("personasObject.json");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Persona persona = (Persona) objectInputStream.readObject();

            System.out.println(persona);

        } catch(IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void ejemplo_3() {

        // creamos dos personas
        Persona persona = new Persona();
        persona.setNombre("Santiago");

        Persona persona2 = new Persona();
        persona2.setNombre("Julian");

        // las agregamos a un arraylist
        List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2);

        try {
            // guardamos el arraylist en un archivo usando ObjectOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream("personasObject.json"); // podemos agregar datos
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(personas);

            objectOutput.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void ejemplo_4() {
        try {
            FileInputStream fileInputStream = new FileInputStream("personasObject.json");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            List<Persona> personas = (List<Persona>) objectInputStream.readObject();

            for(var persona : personas) {
                System.out.println(persona);
            }

        } catch(IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
