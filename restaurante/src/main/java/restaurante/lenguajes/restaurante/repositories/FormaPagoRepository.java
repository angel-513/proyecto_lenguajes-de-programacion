package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.FormaPago;

public interface FormaPagoRepository extends JpaRepository<FormaPago, Integer>{
    
}
