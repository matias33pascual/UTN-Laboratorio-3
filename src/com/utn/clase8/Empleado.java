package com.utn.clase8;

public class Empleado extends Persona {
    private String nombre = "empleado";

    // el atributo no sobreescribe al atributo en la clase padre
    public String apellido = "ado";

    public String getNombre() {
        return this.nombre;
    }

    private String obtenerNombre () {
        return this.nombre;
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("**********************");
        System.out.println(this.getClass());
        System.out.println("hola! soy un empleado");

        System.out.println("this nombre: " + this.nombre);
        System.out.println("this getNombre: " + this.getNombre());

        // aunque le digamos super, al ser un metodo sobreescrito, nos devuelve "empleado"
        System.out.println("super getNombre: " + super.getNombre());
    }

    public void ejemploObtenerNombre_empleado() {
        // super.obtenerNombre(); // error: no puedo acceder porque es privado
        super.ejemploObtenerNombre();
        System.out.println("nombre empleado: " + this.obtenerNombre());
        System.out.println("apellido empleado: " + this.apellido);

        /*
            obtener nombre es privado
            por lo que es propio de cada clase y no es sobreescrito por las subclases
         */
    }

    public void ejemploApellido_empleado() {
        /*
            los atributos no se sobreescriben
         */

        super.ejemploApellido();
        System.out.println("apellido empleado: " + this.apellido);
    }
}
