package com.bravi.Ejercicio1.servicio;

import java.util.Scanner;

import com.bravi.Ejercicio1.dominio.Fabricante.Fabricante;
import com.bravi.Ejercicio1.persistence.FabricanteDao;

public class FabricanteService {
    Scanner scan = new Scanner(System.in);
    FabricanteDao fab = new FabricanteDao();

    public void insertarFabricante() {
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = scan.nextLine();
        Fabricante fabricante = new Fabricante();
        fabricante.setNombre(nombre);
        try {
            fab.insertarFabricante(fabricante);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}
