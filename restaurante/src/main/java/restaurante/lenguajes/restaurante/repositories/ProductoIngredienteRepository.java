package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.ProductoIngrediente;

public interface ProductoIngredienteRepository extends JpaRepository<ProductoIngrediente, Integer>{
    
}
