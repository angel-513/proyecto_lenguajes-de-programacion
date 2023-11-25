package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.DetalleCompra;

public interface DetalleCompraRepository extends JpaRepository<DetalleCompra, Integer>{
    
}
