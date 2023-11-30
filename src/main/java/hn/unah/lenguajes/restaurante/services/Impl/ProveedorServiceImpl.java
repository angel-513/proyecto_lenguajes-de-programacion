package hn.unah.lenguajes.restaurante.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.models.Proveedor;
import hn.unah.lenguajes.restaurante.repositories.ProveedorRepository;
import hn.unah.lenguajes.restaurante.services.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public Proveedor buscarProveedor(int id) {
        return this.obtenerProveedor(id);
    }

    private Proveedor obtenerProveedor(int id){
        boolean estaProveedor = this.proveedorRepository.findById(id).isPresent();

        if (estaProveedor) {
            return this.proveedorRepository.findById(id).get();
        }

        return null;
    }
    
}
