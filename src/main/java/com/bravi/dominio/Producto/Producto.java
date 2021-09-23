package com.bravi.dominio.Producto;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int codigoFabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
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

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoFabricante() {
        return this.codigoFabricante;
    }

    public void setCodigo_fabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    @Override
    public String toString() {
        return "{" + " codigo='" + getCodigo() + "'" + ", nombre='" + getNombre() + "'" + ", precio='" + getPrecio()
                + "'" + ", codigo_fabricante='" + getCodigoFabricante() + "'" + "}";
    }

}