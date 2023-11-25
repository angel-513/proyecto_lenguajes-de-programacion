package hn.unah.lenguajes.restaurante.models;

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
@Table(name = "formapago")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FormaPago {
    
    @Id
    @Column(name = "formapagoid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int FormaPagoID;

    private String descripcion;

}