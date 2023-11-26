package restaurante.lenguajes.restaurante.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "ordenid", referencedColumnName = "ordenid")
    private Orden orden;

    private double total;

    private double descuento;

    private double iva;

    private double subtotal;

    @Column(name = "fechapago")
    private Date FechaPago;

    @ManyToOne
    @JoinColumn(name = "formapagoid", referencedColumnName = "formapagoid")
    private FormaPago formaPago;
}
