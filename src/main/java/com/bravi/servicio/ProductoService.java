package com.bravi.servicio;

import com.bravi.persistence.ProductoDao;

public class ProductoService {
    ProductoDao prod = new ProductoDao();

    public void seleccionarTodo() {
        try {
            prod.seleccionarTodosProductos();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}
