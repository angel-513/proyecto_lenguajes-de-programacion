package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {
    
}
