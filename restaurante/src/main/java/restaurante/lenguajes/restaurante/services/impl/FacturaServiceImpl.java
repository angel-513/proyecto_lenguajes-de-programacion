package restaurante.lenguajes.restaurante.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurante.lenguajes.restaurante.dtos.FacturaDTO;
import restaurante.lenguajes.restaurante.models.Factura;
import restaurante.lenguajes.restaurante.models.FormaPago;
import restaurante.lenguajes.restaurante.models.Orden;
import restaurante.lenguajes.restaurante.repositories.FacturaRepository;
import restaurante.lenguajes.restaurante.repositories.FormaPagoRepository;
import restaurante.lenguajes.restaurante.repositories.OrdenRepository;
import restaurante.lenguajes.restaurante.services.FacturaService;

@Service
public class FacturaServiceImpl implements FacturaService{

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private FormaPagoRepository formaPagoRepository;

    @Autowired
    private OrdenRepository ordenRepository;

    @Override
    public Factura generarFactura(FacturaDTO datos) {
        Orden orden = this.verificarOrden(datos.getOrdenId());

        if (orden != null) {
            Factura factura = new Factura();

            factura.setOrden(orden);
            factura.setFormaPago(this.extraerFormaPago(datos.getFormaPago()));
            factura.setSubtotal(datos.getSubtotal());
            factura.setDescuento(datos.getDescuento());
            factura.setIva(datos.getIva());
            factura.setTotal(datos.getTotal());

            Date date = new Date();
            factura.setFechaPago(date);

            return this.facturaRepository.save(factura);
        }
        
        return null;
    }

    private Orden verificarOrden(int id){
        boolean estaOrden = this.ordenRepository.findById(id).isPresent();

        if (estaOrden) {
            return this.ordenRepository.findById(id).get();
        }

        return null;
    }

    private FormaPago extraerFormaPago(int id){
        return this.formaPagoRepository.findById(id).get();
    }
    
}
