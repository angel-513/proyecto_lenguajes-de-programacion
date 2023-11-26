package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{
    
}
