package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrik.entity.Producto;

public interface ProductoService {
    List<Producto> findAll();
    List<Producto> findAllCustom();
    Optional<Producto> findById(Long id);
    List<Producto> finaByName(String nombre);
    Producto add(Producto p);
    Producto update(Producto p);
    Producto delete(Producto p);
}
