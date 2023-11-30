package hn.unah.lenguajes.restaurante.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngredienteDTO {

    private String nombreIngrediente;

    private String descripcionUnidad;

    private double cantidadAlmacen;

    private double stockMinimo;

    private int proveedor;

}
