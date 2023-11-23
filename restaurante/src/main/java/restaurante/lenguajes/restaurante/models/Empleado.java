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
@Table(name = "empleado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    @Id
    @Column(name = "empleadoid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EmpleadoID;

    @Column(name = "pnombre")
    private String primer_nombre;

    @Column(name = "snombre")
    private String segundo_nombre;

    @Column(name = "papellido")
    private String primer_apellido;

    @Column(name = "sapellido")
    private String segundo_apellido;

    private double sueldo;

    //==============HACER LA RELACION==============//
    private int CargoID;
}
