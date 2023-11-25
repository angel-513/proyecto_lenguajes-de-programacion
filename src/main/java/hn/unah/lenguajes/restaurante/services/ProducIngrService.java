package hn.unah.lenguajes.restaurante.services;

import java.util.List;

import hn.unah.lenguajes.restaurante.models.ProductoIngrediente;

public interface ProducIngrService {
    
    public List<ProductoIngrediente> obtenerIngredientesPlatillo(int producto);

}
