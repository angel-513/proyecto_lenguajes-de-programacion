package hn.unah.lenguajes.restaurante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.models.Cliente;
import hn.unah.lenguajes.restaurante.services.Impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/restaurante/cliente")
public class ClienteController {
    
    @Autowired
    ClienteServiceImpl clienteServiceImpl;

    @GetMapping("/obtener")
    public Cliente obtenerCliente(@RequestParam(name = "dni") String dni){
        return this.clienteServiceImpl.buscarCliente( dni);
    }

    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return this.clienteServiceImpl.guardarCliente(cliente);
    }

}
