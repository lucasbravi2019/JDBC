package com.bravi.servicio;

import java.util.Scanner;

import com.bravi.persistence.ProductoDao;

public class ProductoService {
    ProductoDao prod = new ProductoDao();
    Scanner scan = new Scanner(System.in);

    public void seleccionarTodo() {
        try {
            prod.seleccionarTodosProductos();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void seleccionarNombrePrecio() {
        try {
            prod.seleccionarNombrePrecioProductos();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void seleccionarRangoPrecio() {
        try {
            prod.precioRango();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void seleccionarPortatiles() {
        try {
            prod.seleccionarPortatiles();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void seleccionarProductoBarato() {
        try {
            prod.seleccionarMasBarato();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void insertarProducto() {
        try {
            String nombre;
            double precio;
            int codigo;
            System.out.println("Ingrese el nombre del producto");
            nombre = scan.nextLine();
            System.out.println("Ingrese el precio del producto");
            precio = scan.nextDouble();
            System.out.println("Ingrese el codigo del fabricante");
            prod.seleccionarFabricantes();
            codigo = scan.nextInt();
            prod.insertarProducto(nombre, precio, codigo);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void insertarFabricante() {
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = scan.nextLine();
        try {
            prod.insertarFabricante(nombre);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void modificarProducto() {

        try {
            System.out.println("Ingrese el nombre del producto a modificar");
            String nombreProducto = scan.nextLine();
            System.out.println("Ingrese el nombre del nuevo producto");
            String nombre = scan.nextLine();
            System.out.println("Ingrese el precio del nuevo producto");
            double precio = scan.nextDouble();
            System.out.println("Ingrese el codigo de fabricante del nuevo producto");
            prod.seleccionarFabricantes();
            int fabricante = scan.nextInt();
            prod.modificarProducto(nombre, precio, fabricante, nombreProducto);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
