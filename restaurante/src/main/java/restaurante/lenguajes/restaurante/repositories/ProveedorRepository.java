package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>{
    
}
