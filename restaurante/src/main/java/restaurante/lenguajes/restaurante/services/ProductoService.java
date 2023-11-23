package restaurante.lenguajes.restaurante.services;

import java.util.List;

import restaurante.lenguajes.restaurante.models.Producto;

public interface ProductoService {
    public String crearProducto(Producto nuevoProducto);

    public Producto buscarProducto(int ProductoID);

    public String eliminarProducto(int ProductoID);

    public List<Producto> obtenerProductos();
}
