package hn.unah.lenguajes.restaurante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.models.ProductoIngrediente;
import hn.unah.lenguajes.restaurante.services.Impl.ProducIngrServiceImpl;

@RestController
@RequestMapping("/api/restaurante/ingredientesXProducto")
public class ProducIngrController {
    
    @Autowired
    private ProducIngrServiceImpl pIngrServiceImpl;

    @GetMapping("/obtener")
    public List<ProductoIngrediente> obtenerIngredientesPlatillo(@RequestParam(name = "idProducto") int id){
        return this.pIngrServiceImpl.obtenerIngredientesPlatillo(id); 
    }

}
