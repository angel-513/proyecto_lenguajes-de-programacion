package restaurante.lenguajes.restaurante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurante.lenguajes.restaurante.dtos.OrdenDTO;
import restaurante.lenguajes.restaurante.models.Orden;
import restaurante.lenguajes.restaurante.services.Impl.OrdenServiceImpl;

@RestController
@RequestMapping("/api/restaurante/orden")
public class OrdenController {
    
    @Autowired
    OrdenServiceImpl ordenServiceImpl;

    @PostMapping("/guardar")
    public Orden generaOrden(@RequestBody OrdenDTO datos){
        return this.ordenServiceImpl.incluirOrden(datos);
    }

}
