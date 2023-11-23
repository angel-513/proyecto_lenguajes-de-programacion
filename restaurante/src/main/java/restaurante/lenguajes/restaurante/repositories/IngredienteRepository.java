package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Integer>{
    
}
