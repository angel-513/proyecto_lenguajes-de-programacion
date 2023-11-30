package hn.unah.lenguajes.restaurante.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdenDTO {
    
    private String dni;

    private String cajeroId;

    private List<DetalleOrdenDTO> productos;

}