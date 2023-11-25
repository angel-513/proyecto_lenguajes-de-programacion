package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>{
    
}
