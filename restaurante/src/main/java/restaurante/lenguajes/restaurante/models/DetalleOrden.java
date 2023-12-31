package restaurante.lenguajes.restaurante.models;

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
@Table(name = "detalleorden")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetalleOrden {
    @Id
    @Column(name = "detalleordenid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DetalleOrdenID;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "ordenid", referencedColumnName = "ordenid")
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "productoid", referencedColumnName = "productoid")
    private Producto producto;

    private int cantidad;
}
