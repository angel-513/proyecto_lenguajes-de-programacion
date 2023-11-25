package hn.unah.lenguajes.restaurante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.restaurante.dtos.FacturaDTO;
import hn.unah.lenguajes.restaurante.models.Factura;
import hn.unah.lenguajes.restaurante.services.Impl.FacturaServiceImpl;

@RestController
@RequestMapping("/api/restaurante/factura")
public class FacturaController {

    @Autowired
    FacturaServiceImpl facturaServiceImpl;
    
    @PostMapping("guardar")
    public Factura generarFactura(@RequestBody FacturaDTO datos){
        return this.facturaServiceImpl.generarFactura(datos);
    }
}
