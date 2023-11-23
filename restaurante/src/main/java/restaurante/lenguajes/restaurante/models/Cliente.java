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
@Table(name = "cliente")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @Column(name = "clienteid")
    private int ClienteID;

    @Column(name = "pnombre")
    private String primer_nombre;

    @Column(name = "snombre")
    private String segundo_nombre;

    @Column(name = "papellido")
    private String primer_apellido;

    @Column(name = "sapellido")
    private String segundo_apellido;
}
