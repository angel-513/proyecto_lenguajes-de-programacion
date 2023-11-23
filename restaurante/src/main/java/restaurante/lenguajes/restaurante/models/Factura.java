package restaurante.lenguajes.restaurante.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "factura")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Factura {
    @Id
    @Column(name = "facturaid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int FacturaID;

    //==============HACER LA RELACION==============//
    private int OrdenID;

    private double total;

    private double descuento;

    private double iva;

    private double subtotal;

    @Column(name = "fechapago")
    private Date FechaPago;

    //==============HACER LA RELACION==============//
    private int FormaPagoID;
}
