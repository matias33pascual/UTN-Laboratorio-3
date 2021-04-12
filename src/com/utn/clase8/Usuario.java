package com.utn.clase8;

// esta clase no
public abstract class Usuario {
    public String nombreUsuario;
    public String apellidoUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String apellidoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
    }

    public abstract void conectarse();
    public abstract void desconectarse();
    public abstract void comprobarConneccion();

    // region getters y setters

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    // endregion
}
