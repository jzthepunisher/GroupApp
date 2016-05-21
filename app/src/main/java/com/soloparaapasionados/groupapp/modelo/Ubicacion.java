package com.soloparaapasionados.groupapp.modelo;

/**
 * Created by USUARIO on 17/05/2016.
 */
public class Ubicacion {
    public String codigo;
    public String nombre;
    public String descripcion;

    public Ubicacion(String codigo, String descripcion, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
}
