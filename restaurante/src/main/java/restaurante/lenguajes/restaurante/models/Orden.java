package restaurante.lenguajes.restaurante.models;

import java.sql.Date;

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
@Table(name = "orden")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orden {
    @Id
    @Column(name = "ordenid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrdenID;

    @Column(name = "fechaorden")
    private Date fechaOrden;

    //==============HACER LA RELACION==============//
    private int ClienteID;

    //==============HACER LA RELACION==============//
    private int MeseroID;

    //==============HACER LA RELACION==============//
    private int CajeroID;
}
