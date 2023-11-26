package restaurante.lenguajes.restaurante.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurante.lenguajes.restaurante.models.ProductoIngrediente;
import restaurante.lenguajes.restaurante.repositories.ProductoIngredienteRepository;
import restaurante.lenguajes.restaurante.services.ProducIngrService;

@Service
public class ProducIngrServiceImpl implements ProducIngrService{

    @Autowired
    private ProductoIngredienteRepository piRepository;

    @Override
    public List<ProductoIngrediente> obtenerIngredientesPlatillo(int producto) {
        return this.obtenerIngredientes(producto);
    }

    private List<ProductoIngrediente> obtenerIngredientes(int producto){
        List<ProductoIngrediente> listaTotal = this.piRepository.findAll();

        List<ProductoIngrediente> listaIngredientes = new ArrayList<ProductoIngrediente>();

        for (ProductoIngrediente productoXIngrediente : listaTotal) {
            if(productoXIngrediente.getProducto().getProductoID() == producto){
                listaIngredientes.add(productoXIngrediente);
            }
        }

        return listaIngredientes;
    }
    
}
