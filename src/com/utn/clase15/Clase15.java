/*
    Clase 15

    Genericos
        * Creacion y utilizacion de una clase generica

    Json
        * Como guardar la informacion en archivos
 */

package com.utn.clase15;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.utn.clase9.Persona;
import com.utn.clase7.ejemploHerencia.Gato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Clase15 {
    private static List<Object> elementos = new ArrayList<>();

    public static void init() {
        //ejemplo_1();
        //ejemplo_2();
        //ejemplo_3();
        //ejemplo_4();
        //ejemplo_5();
        ejemplo_6();
    }

    public static void ejemplo_1() {
        /** puedo agregar cualquier tipo de elemento a la lista */

        Persona persona = new Persona();
        Gato gato = new Gato();

        elementos.add(persona);
        elementos.add(gato);
    }

    public static void ejemplo_2() {
        /** uso una caja para guardar elementos de tipo persona */

        Caja<Persona> personas = new Caja<>(10);

        personas.agregarElementos(new Persona());

        /** uso una caja para guardar elementos de tipo gato */

        Caja<Gato> gatos = new Caja<>(5);

        gatos.agregarElementos(new Gato());
    }

    public static void ejemplo_3() {
        /// el gson ahora tiene formato mas facil de leer
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Persona persona = new Persona();
        persona.setNombre("julian");

        /** guardando un archivo con informacion json */

        BufferedWriter fSalida = null;

        try {
            fSalida = new BufferedWriter(new FileWriter(new File("personas.json")));

            gson.toJson(persona, persona.getClass(), fSalida);

        } catch (IOException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if(fSalida != null) {
                try {
                    fSalida.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void ejemplo_4() {
        Libro libro = new Libro();
        libro.setPrecio(1500);
        libro.setStock(500);
        libro.setTitulo("Manual de C");

        Libro libro2 = new Libro();
        libro2.setPrecio(1700);
        libro2.setStock(200);
        libro2.setTitulo("Manual de C++");

        Libro libro3 = new Libro();
        libro3.setPrecio(2700);
        libro3.setStock(400);
        libro3.setTitulo("Manual de C#");

        List<Libro> libros = new ArrayList<>();
        libros.add(libro);
        libros.add(libro2);
        libros.add(libro3);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        /** guardamos en un archivo */

        BufferedWriter fSalida = null;

        try {
            fSalida = new BufferedWriter(new FileWriter(new File("libros.json")));

            String json = gson.toJson(libros, libros.getClass());

            /// vemos lo que esta guardado en el string
            System.out.println(json);

            fSalida.write(json);
            /// String json = gson.toJson(libros, libros.getClass(), fSalida);

        } catch (IOException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if(fSalida != null) {
                try {
                    fSalida.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void ejemplo_5() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        BufferedReader reader = null;

        List<Libro> libros;

        try {
            reader = new BufferedReader(new FileReader(new File("libros.json")));
            libros = gson.fromJson(reader,
                        (new TypeToken<List<Libro>>() {}.getType())
                    ); // hacemos esto porque necesitamos el tipo de dato

            for(var libro : libros) {
                System.out.println(libro.getTitulo());
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void ejemplo_6() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(new File("personas.json")));

            Persona persona = gson.fromJson(reader, Persona.class);

            System.out.println(persona.getNombre());

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
