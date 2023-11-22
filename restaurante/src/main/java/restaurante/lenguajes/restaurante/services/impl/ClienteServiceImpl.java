package restaurante.lenguajes.restaurante.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurante.lenguajes.restaurante.repositories.ClienteRepository;
import restaurante.lenguajes.restaurante.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;
}
