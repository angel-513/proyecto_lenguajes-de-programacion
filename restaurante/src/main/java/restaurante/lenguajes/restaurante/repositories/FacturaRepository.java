package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer>{
    
}
