package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Integer>{
    
}
