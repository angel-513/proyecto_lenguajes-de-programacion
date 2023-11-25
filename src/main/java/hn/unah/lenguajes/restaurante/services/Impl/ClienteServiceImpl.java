package hn.unah.lenguajes.restaurante.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.models.Cliente;
import hn.unah.lenguajes.restaurante.repositories.ClienteRepository;
import hn.unah.lenguajes.restaurante.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public Cliente buscarCliente(String dni) {
        return this.verificarCliente(dni);
    }
    
    public Cliente verificarCliente(String dni){
        boolean estaCliente = this.clienteRepository.findById(dni).isPresent();
    
        if (estaCliente) {
            return this.clienteRepository.findById(dni).get();
        }
    
        return null;
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }
    
}
