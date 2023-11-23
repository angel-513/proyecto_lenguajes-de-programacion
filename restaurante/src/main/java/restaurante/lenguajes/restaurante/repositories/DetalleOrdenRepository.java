package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.DetalleOrden;

public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer>{
    
}
