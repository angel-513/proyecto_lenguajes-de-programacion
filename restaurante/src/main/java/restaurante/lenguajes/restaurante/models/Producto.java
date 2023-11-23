package restaurante.lenguajes.restaurante.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @Column(name = "productoid")
    private int ProductoID;

    @Column(name = "nombreproducto")
    private String NombreProducto;

    private double precio;

    //==============HACER LA RELACION==============//
    private int ProveedorID;
}
