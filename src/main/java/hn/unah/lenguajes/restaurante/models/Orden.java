package hn.unah.lenguajes.restaurante.models;

import java.util.Date;

import jakarta.persistence.CascadeType;
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
@Table(name = "orden")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orden {

    @Id
    @Column(name = "ordenid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrdenID;

    @Column(name = "fechaorden")
    private Date fechaOrden;

    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cajeroid", referencedColumnName = "dni")
    private Empleado cajero;

    @OneToOne(mappedBy = "orden", cascade = CascadeType.ALL)
    private DetalleOrden detalleOrden;

    @OneToOne(mappedBy = "orden", cascade = CascadeType.ALL)
    private Factura factura;

}
