package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.ProductoIngrediente;

public interface ProductoIngredienteRepository extends JpaRepository<ProductoIngrediente, Integer>{

}
