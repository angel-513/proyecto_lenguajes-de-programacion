package restaurante.lenguajes.restaurante.services;

import restaurante.lenguajes.restaurante.models.Cliente;

public interface ClienteService {
    public Cliente buscarCliente(String dni);

    public Cliente guardarCliente(Cliente cliente);
}
