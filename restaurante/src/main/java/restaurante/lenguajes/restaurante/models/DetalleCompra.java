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
    @Id
    @Column(name = "detallecompraid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DetalleCompraID;

    //==============HACER LA RELACION==============//
    @Column(name = "ingredienteid")
    private int IngredienteID;

    //==============HACER LA RELACION==============//
    @Column(name = "compraid")
    private int compraID;

    private int cantidad;
}
