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
            String sql = "SELECT * FROM producto";
            ResultSet sel = select(sql);
            while (sel.next()) {
                System.out.println("Codigo: " + sel.getInt("codigo") + "\tNombre: " + sel.getString("nombre")
                        + "     Precio: " + sel.getDouble("precio") + "     Codigo Fabricante: "
                        + sel.getInt("codigo_fabricante"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

}
