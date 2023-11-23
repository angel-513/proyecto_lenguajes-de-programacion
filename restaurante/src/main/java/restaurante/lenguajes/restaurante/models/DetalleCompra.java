package restaurante.lenguajes.restaurante.models;

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
@Table(name = "detallecompra")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DetalleCompra {
    //==============HACER LA RELACION==============//
    @Id
    @Column(name = "compraid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CompraID;

    //==============HACER LA RELACION==============//
    @Column(name = "productoid")
    private int ProductoID;

    //==============HACER LA RELACION==============//
    @Column(name = "proveedorid")
    private int ProveedorID;

    private int cantidad;
}
