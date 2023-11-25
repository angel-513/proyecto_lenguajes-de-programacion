package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer>{
    
}
