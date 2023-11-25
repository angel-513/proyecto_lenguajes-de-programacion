package hn.unah.lenguajes.restaurante.services;

import hn.unah.lenguajes.restaurante.models.Cliente;

public interface ClienteService {
    
    public Cliente buscarCliente(String dni);

    public Cliente guardarCliente(Cliente cliente);

}
