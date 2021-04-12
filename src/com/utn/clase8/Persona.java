package com.utn.clase8;

public class Persona {
    private String nombre = "persona";
    public String apellido = "ona";

    // este metodo sera sobreescrito
    public String getNombre() {
        return this.nombre;
    }

    // este metodo no es sobreescrito
    private String obtenerNombre () {
        return this.nombre;
    }

    // ejemplo con metodos publicos que se estan sobreescribiendo
    public void saludar() {
        System.out.println("**********************");
        System.out.println(this.getClass());
        System.out.println("hola, soy una persona!");

        System.out.println("this nombre: " + this.nombre);

        // el metodo esta sobreescrito en Empleado, por eso nos devuelve "empleado"
        System.out.println("this getNombre: " + this.getNombre());
    }

    // ejemplo con metodos privados
    public void ejemploObtenerNombre() {
        System.out.println("********************");
        System.out.println(this.getClass());
        System.out.println("nombre persona: " + this.obtenerNombre());

        /*
            obtener nombre es privado
            por lo que es propio de cada clase y no es sobreescrito por las subclases
         */
    }

    public void ejemploApellido() {
        System.out.println("********************");
        System.out.println("apellido persona: " + this.apellido);
    }
}
