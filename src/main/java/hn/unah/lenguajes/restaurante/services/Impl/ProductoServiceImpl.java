package hn.unah.lenguajes.restaurante.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes.restaurante.models.Producto;
import hn.unah.lenguajes.restaurante.repositories.ProductoRepository;
import hn.unah.lenguajes.restaurante.services.ProductoService;

public class ProductoServiceImpl implements ProductoService{
    
    @Autowired 
    private ProductoRepository productoRepository;

    @Override
    public Producto crearProducto(Producto nuevoProducto) {
        return this.productoRepository.save(nuevoProducto);
    }

    @Override
    public String eliminarProducto(int ProductoID) {
        boolean estaProducto = this.productoRepository.findById(ProductoID).isPresent();

        if (estaProducto) {
            Producto productoEliminar = this.productoRepository.findById(ProductoID).get();
            this.productoRepository.delete(productoEliminar);
            return "Platillo eliminado.";
        }

        return "Producto no encontrado.";
    }

    @Override
    public Producto buscaProducto(int ProductoID) {
        boolean estaProducto = this.productoRepository.findById(ProductoID).isPresent();

        if (estaProducto) {
            return this.productoRepository.findById(ProductoID).get();
        }

        return null;
    }
}