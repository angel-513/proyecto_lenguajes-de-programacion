package hn.unah.lenguajes.restaurante.services;

import hn.unah.lenguajes.restaurante.dtos.FacturaDTO;
import hn.unah.lenguajes.restaurante.models.Factura;

public interface FacturaService {
    
    public Factura generarFactura(FacturaDTO datos);

}
