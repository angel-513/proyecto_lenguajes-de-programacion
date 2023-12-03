package hn.unah.lenguajes.restaurante.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.models.Empleado;
import hn.unah.lenguajes.restaurante.repositories.EmpleadoRepository;
import hn.unah.lenguajes.restaurante.services.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado buscarEmpleado(String dni) {
        boolean estaEmpleado = this.empleadoRepository.findById(dni).isPresent();

        if (estaEmpleado) {
            return this.empleadoRepository.findById(dni).get();
        }

        return null;
    }
    
}
