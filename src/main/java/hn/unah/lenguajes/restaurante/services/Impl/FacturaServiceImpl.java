package hn.unah.lenguajes.restaurante.services.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.dtos.FacturaDTO;
import hn.unah.lenguajes.restaurante.models.Factura;
import hn.unah.lenguajes.restaurante.models.FormaPago;
import hn.unah.lenguajes.restaurante.models.Orden;
import hn.unah.lenguajes.restaurante.repositories.FacturaRepository;
import hn.unah.lenguajes.restaurante.repositories.FormaPagoRepository;
import hn.unah.lenguajes.restaurante.repositories.OrdenRepository;
import hn.unah.lenguajes.restaurante.services.FacturaService;

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
