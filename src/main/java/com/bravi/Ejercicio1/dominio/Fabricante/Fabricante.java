package com.bravi.Ejercicio1.dominio.Fabricante;

public class Fabricante {

    private int codigo;
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fabricante codigo(int codigo) {
        setCodigo(codigo);
        return this;
    }

    public Fabricante nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " codigo='" + getCodigo() + "'" + ", nombre='" + getNombre() + "'" + "}";
    }

}
