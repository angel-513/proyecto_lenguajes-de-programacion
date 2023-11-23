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
@Table(name = "productoingrediente")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoIngrediente {
    //==============HACER LA RELACION==============//
    @Id
    @Column(name = "ingredienteid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IngredienteID;

    //==============HACER LA RELACION==============//
    @Id
    @Column(name = "productoid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductoID;

    @Column(name = "cantidadunidades")
    private double CantidadUnidades;
}
