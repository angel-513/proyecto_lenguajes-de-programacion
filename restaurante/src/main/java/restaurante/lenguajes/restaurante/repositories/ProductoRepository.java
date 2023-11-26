package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
