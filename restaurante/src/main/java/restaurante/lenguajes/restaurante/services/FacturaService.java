package restaurante.lenguajes.restaurante.services;

import restaurante.lenguajes.restaurante.dtos.FacturaDTO;
import restaurante.lenguajes.restaurante.models.Factura;

public interface FacturaService {
    
    public Factura generarFactura(FacturaDTO datos);

}
