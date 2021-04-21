package com.utn.clase10;

public class Empleado implements Comparable, AtencionCliente{
    private String nombre;
    private String apellido;
    private String departamento;
    private int numero;

    public Empleado() {}

    public Empleado(String nombre, String apellido, String departamento, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object obj) {
        // si el objeto es este objeto...
        if (obj == this)
            return true;

        // si el objeto no es una instancia de empleado ...
        if (!(obj instanceof Empleado))
            return false;

        /**
         *  dos empleados son iguales si tienen el mismo nombre, trabajan en el mismo
         *  departamento y tienen el mismo numero. No tenemos en cuenta su apellido
         */

        // para comparar con el objeto, casteo el objeto y guardo su referencia
        Empleado empleado = (Empleado) obj;

        boolean respuesta = this.nombre == empleado.nombre &&
                this.departamento == empleado.departamento &&
                this.numero == empleado.numero;

        return respuesta;
    }

    @Override
    public int hashCode() {
        // como usamos nombre, departamento y numero,
        // mantenemos la misma logica en el hashCode
        int result = this.nombre.hashCode();
        result += 31 * this.departamento.hashCode();
        result += 31 * Integer.hashCode(this.numero);

        return result;
    }

    @Override
    public int compareTo(Object o) {
        // casteamos el objeto
        Empleado empleado = (Empleado) o;

        // comenzamos las comparaciones con los atributos...
        int resultado = this.nombre.compareTo(empleado.nombre);

        if (resultado == 0) {
            resultado = this.departamento.compareTo(empleado.departamento);

            if (resultado == 0) {
                resultado = Integer.compare(this.numero, empleado.numero);
            }
        }

        return resultado;
    }

    // region getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    @Override
    public void saludar() {

    }

    @Override
    public void pedirDatos() {

    }

    @Override
    public void transferirAOtroDepartamento() {

    }

    @Override
    public void dejarEnEspera() {

    }

    // endregion
}
