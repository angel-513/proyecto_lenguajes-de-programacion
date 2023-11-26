package restaurante.lenguajes.restaurante.services;

import java.util.List;

import restaurante.lenguajes.restaurante.models.ProductoIngrediente;

/**
 * ProductoIngredienteService
 */
public interface ProducIngrService {
    public List<ProductoIngrediente> obtenerIngredientesPlatillo(int producto);
}