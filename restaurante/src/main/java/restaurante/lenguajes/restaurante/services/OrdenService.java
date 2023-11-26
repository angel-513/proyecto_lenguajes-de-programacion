package restaurante.lenguajes.restaurante.services;

import restaurante.lenguajes.restaurante.dtos.OrdenDTO;
import restaurante.lenguajes.restaurante.models.Orden;

public interface OrdenService {
    public Orden incluirOrden(OrdenDTO nuevaOrden);
}
