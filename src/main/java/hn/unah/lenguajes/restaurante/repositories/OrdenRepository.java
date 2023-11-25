package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer>{
    
}
