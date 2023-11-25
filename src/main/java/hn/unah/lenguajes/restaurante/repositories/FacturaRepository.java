package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer>{
    
}
