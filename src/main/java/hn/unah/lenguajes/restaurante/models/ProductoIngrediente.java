package hn.unah.lenguajes.restaurante.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productoxingredienteid")
    private int productoXIngredienteID;

    @ManyToOne
    @JoinColumn(name = "ingrediente", referencedColumnName = "ingredienteid")
    private Ingrediente ingrediente;

    @ManyToOne
    @JoinColumn(name = "producto", referencedColumnName = "productoid")
    private Producto producto;

    @Column(name = "cantidadutilizada")
    private double cantidadUtilizada;
}
