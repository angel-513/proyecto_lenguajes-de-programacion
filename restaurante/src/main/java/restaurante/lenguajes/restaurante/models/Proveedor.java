package restaurante.lenguajes.restaurante.models;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(name = "proveedor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {
    @Id
    @Column(name = "proveedorid")
    private int ProveedorID;

    @Column(name = "nombreproveedor")
    private String NombreProveedor;

    private String telefono;

    private String correo;
}
