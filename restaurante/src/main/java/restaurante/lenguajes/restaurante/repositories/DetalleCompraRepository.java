package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.DetalleCompra;

public interface DetalleCompraRepository extends JpaRepository<DetalleCompra, Integer>{
    
}
