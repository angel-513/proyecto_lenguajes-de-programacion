package restaurante.lenguajes.restaurante.services;

import restaurante.lenguajes.restaurante.models.Ingrediente;

public interface IngredienteService {
    public Ingrediente creaIngrediente(Ingrediente nuevoIngrediente);

    public Ingrediente actualizaIngrediente(int IngredienteID, Ingrediente ingrediente);

    public String eliminarIngrediente(int IngredienteID);

    public Ingrediente buscarIngrediente(int IngredienteID);
}
