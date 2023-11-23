package restaurante.lenguajes.restaurante.services;

import restaurante.lenguajes.restaurante.models.Producto;

public interface ProductoService {
    public Producto crearProducto(Producto nuevoProducto);

    public Producto buscarProducto(int ProductoID);

    public String eliminarProducto(int ProductoID);
}
