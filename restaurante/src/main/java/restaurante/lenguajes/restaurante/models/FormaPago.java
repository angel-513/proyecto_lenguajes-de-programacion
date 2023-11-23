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
@Table(name = "forma_pago")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FormaPago {
    @Id
    @Column(name = "formapagoid")
    private int FormaPagoID;

    private String descripcion;
}
