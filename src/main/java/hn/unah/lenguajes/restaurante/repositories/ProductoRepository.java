package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
