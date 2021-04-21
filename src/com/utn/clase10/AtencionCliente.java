package com.utn.clase10;

public interface AtencionCliente {
    // public es redundante, todos los metodos son public por defecto
    public void saludar();

    void pedirDatos();
    void transferirAOtroDepartamento();
    void dejarEnEspera();

    // si el metodo es privado, debe tener un cuerpo
    private void anotarCliente() {
        // escribir codigo aqui
    }

    // no se permite el modificador de acceso protected
    // protected void ejemploProtected();
}
