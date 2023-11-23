package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer>{
    
}
