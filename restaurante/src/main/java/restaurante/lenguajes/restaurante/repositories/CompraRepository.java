package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.Compra;

public interface CompraRepository extends JpaRepository<Compra, Integer>{
    
}
