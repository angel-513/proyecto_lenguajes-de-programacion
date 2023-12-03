package hn.unah.lenguajes.restaurante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.models.Empleado;
import hn.unah.lenguajes.restaurante.services.Impl.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api/restaurante/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoServiceImpl empleadoServiceImpl;

    @GetMapping("/buscar")
    public Empleado buscarEmpleado(@RequestParam(name = "dni") String dni){
        return this.empleadoServiceImpl.buscarEmpleado(dni);
    }
    
}
