package hn.unah.lenguajes.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.restaurante.models.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, String>{

}
