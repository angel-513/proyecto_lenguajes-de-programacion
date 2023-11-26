package restaurante.lenguajes.restaurante.dtos;

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

    private int productoId;

    private int cantidad;

}