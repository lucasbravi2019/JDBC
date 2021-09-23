package com.bravi.Ejercicio1.servicio;

import java.util.Scanner;

import com.bravi.Ejercicio1.dominio.Producto.Producto;
import com.bravi.Ejercicio1.persistence.FabricanteDao;
import com.bravi.Ejercicio1.persistence.ProductoDao;

public class ProductoService {
    ProductoDao prod = new ProductoDao();
    FabricanteDao fab = new FabricanteDao();
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
            fab.seleccionarFabricantes();
            codigo = scan.nextInt();
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigo);
            prod.insertarProducto(producto);
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
            fab.seleccionarFabricantes();
            int fabricante = scan.nextInt();
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(fabricante);
            prod.modificarProducto(producto, nombreProducto);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
