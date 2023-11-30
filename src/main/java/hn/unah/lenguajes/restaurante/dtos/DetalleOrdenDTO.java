package hn.unah.lenguajes.restaurante.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleOrdenDTO {
    private int producto;

    private int cantidad;
}
