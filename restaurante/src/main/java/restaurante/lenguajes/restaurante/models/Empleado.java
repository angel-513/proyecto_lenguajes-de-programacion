package restaurante.lenguajes.restaurante.models;

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
@Table(name = "empleado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    @Id
    @Column(name = "dni")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dni;

    @Column(name = "pnombre")
    private String primerNombre;

    @Column(name = "snombre")
    private String segundoNombre;

    @Column(name = "papellido")
    private String primerApellido;

    @Column(name = "sapellido")
    private String segundoApellido;

    private double sueldo;

    @ManyToOne
    @JoinColumn(name = "cargodi", referencedColumnName = "cargoid")
    private Cargo cargo;
}
