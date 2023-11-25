package hn.unah.lenguajes.restaurante.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FacturaDTO {
    
    private int ordenId;

    private double subtotal;

    private double descuento;

    private double iva;

    private double total;

    private int formaPago;

}
