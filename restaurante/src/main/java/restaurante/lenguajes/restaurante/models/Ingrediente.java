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
@Table(name = "ingrediente")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {
    @Id
    @Column(name = "ingredienteid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IngredienteID;

    @Column(name = "nombreingrediente")
    private String NombreIngrediente;

    @Column(name = "precioingredientexunidad")
    private double PrecioIngrediete;

    @Column(name = "descripcionunidad")
    private String DescripcionUnidad;

    @Column(name = "cantidadalmacen")
    private double CantidadAlmacen;

    @Column(name = "stockminimo")
    private double StockMinimo;
}
