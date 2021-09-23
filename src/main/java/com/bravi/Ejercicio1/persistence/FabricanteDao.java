package com.bravi.Ejercicio1.persistence;

import java.sql.ResultSet;
import java.util.Scanner;

import com.bravi.Ejercicio1.dominio.Fabricante.Fabricante;

public class FabricanteDao extends DAO {
    Scanner scan = new Scanner(System.in);
    ProductoDao prod = new ProductoDao();

    public void seleccionarFabricantes() throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM fabricante";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Codigo: " + rs.getInt("codigo") + "\tNombre: " + rs.getString("nombre"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void insertarFabricante(Fabricante fabricante) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + fabricante.getNombre() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

}
