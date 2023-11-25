package hn.unah.lenguajes.restaurante.services;

import hn.unah.lenguajes.restaurante.dtos.OrdenDTO;
import hn.unah.lenguajes.restaurante.models.Orden;

public interface OrdenService {
    
    public Orden incluirOrden(OrdenDTO datos);

}
