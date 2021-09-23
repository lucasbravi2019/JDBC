package com.bravi;

import java.util.Scanner;

import com.bravi.servicio.ProductoService;

public class main {

    static Scanner scan = new Scanner(System.in);
    static ProductoService p = new ProductoService();

    public static void main(String[] args) {
        int operacion = 0;
        while (operacion != 9) {
            System.out.println("\tMenu");
            System.out.println("1. Listar el nombre de todos los productos");
            System.out.println("2. Listar el nombre y precio de todos los productos");
            System.out.println("3. Listar los productos cuyo precio este entre 120 y 202");
            System.out.println("4. Listar todos los portatiles");
            System.out.println("5. Listar el nombre y precio del producto mas barato");
            System.out.println("6. Crear nuevo producto");
            System.out.println("7. Crear nuevo fabricante");
            System.out.println("8. Editar producto");
            System.out.println("9. Salir\n");
            operacion = scan.nextInt();
            if (operacion == 1) {
                p.seleccionarTodo();
            }
            if (operacion == 2) {
                p.seleccionarNombrePrecio();
            }
            if (operacion == 3) {
                p.seleccionarRangoPrecio();
            }
            if (operacion == 4) {
                p.seleccionarPortatiles();
            }
            if (operacion == 5) {
                p.seleccionarProductoBarato();
            }
            if (operacion == 6) {
                p.insertarProducto();
            }
            if (operacion == 7) {
                p.insertarFabricante();
            }
            if (operacion == 8) {
                p.modificarProducto();
            }
            if (operacion == 9) {
                break;
            }
        }
    }
}
