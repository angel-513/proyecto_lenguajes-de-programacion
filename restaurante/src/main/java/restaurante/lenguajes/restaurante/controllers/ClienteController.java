package restaurante.lenguajes.restaurante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurante.lenguajes.restaurante.models.Cliente;
import restaurante.lenguajes.restaurante.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/restaurante/cliente")
public class ClienteController {
    
    @Autowired
    ClienteServiceImpl clienteServiceImpl;

    @GetMapping("/obtener")
    public Cliente obtenerCliente(@PathVariable(name = "dni") String dni){
        return this.clienteServiceImpl.buscarCliente(dni);
    }

    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return this.clienteServiceImpl.guardarCliente(cliente);
    }

}
