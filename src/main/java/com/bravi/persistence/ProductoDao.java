package com.bravi.persistence;

import java.sql.ResultSet;

import com.bravi.dominio.Producto.Producto;

public final class ProductoDao extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Producto vacio");
            }
            String sql = "INSERT INTO producto(nombre, precio, codigo_fabricante) VALUES ('" + producto.getNombre()
                    + "', " + producto.getPrecio() + ", " + producto.getCodigoFabricante() + ")";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Producto vacio");
            }
            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio()
                    + ", codigo_fabricante = " + producto.getCodigoFabricante() + " WHERE codigo = "
                    + producto.getCodigo() + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void eliminarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Producto vacio");
            }
            String sql = "DELETE FROM producto WHERE codigo = " + producto.getCodigo() + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void seleccionarTodosProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";
            ResultSet sel = select(sql);
            while (sel.next()) {
                System.out.println("Nombre: " + sel.getString("nombre"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void seleccionarNombrePrecioProductos() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Producto: " + rs.getString("nombre"));
                System.out.println("Precio: " + rs.getDouble("precio"));
            }

        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void precioRango() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto WHERE precio BETWEEN 120 AND 202";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;

        }
    }

    public void seleccionarPortatiles() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE nombre like 'Portatil%'";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre") + " Precio: $" + rs.getDouble("precio"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void seleccionarMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre") + "\tPrecio: $" + rs.getDouble("precio"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void insertarProducto(String nombre, double precio, int codigo) throws Exception {
        try {
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('" + nombre + "', " + precio
                    + ", " + codigo + ")";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

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

    public void insertarFabricante(String nombre) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + nombre + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void modificarProducto(String nombre, double precio, int fabricante, String nombreProducto)
            throws Exception {
        try {
            String sql = "UPDATE producto SET nombre = '" + nombre + "', precio = " + precio + ", codigo_fabricante = "
                    + fabricante + " WHERE nombre = '" + nombreProducto + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
