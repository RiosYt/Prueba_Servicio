package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrik.entity.Distrito;

public interface DistritoService {
    List<Distrito> findAll();
    List<Distrito> findAllCustom();
    Optional<Distrito> findById(Long id);
    List<Distrito> findByName(String nombre);
    Distrito add(Distrito d);
    Distrito update(Distrito d);
    Distrito delete(Distrito d);
}
