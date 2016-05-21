package com.soloparaapasionados.groupapp.modelo;

/**
 * Created by USUARIO on 16/05/2016.
 */
public class Curso {
    public String codigo;
    public String nombre;
    public String descripcion;
    public int idcarrera;

    public Curso(String codigo, String descripcion, String nombre, int idcarrera) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.idcarrera = idcarrera;
    }
}
