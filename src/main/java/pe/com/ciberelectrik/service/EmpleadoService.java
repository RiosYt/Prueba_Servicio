package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrik.entity.Empleado;

public interface EmpleadoService {
    List<Empleado> findAll();
    List<Empleado> findAllCustom();
    Optional<Empleado> findById(Long id);
    List<Empleado> findByName(String nombre);
    List<Empleado> findByUser(String usuario, String clave);
    Empleado add(Empleado e);
    Empleado update(Empleado e);
    Empleado delete(Empleado e);
}
