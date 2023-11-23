package restaurante.lenguajes.restaurante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurante.lenguajes.restaurante.models.Producto;
import restaurante.lenguajes.restaurante.services.impl.ProductoServiceImpl;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoServiceImpl productoServiceImpl;

    @GetMapping("/obtenertodos")
    public List<Producto> getAllProductos() {
        return this.productoServiceImpl.obtenerProductos();
    }

    @PostMapping("/crear")
    public String crearProducto(@RequestBody Producto nuevoProducto) {
        return this.productoServiceImpl.crearProducto(nuevoProducto);
    }

    @GetMapping("/buscar/{id}")
    public Producto buscarProducto(@PathVariable(name = "id") int ProductoID){
        return this.productoServiceImpl.buscarProducto(ProductoID);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable(name = "id") int ProductoID){
        return this.productoServiceImpl.eliminarProducto(ProductoID);
    }
}
