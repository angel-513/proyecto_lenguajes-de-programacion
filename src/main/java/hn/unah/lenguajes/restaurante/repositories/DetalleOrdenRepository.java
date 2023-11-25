package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.DetalleOrden;

public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer>{
    
}
