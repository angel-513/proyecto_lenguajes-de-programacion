package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.Compra;

public interface CompraRepository extends JpaRepository<Compra, Integer>{
    
}
