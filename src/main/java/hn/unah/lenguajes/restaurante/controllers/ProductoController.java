package hn.unah.lenguajes.restaurante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.models.Producto;
import hn.unah.lenguajes.restaurante.services.Impl.ProductoServiceImpl;


@RestController
@RequestMapping("/api/restaurante/platillo")
public class ProductoController {

    @Autowired
    private ProductoServiceImpl productoServiceImpl;

    @PostMapping("/crear")
    public Producto crearPlatillo(@RequestBody Producto nuevoProducto){
        return this.productoServiceImpl.crearProducto(nuevoProducto);
    }

    @GetMapping("/buscar/{id}")
    public Producto buscarPlatillo(@PathVariable(name = "id") int ProductoID){
        return this.productoServiceImpl.buscaProducto(ProductoID);
    }

    @DeleteMapping("eliminar/{id}")
    public String eliminarPlatillo(@PathVariable(name = "id") int ProductoID){
        return this.productoServiceImpl.eliminarProducto(ProductoID);
    }
    
}
