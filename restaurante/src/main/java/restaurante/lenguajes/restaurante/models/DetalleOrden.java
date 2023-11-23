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
@Table(name = "detalleorden")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetalleOrden {
    //==============HACER LA RELACION==============//
    @Id
    @Column(name = "ordenid")
    private int OrdenID;

    //==============HACER LA RELACION==============//
    private int ProductoID;

    private int cantidad;
}
