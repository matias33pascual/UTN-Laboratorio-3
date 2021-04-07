package com.utn.clase7;

// ANIMAL ES LA SUPERCLASE (o clase padre) DE PERRO Y GATO
// SOLO PUEDE HABER UNA CLASE PADRE EN CADA RELACION
// UNA CLASE PADRE PUEDE TENER MUCHOS CLASES HIJOS (sub clases)

/**
 * abstract: le estamos diciendo que la clase Animal no puede ser instanciada *
 * hacer Animal animal = new Animal(); generaria un error
 *
 * si la clase tiene al menos un metodo abstracto, entonces la clase debe ser
 * declarada como abstracta
 *
 * no se puede tener un metodo abstracto en una clase que no es abstracta,
 * aunque si es posible tener una clase abstracta sin metodos abstractos
 *
 * la abstraccion no es obligatoria para la herencia
 */
public abstract class Animal {
    protected String ubicacion;
    private String nombre;

    // debe haber un constructor default o tendremos errores en las subclases
    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String ubicacion, String nombre) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
    }

    public void comer() {

    }

    public void dormir() {

    }

    public void caminar() {

    }

    // en este ejemplo, el metodo hacerRuido sera sobreescrito por las clases hijas
    // gato y perro

    public abstract void hacerRuido();
    /**
     * nota:
     *      . los metodos abstractos no pueden tener cuerpo de funcion
     *      . una clase abstracta tiene, al menos, un metodo abstracto
     */

    // region getters y setters

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // endregion
}
