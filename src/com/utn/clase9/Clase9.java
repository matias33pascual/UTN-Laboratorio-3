/*
CLASE 9:
    COLLECTIONS
        * List
            _ ArrayList : https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
            _ LinkedList : https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
            _ Vector : https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
            _ Stack : https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
            _ Map : https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

        * Iterator : https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

    Referencias:
    https://www.javatpoint.com/collections-in-java#:~:text=The%20Collection%20in%20Java%20is,a%20single%20unit%20of%20objects.
    https://www.adictosaltrabajo.com/2015/09/25/introduccion-a-colecciones-en-java/
    https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
*/

package com.utn.clase9;

import java.util.*;

public class Clase9 {
    public static void init() {
        //ejemplo_arrayList();
        //ejemplo_linkedList();
        //ejemplo_vector();
        //ejemplo_iterator();
        //ejemplo_stack();
        ejemplo_map();
    }

    private static void ejemplo_arrayList() {
        // CREAR EL ARRAYLIST

        // ¿ por que no usar ArrayList<Personas> = new ArrayList<>(20); ?
        // http://www.corejavaguru.com/blog/java/new-arraylist#:~:text=The%20main%20reason%20you'd,the%20List%20interface%20with%20ease.&text=List%20list%20%3D%20new%20ArrayList()%3B

        List<Persona> personas = new ArrayList<>(20);

        // AGREGAR DATOS AL ARRAYLIST

        Persona persona1 = new Persona("Sergio");
        Persona persona2 = new Persona("Gustavo");

        // agrego las dos personas al ArrayList personas
        personas.add(persona1);
        personas.add(persona2);

        // agrego una persona creada y pasada como parametro
        personas.add(new Persona());

        // agrego una persona creada con el nombre Julian y pasada como parametro
        personas.add(new Persona("Julian"));

        /// LEER DATOS DEL ARRAYLIST

        System.out.println(personas.get(0).getNombre());

        System.out.println("**************************");

        for (Persona persona : personas) {
            persona.saludar();
        }

        // REMOVIENDO UN ELEMENTO

        personas.remove(2);
        personas.remove(persona1);

        System.out.println("**************************");

        // ejemplo del for usando var
        for (var persona : personas) {
            persona.saludar();
        }
    }

    private static void ejemplo_linkedList() {

        // creo la linked list
        List<Persona> personas = new LinkedList<>();

        // agrego datos
        personas.add(new Persona("persona 1"));
        personas.add(new Persona("persona 2"));
        personas.add(new Persona("persona 3"));
        Persona persona4 = new Persona("persona 4");

        // remuevo datos
        personas.remove(0);
        personas.remove(persona4);

        // la persona de la posicion 0 saluda
        personas.get(0).saludar();

        // saludan todos en la linked list
        for (var persona : personas) {
            persona.saludar();
        }

        // algo mas parecido a C
        for(int i = 0; i < personas.size(); i++) {
            personas.get(i).saludar();
        }
    }

    private static void ejemplo_iterator() {
        List<String> palabras = new ArrayList<>();

        palabras.add("hola");
        palabras.add("casa");
        palabras.add("ventana");
        palabras.add("puerta");
        palabras.add("control remoto");

        // obtengo el iterador del array list
        Iterator<String> iterator = palabras.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void ejemplo_vector() {
        Vector vector = new Vector(10,5);

        vector.add(new Persona("Andres"));
        vector.add(new Persona("Franco"));

        vector.add(new Libro());
        vector.add(new Libro());

        for(var elemento : vector) {
            if (elemento instanceof Persona) {
                ((Persona) elemento).saludar();
            }
        }
    }

    private static void ejemplo_stack() {
        Stack<String> palabras = new Stack<>();

        // agrego elementos a la pila
        palabras.push("primer palabra");
        palabras.push("segunda palabra");
        palabras.push("tercer palabra");
        palabras.push("cuarta palabra");

        // quito el ultimo elemento ingresado
        palabras.pop();

        // mostrando palabras
        System.out.println(palabras);

        // muestro con iterator
        Iterator<String> iterator = palabras.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void ejemplo_map() {
        // creo el map
        Map<Integer, String> usuarios = new HashMap<>();

        // agrego key , values
        usuarios.put(1, "Victoria");
        usuarios.put(4, "Marcos");
        usuarios.put(2, "Rocio");
        usuarios.put(20, "Hector");

        // muestro datos
        System.out.println(usuarios.get(1));
        System.out.println(usuarios.get(20));

        System.out.println("******** FOR EACH *************");

        // RECORRIENDO CON FOREACH
        for(var usuario : usuarios.entrySet()) {
            System.out.println(usuario);
            System.out.println("key: " + usuario.getKey());
            System.out.println("value: " + usuario.getValue());
        }

        System.out.println("******* ITERATOR **************");

        // RECORRIENDO CON ITERATOR
        Iterator<Map.Entry<Integer, String>> iterator = usuarios.entrySet().iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("******* LAMBDA **************");

        // RECORRIENDO CON LAMBDA
        usuarios.forEach(
                (k,v) -> System.out.println(k + ", " + v)
        );

        System.out.println("******* LAMBDA con { } **************");

        usuarios.forEach(
                (k,v) -> {
                    System.out.println("key: " + k);
                    System.out.println("value: " + v);
                }
        );
    }
}
