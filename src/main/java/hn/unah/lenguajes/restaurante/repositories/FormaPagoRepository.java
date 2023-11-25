package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.FormaPago;

public interface FormaPagoRepository extends JpaRepository<FormaPago, Integer>{
    
}
