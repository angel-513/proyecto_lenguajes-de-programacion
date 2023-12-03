package hn.unah.lenguajes.restaurante.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.dtos.IngredienteDTO;
import hn.unah.lenguajes.restaurante.models.Ingrediente;
import hn.unah.lenguajes.restaurante.repositories.IngredienteRepository;
import hn.unah.lenguajes.restaurante.services.IngredienteService;

@Service
public class IngredienteServiceImpl implements IngredienteService{

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @Autowired
    private ProveedorServiceImpl proveedorServiceImpl;

    @Override
    public Ingrediente crearIngrediente(IngredienteDTO datos) {
        Ingrediente ingrediente = new Ingrediente();
        
        ingrediente.setNombreIngrediente(datos.getNombreIngrediente());
        ingrediente.setDescripcionUnidad(datos.getDescripcionUnidad());
        ingrediente.setCantidadAlmacen(datos.getCantidadAlmacen());
        ingrediente.setStockMinimo(datos.getStockMinimo());
        ingrediente.setProveedor(this.proveedorServiceImpl.buscarProveedor(datos.getProveedor()));

        return this.ingredienteRepository.save(ingrediente);
    }

    @Override
    public Ingrediente buscarIngrediente(int id) {
        return this.obtenerIngrediente(id);
    }
    
    private Ingrediente obtenerIngrediente(int id){
        boolean estaIngrediente = this.ingredienteRepository.findById(id).isPresent();
    
        if (estaIngrediente) {
            return this.ingredienteRepository.findById(id).get();
        }
    
        return null;
    }

    @Override
    public String actualizarIngrediente(Ingrediente ingrediente) {
        Ingrediente ingredienteBD = this.buscarIngrediente(ingrediente.getIngredienteID());

        if (ingredienteBD != null) {
            ingredienteBD.setCantidadAlmacen(ingredienteBD.getCantidadAlmacen() + ingrediente.getCantidadAlmacen());

            this.ingredienteRepository.save(ingredienteBD);

            return "Ingrediente actualizado con éxito";
        }

        return "Hubo un problema. No se pudo actualizar el ingrediente solicitado";
    }

    @Override
    public String eliminarIngrediente(int id) {
        Ingrediente ingrediente = this.buscarIngrediente(id);

        if (ingrediente != null) {
            this.ingredienteRepository.deleteById(id);

            return "Ingrediente eliminado con éxito";
        }

        return "Hubo un problema. No se pudo eliminar el ingrediente solicitado";
    }

    @Override
    public List<Ingrediente> obtenerTodos() {
        return this.ingredienteRepository.findAll();
    }
    
}
