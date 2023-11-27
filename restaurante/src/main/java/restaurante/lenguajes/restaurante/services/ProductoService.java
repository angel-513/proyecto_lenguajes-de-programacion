package restaurante.lenguajes.restaurante.services;

import restaurante.lenguajes.restaurante.models.Producto;

public interface ProductoService {
    public Producto crearProducto(Producto nuevoProducto);

    public String eliminarProducto(int ProductoID);

    public Producto buscaProducto(int ProductoID);
}
