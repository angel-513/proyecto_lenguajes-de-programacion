package hn.unah.lenguajes.restaurante.services.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.restaurante.dtos.OrdenDTO;
import hn.unah.lenguajes.restaurante.models.Cliente;
import hn.unah.lenguajes.restaurante.models.DetalleOrden;
import hn.unah.lenguajes.restaurante.models.Empleado;
import hn.unah.lenguajes.restaurante.models.Orden;
import hn.unah.lenguajes.restaurante.models.Producto;
import hn.unah.lenguajes.restaurante.models.ProductoIngrediente;
import hn.unah.lenguajes.restaurante.repositories.ClienteRepository;
import hn.unah.lenguajes.restaurante.repositories.EmpleadoRepository;
import hn.unah.lenguajes.restaurante.repositories.OrdenRepository;
import hn.unah.lenguajes.restaurante.repositories.ProductoRepository;
import hn.unah.lenguajes.restaurante.services.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService{

    @Autowired
    private OrdenRepository ordenRepository;

    @Autowired
    private ProductoRepository productoRepository;
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProducIngrServiceImpl producIngrServiceImpl;
    
    @Override
    public Orden incluirOrden(OrdenDTO datos) {

        Empleado empleado = this.buscarEmpleado(datos.getCajeroId());

        if (empleado != null) {
            
            Cliente cliente = this.buscarCliente(datos.getDni());

            if (cliente != null) {
                
                Producto producto = this.buscarProducto(datos.getProductoId());

                if (producto != null) {

                    this.modificarCantidadIngredientes(producto.getProductoID(), datos.getCantidad());

                    DetalleOrden detalleOrden = new DetalleOrden();
                    detalleOrden.setProducto(producto);
                    detalleOrden.setCantidad(datos.getCantidad());

                    Orden orden = new Orden();
                    Date date = new Date();
                    orden.setFechaOrden(date);
                    orden.setCliente(cliente);
                    orden.setCajero(empleado);
                    orden.setDetalleOrden(detalleOrden);

                    return this.ordenRepository.save(orden);

                }

            }

        }

        return null;
    }

    private Empleado buscarEmpleado(String id){
        boolean estaEmpleado = this.empleadoRepository.findById(id).isPresent();

        if (estaEmpleado) {
            return this.empleadoRepository.findById(id).get();
        }

        return null;
    }

    private Cliente buscarCliente(String id){
        boolean estaCliente = this.clienteRepository.findById(id).isPresent();

        if (estaCliente) {
            return this.clienteRepository.findById(id).get();
        }

        return null;
    }

    private Producto buscarProducto(int id){
        boolean estaProducto = this.productoRepository.findById(id).isPresent();

        if (estaProducto) {
            return this.productoRepository.findById(id).get();
        }

        return null;
    }

    private void modificarCantidadIngredientes(int producto, double cantidad){
        
        List<ProductoIngrediente> listaIngredientes = this.producIngrServiceImpl.obtenerIngredientesPlatillo(producto);
        
        for (ProductoIngrediente productoIngrediente : listaIngredientes) {
            
            double cantidadAlmacen = productoIngrediente.getIngrediente().getCantidadAlmacen();
            productoIngrediente.getIngrediente().setCantidadAlmacen(cantidadAlmacen - cantidad * productoIngrediente.getCantidadUtilizada());
        
        }

    }
    
}