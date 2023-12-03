package hn.unah.lenguajes.restaurante.services;

import java.util.List;

import hn.unah.lenguajes.restaurante.models.Producto;

public interface ProductoService {

    public Producto crearProducto(Producto nuevoProducto);

    public String eliminarProducto(int ProductoID);

    public Producto buscaProducto(int ProductoID);

    public List<Producto> obtenerTodos();
    
}
