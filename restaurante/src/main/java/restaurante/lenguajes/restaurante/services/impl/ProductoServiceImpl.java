package restaurante.lenguajes.restaurante.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurante.lenguajes.restaurante.models.Producto;
import restaurante.lenguajes.restaurante.repositories.ProductoRepository;
import restaurante.lenguajes.restaurante.services.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public String crearProducto(Producto nuevoProducto) {
        Producto productoBuscado = this.getProductoByNombre(nuevoProducto.getNombreProducto());

        if (productoBuscado != null) {
            this.productoRepository.save(nuevoProducto);
            return "Producto creado." + productoBuscado.toString();
        } else {
            return "Ya existe un producto con ese nombre.";
        }
    }

    @Override
    public Producto buscarProducto(int ProductoID) {
        return this.productoRepository.findById(ProductoID).get();
    }

    @Override
    public String eliminarProducto(int ProductoID) {
        Producto productoEliminar = this.buscarProducto(ProductoID);

        if (productoEliminar != null) {
            this.productoRepository.delete(productoEliminar);
            return "Producto eliminado " + productoEliminar.getNombreProducto();
        } else {
            return "Producto no encontrado";
        }
    }
    
    @Override
    public List<Producto> obtenerProductos() {
        return this.productoRepository.findAll();
    }
    
    public Producto getProductoByNombre(String nombreProducto){
        return this.productoRepository.findFirstByNombreProducto(nombreProducto);
    }

    
}
