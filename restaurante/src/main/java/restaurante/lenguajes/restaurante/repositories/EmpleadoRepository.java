package restaurante.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurante.lenguajes.restaurante.models.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, String>{
    
}
