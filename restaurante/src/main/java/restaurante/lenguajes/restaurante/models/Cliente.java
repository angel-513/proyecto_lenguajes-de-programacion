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
    @Column(name = "dni")
    private String dni;

    @Column(name = "pnombre")
    private String primerNombre;

    @Column(name = "snombre")
    private String segundoNombre;

    @Column(name = "papellido")
    private String primerApellido;

    @Column(name = "sapellido")
    private String segundoApellido;
}
