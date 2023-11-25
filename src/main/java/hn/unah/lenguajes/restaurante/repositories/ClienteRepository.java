package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{
    
}
