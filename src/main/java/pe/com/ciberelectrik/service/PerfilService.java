
package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrik.entity.Perfil;


public interface PerfilService {
    List<Perfil> findAll();

    List<Perfil> findAllCustom();

    Optional<Perfil> findById(Long id);

    List<Perfil> findByName(String nombre);

    Perfil add(Perfil p);

    Perfil update(Perfil p);

    Perfil delete(Perfil p);

    
}
