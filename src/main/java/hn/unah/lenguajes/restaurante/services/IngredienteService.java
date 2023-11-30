package hn.unah.lenguajes.restaurante.services;

import hn.unah.lenguajes.restaurante.dtos.IngredienteDTO;
import hn.unah.lenguajes.restaurante.models.Ingrediente;

public interface IngredienteService {
    
    public Ingrediente crearIngrediente(IngredienteDTO datos);

    public Ingrediente buscarIngrediente(int id);

    public String actualizarIngrediente(Ingrediente ingrediente);

    public String eliminarIngrediente(int id);

}
