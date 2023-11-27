package restaurante.lenguajes.restaurante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurante.lenguajes.restaurante.models.ProductoIngrediente;
import restaurante.lenguajes.restaurante.services.impl.ProducIngrServiceImpl;

@RestController
@RequestMapping("/api/restaurante/ingredientesXProducto")
public class ProducIngrController {
    
    @Autowired
    private ProducIngrServiceImpl pIngrServiceImpl;

    @GetMapping("/obtenerIngredientes/{id}")
    public List<ProductoIngrediente> obtenerIngredientesPlatillo(@PathVariable(name = "id") int id){
        return this.pIngrServiceImpl.obtenerIngredientesPlatillo(id); 
    }

}
