package hn.unah.lenguajes.restaurante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.dtos.IngredienteDTO;
import hn.unah.lenguajes.restaurante.models.Ingrediente;
import hn.unah.lenguajes.restaurante.services.Impl.IngredienteServiceImpl;

@RestController
@RequestMapping("/api/restaurante/ingrediente")
public class IngredienteController {
    
    @Autowired
    private IngredienteServiceImpl ingredienteServiceImpl;

    @PostMapping("/guardar")
    public Ingrediente creaIngrediente(@RequestBody IngredienteDTO datos){
        return this.ingredienteServiceImpl.crearIngrediente(datos);
    }

    @GetMapping("/buscar")
    public Ingrediente buscarIngrediente(@RequestParam(name = "id") int id){
        return this.ingredienteServiceImpl.buscarIngrediente(id);
    }

    @PutMapping("/actualizar")
    public String actualizaIngrediente(@RequestBody Ingrediente ingrediente){
        return this.ingredienteServiceImpl.actualizarIngrediente(ingrediente);
    }

    @DeleteMapping("/eliminar")
    public String eliminarIngrediente(@RequestParam(name = "id") int id){
        return this.ingredienteServiceImpl.eliminarIngrediente(id);
    }

    @GetMapping("/todos")
    public List<Ingrediente> obtenIngredientes(){
        return this.ingredienteServiceImpl.obtenerTodos();
    }

}
